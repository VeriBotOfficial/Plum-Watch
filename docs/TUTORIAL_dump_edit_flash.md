# Tutorial: Dump, Edit, and Flash HK 10 Pro Max+ (SF32LB525) Firmware

**Target:** HK 10 Pro Max+ smartwatch  
**Chip:** SiFli SF32LB525 (dual-core, 240 MHz)  
**Repo:** `VeriBotOfficial/Plum-Watch` (this repo) + reference `VeriBotOfficial/HK-Custom-Firmware`  
**UART adapter:** CP2102 USB 2.0 UART TTL (you already have this)  
**Flash tool:** `sftool` (OpenSiFli) v0.2.7 — installed to `/usr/local/bin/sftool`

This tutorial walks you through:
1. Opening the watch and connecting the CP2102
2. Dumping the original firmware to a file (backup)
3. Editing the dump / building custom firmware
4. Flashing it back

> **WARNING:** Flashing can brick your watch. Always keep a known-good dump. Work on a watch you can afford to lose. Do not connect 5 V to the watch.

---

## Part 0 — What is in this repo

```
Plum Watch/
├── app/                          # Android companion app (Kotlin, already here)
├── docs/                         # Tutorials (this folder)
│   ├── TUTORIAL_dump_edit_flash.md
│   ├── HARDWARE_PINOUT_CP2102.md
│   └── ESP8266_UART_BACKUP.md
├── firmware/
│   └── hk10promaxplus/
│       └── v1/watch/
│           └── hk10promaxplus_firmware/   # reference SiFli SDK project (from HK-Custom-Firmware)
├── scripts/                      # helper shell scripts
│   ├── dump_firmware.sh
│   └── flash_firmware.sh
├── sifli_sdk/                    # empty — place your installed SiFli SDK here (Windows-oriented)
├── dumps/                        # put your firmware backups here
└── watchfaces/                   # watchface catalogue for the Android app
```

The reference firmware project under `firmware/hk10promaxplus/v1/watch/hk10promaxplus_firmware/` is copied from `VeriBotOfficial/HK-Custom-Firmware` (upstream: `amir1387aht/hk_watchs_hack`). It contains the SiFli SDK project files, `ptab.json` (partition table), `proj.conf` (menuconfig options), and source.

---

## Part 1 — Prepare your PC (already done, but here's the record)

These steps were run to prepare your Fedora PC:

1. **Cloned Plum-Watch** into `/home/doruk/Desktop/Plum Watch`:
   ```bash
   cd "/home/doruk/Desktop/Plum Watch"
   git clone --depth 1 https://github.com/VeriBotOfficial/Plum-Watch.git .
   ```
2. **Installed `sftool`** (SiFli flash download/read tool, v0.2.7):
   ```bash
   sudo install -m 0755 sftool /usr/local/bin/sftool
   sftool --version   # -> sftool 0.2.7
   ```
   Source: `github.com/OpenSiFli/sftool`
3. **Installed Python tools**:
   ```bash
   python3 -m pip install --user pyserial intelhex binwalk
   ```
4. **Directory layout** created (`docs/`, `scripts/`, `dumps/`, `sifli_sdk/`, `firmware/`).

**On Windows** (the SiFli SDK is Windows-oriented), you would additionally:
- Install the official SiFli SDK (see `https://docs.sifli.com/projects/sdk/latest/sf32lb52x/quickstart/install/script/windows.html`)
- Use the **"SiFli-SDK Environment"** terminal (runs `set_env.bat` / `export.sh`)
- Install CP210x VCP driver from Silicon Labs
- `scons` and the ARM GCC toolchain come with the SDK

---

## Part 2 — Hardware: connect the CP2102

Full wiring details are in `docs/HARDWARE_PINOUT_CP2102.md`. Quick summary:

| Watch debug pad | CP2102 pin | Wire |
|---|---|---|
| `DBG_TX0` | RX | Watch -> PC |
| `DBG_RX0` | TX | PC -> Watch |
| `GND` | GND | Common ground |

- **Do NOT connect CP2102 VCC/5V to the watch.**
- Power the watch from its own battery / magnetic charger.
- If no response, swap TX and RX.
- Find your port: `ls /dev/ttyUSB*` (Linux) or Device Manager -> COM port (Windows).

---

## Part 3 — Dump (backup) the original firmware

### 3.1 Know your flash map

The HK 10 Pro Max+ uses the SF32LB525 with an external NOR flash on **MPI2**. From the reference `ptab.json` (board `eh-lb525`), the C-BUS addresses sftool uses are:

