# Plum Store content

## Watchfaces

Add a watchface by placing its ZIP directly in `store/watchfaces/`:

```text
store/watchfaces/
├── Red John.zip
└── Bla Bla Face.zip
```

The ZIP filename is the Store name. No folders, metadata files, descriptions, author fields, or version fields are needed. Use a descriptive filename; the part before `.zip` is shown in the app.

Every push that adds, replaces, renames, or removes a watchface ZIP automatically starts the **Publish Store catalogue** GitHub Action. It validates the archive, extracts a preview where supported, and regenerates `store/index.json`. Do not edit the generated catalogue or preview files manually.

Supported preview assets inside a ZIP: PNG, JPEG, WebP and GIF. If no standalone image is included, the publisher also attempts to decode SiFli EZIP background frames into an animated preview.

## Apps

App packages remain under `store/apps/<slug>/` until their package format and installation protocol are verified.

A package appearing in the catalogue does not imply compatibility with every watch model.
