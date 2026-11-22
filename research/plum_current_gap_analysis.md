# Plum Watch integration gap analysis — updated after JADX review

**Updated:** 2026-11-22  
**Reference:** Wearfit Pro `com.wakeup.howear hw_5.6.21`  
**Target:** HK 10 Pro Max+  
**Review:** JADX source audit plus current Plum source review. No successful target-watch music upload, historical health backfill or live camera-image transfer has yet been verified.

## Current status

| Feature | What is now implemented | What remains |
|---|---|---|
| Camera remote control | Correct Wearfit event decoding; command activation waits until the NUS command/notify channel is ready; shake-to-capture is now a separate setting | The watch's preview/image frame path remains unavailable; live preview on the watch is not implemented |
| Health charts | Each received HR/SpO₂ value is stored with a timestamp; repeated identical readings are retained; charts use time-based x coordinates and survive restart | No watch-history request/backfill; no 0x51 historical record decoder for this target |
| Music upload | Research now confirms exact file header/block builder and dedicated FTP UUID route | UI is still picker-only; no transfer state machine, ACK/retry handling or file-list verification |
| Wearfit feature coverage | API families and source map documented; separate Shake to Capture, Sleep Mode and Physical Training controls added | Most additional features need model capability gating and target validation |

## 1. Findings from the JADX export

The export contains approximately 47,500 Java source files in `decompiled/sources/`. It exposes useful service interfaces, packet builders, analyzer classes, UUID definitions, write queue and health sync orchestration.

Key omissions in the readable export remain:
- `BleWatchServiceImpl` concrete service implementation;
- `DataSyncProxy` and `OldDataSyncProxy` record decoding/persistence;
- `RequestHealthAnalyzer` and `PictureTransferAnalyzer`;
- concrete `DeviceTransferService` implementation;
- concrete `DeviceManagerService.sendData` adapter.

See [the full source audit](wearfit_jadx_source_audit.md) for class paths, packet structures, field confidence and unresolved method behavior.

## 2. Camera

### Fixed in Plum

Wearfit's `CameraControlAnalyzer` establishes these incoming event semantics for `EA ... 15`:
- byte 5 = 2: direct lens switch;
- byte 5 = 1: action envelope; byte 6 = 1 means shutter, byte 6 = 2 means lens switch.

Plum previously mixed the two fields and could map a direct switch as a camera request or double-count a switch. The event parser now matches the analyzer, and unit tests cover both event forms and malformed packets.

Camera mode is now queued only after the watch is connected, proprietary command notifications are configured, and the device-info handshake has marked the command channel ready. The camera page retries when readiness changes. The app no longer turns on the separate persistent shake-to-photo setting merely by opening Camera; that preference has its own setting.

### Not implemented / not proven

CameraX preview is still local to the phone. The exported API includes `sendCameraPreviewState`, `sendCameraPhotoState`, `DeviceTransferService.startPushCamera` and picture-transfer helpers in `TransferOrder`, but the transfer service implementation and `PictureTransferAnalyzer` are absent from the readable export. The `0xAD/0xAE` still-picture path is not enough evidence to invent a live-video frame stream. The app must not claim the watch displays a live camera preview yet.

## 3. Health history and graphs

### Fixed in Plum

The live scalar readings now carry `heartRateUpdatedAt` and `bloodOxygenUpdatedAt`. Each update gets a new timestamp even when the numerical value is equal to the previous one. HealthScreen stores up to 72 timestamp/value pairs per metric, draws the graph using actual sample time on the x-axis, and persists samples in SharedPreferences.

This repairs the prior behavior where equal consecutive values were discarded and charts had no time dimension.

### Still missing

Wearfit's historical sync is a different sequence:
1. `DataSyncMgr.startSyncData()` reads the last saved sync timestamp.
2. It sends `setSyncDataHr(lastTimestamp)`, sleep-apnea sync and GPS sync.
3. A successful `SYNC_DATA_ORDER2` write leads to `syncSleepData(yesterday)`.
4. `HealthDataAnalyzer` routes `0x51` subtypes 17/18 to historical HR/SpO₂ persistence handlers.

