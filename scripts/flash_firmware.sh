#!/usr/bin/env bash
#
# flash_firmware.sh
# Flash HK 10 Pro Max+ (SiFli SF32LB525) firmware via sftool + CP2102 UART.
#
# Usage: ./flash_firmware.sh [SERIAL_PORT] [BUILD_DIR]
#   Default port: /dev/ttyUSB0   (Linux)
#   Default build dir: build_eh-lb525_hcpu
#
# Prerequisites:
#   - sftool installed (https://github.com/OpenSiFli/sftool)
#   - CP2102 connected (see docs/HARDWARE_PINOUT_CP2102.md)
#   - Built firmware files present in BUILD_DIR (ftab.bin, bootloader.bin, main.bin)
#   - Watch in UART download mode (power-cycle before running)
#
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
echo "    Port    : $PORT"
echo "    Build   : $BUILD_DIR"
echo "    Chip    : $CHIP ($MEM), baud $BAUD"
echo ""
echo "[!] Power-cycle / reset the watch into UART download mode NOW."
read -rp "Press Enter once the watch is in download mode..."

flash_region() {
  local src="$1" addr="$2"
  echo ">>> Flashing $src @ $addr"
  sftool -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" \
    write_flash --verify "$src@$addr"
}

# Order: flash table + bootloader first, then main application.
flash_region "$BUILD_DIR/ftab.bin"      "0x12000000"
flash_region "$BUILD_DIR/bootloader.bin" "0x12020000"
flash_region "$BUILD_DIR/main.bin"      "0x12060000"

echo ""
echo "[+] Flash complete."
echo "[!] The watch should reboot and run the new firmware. If it doesn't,"
echo "[!] power-cycle it and re-flash your backup (dumps/)."
