# Tutorial: Dump, Edit, and Flash HK 10 Pro Max+ (SF32LB525) Firmware

**Target:** HK 10 Pro Max+ smartwatch  
**Chip:** SiFli SF32LB525 (dual-core, 240 MHz)  
**Repository:** `VeriBotOfficial/Plum-Watch` + reference `VeriBotOfficial/HK-Custom-Firmware`  
**UART adapter:** CP2102 USB 2.0 UART TTL (or FTDI / CH340)  
**Flash tool:** `sftool` (OpenSiFli) v0.2.7  

This tutorial walks you through:

1. Opening the watch and connecting a UART adapter
2. Dumping the original firmware to a file (backup)
3. Editing the dump or building custom firmware
4. Flashing it back

> **WARNING:** Flashing can brick your watch. Always keep a known-good dump. Work on a watch you can afford to lose. Do not connect 5 V to the watch.

---

## Repository contents

| Path | Contents |
|---|---|
| `docs/TUTORIAL_dump_edit_flash.md` | This tutorial |
| `docs/HARDWARE_PINOUT_CP2102.md` | CP2102 wiring and pinout |
| `docs/ESP8266_UART_BACKUP.md` | ESP8266 as a UART adapter (fallback) |
| `scripts/dump_firmware.sh` | Linux helper to dump flash via sftool |
| `scripts/flash_firmware.sh` | Linux helper to flash firmware via sftool |
| `firmware/hk10promaxplus/v1/watch/hk10promaxplus_firmware/` | Reference SiFli SDK project |
| `dumps/` | Store firmware backups here |

The reference firmware project is based on `VeriBotOfficial/HK-Custom-Firmware` (upstream: `amir1387aht/hk_watchs_hack`). It contains the SiFli SDK project files, `ptab.json` (partition table), `proj.conf` (menuconfig options), and source.

---

## Prepare your PC

### Install sftool

Download the prebuilt `sftool` binary for your platform from https://github.com/OpenSiFli/sftool/releases and place it on your PATH:

```bash
# Linux example
sudo install -m 0755 sftool /usr/local/bin/sftool
sftool --version   # sftool 0.2.7
```

### Install Python tools

```bash
python3 -m pip install --user pyserial intelhex binwalk
```

### SiFli SDK (for rebuilding firmware)

The SiFli SDK is Windows-oriented. To rebuild custom firmware from source:

1. Install the official SiFli SDK: https://docs.sifli.com/projects/sdk/latest/sf32lb52x/quickstart/install/script/windows.html
2. Use the **"SiFli-SDK Environment"** terminal.
3. Place the SDK (or a reference to it) in `sifli_sdk/`.

---

## Hardware: connect the UART adapter

Full wiring details are in `docs/HARDWARE_PINOUT_CP2102.md`. Quick summary for a CP2102:

| Watch debug pad | CP2102 pin | Direction |
|---|---|---|
| `DBG_TX0` | RX | Watch -> PC |
| `DBG_RX0` | TX | PC -> Watch |
| `GND` | GND | Common ground |

- Connect **TX to RX** and **RX to TX**. If there is no response, swap the two signal wires.
- **Do NOT connect VCC/5V to the watch.** GND only.
- Power the watch from its own battery / magnetic charger.
- Find your port: `ls /dev/ttyUSB*` (Linux) or Device Manager -> COM port (Windows).

---

## Dump (backup) the original firmware

### Flash map

The HK 10 Pro Max+ uses the SF32LB525 with external NOR flash on MPI2. From the reference `ptab.json` (board `eh-lb525`), the C-BUS addresses used by sftool are:

| Partition | C-BUS address | Size | What it is |
|---|---|---|---|
| `ftab` (flash table) | `0x12000000` | `0x8000` (32 KB) | Partition table |
| `bootloader` | `0x12020000` | `0x10000` (64 KB) | 2nd-stage bootloader |
| `main` (HCPU_FLASH_CODE) | `0x12060000` | `0x380000` (3.5 MB) | Main application firmware |
| `dfu` | `0x1203E0000` | `0x80000` (512 KB) | DFU/recovery firmware |

sftool internally maps C-BUS `0x12xxxxxx` to S-BUS `0x62xxxxxx`. Use the C-BUS addresses above with sftool. The actual watch layout may differ slightly — verify against the `ptab.json` in the reference project after building once.

