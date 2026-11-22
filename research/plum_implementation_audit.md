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

### Additional controls exposed
The Camera, Display and Health panels now expose Shake to Capture as an independent preference. Sleep Mode and Physical Training helpers are wired into the settings page using their existing Wearfit packet builders.

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


## 6. Automatic-sync and UX follow-up (2026-11-22)

The follow-up implementation is being developed on branch `codex/automatic-watch-sync-and-controls`. This section supersedes the prior UI-only statements where noted; it does not change the unresolved protocol evidence above.

### Implemented in the follow-up branch

- A dedicated Android `connectedDevice` foreground service owns the lifetime of the saved-watch BLE connection while Plum is backgrounded. The existing `BleWatchManager` remains the single owner of the GATT connection and serialized command queue.
- Once the Wearfit device-info handshake is complete, Plum reapplies saved settings, requests automatic health measurements, schedules battery refreshes every five minutes and requests current HR/SpO₂ readings no more often than every fifteen minutes.
- Incoming standard battery, standard HR, Wearfit 0x31 readings and the already-supported 0x51/0x20 scalar frame are persisted by the BLE layer. Health charts can therefore update while their screen is closed and reload the saved samples later.
- Saved alarm entries are replayed after a successful connection. Alarm edits are transmitted automatically; the editor uses the Material clock time picker instead of numeric hour/minute fields. Alarm flags use Wearfit's documented vibration/sound bit values.
- Sleep-mode settings are stored locally, sent as options change and replayed on reconnect. The separate shake-to-photo setting is no longer exposed; it is enabled only during a camera session. The Physical Training panel has been removed from the app UI.
- Notification display options send on change rather than through a separate Send button.

### Still blocked by missing protocol source

- **Music upload is not implemented.** The FTP service/write/notify UUIDs and A0/A1 packet builders are known, but the concrete `DeviceTransferService.startPushMusic` implementation, file type metadata, stream-control sequence, response parser, ACK/retry state machine and end condition remain absent from the readable JADX export. The picker is not an uploader.
- **Historical health backfill is not implemented.** Live scalar measurements are now retained automatically, but the concrete `setSyncDataHr` request builder and `DataSyncProxy` / `OldDataSyncProxy` decoders remain absent. No historical records or sleep-stage history are claimed.
- **Camera video/image transfer to the watch is not implemented.** The app can open the phone camera and handle watch-originated shutter/lens controls. The exported camera/file-transfer interfaces do not provide the missing concrete `PictureTransferAnalyzer` and transfer implementation, so the app must not imply that a live preview is streamed to the watch.

### Background behaviour caveat

The foreground service keeps the BLE connection and notifications active during normal background operation. Android or a device manufacturer's power-management policy can still stop a process or service, and the watch firmware may not report a value while asleep. This is not a guarantee of uninterrupted, real-time sync in every power state. The service uses a persistent low-priority notification as required for a connected-device foreground service.

### Validation still required

The branch requires the Android CI build/unit-test run and real HK 10 Pro Max+ checks. Specifically verify battery reads with the watch display off, HR/SpO₂ arrival when the app is backgrounded, alarm write/read-back, sleep-mode behavior, phone camera remote shutter and camera-session shake behavior. Music upload, watch-side video and historical health remain untestable until the missing smali/implementation or a successful WearFit GATT capture is available.
