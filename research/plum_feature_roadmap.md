# Plum Watch feature roadmap from Wearfit Pro source

**Updated:** 2026-11-22  
**Reference build:** Wearfit Pro `hw_5.6.21`  
**Target:** HK 10 Pro Max+

## Priority 0 — correct existing user-facing behavior

| Item | Current action | Completion criterion |
|---|---|---|
| Camera remote control | Match `CameraControlAnalyzer` event bytes and wait for command-channel readiness before enabling camera mode | Watch shutter and lens-switch events trigger exactly one corresponding phone camera action |
| Shake-to-capture preference | Expose as a separate explicit setting; do not toggle it whenever the Camera page opens | The user can enable/disable the persistent setting independently |
| HR/SpO₂ graph | Timestamp every received reading, retain repeated equal values, chart by timestamp | Every received reading is plotted and survives app restart |
| Health history backfill | Not yet safely implementable; request builder and persistence decoder are missing | Full Wearfit history response is parsed into timestamped records for this device |
| Music upload | Not yet safely implementable; only packet builders/API interface are available | Upload completes through FTP route with parsed ACKs, retries and watch file-list verification |
| Watch image/preview | Not yet safely implementable; camera picture transfer implementation is missing | A real watch-originated/phone-originated preview or still-image flow is shown on the watch and completes with a response |

## Priority 1 — low-risk, directly evidenced additions

- Shake-to-capture setting: Wearfit exposes `setSharkTakePhoto`, and Plum exposes this as a separate toggle rather than coupling it to camera mode.
- Sleep mode and physical training: Plum's existing packet builders are now exposed in Other Settings using `setSleepMode` and `setPhysicalTraining`.
- Keep one-shot HR/SpO₂ requests distinct from history sync.
- Expose health samples with timestamps and an explicit distinction between locally received history and watch backfill.
- Keep Wearfit command, FTP file transfer, SiFli watchface transfer and picture-transfer packet families isolated in their own protocol modules.

## Priority 2 — additional Wearfit API families

Potential API inventory from `DeviceTransferService` and `BleWatchService`:
- file transfer: music, noise/sleep music, ring, e-book, meeting, app, custom file;
- images: camera photo, picture, gallery and WeChat image;
- device settings: sleep mode, reminders, physical training, heart-rate warning, language, time format, wrist wake, body temperature;
- data: steps, sleep, sleep apnea, blood pressure, temperature, weight, glucose, breathing, BMI/body fat/muscle mass;
- device integrations: weather, GPS, maps/navigation, contacts, audio/Bluetooth, translation, recording and sport.

These are not automatically HK 10 Pro Max+ capabilities. Implement one at a time only after its command builder, target support flag, transport route, response parser and UI path are all understood.

## Priority 3 — device validation sequence

1. Save a full GATT database export from the HK watch and confirm which of NUS, FTP and SiFli services it advertises.
2. Capture a working Wearfit music upload and export all ACL/GATT notification/write packets.
3. Capture one full Wearfit health sync from a known last-sync timestamp.
4. Capture one remote camera shutter, one lens-switch action, and any camera image/preview transfer.
5. Compare packet directions, MTU, chunk counters, CRCs, ACK values and completion messages.
6. Implement protocol-level tests before hardware testing; require a watch-side visible result before a feature is called complete.
