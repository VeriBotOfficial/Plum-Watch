# Plum Watch Android app

A lightweight Android companion app for HK-series watches or any watch flashed with plumOS.

## Build

### Requirements

- A current Android Studio release compatible with Android Gradle Plugin 9.1.1
- Internet access for Gradle and Maven Central dependency downloads
- JDK 17
- Android SDK Platform 37 (Android 17)
- Android SDK Build-Tools 37.0.0

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

- **My Watch** — scans nearby BLE devices and maintains a Bluetooth LE GATT connection
- **Watchfaces** — reads the Git tree under `/watchfaces/`, finds each folder's ZIP archive and preview image, and downloads the archive to `Downloads/Plum Watchfaces/`.
- **Settings** — Various settings for the app.

The floating navigation bar uses the backdrop renderer and sample tab components from [Kyant0/AndroidLiquidGlass](https://github.com/Kyant0/AndroidLiquidGlass) (Apache-2.0), with `io.github.kyant0:backdrop:2.0.1` and `io.github.kyant0:shapes:1.2.1`.

## Connecting an HK watch

1. Turn on the watch and keep it close to the phone.
2. Open **My Watch → Connect a watch**.
3. Grant the Nearby Devices permission.
4. Select the watch from the scan results.
5. Wait for the GATT connection and service discovery to complete.

If another companion app currently holds the watch connection, disconnect it there before testing. Some watch models expose different BLE services or require a separate bonding step.

**Protocol status:** the app implements standard GATT Battery, Heart Rate, and Immediate Alert profiles only when the watch advertises those exact services and characteristics. These are capability-detected; a supported sensor chip does not guarantee the firmware exposes the standard profile. The HK10 PRO MAX+ is listed by Chronos, but Chronos notes that individual features are not guaranteed. Wearfit Pro's private command protocol is not yet implemented. Notifications, alarms, and other proprietary controls still require a captured, model-specific protocol exchange and physical-device testing. A successful GATT connection alone does not mean those actions are implemented.

## Watchface folder format

Create one folder per watchface:

```
watchfaces/
  simplewatchface/
    simplewatchface.zip
    preview.png
```

Accepted preview formats are PNG, JPG, JPEG, and WebP. Each folder must contain both an archive and an image to appear in the app. The app chooses a preview named `preview.*`, `cover.*`, or `thumbnail.*` first when present.

## Package

- Application ID: `me.doruk.plumwatch`
- Minimum Android version: Android 8.0 (API 26)
- Compile SDK: 37
- Target SDK: 37
