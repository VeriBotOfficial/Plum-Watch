"""Independent decoder for SiFli EZIP image resources used in watchface ZIPs.

Supports the documented resource header, standard raw-DEFLATE streams, legacy
block-DEFLATE streams, PNG row filters, and the common SiFli pixel layouts.
Unsupported shared-Huffman variants fail closed instead of producing false previews.
"""
from __future__ import annotations

import struct
import zlib
from io import BytesIO

from PIL import Image


def _resource_header(data: bytes):
    if len(data) < 20:
        raise ValueError("resource is shorter than the SiFli header")
    value = struct.unpack_from("<I", data, 0)[0]
    pixel_format = value & 0x1F
    width = (value >> 10) & 0x7FF
    height = (value >> 21) & 0x7FF
    if width <= 0 or height <= 0:
        raise ValueError("invalid SiFli image dimensions")
    return pixel_format, width, height


def _standard_stream(stream: bytes, width: int, height: int):
    if len(stream) < 20:
        raise ValueError("short EZIP stream")
    data_size = struct.unpack_from(">I", stream, 0)[0]
    block_rows = stream[6]
    stream_width, stream_height = struct.unpack_from(">HH", stream, 8)
    if data_size < 20 or data_size > len(stream) or block_rows <= 0:
        raise ValueError("invalid EZIP stream header")
    if (stream_width, stream_height) != (width, height):
        raise ValueError("resource and EZIP dimensions disagree")
    compressed = stream[16:data_size - 4]
    expected_adler = struct.unpack_from(">I", stream, data_size - 4)[0]
    decoded = zlib.decompress(compressed, -15)
    if (zlib.adler32(decoded) & 0xFFFFFFFF) != expected_adler:
        raise ValueError("EZIP checksum mismatch")
    has_filters = (stream[12] & 0x0F) != 1
    return decoded, block_rows, has_filters, True


def _legacy_block_stream(data: bytes):
    if len(data) < 24:
        raise ValueError("short legacy EZIP resource")
    control = data[8]
    has_filters = (data[16] & 0x0F) != 1
    comp_data = data[20:]
    row_size, block_count = struct.unpack_from(">HH", comp_data, 0)
    if row_size <= 0 or block_count <= 0:
        raise ValueError("invalid legacy block table")
    table_size = 4 * (block_count + 1)
    if len(comp_data) < table_size:
        raise ValueError("truncated legacy block table")
    if ((control >> 4) > 2) and ((control >> 4) != 5):
        raise ValueError("legacy shared-Huffman stream is not supported yet")

    raw_stream = comp_data[table_size:]
    offsets = []
    for index in range(block_count):
        offset = struct.unpack_from(">I", comp_data, 4 + index * 4)[0]
        if index == 0:
            offset &= 0x00FFFFFF
        offsets.append(offset)
    offsets.append(len(raw_stream) + table_size + 16)

    decoded = bytearray()
    for index in range(block_count):
        start = offsets[index] - 16 - table_size
        end = offsets[index + 1] - 16 - table_size
        if start < 0 or end < start or end > len(raw_stream):
            raise ValueError("legacy EZIP block offset is outside the stream")
        decoded.extend(zlib.decompress(raw_stream[start:end], -15))
    return bytes(decoded), row_size, has_filters, False


def _unfilter_rows(data: bytes, width: int, height: int, bpp: int, block_rows: int, has_filters: bool, strict: bool):
    stride = width * bpp
    if not has_filters:
        expected = stride * height
        if strict and len(data) != expected:
            raise ValueError("EZIP pixel buffer length mismatch")
        if len(data) < expected:
            raise ValueError("truncated EZIP pixel buffer")
        return data[:expected]

    row_length = stride + 1
    expected = row_length * height
    if strict and len(data) != expected:
        raise ValueError("EZIP filtered buffer length mismatch")
    if block_rows <= 0:
        raise ValueError("invalid EZIP block row size")

    output = bytearray(stride * height)

    def paeth(a, b, c):
        prediction = a + b - c
        da, db, dc = abs(prediction - a), abs(prediction - b), abs(prediction - c)
        if da <= db and da <= dc:
            return a
        if db <= dc:
            return b
        return c

    for y in range(height):
        source_start = y * row_length
        if source_start >= len(data):
            if strict:
                raise ValueError("truncated EZIP scanline")
            break
        filter_type = data[source_start]
        if filter_type > 4:
            raise ValueError(f"unsupported PNG row filter {filter_type}")
        row = data[source_start + 1:source_start + 1 + stride]
        first_in_block = (y % block_rows) == 0
        for x, raw in enumerate(row):
            left = output[y * stride + x - bpp] if x >= bpp else 0
            up = 0 if first_in_block else output[(y - 1) * stride + x]
            up_left = 0 if first_in_block or x < bpp else output[(y - 1) * stride + x - bpp]
            if filter_type == 0:
                value = raw
            elif filter_type == 1:
                value = raw + left
            elif filter_type == 2:
                value = raw + up
            elif filter_type == 3:
                value = raw + ((left + up) // 2)
            else:
                value = raw + paeth(left, up, up_left)
            output[y * stride + x] = value & 0xFF
    return bytes(output)


def _pixels_to_image(raw: bytes, width: int, height: int, resource_format: int):
    pixel_count = width * height
    if len(raw) % pixel_count:
        raise ValueError("decoded EZIP data does not align to whole pixels")
    bpp = len(raw) // pixel_count

    if resource_format == 1 and bpp == 2:
        return Image.frombytes("RGB", (width, height), raw, "raw", "BGR;16")
    if resource_format == 1 and bpp == 3:
        return Image.frombytes("RGB", (width, height), raw, "raw", "BGR")
    if resource_format == 2 and bpp == 4:
        return Image.frombytes("RGBA", (width, height), raw, "raw", "BGRA")
    if resource_format == 2 and bpp == 3:
        rgba = bytearray(pixel_count * 4)
        target = 0
        for offset in range(0, len(raw), 3):
            packed = raw[offset] | (raw[offset + 1] << 8)
            red = ((packed >> 11) & 31) * 255 // 31
            green = ((packed >> 5) & 63) * 255 // 63
            blue = (packed & 31) * 255 // 31
            rgba[target:target + 4] = bytes((red, green, blue, raw[offset + 2]))
            target += 4
        return Image.frombytes("RGBA", (width, height), bytes(rgba))
    raise ValueError(f"unsupported EZIP resource format {resource_format} with {bpp} bytes per pixel")


def decode_ezip_bytes(data: bytes) -> Image.Image:
    """Decode one SiFli .bin image resource into a Pillow image."""
    resource_format, width, height = _resource_header(data)
    try:
        decoded, block_rows, has_filters, strict = _standard_stream(data[4:], width, height)
    except Exception as standard_error:
        try:
            decoded, block_rows, has_filters, strict = _legacy_block_stream(data)
        except Exception as legacy_error:
            raise ValueError(
                f"standard stream: {standard_error}; legacy stream: {legacy_error}"
            ) from legacy_error

    pixel_count = width * height
    filter_bytes = height if has_filters else 0
    pixel_bytes = len(decoded) - filter_bytes
    if pixel_bytes <= 0 or pixel_bytes % pixel_count:
        raise ValueError("decoded stream has an invalid pixel count")
    bpp = pixel_bytes // pixel_count
    raw_pixels = _unfilter_rows(decoded, width, height, bpp, block_rows, has_filters, strict)
    return _pixels_to_image(raw_pixels, width, height, resource_format)