| Partition | C-BUS address | Size | What it is |
|---|---|---|---|
| `ftab` (flash table) | `0x12000000` | `0x8000` (32 KB) | Partition table |
| `bootloader` | `0x12020000` | `0x10000` (64 KB) | 2nd-stage bootloader |
| `main` (HCPU_FLASH_CODE) | `0x12060000` | `0x380000` (3.5 MB) | Main application firmware |
| `dfu` | `0x1203E0000` | `0x80000` (512 KB) | DFU/recovery firmware |

> **Note:** sftool internally converts C-BUS `0x12xxxxxx` to S-BUS `0x62xxxxxx`. Use the C-BUS addresses above with sftool. Your actual watch may differ slightly — verify against the `ptab.json` in `firmware/hk10promaxplus/v1/watch/hk10promaxplus_firmware/v1/watch/project/eh-lb525_hcpu/ptab.json` after you build once.

### 3.2 Enter download mode

The SF32LB52x BootROM stays in UART download mode for ~2000 ms after power-on/reset.

1. Connect CP2102 (TX/RX/GND only).
2. Power the watch ON (or press reset / reinsert battery).
3. Immediately run the dump command — you have ~2 seconds while the bootloader is listening.

### 3.3 Run the dump

Use `scripts/dump_firmware.sh` (Linux) or run sftool directly.

**Linux (Fedora):**
```bash
cd "/home/doruk/Desktop/Plum Watch"
chmod +x scripts/dump_firmware.sh
./scripts/dump_firmware.sh /dev/ttyUSB0
```

**Windows (PowerShell, SiFli-SDK Environment):**
```powershell
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\ftab.bin@0x12000000:0x8000"
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\bootloader.bin@0x12020000:0x10000"
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\main.bin@0x12060000:0x380000"
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\dfu.bin@0x1203E0000:0x80000"
```

Replace `COM3` with your actual port and `/dev/ttyUSB0` with your actual device.

### 3.4 Verify the dump

```bash
ls -lh dumps/
file dumps/*.bin
binwalk dumps/main.bin          # look for known signatures
xxd dumps/main.bin \| head       # hex peek
```

Keep multiple copies of `dumps/` — this is your only way to recover if flashing goes wrong.

**Helper script** (`scripts/dump_firmware.sh`): see Part 6.

---

## Part 4 — Edit the firmware

### Option A — Patch the raw dump (advanced / risky)

You can edit `dumps/main.bin` with a hex editor (e.g., Bless, HxD, ImHex) or with Python (`intelhex` is installed). Changes must be same-size (no insertions/deletions) unless you also update the flash table (`ftab`).

Common things people look for in a dump:
- Strings / build paths / version info (`strings dumps/main.bin`)
- Bluetooth UUIDs
- Menu labels / UI text
- Checksums (editing may break them)

Use `binwalk` and `strings` to explore before editing.

### Option B — Rebuild from source (recommended)

The proper way to make custom firmware is to modify the SiFli SDK project and rebuild:

1. Install the **official SiFli SDK** (Windows). Put a copy/reference in `sifli_sdk/`.
2. Open the **SiFli-SDK Environment** terminal.
3. Navigate:
   ```bash
   cd firmware/hk10promaxplus/v1/watch/hk10promaxplus_firmware/v1/watch/project/eh-lb525_hcpu
   ```
4. (Optional) customize:
   ```bash
   scons --menuconfig --board=eh-lb525
   ```
5. Build:
   ```bash
   scons --board=eh-lb525 -j8
   ```
6. Output appears in `build_eh-lb525_hcpu/`. You get `main.bin`, `bootloader.bin`, `ftab.bin`.

Edit source under `src/` (e.g., `watch_app.c`, GUI apps, resources) to customize behavior, then rebuild.

---

## Part 5 — Flash the firmware back

### 5.1 Flash command

Flash each partition at its address. Order matters: flash table + bootloader first, then main.

**Windows (PowerShell):**
```powershell
sftool -c SF32LB52 -m nor -p COM3 write_flash --verify "build\ftab.bin@0x12000000"
sftool -c SF32LB52 -m nor -p COM3 write_flash --verify "build\bootloader.bin@0x12020000"
sftool -c SF32LB52 -m nor -p COM3 write_flash --verify "build\main.bin@0x12060000"
```

