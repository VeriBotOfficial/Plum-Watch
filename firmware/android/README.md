# Android firmware UI simulator

This Android entry point adds an interactive watch-shaped UI preview to the existing Plum Watch app. It is built with the same Android Gradle project as the companion app, so the APK includes the existing My Watch, Store and Settings features as well.

## Build

Requirements: JDK 17+, Android SDK, and network access for the Gradle dependencies.

Windows PowerShell:

```powershell
.\firmware\android\build-apk.ps1
```

Linux or macOS:

```sh
sh firmware/android/build-apk.sh
```

The builder assembles the existing Android app as a debug APK. The copied APK is written to:

```
firmware/android/build/plum-watch-simulator.apk
```

The Android app build and simulator UI are isolated from the SiFli firmware project. Nothing under `firmware/hk10promax` is edited or rebuilt by these scripts.

## Simulator controls

- Tap the watch face or press the Digital Crown to open the app grid.
- Tap an app icon to open its preview.
- Press the Digital Crown from an app to return to the app grid.
- Press the Digital Crown from the app grid to return to the watch face.
- Android's system Back action leaves the simulator.

The current SiFli `pc_hcpu` target uses the Windows simulator backend and Windows-specific input APIs. The SiFli SDK in this repository does not provide an Android host backend. Therefore this APK currently contains an interactive Android UI preview; it does not execute `main.exe`, boot the SF32 firmware image, or emulate the SF32 hardware. Sensor-backed values and watch peripherals are placeholders in this preview. The existing Windows simulator and physical-watch firmware remain separate and unchanged.
