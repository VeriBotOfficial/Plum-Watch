# Plum Watch BLE implementation audit against Wearfit Pro APK

**Audit date:** 2026-11-21  
**Plum source snapshot:** `main` at `131780f401fc82abdf3eb880f13f6036a7d08ae9`  
**Files compared:** `BleWatchManager.kt`, `WearfitProtocol.kt`  
**Reference:** supplied Wearfit Pro `com.wakeup.howear hw_5.6.21` APK  
**Scope:** read-only source comparison. No app code was changed.

This audit explains why the current Plum BLE implementation should not be treated as protocol-verified. Several high-impact differences exist between Plum's current source and the actual command builders / transport paths visible in Wearfit Pro.

## 1. Highest-impact architecture mismatch: command transport UUID

### Wearfit APK

The ordinary Wearfit command path in `DeviceConnectMgr` defaults to Nordic UART Service:

- Service: `6E400001-B5A3-F393-E0A9-E50E24DCCA9E`
- Phone → watch write: `6E400002-B5A3-F393-E0A9-E50E24DCCA9E`
- Watch → phone notify: `6E400003-B5A3-F393-E0A9-E50E24DCCA9E`

`onConnectSuccess()` enables watch notifications. Pending app command orders are flushed after the notification-ready callback. Special file/OTA routes and the SiFli watchface transport are separate.

### Current Plum source

`BleWatchManager.onServicesDiscovered()` looks up the proprietary command characteristic only under the SiFli UUID pair:

- Service: `00000000-0000-0000-6473-5f696c666973`
- Characteristic: `00000000-0000-0200-6473-5f696c666973`

`sendWearfitSetting()`, `setAlarm()`, `findWatch()`, the heartbeat handler and the proprietary handshake all write to that `sifliDataCharacteristic`. There is no NUS service/write/notify UUID in the current `BleWatchManager.kt` constants.

### Assessment

<badge>High-priority mismatch</badge>

Plum is routing normal Wearfit command packets through the SiFli serial/watchface characteristic, while the APK's default general command route is NUS. The HK 10 Pro Max+ may expose both or use a device-specific override, so a target GATT capture is still required; nevertheless, Plum currently has no implementation of the regular NUS route shown by `DeviceConnectMgr`.

This is the first area to investigate. A packet can be perfectly formed and still do nothing when written to a characteristic that is not the intended command channel.

## 2. Confirmed command-byte mismatches

| Feature | Current Plum source | Wearfit APK source | Assessment |
|---|---|---|---|
| Proprietary time sync | `sendProprietaryTimeSync()` uses opcode `0x90` | `setTimeSync()` uses opcode `0x93` | Wrong command ID; date/time field layout also needs correction |
| Notification-display settings | `setNotificationDisplay()` uses marker `0xDE` | `mesNotifyPush()` starts with `EA 00 06 FF 72 01` | Wrong marker |
| Sleep mode | `setSleepMode()` uses marker `0xDE` | `setSleepMode()` starts with `EA 00 07 FF 7F 01` | Wrong marker |
| Physical training | `physicalTraining()` uses marker `0xDE` | APK uses marker `0xEA`, separator `0x00`, opcode `0x01` | Wrong marker |
| HR early-warning zones | Plum uses opcode `0xFC`, sub-op `0x01`, marker `0xDE` | APK `setHrEarlyWarning()` uses marker `0xEA`, opcode `0xA0`, sub-op `0x00` | Wrong marker, opcode and sub-op |
| Water reminder | Plum uses opcode `0xA3` | APK `setDrinkWater()` uses opcode `0x53` | Wrong command ID |
| Reminder enable state | Plum sends one schedule command | APK schedule builders return two orders, including `reminderSwitch()` | Incomplete command sequence |
| Alarm | Plum fixes header length byte to `0x09` | APK `setAlertClock()` copies a dynamic input into the length/control byte | Fixed header assumption not supported by APK |

### Correct details that should be preserved

- The general packet builder's common `AB/EA + two-byte length + separator + opcode + data` shape is useful for the confirmed command forms; it must not be treated as universal for all Wearfit APIs.
- Plum's heartbeat response bytes `EA 00 03 00 0B 02` match the APK's observed response bytes.
- Plum's phone-system packet `AB 00 05 FF 20 80 01 02` matches the APK.
- Plum's device-info request `AB 00 04 FF 92 80 01` matches the APK.
- Plum's Find Band packet `AB 00 03 FF 71 80` matches the APK.
- Correct packet bytes do not compensate for a wrong GATT route or missing handshake/notification setup.

## 3. Reminder sequence mismatch

In the APK:

- `setSedentaryWarn(...)` returns two `BleOrderModel` entries.
- `setDrinkWater(...)` returns two entries.
- `setRemind(...)` returns two entries.
- One entry is the time-window/configuration packet; the other is `reminderSwitch(...)`, which builds two bitfield bytes from stored strings using `BleUtil.bit2Byte`.

Current Plum `sendReminder()` sends only one generic command. It does not generate the shared reminder-switch bitfield packet and cannot express the source app's full pair of orders. Sending a correctly shaped schedule packet alone may therefore leave the feature disabled.

The exact bit-to-feature mapping and all bit ordering still need to be decoded or captured; do not guess them.

## 4. Alarm packet mismatch

Current Plum `buildAlarmPayload()` emits:

```
AB 00 09 FF 73 80 id status hour minute repeat flags
```

The APK's `setAlertClock(...)` also returns a 12-byte array beginning with `AB 00`, command `0x73`, and the same general field family, but the third byte is assigned from a method argument. The APK's business layer converts `ClockModel` fields and repeat flags before calling it.

