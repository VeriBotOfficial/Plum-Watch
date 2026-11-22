# Plum Watch integration gap analysis — Wearfit Pro 5.6.21

**Analysis date:** 2026-11-22  
**Target:** HK 10 Pro Max+ (exact firmware/protocol still needs live validation)  
**Reference APK:** `com.wakeup.howear`, `hw_5.6.21`, version code `2026111322`  
**Status:** Static APK/DEX inventory and Plum source audit. This is not a complete JADX source review and no successful target-watch BLE session was available.

## Executive summary

The previous feature pass was not a functional implementation of the three requested features:

- **Music:** the UI only opens a document picker and displays URI path segments. It does not retain content access, read the audio bytes, create a transfer session, send a file header/data, wait for transfer acknowledgements, or verify that the watch stored the file.
- **Health:** the screen calls the one-shot measurement methods and charts newly received scalar values. It never requests historical health records. The chart has no timestamps and the current implementation can only retain up to 48 local values; it is not a watch-history graph.
- **Camera:** CameraX opens the phone camera locally. The app sends Wearfit camera-mode and shake-to-photo commands and listens for a small number of watch control events. It does not implement Wearfit's separate image/picture-transfer receive path. A successful queue insertion is not a device acknowledgement.

These are functional gaps in the source, not cosmetic bugs. Do not label these features working until end-to-end transfer or data receipt is demonstrated on the HK watch.

## 1. Evidence and confidence

| Finding | Evidence | Confidence / limitation |
|---|---|---|
| Wearfit has a normal command route and a separate file-transfer route | `wearfit_protocol.md`, `wearfit_uuid_routes.md`, classes `DeviceConnectMgr` and `WriteQueue` | APK-derived; HK route still needs GATT capture |
| Wearfit uses request/response analyzers and message assembly | `RequestHealthAnalyzer`, `HealthDataAnalyzer`, `HealthDataAnalyzer2`, `CameraControlAnalyzer`, `PictureTransferAnalyzer`, `NetFtpOtaAnalyzer`, `DataPackager` | Class/call-path inventory; full method-level review pending |
| Music has distinct file transfer operations | `sendFileTransHead`, `sendFileTransData`, `sendFileReceiveHeadResp`, `sendFileReceiveDataResp` | API presence confirmed; exact fields/acks not yet reconstructed |
| Health history is separate from one-shot measurement | `RequestHealthAnalyzer`, `HealthDataAnalyzer` / `HealthDataAnalyzer2`, old-data persistence methods, `syncSleepData`, `setSyncDataHr` | API/call-path presence; exact request and record schema pending |
| Camera command and image transfer are separate paths | `CameraControlAnalyzer` and `PictureTransferAnalyzer`; `sendCameraPreviewState`, `sendCameraPhotoState`, image-data APIs | API presence; target camera behaviour and image transport pending |
| SiFli watchface file push is its own negotiated protocol | `sifli_watchface_transport.md` | Do not reuse as music/file protocol without proof |

## 2. Plum source audit

### 2.1 Music

Current implementation:
- `MusicScreen` calls `OpenMultipleDocuments`.
- It stores `lastPathSegment` strings only.
- There is no callback to `BleWatchManager`.
- There is no URI permission persistence, content resolver read, file metadata, transfer header, chunk writer, progress/ack state, cancellation, or completion verification.

Wearfit API symbols found:
- `sendFileTransHead`
- `sendFileTransData`
- `sendFileReceiveHeadResp`
- `sendFileReceiveDataResp`
- `sendAudioBle`
- `sendAudioSearchSwitch`
- `MusicControlAnalyzer`
- `HeadsetBoxAnalyzer`

Important separation:
- `sendAudioBle` / `sendAudioSearchSwitch` are audio/Bluetooth control APIs; they are not proof of an MP3 upload protocol.
- File-transfer methods and the special FTP route must be analysed independently from the normal NUS command route and the SiFli watchface transport.
- The existence of a method named `sendFileTransData` is not enough to infer chunk size, header layout, checksum, offset/index, completion handshake, or retry semantics.

**Required implementation after source review:** URI-safe file intake; supported format/size validation; device route selection; exact header and chunk framing; serialized writes; response parsing; timeout/retry; progress; abort; and a watch-side file-list/storage verification path if exposed by the target.

### 2.2 Health and graphs

Current implementation:
- `HealthScreen` calls `refreshHealth()`.
- `refreshHealth()` reads the standard Heart Rate Measurement characteristic if available and queues two `0x31` one-shot requests: HR type `9`, SpO2 type `17`.
- `HealthScreen` stores up to 48 integer values in SharedPreferences.
- Values have no timestamps, source, record identity, date grouping, or quality/status metadata.
- Only a value different from the immediately previous value is appended; repeated equal measurements are discarded.
- No historical-data request is sent by the current health screen/manager path.

The existing `WearfitProtocol.parseHealthMeasurement` also contains a parser for an `AB ... 51 20` frame documented as coming from a different live Wearfit X10/Bluetrum trace. It explicitly is not confirmed for HK 10 Pro Max+. Do not treat this as the target's historical data schema.

Wearfit evidence:
- `RequestHealthAnalyzer`
- `HealthDataAnalyzer`
- `HealthDataAnalyzer2`
- `OldDataSyncProxy` persistence methods
- `syncSleepData(timestamp)`
- `setSyncDataHr`
- `syncSleepApnea`

