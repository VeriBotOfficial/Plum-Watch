# Wearfit Pro 5.6.21 — JADX source audit

**Audit date:** 2026-11-22  
**Package:** `com.wakeup.howear`  
**Build:** `hw_5.6.21`, version code `2026111322`  
**Input:** user's JADX export under `decompiled/sources/`  
**Target of Plum integration:** HK 10 Pro Max+  
**Evidence scope:** source files present in the export, cross-checked against Plum's current implementation and the existing DEX-derived protocol notes.

## 1. Export coverage and important omissions

The repository now contains a large JADX Java source export (approximately 47,500 files under `decompiled/sources/`). This makes the analyzer, public service interfaces, sync coordinator, transfer packet builders, UUID constants and generic BLE queue inspectable.

The export is not complete at the implementation points most important for reproducing the three unfinished features. The following concrete source files are absent from the export:

- `com.wakeup.module.ble.BleWatchServiceImpl` — concrete implementation for the very large `BleWatchService` interface.
- `com.wakeup.module.device.work.dataSync.DataSyncProxy` and `OldDataSyncProxy` — persistence/record decoding behind health callbacks.
- `com.wakeup.module.device.work.analyzer.RequestHealthAnalyzer` and `PictureTransferAnalyzer` — response/request paths identified in the APK analyzer inventory but not exported as readable source.
- Concrete implementation of `com.wakeup.commponent.module.device.DeviceTransferService` — only the interface is present.
- Concrete BLE service adapter behind `DeviceManagerService.sendData(...)`.

**Interpretation:** the public API and packet-builder helper methods establish that capabilities exist. They do not fully expose the payload field values, record decoders, transfer loops, ACK handling, retries or model gating for those operations. Where those concrete methods are absent, this audit records the known framing and explicitly leaves unresolved fields unresolved.

For the missing classes, the next useful evidence is JADX's decompilation error log and/or APKTool smali for the relevant DEX class descriptors. Re-running the entire APK through JADX is not necessary if the same missing class output is reproducible.

## 2. Keep the three transport families separate

### 2.1 Standard Wearfit command channel

The regular watch route is NUS:

| Role | UUID |
|---|---|
| Service | `6E400001-B5A3-F393-E0A9-E50E24DCCA9E` |
| Phone write | `6E400002-B5A3-F393-E0A9-E50E24DCCA9E` |
| Watch notify | `6E400003-B5A3-F393-E0A9-E50E24DCCA9E` |

The service API uses `BleOrderModel` and a write queue. The generic stack accepts service and characteristic UUIDs at call time, rather than forcing every operation through one characteristic.

### 2.2 Wearfit file-transfer channel

The source file `com.wakeup.module.device.work.utils.BleUUID` identifies the separate FTP/file transfer route:

| Role | UUID |
|---|---|
| Service | `6e400011-b5a3-f393-e0a9-e50e24dcca9e` |
| Phone write | `6e400012-b5a3-f393-e0a9-e50e24dcca9e` |
| Watch notify | `6e400013-b5a3-f393-e0a9-e50e24dcca9e` |

`WriteQueue` explicitly routes these order names to the FTP service/write characteristic:

- `SEND_TRANS_FILE_HEAD`
- `SEND_TRANS_FILE_HEAD_RESP`
- `SEND_TRANS_FILE_DATA`
- `SEND_TRANS_FILE_DATA_RESP`
- `SEND_TRANS_STREAM_CTRL`

This route is distinct from both the normal NUS command channel and the SiFli serial watchface channel.

### 2.3 SiFli watchface channel

The SiFli service/data UUID remains a separate transport. The existence of the SiFli SDK does not establish that the target watch uses it for MP3 transfer, camera images or general Wearfit file transfer. See `sifli_watchface_transport.md`.

## 3. Music and generic file transfer

### 3.0 App/game installation API discovered

The exported WearFit interface `com.wakeup.commponent.module.device.DeviceTransferService` declares `startPushApp(path, callback)`, alongside dial-specific entry points such as `startPushDial`, `startPushAigcDial`, `startPushCustomDial` and `startPushCustomVideoDial`.

