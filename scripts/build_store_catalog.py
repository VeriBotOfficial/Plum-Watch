#!/usr/bin/env python3
"""Build the Plum Store catalogue and render SiFli watchfaces from package evidence."""
from __future__ import annotations

import argparse
import json
import re
import struct
import zipfile
from datetime import datetime, timezone
from io import BytesIO
from pathlib import Path
from urllib.parse import quote

from PIL import Image, ImageDraw, ImageOps, ImageStat, ImageSequence
from ezip_preview import decode_ezip_bytes

ROOT = Path(__file__).resolve().parents[1]
STORE = ROOT / "store"
RAW = "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/store"
IMAGE_EXTS = {".png", ".jpg", ".jpeg", ".webp", ".gif"}
SAMPLE_TIME = (10, 8, 30)
SAMPLE_DATE = (22, 11, 2026)


def slug(value: str) -> str:
    value = re.sub(r"[^A-Za-z0-9_-]+", "-", value.strip()).strip("-").lower()
    return value or "item"


def safe_zip_files(zf: zipfile.ZipFile):
    for info in zf.infolist():
        if info.is_dir():
            continue
        name = info.filename.replace("\\", "/")
        if name.startswith("/") or ".." in Path(name).parts:
            raise ValueError(f"Unsafe path in ZIP: {info.filename}")
        yield info


def _elf_imports(data: bytes) -> set[str]:
    """Read undefined dynamic ELF symbols without executing the ARM module."""
    if len(data) < 52 or data[:4] != b"\x7fELF" or data[4] != 1 or data[5] != 1:
        return set()
    try:
        shoff = struct.unpack_from("<I", data, 32)[0]
        shentsize, shnum = struct.unpack_from("<HH", data, 46)
        if shentsize < 40 or shoff + shentsize * shnum > len(data):
            return set()
        sections = [struct.unpack_from("<IIIIIIIIII", data, shoff + i * shentsize) for i in range(shnum)]
        imports = set()
        for section in sections:
            if section[1] not in (2, 11):
                continue
            offset, size, link, entsize = section[4], section[5], section[6], section[9]
            if not entsize or link >= len(sections):
                continue
            strings_section = sections[link]
            strings = data[strings_section[4]:strings_section[4] + strings_section[5]]
            for pos in range(offset, min(offset + size, len(data)), entsize):
                if pos + 16 > len(data):
                    break
                name_off = struct.unpack_from("<I", data, pos)[0]
                shndx = struct.unpack_from("<H", data, pos + 14)[0]
                if shndx != 0 or name_off >= len(strings):
                    continue
                end = strings.find(b"\0", name_off)
                if end < 0:
                    continue
                name = strings[name_off:end].decode("ascii", "ignore")
                if name:
                    imports.add(name)
        return imports
    except (IndexError, struct.error, ValueError):
        return set()


def _package_model(zf: zipfile.ZipFile) -> dict:
    """Identify rendering capabilities from ELF imports and actual resource families."""
    files = list(safe_zip_files(zf))
    modules = {}
    for entry in files:
        if entry.filename.lower().endswith(".so") and "/installer/" in entry.filename.lower() and not entry.filename.lower().endswith("_res.so"):
            modules[Path(entry.filename).stem] = _elf_imports(zf.read(entry))
    all_imports = set().union(*modules.values()) if modules else set()
    names = [Path(entry.filename).name.lower() for entry in files]
    families = {
        "time_num": any(re.search(r"_time_num_\d+\.bin$", name) for name in names),
        "time_digits": any(re.search(r"_time\d+\.bin$", name) for name in names),
        "date_digits": any(re.search(r"_date\d+\.bin$", name) for name in names),
        "analog_hands": all(any(name.endswith("_" + hand + ".bin") for name in names) for hand in ("h", "m", "s")),
        "animated_backgrounds": sum(bool(re.search(r"_bg\d*\.bin$", name)) for name in names) > 1,
    }
    if {"lv_wf_set_analog_hour_hand", "lv_wf_set_analog_min_hand"}.issubset(all_imports) and families["analog_hands"]:
        kind = "analog"
    elif families["time_digits"] and "get_wf_clock_hour_num" in all_imports:
        kind = "digital_complications"
    elif families["time_num"] and "get_wf_clock_hour_num" in all_imports:
        kind = "digital_split"
    else:
        kind = "unknown"
    return {"kind": kind, "modules": modules, "imports": all_imports, "families": families}


