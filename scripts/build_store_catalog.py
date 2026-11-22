#!/usr/bin/env python3
"""Build the Plum Store catalogue and previews directly from ZIP packages."""
from __future__ import annotations

import argparse
import json
import re
import zipfile
from datetime import datetime, timezone
from io import BytesIO
from pathlib import Path
from urllib.parse import quote

from PIL import Image, ImageDraw, ImageOps, ImageSequence, ImageStat
from ezip_preview import decode_ezip_bytes

ROOT = Path(__file__).resolve().parents[1]
STORE = ROOT / "store"
RAW = "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/store"
IMAGE_EXTS = {".png", ".jpg", ".jpeg", ".webp", ".gif"}


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


def choose_preview(zf: zipfile.ZipFile):
    files = list(safe_zip_files(zf))
    preferred = ("preview", "cover", "thumbnail", "thumb", "poster")
    for prefix in preferred:
        matches = [
            entry for entry in files
            if Path(entry.filename).stem.lower() == prefix
            and Path(entry.filename).suffix.lower() in IMAGE_EXTS
        ]
        if matches:
            return sorted(matches, key=lambda entry: entry.filename)[0]
    images = [
        entry for entry in files
        if Path(entry.filename).suffix.lower() in IMAGE_EXTS
    ]
    return images[0] if len(images) == 1 else None


def _clock_digit_assets(zf: zipfile.ZipFile) -> dict[int, Image.Image]:
    """Decode the numbered SiFli clock glyphs (01..10 => 0..9)."""
    digits = {}
    for entry in safe_zip_files(zf):
        match = re.search(r"_time_num_(\\d+)\\.bin$", Path(entry.filename).name, re.IGNORECASE)
        if not match:
            continue
        try:
            number = int(match.group(1))
            if 1 <= number <= 10:
                image = decode_ezip_bytes(zf.read(entry)).convert("RGBA")
                # SiFli resource numbering is one-based: 01 is zero, 10 is nine.
                digits[number - 1 if number < 10 else 9] = image
        except Exception:
            continue
    return digits