This confirms that WearFit has an app-install API surface. It does **not** reveal the package format, concrete transfer implementation, packet/ACK state machine, installation completion signal or HK 10 Pro Max+ capability gate. The concrete `DeviceTransferService` implementation is absent from this JADX export (see the omissions in section 1). Do not route app packages through the SiFli watchface protocol based on this interface alone.

### 3.0.1 Separate legacy dial preview parser

The export also contains `com.wakeup.feature.device.dial.preview.WatchFaceBinParser`. It parses a separate binary dial format into positioned elements (static images, hour/minute/date/month and other data-driven elements), including palette-indexed bitmap resources. This could support a future renderer for that legacy `.bin` format, but it is not a parser for Red John's dynamic SiFli ZIP package (`.dsc`, compiled `.so` and EZIP resources).

### 3.1 APIs found

`com.wakeup.commponent.module.device.DeviceTransferService` exposes:

- `startPushMusic(path, callback)`
- `startPushNoiseMusic(path, callback)`
- `startPushCamera(index, path, callback)`
- `startPushPicture(...)`
- `startPushRing(path, callback)`
- `startPushEBook(path, callback)`
- `startPushMeeting(path, callback)`
- `startPushCustomFile(path, type, fileType, callback)`
- gallery, dial, app, navigation and other transfer APIs.

`DeviceTransfer` defines callback states: `STATE_START=0`, `STATE_PROCESS=1`, `STATE_SUCCESS=2`, `STATE_COMPLETE=3`, `STATE_FAIL=-1`, and `STATE_LOW_MEMORY=-2`.

The existence of `startPushMusic` confirms Wearfit Pro has a local music file-upload flow. It is not the same as the watch-originated media button handler.

### 3.2 File header packet — decoded helper

`com.wakeup.module.device.work.fileTrans.FileTransferOrder.genFileHead(file, type, fileType)` constructs:

```
A0 00 00 00 00 <headLen:2, big-endian> <headCRC:2, big-endian> <headData...>
```

`headData` is:

```
<fileType:1>
<filenameUtf8Length:1> <filenameUtf8...>
<typeUtf8Length:1> <typeUtf8...>
<fileSize:4, big-endian>
<fileCRC:2, big-endian>
```

The default `fileType` is 0. The default GATT split-size value stored with the order is 256. The meaning/value of the `type` string is chosen by the missing transfer implementation and is therefore not assumed here.

The outer command uses `OtaCommandGenerator.CMD_OTA_INFO` (0xA0). The head CRC is calculated over the complete `headData` byte array.

### 3.3 File data block packet — decoded helper

`FileTransferOrder.genFileBlock(block, pkg, blockData, data)` constructs:

```
A1 <block:2, big-endian> <pkg:2, big-endian>
   [if pkg == 0: <blockDataLength:2, big-endian> <blockCRC:2, big-endian>]
   <data...>
```

Only the first package of a block (`pkg == 0`) carries the block length and block CRC. Both the `blockData` and `data` arguments are material: `blockData` is used for the block-level checksum/length, while `data` is the payload for this package.

### 3.4 CRC

`BleUtil.crcTable` and `BleUtil.crcFile` use a 256-entry reflected CRC-16 table, initial value `0xFFFF`, update:

```
crc = CRC_TABLE[(crc XOR byte) AND 0xFF] XOR (crc >>> 8)
```

The table is the reflected `0xA001` CRC-16/Modbus table. The packet helpers write the two-byte CRC high byte first.

### 3.5 What is still missing

The transfer service implementation that calls these builders is absent. So are the complete transfer state machine and the concrete file-transfer ACK analyzer. In particular, the source export does not let us safely recover:

- the `type` string and `fileType` used specifically for local music;
- the exact file-block size and package size;
- whether the reported 256 value is a GATT fragment size or application package size for each target;
- head/data response parsing, success/error meanings, retry policy and missing-block retransmission;
- stream-control start/end values and final completion criteria;
- the per-model capability gate for HK 10 Pro Max+.

Do not start an upload by sending only A0/A1 packets. Without those state transitions it could leave the watch with a partial file. The app's current music picker is still not an upload implementation.

