#!/usr/bin/env bash
set -Eeuo pipefail

SCRIPT_DIR="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
FIRMWARE_ROOT="$(cd -- "$SCRIPT_DIR/../hk10promax" && pwd)"
PROJECT_DIR="$FIRMWARE_ROOT/project"
SDK_ROOT="${SIFLI_SDK:-${1:-}}"
JOBS="${JOBS:-$(getconf _NPROCESSORS_ONLN 2>/dev/null || echo 4)}"
ADD_DISK=0

for arg in "$@"; do
    case "$arg" in
        --add-disk) ADD_DISK=1 ;;
        --help|-h)
            printf 'Usage: %s [SDK_ROOT] [--add-disk]\n' "$0"
            exit 0
            ;;
    esac
done

if [[ -z "$SDK_ROOT" ]]; then
    echo "Set SIFLI_SDK or pass the SiFli-SDK directory as the first argument." >&2
    exit 2
fi

SDK_ROOT="$(cd -- "$SDK_ROOT" && pwd)"
if [[ ! -f "$SDK_ROOT/export.sh" ]]; then
    echo "SiFli SDK export.sh was not found at: $SDK_ROOT/export.sh" >&2
    exit 2
fi

# SiFli's export script prepares PATH, Python and the cross-compiler environment.
# shellcheck source=/dev/null
source "$SDK_ROOT/export.sh"
export SIFLI_SDK="$SDK_ROOT"

if ! command -v scons >/dev/null 2>&1; then
    echo "SCons is unavailable. Check the SiFli SDK environment setup." >&2
    exit 2
fi

cd "$PROJECT_DIR"
args=(--board=eh-lb525 "-j$JOBS")
if (( ADD_DISK )); then
    args+=(--add-disk)
fi
scons "${args[@]}"