### Enter download mode

The SF32LB52x BootROM stays in UART download mode for ~2000 ms after power-on/reset.

1. Connect the UART adapter (TX/RX/GND only).
2. Power the watch ON (or press reset / reinsert battery).
3. Immediately run the dump command — the bootloader listens for about 2 seconds.

### Run the dump

Use `scripts/dump_firmware.sh` or run sftool directly.

**Linux:**

```bash
chmod +x scripts/dump_firmware.sh
./scripts/dump_firmware.sh /dev/ttyUSB0
```

**Windows (PowerShell):**

```powershell
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\ftab.bin@0x12000000:0x8000"
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\bootloader.bin@0x12020000:0x10000"
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\main.bin@0x12060000:0x380000"
sftool -c SF32LB52 -m nor -p COM3 --baud 1000000 read_flash "dumps\dfu.bin@0x1203E0000:0x80000"
```

Replace `COM3` / `/dev/ttyUSB0` with the actual port.

### Verify the dump

```bash
ls -lh dumps/
file dumps/*.bin
binwalk dumps/main.bin      # look for known signatures
xxd dumps/main.bin | head   # hex peek
strings dumps/main.bin      # look for readable strings
```

Keep multiple copies of `dumps/`. This is the only way to recover if flashing goes wrong.

---

## Edit the firmware

### Option A — Patch the raw dump (advanced, risky)

Edit `dumps/main.bin` with a hex editor (e.g., Bless, HxD, ImHex) or with Python (`intelhex`). Changes must be same-size (no insertions/deletions) unless you also update the flash table (`ftab`).

Things to look for in a dump:
- Strings / build paths / version info (`strings dumps/main.bin`)
- Bluetooth UUIDs
- Menu labels / UI text
- Checksums (editing may break them)

Use `binwalk` and `strings` to explore before editing.

### Option B — Rebuild from source (recommended)

The recommended way to make custom firmware is to modify the SiFli SDK project and rebuild:

1. Install the official SiFli SDK and open the **SiFli-SDK Environment** terminal.
2. Navigate:

```bash
cd firmware/hk10promaxplus/v1/watch/hk10promaxplus_firmware/v1/watch/project/eh-lb525_hcpu
```

3. (Optional) Customize settings:

```bash
scons --menuconfig --board=eh-lb525
```

4. Build:

```bash
scons --board=eh-lb525 -j8
```

5. Output appears in `build_eh-lb525_hcpu/` (`main.bin`, `bootloader.bin`, `ftab.bin`).

Edit source under `src/` (e.g., `watch_app.c`, GUI apps, resources) to customize behavior, then rebuild.

---

## Flash the firmware back

Flash each partition at its address. Order matters: flash table + bootloader first, then main.

**Linux:**

```bash
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify build_eh-lb525_hcpu/ftab.bin@0x12000000
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify build_eh-lb525_hcpu/bootloader.bin@0x12020000
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 write_flash --verify build_eh-lb525_hcpu/main.bin@0x12060000
```

**Windows (PowerShell):**

```powershell
sftool -c SF32LB52 -m nor -p COM3 write_flash --verify "build\ftab.bin@0x12000000"
sftool -c SF32LB52 -m nor -p COM3 write_flash --verify "build\bootloader.bin@0x12020000"
sftool -c SF32LB52 -m nor -p COM3 write_flash --verify "build\main.bin@0x12060000"
```

- `--verify` reads back and checks.
- Add `-e` (erase-all) only if you intend to wipe — do not erase unless you have a backup and know what you are doing.

### If flashing fails

- Swap TX/RX and retry.
- Close any other serial terminal using the COM port.
- Power-cycle the watch right before flashing (re-enter download mode).
- Add `--compat true` if you get timeouts or verification failures.

### Recover from a bad flash

If the watch will not boot:

1. Re-enter download mode (power-cycle / reset).
2. Flash the original backup (`dumps/`) back at the same addresses.
3. The factory bootloader (ROM) is usually still intact, so UART download should still work.

---

## Helper scripts

### `scripts/dump_firmware.sh` (Linux)

