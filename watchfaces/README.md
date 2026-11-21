# Watchface library

The Android app loads this static catalogue from `watchfaces/index.json` using GitHub's raw file hosting.

Each watchface has its own folder:

```
watchfaces/
  index.json
  example/
    example.zip
    preview.png
```

Add one object to `index.json` for every watchface:

```json
{
  "id": "example",
  "name": "example",
  "previewUrl": "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/watchfaces/example/preview.png",
  "archiveUrl": "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/watchfaces/example/example.zip"
}
```
