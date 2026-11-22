# Wearfit APK research workspace

Persistent home for JADX source, APK-derived protocol notes and Plum integration research.

## Inputs

The JADX Java source export supplied by the user is stored under `decompiled/sources/` (approximately 47,500 source files). The original split APKs remain under `research/apk/` as Git LFS entries.

Current research documents:
- `research/wearfit_protocol.md` — packet framing and known command builders.
- `research/wearfit_uuid_routes.md` — NUS, FTP and SiFli service routing.
- `research/wearfit_features.md` — Wearfit API/analyzer inventory.
- `research/wearfit_jadx_source_audit.md` — source-level audit of music, health sync, camera and transfer helpers.
- `research/sifli_watchface_transport.md` — separate SiFli watchface transfer state machine.
- `research/plum_current_gap_analysis.md` — current implementation status.
- `research/plum_feature_roadmap.md` — priorities and evidence requirements.

## Decompilation coverage

The JADX export is broad but several critical concrete implementation classes are not present as readable Java sources:
- `BleWatchServiceImpl`
- `DataSyncProxy` / `OldDataSyncProxy`
- `RequestHealthAnalyzer` / `PictureTransferAnalyzer`
- concrete `DeviceTransferService`
- concrete `DeviceManagerService.sendData` adapter.

Interfaces, analyzers, packet builders and transport routing are available and have been cross-referenced. The remaining missing classes are recorded explicitly rather than inferred from their method names.

See `decompiled/HOW_TO_DECOMPILE.md` for targeted recovery instructions. Do not repeat the full export unless the JADX source is missing or corrupted; smali for the missing class descriptors plus the JADX error log is the most useful next input.