**Required implementation after source review:** identify the history request initiator, date/time range encoding, record response types, units/scaling, record timestamps, pagination/continuation, and completion markers. Store actual timestamped records, deduplicate by stable record key, and chart them by time. Keep one-shot measurements as a separate live-measurement flow.

### 2.3 Camera

Current implementation:
- CameraX preview and capture run on the phone.
- On camera screen entry, Plum queues `setShakeToPhoto(true)` and `sendCameraPreviewState(true)`.
- Incoming `0x15` messages are reduced to shutter/lens-switch counters.
- The camera screen captures a phone photo when it sees the shutter counter and switches the phone lens when it sees the switch counter.
- No camera image/video bytes are assembled, decoded, or rendered from the watch.
- The current UI's message describes phone preview and remote shutter/switch; that is a phone-camera remote-control design, not a watch-camera stream.

Wearfit evidence:
- `CameraControlAnalyzer` handles camera mode/control events.
- `PictureTransferAnalyzer` is a separate image-transfer receive path.
- API symbols include `sendCameraPhotoState`, `sendCameraPreviewState`, `sendFriendImage`, `sendFriendImageData`, and `sendRTTAvatarImgWithIndex`.
- The existence of the picture analyzer does not prove that live camera preview is transported over it; it may be still images or other picture features.

**Required implementation after source review:** determine the exact direction and meaning of each camera command, whether the HK firmware exposes remote phone camera control, watch-camera still capture, or live preview; decode image transfer framing separately; and implement only the modes that the target demonstrably supports. Do not send speculative image/OTA/file packets.

## 3. Transport findings to preserve

Wearfit has at least three distinct transport layers in the supplied APK:

1. Regular app command route: default NUS service `6E400001-B5A3-F393-E0A9-E50E24DCCA9E`, write `...0002...`, notify `...0003...`.
2. Special FTP/file route: service `6E400011-B5A3-F393-E0A9-E50E24DCCA9E`, write `...0012...`, notify `...0013...` (see `wearfit_uuid_routes.md` for complete route details).
3. SiFli serial/watchface route: service `00000000-0000-0000-6473-5f696c666973`, data characteristic `00000000-0000-0200-6473-5f696c666973`.

The target model may select another route. The presence of these UUIDs in the APK does not prove they are exposed by HK 10 Pro Max+.

## 4. Capture audit

A local `btsnoop_hci.log` was present in the analysis workspace (6,315 bytes). It contains controller HCI command/command-complete and scan-related records, but **no HCI ACL data records**. It therefore does not contain the GATT ATT payloads needed to verify Wearfit commands, service UUID selection, health records, music chunks, or camera transfer. It is not a usable feature-session capture.

For the next capture, record a successful session in Wearfit Pro with the exact HK watch:
1. Pair/connect and wait for all setup to finish.
2. Open Health and trigger one HR and one SpO2 measurement; then open historical health/sleep pages and wait for sync.
3. Open the music/file transfer screen and transfer one small audio file if the watch/app supports it.
4. Open Camera, trigger one shutter and one lens switch.
5. If possible, run a successful watchface transfer separately to compare its route, but do not assume it shares the music protocol.

Keep separate captures for each operation and record the exact app version, watch firmware, GATT service/characteristic map, negotiated MTU and visible result.

## 5. JADX decompilation status

The full `base.apk` binary is available in the current analysis workspace at `/mnt/data/files/base.apk` (210,859,037 bytes; 17 DEX files). The four repository APK entries are Git LFS pointers, not binary contents. The current environment has Java but does not have JADX or apktool, and outbound package/release downloads are unavailable here. Therefore a complete Java source decompilation could not be generated in this session.

A full JADX export from the user's machine is now required for the method-level review. See `decompiled/HOW_TO_DECOMPILE.md` for exact commands and the minimal source folders to send.

## 6. Implementation gate

Do not merge guessed protocol code. Before each feature is marked complete, require:
- correct discovered GATT service and characteristic;
- correct notify/indicate setup and negotiated MTU;
- serialized writes with actual callback errors surfaced;
- parsed application-level acknowledgement/response (not just Android write success);
- visible confirmation on the HK watch or returned data;
- regression tests for framing, parsing, chunk sequencing, timeout and retry.

## 7. Remaining source-review targets

Prioritise these exact Wearfit classes/methods in JADX:
- `com.wakeup.module.ble.BleWatchServiceImpl`: `sendFileTransHead`, `sendFileTransData`, `sendFileReceiveHeadResp`, `sendFileReceiveDataResp`, `sendCameraPhotoState`, `sendCameraPreviewState`, `setSyncDataHr`, `syncSleepData`.
- `com.wakeup.module.device.work.WriteQueue`, `DeviceConnectMgr`, and the concrete `DeviceManagerService` adapter/implementation.
- `com.wakeup.module.device.work.analyzer.RequestHealthAnalyzer`, `HealthDataAnalyzer`, `HealthDataAnalyzer2`, `CameraControlAnalyzer`, `PictureTransferAnalyzer`, `MusicControlAnalyzer`, `NetFtpOtaAnalyzer`.
- `OldDataSyncProxy`, `DataPackager`, and any file-transfer callback/response model referenced by those classes.

Record caller paths and data flow, not just method bodies. The request builder, transport route, response parser, persistence and UI invocation all need to be connected before implementing the feature.
