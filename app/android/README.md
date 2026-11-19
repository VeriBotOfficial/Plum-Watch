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

## BLE protocol implementation status

The Android GATT layer currently capability-detects these standard Bluetooth services:

- Battery Service (0x180F): read and/or subscribe to the Battery Level characteristic when the advertised properties allow it.
- Heart Rate Service (0x180D): subscribe to Heart Rate Measurement when notifications or indications are available.
- Immediate Alert Service (0x1802): send the standard alert-level command for Find Watch.
- Current Time Service (0x1805): set the phone's local date/time only when the watch exposes the Current Time characteristic with the standard Write property. Read-only CTS implementations are not treated as synchronizable.

SiFli serial framing and reassembly are isolated in `SifliSerialProtocol.kt`. JVM tests cover little-endian message headers, MTU-based fragmentation, reassembly, malformed fragments and recovery. Watchface receiver status values are mapped from the SiFli firmware enum; in particular, status 22 means that the watch application rejected the destination file path. The mapping improves diagnosis but does not itself repair the watch-side path policy.

### HK-specific limitations

The HK10 Pro Max+ project in the available HK-Custom-Firmware repository contains a firmware project skeleton and generic SiFli SDK sources, but not the watch application's registered watchface filesystem callback or the Wearfit phone-to-watch BLE command bridge. Its alarm manager header defines internal firmware messages (list/add/edit/enable/disable/delete), but no corresponding phone-facing GATT/serial command encoding is provided. The generic SiFli ANCS example is Apple Notification Center Service support and is not an Android notification-forwarding protocol.

For that reason, notifications, alarm synchronization, music/camera controls, and the HK-specific watchface path rejection are not presented as implemented. They require a successful reference-app packet trace or equivalent model-specific protocol source, followed by physical-device testing. Do not infer proprietary command IDs or payloads from the generic serial transport alone.

The Android CI workflow runs `testDebugUnitTest` and `assembleDebug` for pull requests and BLE foundation branches.

### Reference transfer examples are not interchangeable

SiFli's public generic BLE file-transfer example documents WFPUSH2 with File Type 3 and byte alignment for writing a ZIP into a development board's `file_recv` directory ([official example](https://docs.sifli.com/projects/sdk/latest/en/sf32lb58x/example/ble/file_transfer/README.html)). That is a generic file-receive workflow, not proof that an HK watch's native watchface receiver expects the same type or destination.

Plum Watch keeps native watchface file type 0, matching the successful option-0 reference-app test reported for the same HK10 Pro Max+ and ZIP. The generic example's type 3 setting is deliberately not copied into this watchface flow.

SiFli's separate Android OTA demo also contains an `OTA_SIFLI_WATCHFACE` path through its OTA V3 manager ([demo source](https://github.com/OpenSiFli/SiFli_OTA_APP)). That is a separate higher-level transfer route; its presence in the demo does not prove that the HK firmware build exposes or supports it.


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
