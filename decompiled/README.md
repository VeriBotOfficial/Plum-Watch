# Wearfit APK research workspace

Persistent home for reverse-engineering notes and eventual JADX output.

## Inputs and status

The repository entries under `research/apk/` are Git LFS pointers. The analysis workspace currently has the 210,859,037-byte `base.apk` binary (17 DEX files) plus the Turkish and xxhdpi splits. The arm64 split is not locally materialized.

Existing APK-derived reference documents:
- `research/wearfit_protocol.md`
- `research/wearfit_uuid_routes.md`
- `research/wearfit_features.md`
- `research/sifli_watchface_transport.md`
- `research/plum_current_gap_analysis.md`

The 2026-11-22 Plum source audit found that music is picker-only, health is one-shot measurement plus local scalar history (no watch-history request), and camera is phone CameraX remote control (no picture/video receive pipeline). See the gap analysis for exact code paths and evidence.

## Full decompile status

A full JADX Java/Kotlin source export has **not** been produced in this environment. Java is available, but JADX/apktool are not installed and outbound package/release downloads are unavailable. The existing protocol notes are static DEX/APK-derived research, not a full source decompilation.

Follow `decompiled/HOW_TO_DECOMPILE.md` to export the APK on a local Fedora/Linux machine. Put the output under:
- `decompiled/jadx/base/sources/`
- `decompiled/jadx/base/resources/`
- optional split outputs under `decompiled/jadx/split_config.*/`

Do not duplicate the APK binaries in this directory. Keep canonical inputs under `research/apk/`.