def choose_preview(zf: zipfile.ZipFile):
    files = list(safe_zip_files(zf))
    for prefix in ("preview", "cover", "thumbnail", "thumb", "poster"):
        matches = [e for e in files if Path(e.filename).stem.lower() == prefix and Path(e.filename).suffix.lower() in IMAGE_EXTS]
        if matches:
            return sorted(matches, key=lambda e: e.filename)[0]
    images = [e for e in files if Path(e.filename).suffix.lower() in IMAGE_EXTS]
    return images[0] if len(images) == 1 else None


def _asset_images(zf: zipfile.ZipFile) -> dict[str, Image.Image]:
    assets = {}
    for entry in safe_zip_files(zf):
        if not entry.filename.lower().endswith(".bin"):
            continue
        name = Path(entry.filename).stem.lower()
        try:
            assets[name] = decode_ezip_bytes(zf.read(entry)).convert("RGBA")
        except Exception:
            continue
    return assets


def _find_asset(assets: dict[str, Image.Image], suffix: str):
    matches = [image for name, image in assets.items() if name.endswith(suffix)]
    return matches[0] if len(matches) == 1 else None


def _digit_set(assets: dict[str, Image.Image], prefix: str) -> dict[int, Image.Image]:
    result = {}
    for name, image in assets.items():
        match = re.search(re.escape(prefix) + r"(\d+)$", name)
        if match:
            number = int(match.group(1))
            # time_num_01..10 is a one-based SiFli glyph bank (01=0, 10=9).
            if prefix == "time_num_" and 1 <= number <= 10:
                result[number - 1] = image
            elif 0 <= number <= 9:
                result[number] = image
    return result


