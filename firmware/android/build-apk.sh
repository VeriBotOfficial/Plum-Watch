#!/usr/bin/env bash
set -Eeuo pipefail

SCRIPT_DIR="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
REPOSITORY_ROOT="$(cd -- "$SCRIPT_DIR/../.." && pwd)"
ANDROID_PROJECT="$REPOSITORY_ROOT/app/android"
OUTPUT_DIR="$SCRIPT_DIR/build"
OUTPUT_APK="$OUTPUT_DIR/plum-watch-simulator.apk"

if ! command -v java >/dev/null 2>&1; then
    echo "Java is required. Install JDK 17 or newer and try again." >&2
    exit 2
fi

if [[ ! -f "$ANDROID_PROJECT/gradlew" ]]; then
    echo "Android Gradle project was not found at: $ANDROID_PROJECT" >&2
    exit 2
fi

cd "$ANDROID_PROJECT"
echo "[Plum Watch] Running Android unit tests and building the debug APK..."
sh ./gradlew --no-daemon assembleDebug

BUILT_APK="$ANDROID_PROJECT/app/build/outputs/apk/debug/app-debug.apk"
if [[ ! -s "$BUILT_APK" ]]; then
    echo "Gradle finished without producing the expected APK: $BUILT_APK" >&2
    exit 1
fi

mkdir -p "$OUTPUT_DIR"
cp "$BUILT_APK" "$OUTPUT_APK"

if command -v sha256sum >/dev/null 2>&1; then
    echo "SHA-256: $(sha256sum "$OUTPUT_APK" | awk '{print $1}')"
fi
echo "APK: $OUTPUT_APK"
