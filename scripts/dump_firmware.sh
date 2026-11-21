#!/usr/bin/env bash
#
# Read the HK10 Pro Max / SF32LB525 reference flash map with OpenSiFli sftool.
#
# Usage:
#   ./scripts/dump_firmware.sh [SERIAL_PORT] [OUTPUT_DIR] [ftab|all]
#
# The safe default is "ftab": read only the live 32 KiB flash table first.
# Use "all" only after confirming that the target watch uses the eh-lb525 map.
#
set -Eeuo pipefail

ROOT_DIR="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
PORT="${1:-/dev/ttyUSB0}"
OUT_DIR="${2:-${ROOT_DIR}/dumps/hk10promax-$(date +%Y%m%d-%H%M%S)}"
SCOPE="${3:-ftab}"

SFTOOL_BIN="${SFTOOL_BIN:-sftool}"
CHIP="${CHIP:-SF32LB52}"
MEM="${MEM:-nor}"
BAUD="${BAUD:-1000000}"
CONNECT_ATTEMPTS="${CONNECT_ATTEMPTS:-0}"

command -v "$SFTOOL_BIN" >/dev/null 2>&1 || {
    echo "[ERROR] sftool not found: $SFTOOL_BIN" >&2
    echo "Install OpenSiFli/sftool or set SFTOOL_BIN=/path/to/sftool." >&2
    exit 1
}

case "$SCOPE" in
    ftab|all) ;;
    *)
        echo "[ERROR] Scope must be 'ftab' or 'all'." >&2
        exit 2
        ;;
esac

mkdir -p "$OUT_DIR"

# C-BUS alias: flash2 base 0x62000000 is accessed by SFTool at 0x12000000.
# These offsets and sizes are from project/eh-lb525_hcpu/ptab.json.
declare -a READS
READS+=("$OUT_DIR/ftab.bin@0x12000000:0x00008000")

if [[ "$SCOPE" == "all" ]]; then
    READS+=(
        "$OUT_DIR/bootloader.bin@0x12020000:0x00020000"
        "$OUT_DIR/main.bin@0x12060000:0x00380000"
        "$OUT_DIR/dfu.bin@0x123E0000:0x00080000"
        "$OUT_DIR/dfu_download.bin@0x12460000:0x00100000"
        "$OUT_DIR/dfu_info.bin@0x12560000:0x00020000"
        "$OUT_DIR/fs_root.bin@0x12580000:0x07580000"
        "$OUT_DIR/flash_part2.bin@0x19B00000:0x00080000"
        "$OUT_DIR/flash_part12.bin@0x19B80000:0x00080000"
    )
fi

echo "[*] HK10 Pro Max / SF32LB525 reference dump"
echo "    Port : $PORT"
echo "    Chip : $CHIP"
echo "    Mem  : $MEM"
echo "    Baud : $BAUD"
echo "    Scope: $SCOPE"
echo "    Out  : $OUT_DIR"
echo
if [[ "$SCOPE" == "ftab" ]]; then
    echo "[!] Reading only the live FTAB (read-only)."
    echo "[!] Inspect/confirm the target layout before running with scope 'all'."
else
    echo "[!] This uses the eh-lb525 reference map. Continue only if the live FTAB"
    echo "[!] has been confirmed to match. All reads are read-only."
fi
echo "[!] SFTool will retry the connection. Once it is waiting, reset/power-cycle"
echo "[!] the watch into its ROM UART download interface."
echo

# Keep one SFTool session for all requested regions.
"$SFTOOL_BIN" \
    -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" \
    --before no_reset --after no_reset --connect-attempts "$CONNECT_ATTEMPTS" \
    read_flash "${READS[@]}"

{
    echo "HK10 Pro Max / SF32LB525 reference dump"
    echo "Scope: $SCOPE"
    echo "SFTool chip: $CHIP"
    echo "Memory: $MEM"
    echo "Baud: $BAUD"
    echo "Reference ptab: firmware/hk10promax/project/eh-lb525_hcpu/ptab.json"
    echo "Note: this reference map must be checked against the device's live FTAB."
} > "$OUT_DIR/manifest.txt"

if command -v sha256sum >/dev/null 2>&1; then
    (cd "$OUT_DIR" && sha256sum ./*.bin > SHA256SUMS)
fi

echo
echo "[+] Dump complete:"
ls -lh "$OUT_DIR"
