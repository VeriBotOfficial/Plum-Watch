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

from PIL import Image, ImageOps, ImageSequence, ImageStat
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

    output_dir.mkdir(parents=True, exist_ok=True)
    gif_name = item["id"] + ".gif"
    duration = 120
    rgba_frames = [frame.convert("RGBA") for frame in frames]
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
    for archive in sorted(base.glob("*.zip"), key=lambda path: path.name.casefold()):
        item_id = slug(archive.stem)
        item = {
            "id": item_id,
            "name": archive.stem,
            "archiveUrl": f"{RAW}/watchfaces/{archive.name}",
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