```bash
#!/usr/bin/env bash
# Dump HK 10 Pro Max+ (SF32LB525) flash via sftool + UART adapter.
# Usage: ./dump_firmware.sh [SERIAL_PORT] [OUTPUT_DIR]
# Default port: /dev/ttyUSB0   Default output: dumps/
set -euo pipefail

PORT="${1:-/dev/ttyUSB0}"
OUT_DIR="${2:-dumps}"
BAUD="${BAUD:-1000000}"
CHIP="${CHIP:-SF32LB52}"
MEM="${MEM:-nor}"

declare -A REGIONS
REGIONS[ftab]="0x12000000:0x8000"
REGIONS[bootloader]="0x12020000:0x10000"
REGIONS[main]="0x12060000:0x380000"
REGIONS[dfu]="0x1203E0000:0x80000"

command -v sftool >/dev/null 2>&1 || {
  echo "[ERROR] sftool not found on PATH. Install from https://github.com/OpenSiFli/sftool" >&2
  exit 1
}

mkdir -p "$OUT_DIR"

echo "[*] Dumping HK 10 Pro Max+ firmware"
echo "    Port : $PORT"
echo "    Chip : $CHIP ($MEM), baud $BAUD"
echo "    Out  : $OUT_DIR/"
echo ""
echo "[!] Power-cycle the watch into UART download mode now."
echo "[!] Press Enter once the watch is powered on and in download mode."
read -r

for name in ftab bootloader main dfu; do
  spec="${REGIONS[$name]}"
  addr="${spec%%:*}"
  size="${spec##*:}"
  out="$OUT_DIR/${name}.bin"
  echo ">>> Dumping $name ($addr + $size) -> $out"
  sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" \
    read_flash "$out@$addr:$size"
done

echo ""
echo "[+] Dump complete."
ls -lh "$OUT_DIR"
echo ""
echo "[!] Keep these files safe. They are the only recovery if flashing goes wrong."
```

### `scripts/flash_firmware.sh` (Linux)

```bash
#!/usr/bin/env bash
# Flash HK 10 Pro Max+ firmware via sftool + UART adapter.
# Usage: ./flash_firmware.sh [SERIAL_PORT] [BUILD_DIR]
# Default port: /dev/ttyUSB0   Default build dir: build_eh-lb525_hcpu
set -euo pipefail

PORT="${1:-/dev/ttyUSB0}"
BUILD_DIR="${2:-build_eh-lb525_hcpu}"
BAUD="${BAUD:-1000000}"
CHIP="${CHIP:-SF32LB52}"
MEM="${MEM:-nor}"

command -v sftool >/dev/null 2>&1 || {
  echo "[ERROR] sftool not found on PATH." >&2
  exit 1
}

[[ -d "$BUILD_DIR" ]] || {
  echo "[ERROR] Build directory '$BUILD_DIR' not found. Build the firmware first." >&2
  exit 1
}

echo "[*] Flashing HK 10 Pro Max+ firmware"
echo "    Port   : $PORT"
echo "    Build  : $BUILD_DIR"
echo "    Chip   : $CHIP ($MEM), baud $BAUD"
echo ""
echo "[!] Power-cycle the watch into UART download mode now."
read -rp "Press Enter once the watch is in download mode..."

flash_region() {
  local src="$1" addr="$2"
  echo ">>> Flashing $src @ $addr"
  sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" \
    write_flash --verify "$src@$addr"
}

flash_region "$BUILD_DIR/ftab.bin"      "0x12000000"
flash_region "$BUILD_DIR/bootloader.bin" "0x12020000"
flash_region "$BUILD_DIR/main.bin"      "0x12060000"

echo ""
echo "[+] Flash complete."
echo "[!] The watch should reboot and run the new firmware. If it does not,"
echo "[!] power-cycle it and re-flash the backup from dumps/."
```

Make them executable:

```bash
chmod +x scripts/dump_firmware.sh scripts/flash_firmware.sh
```

---

## Quick reference commands

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

- `VeriBotOfficial/HK-Custom-Firmware` — SDK project + flashing guide (forked from `amir1387aht/hk_watchs_hack`)
- `OpenSiFli/sftool` — `sftool` download/read tool — https://github.com/OpenSiFli/sftool
- SiFli SDK Programming Guide — https://docs.sifli.com/projects/sdk/latest/sf32lb52x/
- SiFli flash usage / addresses — https://docs.sifli.com/projects/sdk/latest/en/sf32lb52x/app_note/flash_usage.html
- `VeriBotOfficial/Plum-Watch` — this repository (Android app + watchfaces)
