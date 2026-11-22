# Wearfit feature map — updated 2026-11-22

| Feature | Wearfit Pro 5.6.21 source evidence | Plum Watch status |
|---|---|---|
| Time sync | Standard CTS plus proprietary time/timezone builders | Standard CTS auto-sync; proprietary path not target-verified |
| HR/SpO₂ live | `0x31` subtypes 9/10 and 17/18; standard HR characteristic may also exist | One-shot request and standard HR read; timestamped sample graph |
| HR/SpO₂ history | `DataSyncMgr.startSyncData`, `setSyncDataHr(lastTimestamp)`, `0x51` subtypes 17/18 | No historical backfill yet; concrete request builder and old-data decoder missing |
| Sleep history | `syncSleepData(yesterday)`, `0x52` analyzer | Not implemented |
| Sleep apnea | `syncSleepApnea(timestamp)`, `EA ... 2A 01` analyzer | Not implemented |
| Music file upload | `DeviceTransferService.startPushMusic`, `FileTransferOrder`, FTP route | Picker only; upload ACK/state machine not implemented |
| Phone media controls | `MusicControlAnalyzer` maps watch commands to Android media keys | Watch-originated phone media control exists; not the same as file upload |
| Camera remote control | `CameraControlAnalyzer`, camera mode/photo APIs | Event parser fixed; waits for BLE readiness; phone camera is remote-controlled |
| Camera image/picture transfer | `startPushCamera`, picture methods and `TransferOrder` A0/AE-like packet family | Not implemented; concrete transfer analyzer missing |
| Watchfaces | SiFli request/response push SDK | Existing SiFli path retained |
| Shake to capture | `setSharkTakePhoto` API | Separate explicit setting exposed; not toggled by Camera page |
| Sleep mode | `setSleepMode` builder | Existing builder now exposed in Other Settings |
| Physical training | `setPhysicalTraining` builder | Existing builder now exposed in Other Settings |
| Body temperature mode | `bodyTempMeasure` builder | Setting exposed |
| Alarms/reminders/notifications | Builders and analyzers in Wearfit service API | Some controls implemented; verify exact model support |
| Weather/GPS/maps/sport/contacts/voice/translation | API/analyzer families exist | Not blanket-enabled; require payload and capability work |

## Transport rules

- Normal command route: NUS `6E400001/2/3...`.
- File transfer: FTP `6E400011/12/13...`.
- SiFli watchface transport: `00000000-0000-0000-6473-5f696c666973` service and serial data characteristic.
- Picture transfer helpers are a separate application packet family; their complete state machine is not exported.
- A local graph of readings received by Plum is not equivalent to backfilled watch history.
- A command write callback is not a file-transfer ACK or proof that a feature completed.

See `research/wearfit_jadx_source_audit.md` for packet layouts, class paths and missing implementation details.
