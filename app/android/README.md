# Plum Watch · Android app

A lightweight Android companion app for HK-series watches. This project is the app foundation; the custom watch firmware and vendor-specific command protocol are separate stages.

## Build

### Requirements

- A current Android Studio release compatible with Android Gradle Plugin 9.1.1
- JDK 17
- Android SDK Platform 36 (Android 16) and Build-Tools 36.0.0
- Android SDK Build-Tools 36.0.0

Open **this folder** in Android Studio:

`app/android/`

Allow Gradle sync to finish, select the `app` run configuration, then use **Build → Build Bundle(s) / APK(s) → Build APK(s)**.

The repository includes small Gradle bootstrap scripts. On Windows, from this folder, run:

```powershell
.\gradlew.bat assembleDebug
```

On macOS or Linux:

```sh
sh ./gradlew assembleDebug
```

The first run downloads Gradle 9.3.1 into the local Gradle user directory. It does not install Android Studio or the Android SDK for you.

The debug APK is written to:

```
app/build/outputs/apk/debug/app-debug.apk
```

## Current app structure

- **My Watch** — scans nearby BLE devices, lets you select a watch, opens a real Bluetooth GATT connection, discovers its GATT services, and can disconnect/remove the current connection.
- **Watchfaces** — reads the Git tree under `/watchfaces/`, finds each folder's ZIP archive and preview image, and downloads the archive to `Downloads/Plum Watchfaces/`.
- **Settings** — System / Light / Dark theme selection, Bluetooth status, app version, and developer credits for Doruk Çavdar and Troy Mitchell.

The bottom navigation is a floating, translucent glass-style pill inspired by the supplied Apple Watch companion screenshots. The UI is built with native Kotlin and Jetpack Compose.

## Connecting an HK watch

1. Turn on the watch and keep it close to the phone.
2. Open **My Watch → Connect a watch**.
3. Grant the Nearby Devices permission.
4. Select the watch from the scan results.
5. Wait for the GATT connection and service discovery to complete.

If another companion app currently holds the watch connection, disconnect it there before testing. Some watch models expose different BLE services or require a separate bonding step.

**Important:** this first version proves and displays the BLE/GATT connection. It does not yet implement Wearfit Pro's proprietary HK commands. The Notifications, Alarms, Find Watch, Health, Weather, Camera, and Music tiles are placeholders until the exact watch protocol is identified and tested against hardware. A successful GATT connection alone does not mean those actions are implemented.

## Watchface folder format

Create one folder per watchface:

```
watchfaces/
  simplewatchface/
    simplewatchface.zip
    preview.png
```

Accepted preview formats are PNG, JPG, JPEG, and WebP. Each folder must contain both an archive and an image to appear in the app. The app chooses a preview named `preview.*`, `cover.*`, or `thumbnail.*` first when present.

No watchfaces are included yet.

## GitHub visibility note

The Plum-Watch repository is currently private. A normal Android app cannot read a private GitHub repository without authenticating users. A personal access token must **never** be embedded in the APK, because users could extract it.

The catalogue code is ready for the repository's public GitHub Git Trees API. It displays a clear private/unavailable state until the catalogue is served publicly or a secure sign-in/backend flow is added. The repository's visibility has not been changed.

## Package

- Application ID: `me.doruk.plumwatch`
- Minimum Android version: Android 8.0 (API 26)
- Compile SDK: 36
- Target SDK: 36
- Version: 0.1.0
