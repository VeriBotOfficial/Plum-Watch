# Wearfit APK research workspace

Persistent home for readable reverse-engineering notes and future JADX output.

## Inputs and status

The four entries under `research/apk/` are Git LFS pointers in the repository tree, not ordinary APK blobs. A 202 MB `base.apk` and two split APKs were materialized separately in the analysis workspace; the arm64 split was not available as a local binary. Those workspace copies are temporary.

The Wearfit Pro APK was inspected for BLE command builders, analyzers, and service-layer methods. Durable findings are recorded in:
- `research/wearfit_protocol.md`
- `research/wearfit_features.md`
- `research/sifli_watchface_transport.md`

The source exposes health history synchronization, music file transfer, and camera preview/capture paths. Music uses dedicated file-transfer methods such as `sendFileTransHead` and `sendFileTransData`. Camera mode is a command, separate from preview-frame/image transfer. Target-model framing is not yet verified.

## Full decompile status

A full Java/Kotlin decompile has **not** been produced. JADX/apktool are not installed in the current build environment, and GitHub's text file interface cannot retrieve binary LFS objects. Do not mistake the protocol notes for a complete decompile.

When the APK binaries and JADX are available, place outputs here:
- `decompiled/jadx/base/`
- `decompiled/jadx/split_config.arm64_v8a/`
- `decompiled/jadx/split_config.tr/`
- `decompiled/jadx/split_config.xxhdpi/`

Keep outputs split-specific. Do not duplicate APK binaries here; retain canonical inputs under `research/apk/`.
