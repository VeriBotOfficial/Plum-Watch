# Windows Simulator

This directory documents the native SiFli PC simulator target for the HK10 Pro Max+ firmware. It runs the firmware's LVGL application sources in the SiFli SDK PC simulator; it is not a UI mockup.

## Run

1. Install the SiFli SDK and its Windows build environment.
2. Configure the SDK's `msvc_setup.bat` for the installed Visual Studio / Windows SDK, as required by SiFli.
3. Open **x64 Native Tools Command Prompt for Visual Studio**.
4. Run from the repository root:

```bat
firmware\hk10promax\run_simulator_windows.bat C:\path\to\SiFli-SDK
```

You can also set `SIFLI_SDK` before running the batch file.

The SDK's `pc_hcpu` target produces `firmware/hk10promax/project/build_pc_hcpu/main.exe`. The simulator uses the same application source tree as the watch firmware. Hardware-only services and peripherals may require simulator-specific handling and will not behave like physical watch hardware.
