# Plum Watch

Custom firmware & app for HK watches — now including **HK 10 Pro Max+ (SiFli SF32LB525)** custom-firmware tooling.

This repo started as the Android companion app (`/app`). It now also holds the firmware side: reverse-engineering, dump/edit/flash tutorials, hardware pinouts, helper scripts, and a reference SiFli SDK project for the HK 10 Pro Max+.

> I am the owner of both `VeriBotOfficial/Plum-Watch` and `VeriBotOfficial/HK-Custom-Firmware`. The firmware reference project was copied from `HK-Custom-Firmware` (upstream: `amir1387aht/hk_watchs_hack`) into `/firmware`.

---

## Repository layout

```
Plum Watch/
├── app/                          # Android companion app (Kotlin, original content)
├── docs/                         # Tutorials
│   ├── TUTORIAL_dump_edit_flash.md     # dump / edit / flash the HK 10 Pro Max+ firmware
│   ├── HARDWARE_PINOUT_CP2102.md       # how to wire your CP2102 to the watch
│   └── ESP8266_UART_BACKUP.md          # use an ESP8266 as a UART adapter (last resort)
├── firmware/
│   └── hk10promaxplus/
│       └── v1/watch/
│           └── hk10promaxplus_firmware/  # reference SiFli SDK project (from HK-Custom-Firmware)
├── scripts/                      # helper shell scripts
│   ├── dump_firmware.sh            # dump flash via sftool + CP2102 (Linux)
│   └── flash_firmware.sh           # flash firmware via sftool + CP2102 (Linux)
├── sifli_sdk/                    # empty — place your SiFli SDK here (Windows-oriented)
├── dumps/                        # put your firmware backups here (gitignored-ish; back up externally!)
└── watchfaces/                   # watchface catalogue for the Android app
```

---

## Goal: custom firmware for HK 10 Pro Max+ (SF32LB525)

1. Open the watch and locate the debug UART pads.
2. Wire a **CP2102 USB-to-UART** adapter (you have one).
3. **Dump** the original firmware (backup first!).
4. **Edit** the dump or rebuild from the SiFli SDK project.
5. **Flash** it back.

Start here: `docs/TUTORIAL_dump_edit_flash.md`

Wiring: `docs/HARDWARE_PINOUT_CP2102.md`

---

## Quick reference

| Task | Command (Linux) |
|---|---|
| Dump firmware | `./scripts/dump_firmware.sh /dev/ttyUSB0` |
| Flash firmware | `./scripts/flash_firmware.sh /dev/ttyUSB0 build_eh-lb525_hcpu` |
| sftool version | `sftool --version` |

Flash map (C-BUS addresses from `ptab.json`):

| Partition | Address | Size |
|---|---|---|
| `ftab` | `0x12000000` | `0x8000` |
| `bootloader` | `0x12020000` | `0x10000` |
| `main` | `0x12060000` | `0x380000` |
| `dfu` | `0x1203E0000` | `0x80000` |

---

## PC prep (already done)

- `sftool` v0.2.7 installed to `/usr/local/bin/sftool` (from `OpenSiFli/sftool`)
- Python tools: `pyserial`, `intelhex`, `binwalk`
- Repo cloned from `VeriBotOfficial/Plum-Watch`
- Reference firmware project copied from `VeriBotOfficial/HK-Custom-Firmware`

On Windows, also install the official **SiFli SDK** and use the **"SiFli-SDK Environment"** terminal, plus the CP210x VCP driver.

---

## ⚠️ Safety

- **Never** connect CP2102 5V/VCC to the watch. TX/RX/GND only.
- Power the watch from its own battery / charger.
- **Always** keep a backup dump in `dumps/` (and copy it off the PC).
- Flashing can brick the watch. Work on a watch you can afford to lose.
