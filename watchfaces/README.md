# Watchface library

The Android app reads this directory from the Plum-Watch GitHub repository.

Add each watchface in its own folder:

```
watchfaces/
  simplewatchface/
    simplewatchface.zip
    preview.png
```

The app looks for one `.zip` archive and one preview image (`.png`, `.jpg`, `.jpeg`, or `.webp`) in each watchface folder. The image is used in the catalogue; the ZIP is downloaded to the phone's Downloads folder.

The current repository is private. The Android app intentionally does not contain a personal GitHub token. The catalogue becomes available to app users after its files are served from a public source or a secure authenticated service is added.