The exported source does not include the concrete `setSyncDataHr` packet builder or the old-data decoder. The current graph is therefore a timestamped log of readings received by Plum, not a graph of records already stored on the watch. Do not label it "watch history" until that response path has been decoded and tested.

## 4. Music upload

The UI still does not upload music. JADX confirms:
- `DeviceTransferService.startPushMusic(path, callback)`;
- separate `FileTransferOrder.genFileHead` and `genFileBlock` packet builders;
- `WriteQueue` routes file-transfer orders over the dedicated FTP service/write UUID;
- head/data response order names and stream-control order exist.

The A0 header and A1 block layouts plus CRC algorithm are documented in `wearfit_jadx_source_audit.md`. The concrete `startPushMusic` implementation, type string, block/package sizing, ACK parser, retry logic and finalization are missing. Sending guessed block counters or guessed end commands is unsafe and could leave a truncated file on the watch. The picker is therefore not represented as working transfer.

## 5. Transport separation

| Route | Intended purpose in Wearfit | Plum status |
|---|---|---|
| NUS `6E400001/2/3...` | Normal settings/control and notification | Implemented in current BLE manager |
| FTP `6E400011/12/13...` | File-transfer orders | Not implemented |
| SiFli service/data UUID | SiFli serial/watchface transfer | Existing watchface path retained |

The three routes must remain separate.

## 6. Tests and hardware verification

The current change adds protocol unit tests for camera event semantics. Android CI must pass before merging.

Static tests can verify packet parsing and graph persistence behavior, but they cannot prove that the HK watch firmware implements every Wearfit feature. Hardware validation still required:
- one remote shutter and one switch event from the watch;
- repeated HR/SpO₂ readings and app restart;
- full Wearfit history sync with timestamps;
- successful Wearfit music upload, captured with GATT notifications and ACKs;
- camera image/preview transfer if Wearfit actually displays it on this model.

## 7. Next source material if implementation remains blocked

If these classes are present in the original DEX but not in `decompiled/sources`, provide their APKTool smali or JADX error log:
- `BleWatchServiceImpl`
- `DataSyncProxy`, `OldDataSyncProxy`
- `RequestHealthAnalyzer`, `PictureTransferAnalyzer`
- concrete `DeviceTransferService` and `DeviceManagerService` adapter.

A GATT HCI capture of a successful operation on the user's HK 10 Pro Max+ is even more valuable than another static export for confirming model routing and response behavior.


## 8. Follow-up implementation status — 2026-11-22

Branch: `codex/automatic-watch-sync-and-controls`.

| Area | Follow-up change | Remaining gap |
|---|---|---|
| Automatic connection | Connected-device foreground service keeps the saved GATT connection active in normal background operation | Android/OEM process killing and watch firmware sleep policies still apply |
| Battery | Five-minute background refresh loop; standard battery values and WearFit battery reports are persisted | Requires real-watch test with display off; device may only report on its own schedule |
| Live health | Automatic measurement mode is requested; current HR/SpO₂ polls run every 15 minutes; samples are persisted below the UI | Historical backfill and sleep-stage history still blocked by missing WearFit proxy/decoder classes |
| Camera | Phone CameraX preview and remote watch shutter/lens controls; shake-to-capture is enabled only while Camera is active | No verified live-video/image-frame transfer to the watch |
| Music | FTP route and packet builders documented | No concrete `startPushMusic` implementation, ACK/retry handling or end protocol; upload remains unavailable |
| Sleep mode | Saved settings are sent immediately on change and restored on reconnect | Physical target-watch behavior requires validation |
| Alarms | Clock picker, immediate sends, persistent schedule and reconnect replay | Confirm repeat-day and vibration/sound behavior on device |
| Physical Training | Removed from the user-facing settings UI | Protocol builder retained internally but unused |

The current implementation intentionally distinguishes **live readings received by Plum** from **historical data stored on the watch**. It also distinguishes **phone camera remote control** from **video streaming to the watch**. Neither unsupported path is represented as complete.
