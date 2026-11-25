# App Store packages

Drop a QuickJS app ZIP directly into this folder. The catalogue workflow will:

- Create a folder using the ZIP filename, with its first character capitalized
- Move the ZIP into that folder
- Read an embedded app manifest or README when available
- Generate concise metadata and extract the app icon and preview artwork
- Publish the app in `store/index.json`

Example:

```
apps/
  Tetris/
    tetris.zip
    metadata.json
```

For best results, packages should follow the SiFli QuickJS layout under `dyn/dynamic_app/qjs_app/JA_<app_name>/`, with `main.js` as the application entry point. QuickJS apps use OTA type 5.
