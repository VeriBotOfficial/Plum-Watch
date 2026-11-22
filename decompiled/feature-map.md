# Wearfit feature map

| Feature | Wearfit Pro 5.6.21 evidence | Current Plum Watch implementation |
|---|---|---|
| Time sync | Standard Current Time Service and proprietary time/timezone builders | Standard Current Time Service auto-sync at connection; proprietary time/timezone route still needs target validation |
| Heart-rate / SpO2 live measurement | `setOnceOrRealTimeMeasure`, `RequestHealthAnalyzer`, `HealthDataAnalyzer` and `HealthDataAnalyzer2` | Queues one-shot type 9/17 requests and reads standard HR if exposed; response compatibility with HK watch not yet demonstrated |
| Heart-rate / SpO2 history | Request/response analyzers and `OldDataSyncProxy` history persistence | Not implemented: no history request, timestamped records, or historical response parser |
| Sleep history | `syncSleepData(timestamp)`, sleep analyzers and old-data persistence | Not implemented |
| Music file transfer | `sendFileTransHead`, `sendFileTransData`, receive-response methods and dedicated FTP route | Not implemented: picker only; no URI read or BLE transfer |
| Audio/Bluetooth controls | `sendAudioBle`, `sendAudioSearchSwitch`, `MusicControlAnalyzer` | Phone media control was removed; watch audio/Bluetooth control not implemented |
| Camera remote control | `CameraControlAnalyzer`, camera preview/photo state APIs | Partial: phone CameraX preview/capture and watch shutter/lens events; command semantics/target compatibility unverified |
| Picture/image transfer | `PictureTransferAnalyzer` and image-data APIs | Not implemented: no image packet assembly, decoding or transfer |
| Watchfaces | SiFli SDK file-push state machine | Existing SiFli watchface path; do not reuse for music unless target protocol proves it |
| Device settings/reminders | Numerous Wearfit builders and capability-gated sync paths | Some settings implemented; full API/target support inventory remains incomplete |

## Important distinctions

- The regular Wearfit command NUS route, special FTP/file-transfer route, and SiFli watchface route are separate layers.
- A one-shot HR/SpO2 request is not a historical-data sync request.
- A local list of scalar readings is not watch history. Correct graphs need timestamped records and response-completion handling.
- Camera control messages are not image data. `CameraControlAnalyzer` and `PictureTransferAnalyzer` are distinct receive paths.
- Audio/Bluetooth control APIs are not the same thing as sending MP3/M4A files.
- A GATT write callback proves that Android's write completed at the transport layer; it does not prove that the watch accepted or stored the operation.

See `research/plum_current_gap_analysis.md` for the source audit and `decompiled/HOW_TO_DECOMPILE.md` for the remaining source-export step.
