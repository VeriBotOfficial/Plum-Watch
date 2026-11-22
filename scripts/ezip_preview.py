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


def _decode_shared_huffman(data: bytes) -> bytes:
    """Decode SiFli's shared-table DEFLATE-like stream variant."""
    class BitReader:
        def __init__(self, payload):
            self.data = payload
            self.position = 0

        def read_bit(self):
            if self.position >= len(self.data) * 8:
                raise ValueError("unexpected end of shared-Huffman stream")
            bit = (self.data[self.position >> 3] >> (self.position & 7)) & 1
            self.position += 1
            return bit

        def read_bits(self, count):
            value = 0
            for shift in range(count):
                value |= self.read_bit() << shift
            return value

        def align_word(self):
            byte_index = (self.position + 7) >> 3
            byte_index = (byte_index + 3) & ~3
            self.position = byte_index * 8

    def make_tree(lengths):
        maximum = max(lengths) if lengths else 0
        counts = [0] * (maximum + 1)
        for length in lengths:
            if length:
                counts[length] += 1
        next_code = [0] * (maximum + 1)
        code = 0
        for bits in range(1, maximum + 1):
            code = (code + counts[bits - 1]) << 1
            next_code[bits] = code
        tree = {}
        for symbol, length in enumerate(lengths):
            if length:
                tree[(length, next_code[length])] = symbol
                next_code[length] += 1
        return tree

    def symbol(reader, tree):
        code = 0
        for length in range(1, 16):
            code = (code << 1) | reader.read_bit()
            result = tree.get((length, code))
            if result is not None:
                return result
        raise ValueError("invalid shared-Huffman code")

    length_base = (3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258)
    length_extra = (0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0)
    distance_base = (1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577)
    distance_extra = (0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13)
    code_order = (16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15)

    reader = BitReader(data)
    literal_count = reader.read_bits(5) + 257
    distance_count = reader.read_bits(5) + 1
    code_count = reader.read_bits(4) + 4
    code_lengths = [0] * 19
    for index in range(code_count):
        code_lengths[code_order[index]] = reader.read_bits(3)
    code_tree = make_tree(code_lengths)

    lengths = []
    required = literal_count + distance_count
    while len(lengths) < required:
        value = symbol(reader, code_tree)
        if value <= 15:
            lengths.append(value)
        elif value == 16:
            if not lengths:
                raise ValueError("repeat code appears before first code length")
            lengths.extend([lengths[-1]] * (reader.read_bits(2) + 3))
        elif value == 17:
            lengths.extend([0] * (reader.read_bits(3) + 3))
        elif value == 18:
            lengths.extend([0] * (reader.read_bits(7) + 11))
        else:
            raise ValueError("invalid code-length symbol")
        if len(lengths) > required:
            raise ValueError("shared-Huffman code-length table overflows")
    literal_tree = make_tree(lengths[:literal_count])
    distance_tree = make_tree(lengths[literal_count:])
    reader.align_word()

    output = bytearray()
    while True:
        final_block = reader.read_bit()
        block_type = reader.read_bits(2)
        if block_type == 0:
            reader.position = (reader.position + 7) & ~7
            offset = reader.position >> 3
            if offset + 4 > len(data):
                raise ValueError("truncated stored shared-Huffman block")
            size = data[offset] | (data[offset + 1] << 8)
            payload_start = offset + 4
            payload_end = payload_start + size
            if payload_end > len(data):
                raise ValueError("stored shared-Huffman block exceeds input")
            output.extend(data[payload_start:payload_end])
            reader.position = payload_end * 8
        elif block_type in (1, 2):
            while True:
                value = symbol(reader, literal_tree)
                if value < 256:
                    output.append(value)
                elif value == 256:
                    break
                else:
                    index = value - 257
                    if index < 0 or index >= len(length_base):
                        raise ValueError("invalid shared-Huffman length symbol")
                    length = length_base[index] + reader.read_bits(length_extra[index])
                    distance_symbol = symbol(reader, distance_tree)
                    if distance_symbol >= len(distance_base):
                        raise ValueError("invalid shared-Huffman distance symbol")
                    distance = distance_base[distance_symbol] + reader.read_bits(distance_extra[distance_symbol])
                    if distance <= 0 or distance > len(output):
                        raise ValueError("invalid shared-Huffman back-reference")
                    for _ in range(length):
                        output.append(output[-distance])
        else:
            raise ValueError("reserved shared-Huffman block type")

        reader.align_word()
        if final_block:
            break
    return bytes(output)


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

    raw_stream = comp_data[table_size:]
    shared_huffman = ((control >> 4) > 2) and ((control >> 4) != 5)
    if shared_huffman:
        decoded = _decode_shared_huffman(raw_stream)
    else:
        offsets = []
        for index in range(block_count):
            offset = struct.unpack_from(">I", comp_data, 4 + index * 4)[0]
            if index == 0:
                offset &= 0x00FFFFFF
            offsets.append(offset)
        offsets.append(len(raw_stream) + table_size + 16)

        output = bytearray()
        for index in range(block_count):
            start = offsets[index] - 16 - table_size
            end = offsets[index + 1] - 16 - table_size
            if start < 0 or end < start or end > len(raw_stream):
                raise ValueError("legacy EZIP block offset is outside the stream")
            output.extend(zlib.decompress(raw_stream[start:end], -15))
        decoded = bytes(output)

    return decoded, row_size, has_filters, False

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
    if resource_format in (2, 5) and bpp == 3:
        # SiFli format 5 is the three-byte RGB565 + alpha layout used by
        # native analog hand sprites; format 2 uses the same packed pixel order.
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
