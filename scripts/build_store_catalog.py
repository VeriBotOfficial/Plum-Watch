#!/usr/bin/env python3
"""Build the public Plum Store catalogue and safe previews from ZIP packages."""
from __future__ import annotations

import argparse
import json
import re
import zipfile
from datetime import datetime, timezone
from io import BytesIO
from pathlib import Path

from PIL import Image, ImageOps, ImageSequence

ROOT = Path(__file__).resolve().parents[1]
STORE = ROOT / "store"
RAW = "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/store"
IMAGE_EXTS = {".png", ".jpg", ".jpeg", ".webp", ".gif"}


def slug(value: str) -> str:
    value = re.sub(r"[^A-Za-z0-9_-]+", "-", value.strip()).strip("-").lower()
    return value or "item"


def read_metadata(folder: Path) -> dict:
    path = folder / "metadata.json"
    if not path.exists():
        return {}
    data = json.loads(path.read_text(encoding="utf-8"))
    if not isinstance(data, dict):
        raise ValueError(f"{path}: metadata must be a JSON object")
    return data


def safe_zip_files(zf: zipfile.ZipFile):
    for info in zf.infolist():
        if info.is_dir():
            continue
        name = info.filename.replace("\\", "/")
        if name.startswith("/") or ".." in Path(name).parts:
            raise ValueError(f"Unsafe path in ZIP: {info.filename}")
        yield info


def choose_preview(zf: zipfile.ZipFile, metadata: dict):
    files = list(safe_zip_files(zf))
    by_name = {entry.filename: entry for entry in files}
    requested = metadata.get("previewFile")
    if requested:
        if requested not in by_name:
            raise ValueError(f"previewFile {requested!r} not found in archive")
        return by_name[requested]

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


def make_preview(zf: zipfile.ZipFile, item: dict, output_dir: Path):
    entry = choose_preview(zf, item)
    if entry is None:
        names = [entry.filename.lower() for entry in safe_zip_files(zf)]
        if any(name.endswith((".bin", ".dsc")) for name in names):
            item["previewStatus"] = "requires_ezip_decoder"
        else:
            item["previewStatus"] = "no_preview_asset"
        return

    raw = zf.read(entry)
    try:
        with Image.open(BytesIO(raw)) as source:
            source.load()
            output_dir.mkdir(parents=True, exist_ok=True)
            if source.format == "GIF" and getattr(source, "is_animated", False):
                frames = []
                durations = []
                for frame in ImageSequence.Iterator(source):
                    frames.append(frame.convert("RGBA").copy())
                    durations.append(frame.info.get("duration", 100))
                output_name = slug(item["id"]) + ".gif"
                frames[0].save(
                    output_dir / output_name,
                    save_all=True,
                    append_images=frames[1:],
                    duration=durations,
                    loop=0,
                    optimize=True,
                )
            else:
                image = ImageOps.exif_transpose(source).convert("RGBA")
                image.thumbnail((720, 880), Image.Resampling.LANCZOS)
                output_name = slug(item["id"]) + ".png"
                image.save(output_dir / output_name, format="PNG", optimize=True)

            item["previewUrl"] = f"{RAW}/generated/previews/{output_name}"
            item["previewStatus"] = "generated"
    except Exception as exc:
        item["previewStatus"] = "unsupported_preview_asset"
        item["previewError"] = str(exc)[:180]


def scan_category(category: str, output_dir: Path):
    entries = []
    base = STORE / category
    if not base.exists():
        return entries

    for folder in sorted(path for path in base.iterdir() if path.is_dir()):
        archives = sorted(folder.glob("*.zip"))
        if not archives:
            continue
        if len(archives) > 1:
            raise ValueError(f"{folder}: keep exactly one distributable ZIP in each package folder")

        metadata = read_metadata(folder)
        archive = archives[0]
        item = {
            "id": metadata.get("id") or folder.name,
            "name": metadata.get("name") or folder.name.replace("-", " ").replace("_", " "),
            "description": metadata.get("description", ""),
            "author": metadata.get("author", ""),
            "version": str(metadata.get("version", "1.0.0")),
            "category": metadata.get("category", "Other"),
            "archiveUrl": f"{RAW}/{category}/{folder.name}/{archive.name}",
            "archiveSizeBytes": archive.stat().st_size,
        }

        with zipfile.ZipFile(archive) as zf:
            corrupt = zf.testzip()
            if corrupt:
                raise ValueError(f"{archive}: corrupt ZIP member {corrupt}")
            if category == "watchfaces":
                make_preview(zf, item, output_dir)
            else:
                item["previewStatus"] = "not_generated"
        entries.append(item)

    return entries


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--write", action="store_true")
    args = parser.parse_args()

    output_dir = STORE / "generated" / "previews"
    catalogue = {
        "schemaVersion": 1,
        "generatedAt": datetime.now(timezone.utc).isoformat(),
        "watchfaces": scan_category("watchfaces", output_dir),
        "apps": scan_category("apps", output_dir),
    }
    rendered = json.dumps(catalogue, indent=2, ensure_ascii=False) + "\n"
    if args.write:
        (STORE / "index.json").write_text(rendered, encoding="utf-8")
        print(
            f"Published {len(catalogue['watchfaces'])} watchfaces "
            f"and {len(catalogue['apps'])} apps."
        )
    else:
        print(rendered)


if __name__ == "__main__":
    main()
