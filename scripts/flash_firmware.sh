#!/usr/bin/env bash
#
# Flash the core HK10 Pro Max / SF32LB525 build outputs with SFTool.
#
# Usage:
#   ./scripts/flash_firmware.sh [SERIAL_PORT] [BUILD_DIR] [--include-dfu] [--include-fs-root]
#
# Default BUILD_DIR:
#   firmware/hk10promax/project/build_eh-lb525_hcpu
#
# By default only FTAB, bootloader and main are written. DFU and filesystem
# writes are opt-in because they replace recovery code and/or factory data.
#
set -Eeuo pipefail

ROOT_DIR="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
PROJECT_DIR="$ROOT_DIR/firmware/hk10promax/project"
PORT="${1:-/dev/ttyUSB0}"
DEFAULT_BUILD_DIR="$PROJECT_DIR/build_eh-lb525_hcpu"

if (($# > 0)); then shift; fi
if (($# > 0)) && [[ "$1" != --* ]]; then
    BUILD_DIR="$1"
    shift
else
    BUILD_DIR="$DEFAULT_BUILD_DIR"
fi

INCLUDE_DFU=0
INCLUDE_FS_ROOT=0
while (($# > 0)); do
    case "$1" in
        --include-dfu) INCLUDE_DFU=1 ;;
        --include-fs-root) INCLUDE_FS_ROOT=1 ;;
        *)
            echo "[ERROR] Unknown option: $1" >&2
            echo "Usage: $0 [SERIAL_PORT] [BUILD_DIR] [--include-dfu] [--include-fs-root]" >&2
            exit 2
            ;;
    esac
    shift
done

SFTOOL_BIN="${SFTOOL_BIN:-sftool}"
CHIP="${CHIP:-SF32LB52}"
MEM="${MEM:-nor}"
BAUD="${BAUD:-1000000}"
CONNECT_ATTEMPTS="${CONNECT_ATTEMPTS:-0}"

command -v "$SFTOOL_BIN" >/dev/null 2>&1 || {
    echo "[ERROR] sftool not found: $SFTOOL_BIN" >&2
    exit 1
}

[[ -d "$BUILD_DIR" ]] || {
    echo "[ERROR] Build directory not found: $BUILD_DIR" >&2
    echo "Build from firmware/hk10promax/project with: scons --board=eh-lb525 -j8" >&2
    exit 1
}

check_image() {
    local file="$1"
    local max_size="$2"
    local size
    [[ -f "$file" ]] || {
        echo "[ERROR] Required image missing: $file" >&2
        exit 1
    }
    size="$(wc -c < "$file" | tr -d '[:space:]')"
    if (( size == 0 || size > max_size )); then
        echo "[ERROR] Invalid image size for $file: $size bytes (max $max_size)." >&2
        exit 1
    fi
}

# Required images and their ptab allocation limits.
check_image "$BUILD_DIR/ftab.bin" 32768
check_image "$BUILD_DIR/bootloader.bin" 131072
check_image "$BUILD_DIR/main.bin" 3670016

declare -a WRITE_IMAGES
WRITE_IMAGES+=(
    "$BUILD_DIR/ftab.bin@0x12000000"
    "$BUILD_DIR/bootloader.bin@0x12020000"
    "$BUILD_DIR/main.bin@0x12060000"
)

if (( INCLUDE_DFU )); then
    check_image "$BUILD_DIR/dfu.bin" 524288
    WRITE_IMAGES+=("$BUILD_DIR/dfu.bin@0x123E0000")
fi

if (( INCLUDE_FS_ROOT )); then
    check_image "$BUILD_DIR/fs_root.bin" 122159104
    WRITE_IMAGES+=("$BUILD_DIR/fs_root.bin@0x12580000")
fi

echo "[*] Target: HK10 Pro Max / SF32LB525 (SFTool $CHIP)"
echo "    Port : $PORT"
echo "    Build: $BUILD_DIR"
echo "    Write:"
printf '      %s\n' "${WRITE_IMAGES[@]}"
echo
echo "[!] This is a destructive operation. A complete original dump and a"
echo "[!] verified live FTAB are required. The default does not write DFU or FS."
read -r -p "Type FLASH HK10PROMAX to continue: " confirmation
if [[ "$confirmation" != "FLASH HK10PROMAX" ]]; then
    echo "[CANCELLED] No write was started."
    exit 1
fi

echo
echo "[!] SFTool will retry the ROM connection. Once it is waiting, reset/"
echo "[!] power-cycle the watch into its confirmed ROM UART download interface."
"$SFTOOL_BIN" \
    -c "$CHIP" -m "$MEM" -p "$PORT" --baud "$BAUD" \
    --before no_reset --after no_reset --connect-attempts "$CONNECT_ATTEMPTS" \
    write_flash --verify "${WRITE_IMAGES[@]}"

echo
echo "[+] SFTool completed the requested write with verification enabled."
echo "[!] Do not assume this proves every watch feature works; test the device."
