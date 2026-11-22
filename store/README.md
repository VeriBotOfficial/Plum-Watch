# Plum Store content

The Store has two catalogues:

- `watchfaces/` — SiFli watchface ZIP packages.
- `apps/` — compatible watch apps and games, published only after their package and installation protocol are verified.

## Add a watchface or app

1. Create a folder under `watchfaces/<slug>/` or `apps/<slug>/`.
2. Put exactly one distributable `.zip` in that folder.
3. Optionally add a `metadata.json` file.
4. Push to `main`.

GitHub Actions validates the archive and regenerates `index.json`. It extracts a preview when the archive contains a supported preview image or animation. You do not edit the catalogue by hand and do not need to create a separate `preview.png`.

Example optional `metadata.json`:

```json
{
  "name": "My Watchface",
  "description": "A short description.",
  "author": "Doruk",
  "version": "1.0.0",
  "category": "Digital",
  "previewFile": "preview.gif"
}
```

If `previewFile` is omitted, the publisher looks for a file named `preview`, `cover`, or `thumbnail` inside the ZIP, then a single unambiguous image. Animated GIF previews are preserved and animated in the Android Store.

## Preview support

PNG, JPEG, WebP and GIF are supported automatically. The publisher also decodes SiFli EZIP background resources and can assemble numbered background frames into an animated GIF. For multi-frame EZIP packages, preview timing defaults to 120 ms per frame unless `previewFrameDurationMs` is set in metadata. The decoder rejects unsupported or malformed variants rather than creating a misleading preview.

## Compatibility

A package appearing in the catalogue does not imply every watch supports it. Plum checks the available transfer capability before starting a watchface installation. App/game installation remains unpublished until the target watch's app-install protocol is verified.
