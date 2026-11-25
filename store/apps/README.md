# App Store packages

Place each watch app or game in its own folder:

```
apps/
  Tetris/
    Tetris.zip
    metadata.json
```

The catalogue publisher reads metadata and extracts preview artwork directly from SiFli EZIP resources inside each package. Use `packageType: "qjs"` and `otaType: 5` for QuickJS applications. GUIBuilder packages use their own transfer type and must not be labelled as QJS.

Metadata fields: `id`, `name`, `description`, `category`, `version`, `author`, `compatibility`, `packageType`, and `otaType`.