### 3.6 Music control is another feature

`MusicControlAnalyzer` maps watch button events to Android `AudioManager.dispatchMediaKeyEvent`. It handles older command 153 and newer command 157, including play/pause/previous/next. `LocalMusicOrder` uses `EA ... 10 01` for requesting the local music list and `EA ... 10 02` for sending local music status. Neither helper is the MP3 upload format.

## 4. Health history synchronization

### 4.1 Wearfit sync coordinator

`com.wakeup.module.device.work.dataSync.DataSyncMgr.startSyncData()` implements a real history-sync sequence:

1. Read `device_last_sync_time_<MAC>` from persistent cache.
2. Record a new current sync timestamp.
3. Skip unsupported product id 11 and sleep-sound devices.
4. Begin quiet health-sync UI mode.
5. Send `BleWatchService.setSyncDataHr(lastSavedTimestamp)`.
6. Send `syncSleepApnea(lastSavedTimestamp)`.
7. Send `syncGpsData(0)`.
8. When the `SYNC_DATA_ORDER2` write succeeds, send `syncSleepData(yesterday)`.
9. Complete after the expected write/response window and save the new per-device sync timestamp only on success.

The coordinator listens to `TYPE_DEVICE_WRITE` and `TYPE_SYNC_OVER`. A failed primary or sleep sync marks the operation as failed; a successful Android GATT write is part of the sequence, not a parsed history record by itself.

### 4.2 Analyzer dispatch

