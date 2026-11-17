# Watchface library

The Android app loads this static catalogue from `watchfaces/index.json` using GitHub's raw file hosting, not the GitHub REST API. This avoids the unauthenticated GitHub API rate limit that can affect all app users sharing an IP address.

Each watchface has its own folder:

```
watchfaces/
  index.json
  Red John/
    Red John.zip
    preview.png
```

Add one object to `index.json` for every watchface:

```json
{
  "id": "Red John",
  "name": "Red John",
  "previewUrl": "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/watchfaces/Red%20John/preview.png",
  "archiveUrl": "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/watchfaces/Red%20John/Red%20John.zip"
}
```

The preview is displayed in the catalogue; the ZIP is downloaded to the phone's Downloads folder. Keep the repository public so the app can read these files without a personal access token.
