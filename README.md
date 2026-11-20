# Plum Watch

Custom firmware & app for HK watches.

This repository holds the Android companion app (`/app`) and the firmware tooling for the **HK 10 Pro Max+ (SiFli SF32LB525)**: reverse-engineering guides, hardware pinouts, dump/edit/flash tutorials, helper scripts, and a reference SiFli SDK project.

The firmware reference project under `firmware/hk10promaxplus/` is based on `VeriBotOfficial/HK-Custom-Firmware` (upstream: `amir1387aht/hk_watchs_hack`).

---

## Repository layout

```
Plum Watch/
├── app/                          # Android companion app (Kotlin)
├── docs/                         # Tutorials and pinout guides
│   ├── TUTORIAL_dump_edit_flash.md
│   ├── HARDWARE_PINOUT_CP2102.md
│   └── ESP8266_UART_BACKUP.md
├── firmware/
│   └── hk10promaxplus/
│       └── v1/watch/
│           └── hk10promaxplus_firmware/  # reference SiFli SDK project
├── scripts/                      # helper shell scripts
│   ├── dump_firmware.sh
│   └── flash_firmware.sh
├── sifli_sdk/                    # place your installed SiFli SDK here
├── dumps/                        # firmware backups (back these up externally)
└── watchfaces/                   # watchface catalogue for the Android app
```

---

## Goal: custom firmware for HK 10 Pro Max+ (SF32LB525)

1. Open the watch and locate the debug UART pads.
2. Wire a USB-to-UART adapter (e.g., CP2102, FTDI, CH340).
3. **Dump** the original firmware (backup first).
4. **Edit** the dump or rebuild from the SiFli SDK project.
5. **Flash** it back.

Start here: `docs/TUTORIAL_dump_edit_flash.md`

Wiring: `docs/HARDWARE_PINOUT_CP2102.md`

---

## Quick reference

| Task | Command |
|---|---|
| Dump all partitions | `./scripts/dump_firmware.sh /dev/ttyUSB0` |
| Flash all partitions | `./scripts/flash_firmware.sh /dev/ttyUSB0 build_eh-lb525_hcpu` |
| sftool version | `sftool --version` |

Flash map (C-BUS addresses from `ptab.json`):

| Partition | Address | Size |
|---|---|---|
| `ftab` | `0x12000000` | `0x8000` |
| `bootloader` | `0x12020000` | `0x10000` |
| `main` | `0x12060000` | `0x380000` |
| `dfu` | `0x1203E0000` | `0x80000` |

---

## PC preparation

### Linux

1. Clone the repository:

```bash
git clone --depth 1 https://github.com/VeriBotOfficial/Plum-Watch.git
cd Plum-Watch
```

2. Install `sftool` (SiFli flash download/read tool, from `OpenSiFli/sftool`):

```bash
# download the prebuilt binary for your platform from
# https://github.com/OpenSiFli/sftool/releases
sudo install -m 0755 sftool /usr/local/bin/sftool
sftool --version
```

3. Install Python tools:

```bash
python3 -m pip install --user pyserial intelhex binwalk
```

4. Install the CP210x VCP driver if needed (built into most Linux kernels).

### Windows

1. Install the official SiFli SDK: https://docs.sifli.com/projects/sdk/latest/sf32lb52x/quickstart/install/script/windows.html
2. Use the **"SiFli-SDK Environment"** terminal.
3. Install `sftool` and add it to PATH.
4. Install the CP210x VCP driver from Silicon Labs.
5. `scons` and the ARM GCC toolchain come with the SDK.

---

## ⚠️ Safety

- **Never** connect a UART adapter's 5V / VCC pin to the watch. Connect TX, RX, and GND only.
- Power the watch from its own battery / magnetic charger, never from the UART adapter.
- Use 3.3 V logic levels (or a level shifter if needed).
- **Always** keep a backup dump in `dumps/` and copy it off the computer.
- Flashing can brick the watch. Work on a watch you can afford to lose.
