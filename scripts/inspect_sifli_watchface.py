#!/usr/bin/env python3
"""Inspect SiFli watchface metadata, ELF layout, relocations and Thumb code."""
from __future__ import annotations

import re
import struct
import subprocess
import tempfile
import zipfile
from pathlib import Path

ARCHIVE = Path("store/watchfaces/Red John.zip")


def image_header(data: bytes):
    word = struct.unpack_from("<I", data, 0)[0]
    return {"format": word & 0x1F, "width": (word >> 10) & 0x7FF, "height": (word >> 21) & 0x7FF}


with zipfile.ZipFile(ARCHIVE) as archive:
    for name in archive.namelist():
        if name.endswith(".dsc"):
            data = archive.read(name)
            print("DSC", name, "length", len(data), "repr", repr(data), "hex", data.hex())
        elif name.endswith(".so"):
            data = archive.read(name)
            print("\nSO", name, "length", len(data), "header", data[:64].hex())
            print("ASCII STRINGS", [s.decode("ascii", "replace") for s in re.findall(rb"[ -~]{4,}", data)])
            with tempfile.NamedTemporaryFile(suffix=".so") as tmp:
                tmp.write(data)
                tmp.flush()
                commands = (
                    ["readelf", "-h", tmp.name],
                    ["readelf", "-S", tmp.name],
                    ["readelf", "-Ws", tmp.name],
                    ["readelf", "-r", tmp.name],
                    ["arm-none-eabi-objdump", "-D", "-M", "force-thumb", tmp.name],
                )
                for command in commands:
                    print("\nCOMMAND", " ".join(command))
                    result = subprocess.run(command, text=True, capture_output=True)
                    print(result.stdout[:80000])
                    if result.stderr:
                        print("STDERR", result.stderr[:3000])
        elif "_time_num_" in name or re.search(r"_bg\d*\.bin$", name):
            data = archive.read(name)
            print("IMAGE", name, image_header(data), "bytes", len(data))
