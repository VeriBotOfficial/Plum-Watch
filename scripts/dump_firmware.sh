#!/usr/bin/env bash
#
# dump_firmware.sh
# Dump HK 10 Pro Max+ (SiFli SF32LB525) flash via sftool + CP2102 UART.
#
# Usage: ./dump_firmware.sh [SERIAL_PORT]
#   Default port: /dev/ttyUSB0   (Linux)
#   Windows: pass "COM3" etc. and run from a shell where sftool is on PATH.
#
# Prerequisites:
#   - sftool installed (https://github.com/OpenSiFli/sftool)  -> v0.2.7 installed at /usr/local/bin/sftool
#   - CP2102 connected: watch DBG_TX0 -> CP2102 RX, DBG_RX0 -> CP2102 TX, GND -> GND
#   - Watch in UART download mode (power-cycle it right before running)
#
set -euo pipefail

PORT="${1:-/dev/ttyUSB0}"
OUT_DIR="${2:-dumps}"
BAUD="${BAUD:-1000000}"
CHIP="${CHIP:-SF32LB52}"
MEM="${MEM:-nor}"

# Flash map (C-BUS addresses) from the HK-Custom-Firmware ptab.json (eh-lb525).
# sftool internally maps C-BUS 0x12xxxxxx -> S-BUS 0x62xxxxhex for SF32LB52.
declare -A REGIONS
REGIONS[ftab]="0x12000000:0x8000"          # 32 KB  flash table
REGIONS[bootloader]="0x12020000:0x10000"   # 64 KB  2nd-stage bootloader
REGIONS[main]="0x12060000:0x380000"        # 3.5 MB HCPU_FLASH_CODE (main firmware)
REGIONS[dfu]="0x1203E0000:0x80000"         # 512 KB DFU/recovery

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
echo "[!] IMPORTANT: Power-cycle / reset the watch NOW so it enters UART download mode."
echo "[!] You have ~2 seconds. Press Enter once the watch is powered on/in download mode."
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
echo "[!] Keep these files safe. They are your only recovery if flashing goes wrong."
