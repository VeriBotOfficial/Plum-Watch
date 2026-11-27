# Windows Simulator

This directory documents the native SiFli PC simulator target for the HK10 Pro Max+ firmware. It builds the real firmware application sources for the SiFli SDK's Windows PC simulator.

## Run

From the repository root, run:

```bat
firmware\hk10promax\run_simulator_windows.bat
```

The launcher activates the SDK environment through `export.ps1`, finds Visual Studio's x64 C++ environment, builds `pc_hcpu`, and starts the simulator. You do not need to run `export.ps1` manually before each launch.

SDK detection checks `SIFLI_SDK`, `SIFLI_SDK_PATH`, and common install folders on available drives. For a non-standard SDK location, pass it explicitly:

```bat
firmware\hk10promax\run_simulator_windows.bat B:\path\to\SiFli-SDK
```

The launcher also accepts an already-activated x64 Native Tools PowerShell prompt. Visual Studio's **Desktop development with C++** workload is required. If your SDK version requires local paths in `msvc_setup.bat`, configure that file once for your Visual Studio and Windows SDK installation.

The executable is generated at `firmware/hk10promax/project/build_pc_hcpu/main.exe`. The simulator uses the same application source tree as the watch firmware, but hardware-only services and peripherals need simulator-specific implementations and will not behave like physical watch hardware.