def _draw_digit_row(canvas: Image.Image, digits: dict[int, Image.Image], values: str, y: int, *, center: bool = True, gap: int = 0):
    if not values or any(not char.isdigit() or int(char) not in digits for char in values):
        return False
    glyphs = [digits[int(char)] for char in values]
    height = max(image.height for image in glyphs)
    width = sum(image.width for image in glyphs) + gap * (len(glyphs) - 1)
    x = (canvas.width - width) // 2 if center else 0
    if y < 0 or y + height > canvas.height or x < 0 or x + width > canvas.width:
        return False
    for glyph in glyphs:
        canvas.alpha_composite(glyph, (x, y + (height - glyph.height) // 2))
        x += glyph.width + gap
    return True


def _render_split_digital(background: Image.Image, assets: dict[str, Image.Image], module_id: str) -> tuple[Image.Image, bool]:
    canvas = background.convert("RGBA")
    # The 1000/1003 modules share the same clock construction and offsets.
    # Resource IDs, not the user-visible ZIP name, select this verified layout.
    if module_id in {"wf_clock1000", "wf_clock1003"}:
        digits = _digit_set(assets, "time_num_")
        if len(digits) == 10:
            # Native glyphs are 168x194; the original module uses top-left alignment.
            for value, x, y in (("10", 38, 42), ("08", 32, 258)):
                for index, char in enumerate(value):
                    glyph = digits[int(char)]
                    canvas.alpha_composite(glyph, (x + index * glyph.width, y))
            return canvas, True
    # Other SiFli digital modules expose a numbered time glyph family. Use
    # the module's own glyph dimensions and center the four-digit clock as a
    # conservative generic layout; do not borrow another module's coordinates.
    digits = _digit_set(assets, "time")
    if len(digits) == 10:
        glyphs = [digits[int(char)] for char in f"{SAMPLE_TIME[0]:02d}{SAMPLE_TIME[1]:02d}"]
        colon = next((image for name, image in assets.items() if name.endswith("_timech")), None)
        gap = max(2, int(max(image.height for image in glyphs) * 0.035))
        parts = [glyphs[0], glyphs[1]]
        if colon is not None:
            parts.append(colon)
        parts.extend(glyphs[2:])
        total_width = sum(image.width for image in parts) + gap * (len(parts) - 1)
        total_height = max(image.height for image in parts)
        x = (canvas.width - total_width) // 2
        y = max(8, int(canvas.height * 0.075))
        if x >= 0 and y + total_height <= canvas.height:
            for image in parts:
                canvas.alpha_composite(image, (x, y + (total_height - image.height) // 2))
                x += image.width + gap
            return canvas, True
        return canvas, False
    return canvas, False


def _render_analog(background: Image.Image, assets: dict[str, Image.Image]) -> tuple[Image.Image, bool]:
    """Compose a sample analog time using native hand resources and a shared dial pivot."""
    hands = [_find_asset(assets, "_" + suffix) for suffix in ("h", "m", "s")]
    if any(hand is None for hand in hands):
        return background.convert("RGBA"), False
    canvas = background.convert("RGBA")
    # The two supplied analog modules use the same 320x384 logical hand table
    # on a 410x494 resource canvas. Scale the table's center to the decoded
    # canvas instead of assuming the ZIP's display name or dimensions.
    cx, cy = canvas.width / 2, canvas.height / 2
    hour, minute, second = SAMPLE_TIME
    angles = (hour % 12 * 30 + minute * 0.5, minute * 6, second * 6)
    for hand, angle in zip(hands, angles):
        rotated = hand.rotate(-angle, resample=Image.Resampling.BICUBIC, expand=True)
        # Native hand artwork is pivoted at its lower center.
        pivot_x, pivot_y = hand.width / 2, hand.height * 0.88
        pivot_offset = pivot_y - hand.height / 2
        radians = __import__("math").radians(angle)
        rotated_pivot = (
            rotated.width / 2 + pivot_offset * __import__("math").sin(radians),
            rotated.height / 2 + pivot_offset * __import__("math").cos(radians),
        )
        canvas.alpha_composite(rotated, (round(cx - rotated_pivot[0]), round(cy - rotated_pivot[1])))
    return canvas, True


def _render_watchface_frame(background: Image.Image, assets: dict[str, Image.Image], model: dict) -> tuple[Image.Image, bool]:
    if model["kind"] == "analog":
        return _render_analog(background, assets)
    if model["kind"] in {"digital_split", "digital_complications"}:
        # The internal module identifier is authoritative. A single ZIP may
        # contain paired/resource modules, so resolve the primary clock module.
        module_id = next((name for name in model["modules"] if name.startswith("wf_clock") and not name.endswith("_res")), "")
        return _render_split_digital(background, assets, module_id)
    return background.convert("RGBA"), False


def _ezip_backgrounds(zf: zipfile.ZipFile) -> list[tuple[int, Image.Image]]:
    candidates = []
    for entry in safe_zip_files(zf):
        match = re.search(r"_bg(\d*)\.bin$", Path(entry.filename).name, re.IGNORECASE)
        if match:
            try:
                frame = decode_ezip_bytes(zf.read(entry)).convert("RGBA")
                candidates.append((int(match.group(1)) if match.group(1) else 1, frame))
            except Exception:
                continue
    candidates.sort(key=lambda pair: pair[0])
    return candidates


def _save_preview_frames(frames: list[Image.Image], item: dict, output_dir: Path):
    if not frames:
        return
    output_dir.mkdir(parents=True, exist_ok=True)
    png_name = item["id"] + ".png"
    best_frame = max(frames, key=lambda frame: sum(ImageStat.Stat(frame.convert("RGB")).mean) / 3)
    thumbnail = best_frame.copy()
    thumbnail.thumbnail((640, 780), Image.Resampling.LANCZOS)
    thumbnail.save(output_dir / png_name, format="PNG", optimize=True)
    item["previewUrl"] = f"{RAW}/generated/previews/{png_name}"
    if len(frames) > 1:
        gif_name = item["id"] + ".gif"
        frames[0].save(output_dir / gif_name, save_all=True, append_images=frames[1:], duration=120, loop=0, optimize=True, disposal=2)
        item["animatedPreviewUrl"] = f"{RAW}/generated/previews/{gif_name}"
        item["previewFrameCount"] = len(frames)


def make_preview(zf: zipfile.ZipFile, item: dict, output_dir: Path):
    model = _package_model(zf)
    item["rendering"] = {
        "type": model["kind"],
        "modules": sorted(model["modules"]),
        "features": sorted(name for name, present in model["families"].items() if present),
    }
    assets = _asset_images(zf)
    backgrounds = _ezip_backgrounds(zf)
    if backgrounds:
        rendered = []
        clock_rendered = False
        for _, frame in backgrounds:
            output, has_clock = _render_watchface_frame(frame, assets, model)
            rendered.append(output)
            clock_rendered = clock_rendered or has_clock
        _save_preview_frames(rendered, item, output_dir)
        item["previewStatus"] = "rendered" if clock_rendered else ("background_only" if model["kind"] != "unknown" else "unsupported_module")
        return

    entry = choose_preview(zf)
    if entry is None:
        item["previewStatus"] = "no_preview_asset"
        return
    with Image.open(BytesIO(zf.read(entry))) as source:
        source.load()
        output_dir.mkdir(parents=True, exist_ok=True)
        if source.format == "GIF" and getattr(source, "is_animated", False):
            frames = [frame.convert("RGBA").copy() for frame in ImageSequence.Iterator(source)]
            _save_preview_frames(frames, item, output_dir)
        else:
            image = ImageOps.exif_transpose(source).convert("RGBA")
            _save_preview_frames([image], item, output_dir)


def scan_watchfaces(output_dir: Path):
    entries = []
    base = STORE / "watchfaces"
    if not base.exists():
        return entries
    seen_ids = set()
    for archive in sorted(base.glob("*.zip"), key=lambda path: path.name.casefold()):
        item_id = slug(archive.stem)
        if item_id in seen_ids:
            raise ValueError(f"Watchface filenames produce a duplicate Store ID: {archive.name}")
        seen_ids.add(item_id)
        item = {"id": item_id, "name": archive.stem, "archiveUrl": f"{RAW}/watchfaces/{quote(archive.name, safe='')}", "archiveSizeBytes": archive.stat().st_size}
        with zipfile.ZipFile(archive) as zf:
            corrupt = zf.testzip()
            if corrupt:
                raise ValueError(f"{archive}: corrupt ZIP member {corrupt}")
            list(safe_zip_files(zf))
            try:
                make_preview(zf, item, output_dir)
            except Exception as exc:
                item["previewStatus"] = "preview_failed"
                item["previewError"] = str(exc)[:180]
        entries.append(item)
    return entries


def scan_apps(output_dir: Path):
    entries = []
    base = STORE / "apps"
    if not base.exists():
        return entries
    for folder in sorted(path for path in base.iterdir() if path.is_dir()):
        archives = sorted(folder.glob("*.zip"))
        if not archives:
            continue
        if len(archives) > 1:
            raise ValueError(f"{folder}: keep one ZIP in each app folder")
        archive = archives[0]
        item = {"id": slug(folder.name), "name": folder.name.replace("-", " ").replace("_", " "), "archiveUrl": f"{RAW}/apps/{folder.name}/{archive.name}", "archiveSizeBytes": archive.stat().st_size, "previewStatus": "not_generated"}
        with zipfile.ZipFile(archive) as zf:
            corrupt = zf.testzip()
            if corrupt:
                raise ValueError(f"{archive}: corrupt ZIP member {corrupt}")
            list(safe_zip_files(zf))
        entries.append(item)
    return entries


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--write", action="store_true")
    args = parser.parse_args()
    output_dir = STORE / "generated" / "previews"
    output_dir.mkdir(parents=True, exist_ok=True)
    for old in output_dir.glob("*"):
        if old.is_file() and old.suffix.lower() in {".png", ".gif"}:
            old.unlink()
    catalogue = {
        "schemaVersion": 1,
        "generatedAt": datetime.now(timezone.utc).isoformat(),
        "watchfaces": scan_watchfaces(output_dir),
        "apps": scan_apps(output_dir),
    }
    rendered = json.dumps(catalogue, indent=2, ensure_ascii=False) + "\n"
    if args.write:
        (STORE / "index.json").write_text(rendered, encoding="utf-8")
        print(f"Published {len(catalogue['watchfaces'])} watchfaces and {len(catalogue['apps'])} apps.")
    else:
        print(rendered)


if __name__ == "__main__":
    main()
