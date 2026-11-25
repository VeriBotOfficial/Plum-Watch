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

Publish an app by uploading its ZIP directly to `store/apps/`:

```text
store/apps/
└── tetris.zip
```

The Store workflow automatically creates `store/apps/Tetris/`, moves the ZIP into it, reads any human-facing name, description, category, version and author from an embedded app manifest, and generates `metadata.json`, the app icon, preview and catalogue entry. If the ZIP has no useful description, the publisher creates a short description from the app name and category. Technical package details are kept out of the user-facing copy.

Uploading the same ZIP filename again replaces the package and refreshes its generated metadata and previews. Keep one app ZIP in each generated folder. The archive must contain a supported QuickJS app under `dyn/dynamic_app/qjs_app/`.

The App Store reads the generated `store/index.json`; do not edit generated catalogue or preview files manually.