`HealthDataAnalyzer` dispatches by command byte (byte index 4 in the analyzer's integer list):

- `0x31`: one-shot/current measurements. Byte index 5 subtype 9/10 routes HR single/current, 17/18 routes SpO₂ single/current, 33/34 blood pressure, 65 immunity and 129 temperature.
- `0x32`: one-time/key data.
- `0x51`: history/measurement records. Subtypes include 8 step data, 11 pressure, 17 HR, 18 SpO₂, 19 temperature, 20 blood pressure, 24 immunity, 32 hourly group 1 and 33 hourly group 2.
- `0x52`: sleep data.
- `0xB7`: sport data.

`HealthDataAnalyzer2` handles the `EA ... 2A 01` sleep-apnea event.

The analyzer forwards record lists to `DataSyncMgr` persistence methods such as `saveMeasureHR`, `saveMeasureBO`, `hourlyMeasure1` and `hourlyMeasure2`.

### 4.3 Persisted data model

`HealthEntity` includes a record time, device/MAC identity, numeric data type, JSON value and secondary JSON fields, sync state and update time. This confirms that Wearfit's graphs/history are based on timestamped persisted records, not just a mutable latest scalar.

### 4.4 Remaining gap

`setSyncDataHr` packet construction, the `DataSyncProxy`/ `OldDataSyncProxy` decoding logic, historical record timestamp offsets, units and data schemas are not available in this source export. The public `BleWatchService` interface proves the request method exists, but does not reveal its exact bytes or response layout.

Plum must not send a guessed historical request or interpret the separate `AB ... 51 20` X10 sample parser as the HK 10 Pro Max+ data schema. Plum's current timestamped chart is a local log of newly received readings; historical backfill remains pending these missing sources or a real packet trace.

## 5. Camera control and image transfer

### 5.1 CameraControlAnalyzer — confirmed event meanings

`CameraControlAnalyzer` requires an incoming message whose marker is `0xEA` and command id is `0x15`:

- byte 5 = `2`: direct front/rear lens-switch event.
- byte 5 = `1`: camera action envelope; byte 6 is the state:
  - state 1: take photo;
  - state 2: switch camera.
- If the message contains at least 11 bytes, bytes 7–8 are a big-endian width and bytes 9–10 a big-endian height in the emitted event.

This is the camera-control event format. It is not itself a video/image payload.

### 5.2 Camera API and picture transfer are distinct

`BleWatchService` exposes `sendCameraPreviewState(isResume)` and `sendCameraPhotoState(state, error, num)`. Their concrete outgoing builders are in the missing service implementation.

`DeviceTransferService` separately exposes `startPushCamera(index, path, callback)` and picture-upload methods. `TransferOrder` contains a distinct picture-transfer helper family:

- start packet marker `0xAD`, with data length, request value, CRC, end/state and 32-bit file size;
- image content framing begins `0xAE`, carries a two-byte sequence, and then image bytes;
- the order also carries a configurable split value (default path uses an order split count).

These are picture/file transfer helpers, not proof of a live frame-stream protocol. The actual camera transfer service and `PictureTransferAnalyzer` source are missing, so frame timing, image encoding, package response, retries and the exact use of those packet builders remain unknown.

### 5.3 Plum behavior

Plum's CameraX preview and capture are phone-side. The watch can send shutter/lens-switch actions after the remote camera mode is active. Plum cannot currently prove a live preview stream is being sent to the watch. This audit fixes the event decoder to match the exact event meanings and delays camera-mode activation until the command channel has completed its handshake.

## 6. Incoming fragmentation

`DataPackager.packageData` shows a proprietary receive reassembly rule: the first fragment contains a three-byte message prefix and a big-endian length at bytes 1–2; the buffer size is length + 3. Continuations omit their first byte (sequence/index) and append the remaining bytes. A malformed overflow clears the buffer.

This is separate from the application-level file transfer A0/A1 block protocol and separate from the SiFli serial packet framing. Do not apply one fragmentation rule to all three.

## 7. Newly confirmed Wearfit feature families

The exported interfaces add evidence for additional device transfer APIs: music, noise/sleep music, camera images, picture, ring, e-book, meeting recording, app packages, navigation assets, gallery and custom dial/video files. These are Wearfit app capabilities, not a blanket support claim for this watch.

The `BleWatchService` interface also exposes body temperature, user profile, weight/body-fat/muscle/BMI, weather, navigation, GPS, menstrual, sports, audio/Bluetooth, translation and health sync methods. Add each only after its builder, capability gate, route and receive path are reconstructed and validated against the HK device.

## 8. Source map / later lookup

| Purpose | JADX source path |
|---|---|
| Watch command API | `com/wakeup/commponent/module/ble/BleWatchService.java` |
| Order identifiers | `com/wakeup/commponent/module/ble/WatchBleOrder.java` |
| File-transfer packet builders | `com/wakeup/module/device/work/fileTrans/FileTransferOrder.java` |
| FTP/NUS/SiFli UUIDs | `com/wakeup/module/device/work/utils/BleUUID.java` |
| Special FTP routing | `com/wakeup/module/device/work/utils/WriteQueue.java` |
| Music remote controls | `com/wakeup/module/device/work/analyzer/MusicControlAnalyzer.java` |
| Local music list/status | `com/wakeup/feature/device/music/order/LocalMusicOrder.java` |
| Health request sequence | `com/wakeup/module/device/work/dataSync/DataSyncMgr.java` |
| Health response dispatch | `com/wakeup/module/device/work/analyzer/HealthDataAnalyzer.java` |
| Sleep-apnea dispatch | `com/wakeup/module/device/work/analyzer/HealthDataAnalyzer2.java` |
| Receive reassembly | `com/wakeup/module/device/work/analyzer/DataPackager.java` |
| Camera event dispatch | `com/wakeup/module/device/work/analyzer/CameraControlAnalyzer.java` |
| Still-image/dial packet helpers | `com/wakeup/module/device/trans/TransferOrder.java` |
| Transfer feature API | `com/wakeup/commponent/module/device/DeviceTransferService.java` |
| Persisted health model | `com/wakeup/module/data/entity/HealthEntity.java` |

## 9. Evidence required before hardware feature completion

For music and camera image transfer, capture a successful Wearfit Pro operation on the exact HK 10 Pro Max+ and record:
- GATT route and characteristic properties;
- notification setup and MTU;
- file type/path metadata and first packet;
- package/block counters and payload lengths;
- all response packets and retransmission behavior;
- final visible file/image state on the watch.

For health history, capture a full sync from a known last-sync time and preserve the `0x51` records with timestamps, command subtypes and resulting history screen values. The request bytes and date/epoch conversions must be tied to the exact watch firmware.

No OTA, reset or firmware-write operations are required for these integrations.
