# Plum Watch BLE implementation audit — JADX follow-up

**Audit date:** 2026-11-22  
**Reference APK:** Wearfit Pro `hw_5.6.21`  
**Current branch:** `fix/wearfit-jadx-camera-health`  
**Audit type:** Source-to-source comparison and targeted implementation.

## 1. Transport

Current Plum `BleWatchManager` discovers the normal Wearfit NUS service and selects its write/notify characteristics when their properties are suitable. The SiFli characteristic is kept separate for watchface operations. CCCD setup is serialized and the command queue serializes GATT writes.

Wearfit's `WriteQueue` additionally maps these order identifiers to the FTP route:
- `SEND_TRANS_FILE_HEAD`
- `SEND_TRANS_FILE_HEAD_RESP`
- `SEND_TRANS_FILE_DATA`
- `SEND_TRANS_FILE_DATA_RESP`
- `SEND_TRANS_STREAM_CTRL`

Plum does not yet discover/use this FTP route. The old audit's statement that the current Plum manager lacked NUS selection is stale; this file replaces that conclusion.

## 2. Camera

### Before this change
- Incoming `0x15` handling mixed direct event byte 5 with action state byte 6.
- The page attempted camera-mode activation as soon as Android camera permission became available, even if the BLE command channel was still setting up.
- It enabled the persistent `setShakeToPhoto` preference whenever the Camera page opened.

### Current implementation
- `WearfitProtocol.parseCameraControlEvent` encodes the exact `CameraControlAnalyzer` event map:
  - `EA ... 15 02` → direct switch;
  - `EA ... 15 01 01` → camera request + shutter;
  - `EA ... 15 01 02` → camera request + switch.
- `CameraScreen` waits for a connected watch and `supportsProprietaryCommands`, then queues camera mode.
- Camera mode no longer mutates the separate shake-to-capture preference.
- `WatchControlsSettingsContent` exposes that preference separately.
- Unit tests cover the decoded event cases and malformed frames.

### Remaining
CameraX preview/capture still occurs on the phone. Live image/video transfer to the watch is not implemented. The source export exposes separate camera and picture-transfer APIs, but their concrete service/analyzer implementations are unavailable.

## 3. Health

### Before this change
- `refreshHealth()` read standard HR if exposed and sent one-shot `0x31` requests for HR subtype 9 and SpO₂ subtype 17.
- The screen stored integer values only, omitted timestamps and ignored repeated equal values.

### Current implementation
- `BleUiState` updates carry a timestamp for HR and SpO₂ samples.
- Standard HR, proprietary one-shot measurement and the existing supported health-frame parser update those timestamps.
- HealthScreen stores up to 72 timestamp/value pairs per metric and draws a time-based graph.
- Equal values are retained as long as each incoming reading has a new timestamp.

### Remaining
No historical `setSyncDataHr(lastTimestamp)` request is issued. The required Wearfit response parser/persistence proxy is absent from the JADX source export. The current history is only the app's own received samples.

## 4. Music

Current `MusicScreen` remains a document picker; it does not upload. The JADX source provides:
- `FileTransferOrder.genFileHead` and `genFileBlock`;
- CRC-16/Modbus-like calculation initialized to `0xFFFF`;
- FTP UUID route via `WriteQueue`;
- `DeviceTransferService.startPushMusic(path, callback)`.

The concrete implementation of `startPushMusic`, ACK handler and stream-control orchestration are not available. No guessed transfer packet flow has been added. The UI must not report a successful upload.

## 5. Protocol tests

Added unit cases for:
- direct camera lens-switch event;
- camera request + shutter;
- camera request + lens-switch;
- invalid marker, command id and incomplete event.

The CI run for this branch is the required build/test gate. A passing build does not replace physical HK 10 Pro Max+ validation.