**Linux:**
```bash
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify build_eh-lb525_hcpu/ftab.bin@0x12000000
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify build_eh-lb525_hcpu/bootloader.bin@0x12020000
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify build_eh-lb525_hcpu/main.bin@0x12060000
```

`--verify` reads back and checks. Add `-e` (erase-all) only if you intend to wipe — **do not erase unless you have a backup and know what you're doing.**

### 5.2 If flashing fails

- Swap TX/RX and retry.
- Close any other serial terminal using the COM port.
- Power-cycle the watch right before flashing (re-enter download mode).
- Add `--compat true` if you get timeouts or verify failures:
  ```bash
  sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 --compat true write_flash --verify ...
  ```
- The watch may auto-reset and run the new firmware after flashing; the screen should light up.

### 5.3 Recover from a bad flash

If the watch won't boot:
1. Re-enter download mode (power-cycle / reset).
2. Flash your **original backup** (`dumps/`) back at the same addresses.
3. The factory bootloader (ROM) is usually still intact, so UART download should still work.

---

## Part 6 — Helper scripts

### `scripts/dump_firmware.sh` (Linux)

```bash
#!/usr/bin/env bash
# Dump HK 10 Pro Max+ (SF32LB525) flash via sftool + CP2102.
# Usage: ./dump_firmware.sh /dev/ttyUSB0
set -euo pipefail

PORT="${1:-/dev/ttyUSB0}"
OUT_DIR="dumps"
BAUD="${BAUD:-1000000}"
CHIP="SF32LB52"
MEM="nor"

mkdir -p "$OUT_DIR"

echo "[*] Dumping HK 10 Pro Max+ firmware from $PORT ..."
echo "[!] Make sure the watch is in UART download mode (power-cycle it now!)."

sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" read_flash "$OUT_DIR/ftab.bin@0x12000000:0x8000"
sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" read_flash "$OUT_DIR/bootloader.bin@0x12020000:0x10000"
sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" read_flash "$OUT_DIR/main.bin@0x12060000:0x380000"
sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" read_flash "$OUT_DIR/dfu.bin@0x1203E0000:0x80000"

echo "[+] Dump complete. Files in $OUT_DIR/"
ls -lh "$OUT_DIR"
```

### `scripts/flash_firmware.sh` (Linux)

```bash
#!/usr/bin/env bash
# Flash HK 10 Pro Max+ firmware via sftool + CP2102.
# Usage: ./flash_firmware.sh /dev/ttyUSB0 build_eh-lb525_hcpu
set -euo pipefail

PORT="${1:-/dev/ttyUSB0}"
BUILD_DIR="${2:-build_eh-lb525_hcpu}"
BAUD="${BAUD:-1000000}"
CHIP="SF32LB52"
MEM="nor"

echo "[!] Power-cycle the watch into download mode before continuing."
read -rp "Press Enter once the watch is in download mode..."

sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" write_flash --verify "$BUILD_DIR/ftab.bin@0x12000000"
sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" write_flash --verify "$BUILD_DIR/bootloader.bin@0x12020000"
sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" write_flash --verify "$BUILD_DIR/main.bin@0x12060000"

echo "[+] Flash complete. The watch should reboot and run the new firmware."
```

Make them executable:
```bash
chmod +x scripts/dump_firmware.sh scripts/flash_firmware.sh
```

---

## Part 7 — Quick reference commands

```bash
# Version
sftool --version

# Dump all partitions (Linux)
./scripts/dump_firmware.sh /dev/ttyUSB0

# Flash all partitions (Linux)
./scripts/flash_firmware.sh /dev/ttyUSB0 build_eh-lb525_hcpu

# Read a single region
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 read_flash backup.bin@0x12060000:0x380000

# Write + verify a single region
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify main.bin@0x12060000

# Erase a region (DANGEROUS)
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 erase_region 0x12060000:0x380000

# Compatibility mode (if timeouts/verify fail)
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 --compat true ...
```

---

## References

- `VeriBotOfficial/HK-Custom-Firmware` — SDK project + flashing README (forked from `amir1387aht/hk_watchs_hack`)
- `OpenSiFli/sftool` — `sftool` download/read tool (v0.2.7 installed)
- SiFli SDK Programming Guide — https://docs.sifli.com/projects/sdk/latest/sf32lb52x/
- SiFli flash usage / addresses — https://docs.sifli.com/projects/sdk/latest/en/sf32lb52x/app_note/flash_usage.html
- `VeriBotOfficial/Plum-Watch` — this repo (Android app + watchfaces)