def _render_clock_preview(background: Image.Image, digits: dict[int, Image.Image]) -> Image.Image:
    """Composite a representative 10:08 digital clock from the watchface's own glyphs."""
    required = (1, 0, 0, 8)
    if not all(number in digits for number in required):
        return background.convert("RGBA")

    canvas = background.convert("RGBA")
    glyphs = []
    for number in required:
        glyph = digits[number]
        alpha = glyph.getchannel("A")
        bounds = alpha.getbbox()
        if bounds:
            glyph = glyph.crop(bounds)
        else:
            continue
        glyphs.append(glyph)

    if len(glyphs) != 4:
        return canvas

    # Keep the original glyph design and aspect ratio; scale as one clock group.
    target_height = max(18, int(canvas.height * 0.105))
    scaled = []
    for glyph in glyphs:
        height = min(target_height, max(1, glyph.height))
        width = max(1, round(glyph.width * height / glyph.height))
        scaled.append(glyph.resize((width, height), Image.Resampling.LANCZOS))

    gap = max(2, round(target_height * 0.09))
    colon_width = max(4, round(target_height * 0.15))
    colon_gap = max(2, round(target_height * 0.06))
    clock_width = sum(g.width for g in scaled) + gap * 3 + colon_width + colon_gap * 2
    clock_height = max(g.height for g in scaled)
    x = max(0, (canvas.width - clock_width) // 2)
    # A restrained upper-middle placement keeps the clock legible without
    # covering the central subject in most portrait watchface compositions.
    y = max(0, round(canvas.height * 0.31) - clock_height // 2)

    positions = []
    cursor = x
    for index, glyph in enumerate(scaled):
        positions.append((cursor, y + (clock_height - glyph.height) // 2))
        cursor += glyph.width
        if index == 1:
            cursor += colon_gap
            cursor += colon_width
            cursor += colon_gap
        elif index < 3:
            cursor += gap

    for glyph, position in zip(scaled, positions):
        canvas.alpha_composite(glyph, position)

    # Match the colon to the glyph artwork instead of introducing a new font.
    sample = scaled[1].getpixel((scaled[1].width // 2, scaled[1].height // 2))
    color = sample if sample[3] > 0 else (255, 255, 255, 230)
    colon_x = positions[1][0] + scaled[1].width + colon_gap
    colon_x += max(0, (colon_width - max(2, target_height // 10)) // 2)
    dot = max(2, target_height // 10)
    draw = ImageDraw.Draw(canvas)
    center_y = y + clock_height // 2
    draw.ellipse((colon_x, center_y - dot * 2, colon_x + dot, center_y - dot), fill=color)
    draw.ellipse((colon_x, center_y + dot, colon_x + dot, center_y + dot * 2), fill=color)
    return canvas


def make_ezip_animation(zf: zipfile.ZipFile, item: dict, output_dir: Path) -> bool:
    candidates = []
    for entry in safe_zip_files(zf):
        base = Path(entry.filename).name.lower()
        match = re.search(r"_bg(\d*)\.bin$", base)
        if match:
            candidates.append((int(match.group(1)) if match.group(1) else 1, entry))
    candidates.sort(key=lambda pair: pair[0])
    if len(candidates) < 2:
        return False

    frames = [decode_ezip_bytes(zf.read(entry)) for _, entry in candidates]
    if len({frame.size for frame in frames}) != 1:
        raise ValueError(f"{item['name']}: EZIP frames have inconsistent dimensions")

    # SiFli dynamic modules store the clock as separate numbered image assets.
    # Render a stable sample time into every animated frame using those assets.
    clock_digits = _clock_digit_assets(zf)
    rgba_frames = [
        _render_clock_preview(frame, clock_digits) if clock_digits else frame.convert("RGBA")
        for frame in frames
    ]

    output_dir.mkdir(parents=True, exist_ok=True)
    gif_name = item["id"] + ".gif"
    duration = 120
    rgba_frames[0].save(
        output_dir / gif_name,
        save_all=True,
        append_images=rgba_frames[1:],
        duration=duration,
        loop=0,
        optimize=True,
        disposal=2,
    )

    best_frame = max(
        rgba_frames,
        key=lambda frame: sum(ImageStat.Stat(frame.convert("RGB")).mean) / 3
    )
    thumbnail = best_frame.copy()
    thumbnail.thumbnail((640, 780), Image.Resampling.LANCZOS)
    png_name = item["id"] + ".png"
    thumbnail.save(output_dir / png_name, format="PNG", optimize=True)

    item["previewUrl"] = f"{RAW}/generated/previews/{png_name}"
    item["animatedPreviewUrl"] = f"{RAW}/generated/previews/{gif_name}"
    item["previewFrameCount"] = len(rgba_frames)
    return True


def make_preview(zf: zipfile.ZipFile, item: dict, output_dir: Path):
    entry = choose_preview(zf)
    if entry is None:
        if make_ezip_animation(zf, item, output_dir):
            return
        names = [entry.filename.lower() for entry in safe_zip_files(zf)]
        item["previewStatus"] = (
            "requires_ezip_decoder"
            if any(name.endswith((".bin", ".dsc")) for name in names)
            else "no_preview_asset"
        )
        return

    with Image.open(BytesIO(zf.read(entry))) as source:
        source.load()
        output_dir.mkdir(parents=True, exist_ok=True)
        png_name = item["id"] + ".png"
        if source.format == "GIF" and getattr(source, "is_animated", False):
            frames = []
            durations = []
            for frame in ImageSequence.Iterator(source):
                frames.append(frame.convert("RGBA").copy())
                durations.append(frame.info.get("duration", 100))
            gif_name = item["id"] + ".gif"
            frames[0].save(
                output_dir / gif_name,
                save_all=True,
                append_images=frames[1:],
                duration=durations,
                loop=0,
                optimize=True,
            )
            best_frame = max(
                frames,
                key=lambda frame: sum(ImageStat.Stat(frame.convert("RGB")).mean) / 3
            )
            thumbnail = best_frame.copy()
            item["animatedPreviewUrl"] = f"{RAW}/generated/previews/{gif_name}"
        else:
            thumbnail = ImageOps.exif_transpose(source).convert("RGBA")
        thumbnail.thumbnail((640, 780), Image.Resampling.LANCZOS)
        thumbnail.save(output_dir / png_name, format="PNG", optimize=True)
        item["previewUrl"] = f"{RAW}/generated/previews/{png_name}"


def validate_archive(archive: Path):
    with zipfile.ZipFile(archive) as zf:
        corrupt = zf.testzip()
        if corrupt:
            raise ValueError(f"{archive}: corrupt ZIP member {corrupt}")
        # Validate every path before publishing the package.
        list(safe_zip_files(zf))
        return zf


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
        item = {
            "id": item_id,
            "name": archive.stem,
            "archiveUrl": f"{RAW}/watchfaces/{quote(archive.name, safe='')}",
            "archiveSizeBytes": archive.stat().st_size,
        }
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
        item = {
            "id": slug(folder.name),
            "name": folder.name.replace("-", " ").replace("_", " "),
            "archiveUrl": f"{RAW}/apps/{folder.name}/{archive.name}",
            "archiveSizeBytes": archive.stat().st_size,
            "previewStatus": "not_generated",
        }
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
    # Remove stale previews so deleted/renamed ZIPs cannot leave orphaned assets.
    for old_preview in output_dir.glob("*"):
        if old_preview.is_file() and old_preview.suffix.lower() in {".png", ".gif"}:
            old_preview.unlink()

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