Therefore the static `0x09` header value in Plum is not confirmed. The precise field-to-argument mapping needs method/caller-level reconstruction and a live packet capture before replacing it.

## 5. Notification readiness and write scheduling

Wearfit's `DeviceConnectMgr` waits for the watch notify channel to become ready before flushing pending command orders. Its write queue is serialized and has success/failure recovery logic.

Plum enables notifications on characteristics it discovers, but its ordinary proprietary writes are not gated on a NUS notify-ready state. `sendProprietaryCommand()` returns the result of Android's GATT write API call. That confirms the Android stack accepted/queued the write; it does not confirm that the watch parsed or applied the command.

Plum should distinguish:
- GATT connection complete;
- service/characteristic discovery complete;
- CCCD notification write complete;
- command write callback success;
- protocol-level response/acknowledgement;
- actual setting read-back or visible watch state change.

## 6. Current settings implementation status

| Current Plum setting | Source comparison |
|---|---|
| Language `0x7B` | Command structure matches one APK builder; target parameter mapping and transport still require verification |
| 12/24-hour `0x7C` | Structure matches one APK builder; verify device capability |
| Wrist wake `0x77` | Simple builder exists, but Wearfit also has a separate extended `0x77` form |
| Auto measurement `0x78` | One builder exists; distinguish periodic measurement from `setOnceOrRealTimeMeasure` (`0x31`) |
| Shake-to-photo `0x79` | Toggle builder exists; does not implement camera photo/preview transfer |
| Body temperature `0x86` | Builder exists; feature support varies by device |
| Notification display `0x72` | Wrong marker in current Plum |
| Sleep mode `0x7F` | Wrong marker in current Plum; distinct from sleep-time-range builder |
| HR zones | Wrong opcode, sub-op and marker in current Plum |
| Sedentary | Missing second reminder-switch order |
| Water | Wrong opcode and missing second reminder-switch order |
| Alarms `0x73` | Fixed header-length assumption differs from APK method |
| Heart rate / battery | Standard GATT characteristics are handled separately; device-specific data/report format still needs capture |

## 7. Likely root-cause order for the "nothing works" report

Based only on source comparison, not on a live reproduction:

1. **Wrong command characteristic:** the main candidate. Plum routes Wearfit packets to SiFli `...0200` instead of implementing the APK's default NUS command route.
2. **Wrong command framing:** multiple visible setting methods use markers/opcodes that differ from the APK.
3. **Missing command sequence:** reminder writes omit the second switch packet; handshake/notification sequencing may not match the source app.
4. **No protocol-level confirmation:** Plum treats an Android GATT queue result as command submission success, not a watch acknowledgement.
5. **Device-specific capabilities:** the APK gates synchronization using `DeviceDao.isSupport(...)`; Plum's current source does not reproduce that capability table.

The first item should be tested before changing all payload builders. Otherwise, protocol changes risk being evaluated over the wrong transport.

## 8. What a decisive HK 10 Pro Max+ capture needs

Capture one successful Wearfit Pro session with this exact physical watch and record:

- all advertised service UUIDs;
- all characteristics and properties (read, write, write-without-response, notify, indicate);
- CCCD writes and their callback status;
- negotiated MTU;
- outbound bytes and destination service/characteristic;
- inbound notifications and their timestamps;
- connection/bonding events;
- one setting change at a time, including watch state before and after.

Start with connection setup, a device-info request, a heartbeat round-trip, and one reversible setting such as 12/24-hour mode. Only after that matches should Plum's transport be replaced or additional commands be added.

---

**Conclusion:** the present source contains several protocol assumptions contradicted by the Wearfit APK. The research now supports a much more specific next step: verify and implement the real NUS command route (or the model-specific route actually seen on the HK watch), then correct the command builders and response handling. This audit does not modify or claim to validate the running app.


## Current feature-branch implementation and CI validation (2026-11-22)

The `fix/plum-watch-controls-camera-notifications` branch now includes the following application-side changes:

- Dedicated Alarm, Health, Notifications and Camera pages; these controls are not duplicated inside Other Settings.
- Alarm records are created by the user, persisted locally, and only editable/sent while the proprietary command channel is available. Sound is not exposed as a configurable watch alarm capability.
- Notification listener access is user-granted and notifications are filtered by the selected launcher-app package names.
- CameraX supplies the phone preview and local capture path; remote watch shutter and camera-switch events are handled by the incoming `0x15` command path.
- Health requests use the APK's `0x31` request form; replies are handled from `0x31` measurement-type/value fields. An additional strict `0x51/0x20` parser is kept separate and is based on a different Wearfit X10 capture; its compatibility with the HK 10 Pro Max+ remains unverified.
- Notification text fragmentation uses a 20-byte initial write and indexed 19-byte continuation payloads, with unit tests covering ordering, limits and reconstruction.
- SiFli serial frames cap Android characteristic values at 512 bytes, with MTU-517 boundary and reassembly tests. This fixes the Android-side attribute-value length failure but does not prove that the watch accepts the current outer SiFli framing or file-transfer handshake.

### Required physical-device validation

The following are not proven by unit tests or source inspection alone:

1. A complete watchface installation on the HK 10 Pro Max+ (including watch-side acceptance and final response).
2. The exact camera-preview/remote-shutter interaction on this model.
3. The `0x51/0x20` Health response layout on this model; the primary `0x31` measurement response path is handled independently.
4. Long notification delivery and app filtering on the physical watch.

The Android build workflow runs `testDebugUnitTest` and `assembleDebug`; a successful Actions run validates compilation and unit tests, not these hardware-dependent behaviors.
