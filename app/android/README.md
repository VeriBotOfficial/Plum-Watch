# Plum Watch Android app

A lightweight Android companion app for HK-series watches and watches exposing the supported SiFli / Wearfit BLE protocols.

## Build

### Requirements

- A current Android Studio release compatible with Android Gradle Plugin 9.1.1
- Internet access for Gradle and Maven Central dependency downloads
- JDK 17
- Android SDK Platform 37
- Android SDK Build-Tools 37.0.0

Open **this folder** in Android Studio:

`app/android/`

Allow Gradle sync to finish, select the `app` run configuration, then use **Build → Build Bundle(s) / APK(s) → Build APK(s)**.

From this folder, build on Windows with:

```powershell
.\gradlew.bat assembleDebug
```

On macOS or Linux:

```sh
sh ./gradlew testDebugUnitTest assembleDebug
```

The first run downloads Gradle 9.3.1 into the local Gradle user directory. The debug APK is written to:

```
app/build/outputs/apk/debug/app-debug.apk
```

## App structure

- **My Watch** — BLE discovery, connection state, battery status, Find Watch, alarms, Health (heart rate) and watchface transfer.
- **Store** — loads `/store/index.json`; Watchface Store previews and transfers supported SiFli ZIP packages. App Store is present, but app/game installation is not enabled until the WearFit app-install transfer path is reconstructed and verified.
- **Settings → Watch controls** — documented Wearfit settings including language, time format, wrist wake, automatic health measurements, body-temperature mode, sleep mode, sedentary and water reminders, notification display preferences, physical-training options and heart-rate zones.
- **Settings → Alarms / Find Watch** — dedicated device controls.

The floating navigation bar uses the backdrop renderer and sample tab components from [Kyant0/AndroidLiquidGlass](https://github.com/Kyant0/AndroidLiquidGlass) (Apache-2.0), with `io.github.kyant0:backdrop:2.0.1` and `io.github.kyant0:shapes:1.2.1`.

## Connecting an HK watch

1. Turn on the watch and keep it close to the phone.
2. Open **My Watch → Connect a watch**.
3. Grant the Nearby Devices permission.
4. Select the watch from the scan results.
5. Wait for GATT service discovery to complete.

If another companion app currently holds the watch connection, disconnect it there before testing. Some watch models expose different BLE services or require a separate bonding step.

A successful BLE link is not, by itself, proof that every protocol feature is present. The app detects the writable proprietary serial characteristic independently from its notification support. This distinction matters: documented Wearfit settings and alarms use BLE writes, while the SiFli watchface transfer requires response notifications/indications as well.

## BLE and Wearfit capabilities

### Standard Bluetooth services

- **Battery Service (0x180F):** read or subscribe to Battery Level (0x2A19) when the characteristic exposes the required properties.
- **Heart Rate Service (0x180D):** subscribe to Heart Rate Measurement (0x2A37) when notifications or indications are available.
- **Immediate Alert Service (0x1802):** send the standard alert-level command for Find Watch.
- **Current Time Service (0x1805):** synchronize the phone's local time when the watch exposes a writable Current Time characteristic.

### Wearfit proprietary channel

The Android app uses the same SiFli serial characteristic for proprietary Wearfit commands. A writable characteristic is enough to enable the command controls; notifications are only required for response-driven features such as watchface transfer.

Implemented command paths:

- **Connection setup and battery:** phone-system identification, connect request, device-info request and battery report (145).
- **Find Watch:** standard Immediate Alert when available, plus proprietary command 113 fallback.
- **Alarms:** command 115 with eight alarm slots, time, repeat mask and vibration/sound flags.
- **Device settings:** raise wrist (119), automatic HR/SpO₂ mode (120), shake-to-photo mode (121), language (123), 12/24-hour format (124), body temperature mode (134), sleep mode (127), notification display preferences (114 variant), physical-training options (1) and HR zones (252).
- **Reminders:** sedentary (117) and drink-water (163) schedules.
- **Phone media controls:** incoming watch commands for play, pause, next, previous and volume-up are translated into Android media/audio key events.
- **Time synchronization:** standard Current Time Service when writable; proprietary command 144 as a fallback when standard CTS is absent.
- **Watchfaces:** SiFli per-file transfer, gated separately on successful notification/indication setup.

For settings that have no read-back or acknowledgement in the available protocol notes, the UI reports that Android queued the BLE write. It does not claim that the watch confirmed or retained the setting.

### Protocol limitations

The current research notes do not provide reliable enough payload definitions to implement these end-to-end:

- Weather: the documented length field conflicts with the listed seven-day temperature, icon and wind arrays.
- Do Not Disturb: command ID is known, but its payload layout is not documented.
- Contact-name/phone synchronization: the packet fragmentation and ordering are incomplete.
- Historical health replies: command 199 describes watch-originated requests, but not the phone reply formats or an integrated health-data source.
- Camera preview/photo transfer: the watch-side shake-to-photo toggle is implemented; the camera preview/photo event flow is not.
- GPS, map navigation, OTA, voice/AI, calendar, recordings and call-log transfers: analyzer names are present in the reference, but complete payload/transport formats and the required app services are not.

QR Code sending is intentionally not part of the Android app.

The HK10 Pro Max+ firmware project in the available HK-Custom-Firmware repository is a firmware skeleton and generic SiFli SDK source, not a complete Wearfit command bridge. Features still need validation against the physical watch model. No successful BLE write can guarantee that a particular firmware build supports that setting.

## SiFli watchface transfer

SiFli serial framing and reassembly are isolated in `SifliSerialProtocol.kt`. JVM tests cover little-endian message headers, MTU-based fragmentation, reassembly, malformed fragments and recovery.

Plum Watch unzips a watchface archive on the phone, then pushes each file separately with its ZIP-relative path (prefixed with `/`) as the destination path. File data indexes start at 1, files are sorted by descending size with GIFs last, and type 0 (watchface/DIALPLATE) files are sent raw without padding or CRC. The extractor validates paths, prevents traversal outside the cache directory, and enforces file-count and expanded-size limits.

The generic SiFli WFPUSH2 sample uses a different transfer type and is not interchangeable with the HK watch's native receiver. SiFli's separate Android OTA demo also contains an `OTA_SIFLI_WATCHFACE` route; its presence does not prove that the HK firmware build exposes it.

## Watchface Store packages

Place each watchface ZIP directly in the repository's `store/watchfaces/` directory:

```
store/watchfaces/
  Red John.zip
  Simple Watchface.zip
```

The ZIP filename is the display name. No per-watchface folders, metadata files or separate preview files are required. A push that adds, replaces, renames or removes a ZIP automatically runs the Store catalogue workflow, which validates the archive and generates a preview when the ZIP contains supported image/GIF assets or decodable SiFli EZIP frames.

## Package

- Application ID: `me.doruk.plumwatch`
- Minimum Android version: Android 8.0 (API 26)
- Compile SDK: 37
- Target SDK: 37
