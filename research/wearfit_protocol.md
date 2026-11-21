# Wearfit Pro BLE research — APK-derived reference

**Source package:** `com.wakeup.howear`  
**Version:** `hw_5.6.21` (`versionCode=2026111322`)  
**Analysis date:** 2026-11-21  
**APK identity:** see [APK inventory](apk/README.md)  
**Scope:** static analysis of the supplied split APK set. No live watch session or BLE packet capture was available.

> **Important correction:** this replaces the earlier protocol notes. The old document incorrectly treated the Wearfit command channel and the SiFli serial transport as one universal characteristic/protocol. The APK contains separate app-level Wearfit command construction, a generic BLE stack with caller-supplied service/characteristic UUIDs, and a distinct SiFli serial/watchface stack. These layers must not be conflated.

## Evidence labels

- **Confirmed in APK:** directly visible in DEX method construction, method signatures, class constants, or call paths.
- **Partially decoded:** the command marker/opcode/array structure is visible, but one or more fields, byte order, or fragment semantics remain unresolved.
- **Capability only:** a Wearfit API, analyzer, or request class exists; this does not establish a complete packet definition or target-watch support.
- **Device validation required:** requires an HK 10 Pro Max+ trace or a physical command test.

The supplied APK was structurally inspected with a local DEX/AXML parser. This was **not** a full JADX source decompilation. Findings below cite package/class/method names so they can be rechecked against the exact APK hashes.

---

## 1. The three BLE layers

### 1.1 Wearfit app-level command protocol

The application constructs command objects in:

- `com.wakeup.module.ble.BleWatchServiceImpl` — concrete command builders.
- `com.wakeup.commponent.module.ble.BleWatchService` — service interface with a large set of operations.
- `com.wakeup.commponent.module.ble.BleOrderModel` — command envelope.
- `com.wakeup.module.ble.OrderUtil` — app-level message splitting helper.
- `com.wakeup.commponent.module.device.work.GetDeviceDataBiz` — device setup and synchronization orchestration.
- `com.wakeup.module.device.work.analyzer.*` — incoming message analyzers.

`BleOrderModel` carries a command `type`, a byte array, an `isSplit` flag and a `splitNum`. The application layer creates an order, then passes it through `DeviceManagerService.sendData(...)`. The concrete `DeviceManagerService` implementation is not present as a normal concrete class in the inspected DEX set; it is exposed through a service abstraction.

**Consequence:** a Wearfit command byte array is not itself a GATT characteristic UUID or a complete GATT write recipe. Do not assume that every command is written directly to the SiFli UUID shown below.

### 1.2 Generic Wearfit BLE stack

The APK contains two interchangeable stack backends:

- `com.wakeup.module.device.stack.FastBleStack`
- `com.wakeup.module.device.stack.nordic.NordicBleStack`

Both expose write/notify functions that accept a service UUID and characteristic UUID at call time. The Nordic implementation resolves the characteristic, checks the properties, queues a write and uses Nordic BLE library MTU splitting. The FastBle implementation delegates to its shared `BleManager`.

The shared stack:
- accepts the target service and characteristic UUIDs as arguments rather than baking in one universal Wearfit UUID at the public write/notify boundary;
- has a 20-byte default split-write threshold in the FastBle path, with a warning that a write longer than 20 bytes needs a larger MTU or split-write handling;
- supports MTU requests and connection/scan state management;
- uses callbacks for write and notification completion/failure.

**The regular command route is identified in `DeviceConnectMgr` (classes4.dex):**

| Role | UUID |
|---|---|
| Default watch-command service | `6E400001-B5A3-F393-E0A9-E50E24DCCA9E` |
| Default watch-command write characteristic | `6E400002-B5A3-F393-E0A9-E50E24DCCA9E` |
| Default watch-command notify characteristic | `6E400003-B5A3-F393-E0A9-E50E24DCCA9E` |

The connection-success path calls `openWatchNotify()`, which calls `openNotify()`; that method enables notifications on the NUS-style notify characteristic. `execWrite()` supplies the matching NUS service/write characteristic when an order does not carry a UUID override, then submits the write through `IBleStack.write`. This is direct evidence for Wearfit's default command route—not an inference from the UUID strings merely appearing in the APK.

`DeviceConnectMgr.onNotifyReady()` flushes the pending write queue after notification setup completes. Writes are serialized through the queue. Write success advances the queue; recoverable write failure can pause it and trigger disconnect/reconnect handling. The Android GATT write callback is still only transport-level success, not proof that the watch applied the setting.

**Remaining uncertainty:** Wearfit has explicit model/protocol route overrides (see [wearfit_uuid_routes.md](wearfit_uuid_routes.md)); the NUS default must still be checked against the exact GATT table exposed by the user's HK 10 Pro Max+. The concrete `DeviceManagerService.sendData` adapter remains behind an app service abstraction in the inspected code.

### 1.3 Separate SiFli serial transport / watchface stack

The app also embeds SiFli-specific transport and watchface code:

- `com.sifli.serialtransport.serialTransService` — older serial transport service.
- `com.sifli.siflicore.blecore.SFBLEManager` — newer SiFli GATT manager.
- `com.sifli.watchfacesdk.manager.SFWatchfaceFilePushManager`
- `com.sifli.watchfacesdk.modules.pushfile.SFPushFileModule`
- `com.sifli.watchfacesdk.packet.*` — request/response packet classes.

For the SiFli serial path, the APK contains these UUIDs:

| Role | UUID |
|---|---|
| GATT service | `00000000-0000-0000-6473-5f696c666973` |
| Serial data characteristic | `00000000-0000-0200-6473-5f696c666973` |
| Additional SiFli characteristic | `00000000-0000-0100-6473-5f696c666973` |
| Client Characteristic Configuration Descriptor | `00002902-0000-1000-8000-00805f9b34fb` |

The SiFli manager resolves the service and read/write characteristic by UUID, enables notifications through CCCD, requests MTU and does not accept queued file-transfer writes before its internal handshake is complete. The older serial transport code also uses the service/data UUID pair and serializes GATT write requests.

**Do not infer that the HK 10 Pro Max+ uses this transport just because Wearfit Pro contains it.** Wearfit Pro supports multiple hardware families. The target watch's advertised GATT table and a successful notification/handshake trace are required to establish applicability.

---

## 2. Wearfit command framing and fragmentation

### 2.1 Common observed byte patterns

Many command builders create arrays whose leading bytes resemble:

```
marker, length-high, length-low, separator, opcode, command-specific bytes...
```

Observed markers include `0xAB` and `0xEA`. Separators include `0xFF` and, for at least one physical-training command, `0x00`. Some commands use a `0x80` sub-opcode/control byte; others use `0x01` or `0x00`.

**This is not a validated universal parser format.** The byte layout varies by command builder. Do not apply one generic encoder to all commands until every method has been decoded and compared with a packet capture.

### 2.2 App-level splitting

`OrderUtil.handleMessageBytes`:
- recognizes message types beginning with `0xAB`, `0xEA`, and `0xC4`;
- allocates a 20-byte first fragment;
- uses subsequent fragments with 19-byte data blocks;
- feeds fragments into an order list.

The exact sequence/index byte semantics are not fully reconstructed in this static pass. The separate `BleOrderModel.isSplit` and `splitNum` fields also control split behaviour. `setSmartWarnCarryContent` explicitly uses a split writer with a 19-byte chunk size and a split count value of 20.

At the BLE transport layer:
- FastBle's common write path warns when the byte array exceeds 20 bytes and invokes its split writer;
- the Nordic stack uses `DefaultMtuSplitter` and queues a characteristic write.

These are **two distinct potential fragmentation layers**. Plum Watch should not blindly split a command itself and then ask the BLE library to split it again. First establish which layer owns framing for the specific device route.



### 2.4 DeviceConnectMgr command queue and notification gate

The regular app command path in `com.wakeup.module.device.work.DeviceConnectMgr` is important to reproducing the source application's behaviour:

1. `onConnectSuccess()` calls `openWatchNotify()`.
2. `openWatchNotify()` calls `openNotify()`, enabling the NUS notify characteristic.
3. Pending orders are held until the notify-ready callback; `onNotifyReady()` then starts/flushed the write queue.
4. `execWrite()` uses the NUS write characteristic by default, or the UUID route attached to an order/model override.
5. `onWriteSuccess()` removes the completed queue item and advances to the next.
6. `onWriteFailure()` can pause the queue and invoke recovery/reconnect handling.

This means Plum should not simply set a "connected" flag and immediately fire a group of writes. It should complete service discovery, select the correct route, enable notifications, wait for CCCD completion, and serialize writes. Preserve each order's response/timeout semantics separately from the GATT write callback.

### 2.3 Practical transport requirements

1. Discover the real service/characteristic pair on the target watch.
2. Check characteristic write properties (write vs write-without-response) and notify/indicate properties separately.
3. Enable notifications only on the correct response characteristic; complete the CCCD descriptor write and await its callback.
4. Request MTU, but record the *negotiated* MTU from the callback. A request is not proof that the MTU changed.
5. Serialize GATT operations and handle callbacks/failures; do not treat a queued write as a device acknowledgement.
6. Implement fragmentation only after establishing whether app-level or GATT-layer splitting is expected.

---

## 3. Confirmed command builders

The byte arrays below are taken from `BleWatchServiceImpl` methods in `classes4.dex`. Values written as `<...>` are dynamic inputs; they are not literal bytes.

### 3.1 Connection / keep-alive / discovery

| Operation | Builder | Observed bytes | Evidence |
|---|---|---|---|
| Identify phone platform | `setSendPhoneSystem()` | `AB 00 05 FF 20 80 01 02` | Confirmed in method fill-array-data |
| Device info request | `getDeviceInfoData()` | `AB 00 04 FF 92 80 01` | Confirmed |
| Find band | `findBand()` | `AB 00 03 FF 71 80` | Confirmed |
| Heartbeat response | `replyDeviceHeartBeat()` | `EA 00 03 00 0B 02` | Confirmed |
| Connect request | `sendConnectRequestType(type, model)` | Dynamic `AB ... E0 80 ...` message; model and other dynamic fields are included and the order is marked for splitting | Partially decoded |

The phone-system packet and heartbeat response use **different marker/separator combinations**. Do not rewrite the heartbeat response as an `AB ... FF` packet.

### 3.2 Time and timezone

| Operation | Builder | Observed structure | Evidence |
|---|---|---|---|
| Clock sync | `setTimeSync()` | 14-byte array beginning `AB 00 0B FF 93 80`, followed by date/time-derived bytes | Header/opcode confirmed; dynamic byte order requires trace |
| Timezone sync | `setTimeZoneSync()` | Starts `EA 00 07 FF 93 01`, then timezone offset/metadata and timezone ID bytes; variable length and passed through `OrderUtil.handleMessageBytes` | Partially decoded |
| Sleep-history request | `syncSleepData(timestamp)` | 10-byte array beginning `AB 00 07 FF 52 80`, with requested date fields | Header/opcode and method signature confirmed |

**Corrections to previous notes:** the time-sync builder uses opcode `0x93`, not `0x90`; the sleep-history request uses opcode `0x52`, not `0x83`. Do not transplant the previous field layouts for these commands.

### 3.3 Device settings

| Feature | Builder | Observed bytes / structure | Notes |
|---|---|---|---|
| Raise wrist (basic) | `setUpHandLightScreen(value)` | `AB 00 04 FF 77 80 <value>` | Simple switch form |
| Raise wrist (extended) | `setWakeUpScreenSettings(a,b)` | `EA 00 05 FF 77 01 <a> <b>` | Separate extended form; not interchangeable |
| 12/24-hour format | `set12HourSystem(value)` | `AB 00 04 FF 7C 80 <value>` | Confirmed |
| Language | `setBandLanguage(value)` | `AB 00 04 FF 7B 80 <value>` | A second language setter also exists |
| Automatic measurement | `setOnTimeMeasure(value)` | `AB 00 04 FF 78 80 <value>` | Method label says on-time/periodic measurement |
| Single/real-time measurement | `setOnceOrRealTimeMeasure(a,b)` | `AB 00 04 FF 31 <a> <b>` | Distinct from command `0x78` |
| Shake to photo | `setSharkTakePhoto(value)` | `AB 00 04 FF 79 80 <value>` | Toggle only; not the camera-transfer flow |
| Body-temperature mode | `bodyTempMeasure(value)` | `AB 00 04 FF 86 80 <value>` | Toggle/config API exists |
| Sleep mode | `setSleepMode(a,b,c,d)` | `EA 00 07 FF 7F 01 <four dynamic bytes>` | Ten-byte array; exact semantic mapping must be checked at call site |
| Sleep-time range | `setSleepTimeRange(a,b,c,d,e)` | `AB 00 08 FF 7F 80 <five dynamic bytes>` | Separate command variant; do not combine with sleep-mode packet |
| DND schedule/settings | `setDisturbanceModel(a,b,c,d,e)` | `AB 00 08 FF 76 80 <five dynamic bytes>` | Eleven-byte array |
| DND mode | `notDisturbMode(a,b)` | `EA 00 05 FF 76 01 <a> <b>` | Separate eight-byte command |
| Physical training | `setPhysicalTraining(a,b,c,d)` | Ten-byte array beginning `EA 00 07 00 01 01`, followed by four dynamic values | Separator is `00`, not `FF`; verify exact field meanings |

### 3.4 Reminders and alarms

| Feature | Builder | Observed bytes / structure | Notes |
|---|---|---|---|
| Reminder switch bitfields | `reminderSwitch(otherStr, controlStr)` | `AB 00 05 FF A0 80 <other-bits> <control-bits>` | Each string is converted with `BleUtil.bit2Byte`; bit ordering still needs verification |
| Sedentary reminder | `setSedentaryWarn(...)` | `AB 00 09 FF 75 80 <six dynamic bytes>` | Returns **two** orders: schedule/config packet, then reminder-switch packet |
| Water reminder | `setDrinkWater(...)` | `AB 00 09 FF 53 80 <six dynamic bytes>` | Uses opcode `0x53`, not `0xA3`; returns two orders |
| Other reminders | `setRemind(...)` | `AB 00 08 FF 9E <six dynamic bytes>` | Also returns two orders; used for sport/eating/medicine/book/walk-style reminders |
| HR early-warning zones | `setHrEarlyWarning(...)` | `EA 00 0B FF A0 00 <eight dynamic values>` | Not the same packet as `reminderSwitch`, despite both using opcode `0xA0` |
| Alarm | `setAlertClock(...)` | 12-byte array beginning `AB 00 <dynamic> FF 73 80 ...` | Third byte is copied from a method input; it is **not a fixed `0x08`**. Six integer parameters are accepted. Decode caller-to-field mapping before implementing. |

For the three schedule methods, the service returns an array of two `BleOrderModel` entries. Plum must send both in the original order. Sending only the obvious schedule packet omits the switch/enable state.

The alarm call path in `GetDeviceDataBiz.setClock` retrieves alarm hour, minute, repeat and reminder flags from `ClockModel`, bit-packs repeat and passes them into `setAlertClock`. The precise meaning of all six method arguments and the dynamic length/control byte remains unresolved here.

### 3.5 Notifications

`mesNotifyPush(iconPrompt, show, hideDetails)` builds a 9-byte array:

```
EA 00 06 FF 72 01 <iconPrompt> <show> <hideDetails>
```

This is an `EA` marker packet. The old document's `DE ... 72` framing is not supported by the supplied builder.

`setSmartWarnCarryContent(..., content)` builds notification content from bytes, uses a 19-byte split writer and marks the order for splitting. Keep this separate from the notification-display preferences.

### 3.6 Other confirmed builders

- `getMtu(...)` — opcode `0xA9`; exact response negotiation semantics require call-site trace.
- `sendWeatherInfo` / `sendWeatherInfo2` / `sendCityWeather` / `sendCityAllWeather` — builders exist, but this pass has not validated all fields and array lengths.
- `sendUserInfo`, `syncMetGoal`, `sendTemperatureUnit` — user/device profile and unit synchronization APIs exist; payload definitions need more decoding before use.

---

## 4. Device setup and capability gating

`GetDeviceDataBiz` shows that Wearfit does not simply blast every setting packet to every connected device.

- `connectSend` checks whether the device is in an OTA state and skips ordinary synchronization while OTA is active.
- It obtains device identity/SN and sends timezone, time and MTU-related commands during connection setup, alongside additional device-specific requests.
- `deviceExpandSynchronize` syncs settings through individual methods (wrist wake, notifications, HR warning, DND, sleep settings, training, language, alarms, reminders and more).
- Several operations are guarded by `DeviceDao.isSupport(...)` and device-type/support metadata.
- Language setup can call both `setBandLanguage2` and `setBandLanguage`.
- Alarm and reminder settings are assembled from persisted model objects rather than from raw UI booleans alone.

**Implication for Plum Watch:** command knowledge alone is not enough. It needs device identification/capability gating, the real transport route, correct field values, and response verification. A writable GATT characteristic does not mean that the firmware recognises every Wearfit command.

---

## 5. Incoming-message architecture

The APK contains dedicated analyzers, including:

- `ConnectAnalyzer`
- `CommonAnalyzer`
- `OtherAnalyzer`
- `SettingsAnalyzer`
- `SportAnalyzer`
- `RequestHealthAnalyzer`
- `HealthDataAnalyzer` / `HealthDataAnalyzer2`
- `CameraControlAnalyzer`
- `MusicControlAnalyzer`
- `GpsAnalyzer`
- `MapNaviAnalyzer`
- `ScheduleAnalyzer`
- `NetFtpOtaAnalyzer`
- `RecordingAnalyzer`
- `CallRecordAnalyzer`
- `DialAnalyzer`
- `FriendsAnalyzer`
- `MenstrualAnalyzer`
- `PictureTransferAnalyzer`
- `AiAnalyzer`

`DataPackager` has buffering, package-completion and reset methods, which indicates that incoming messages may be assembled before analyzer dispatch. `OtherAnalyzer` handles the heartbeat path and sends `replyDeviceHeartBeat()`.

This confirms a structured receive pipeline rather than a fire-and-forget-only application. It does **not** provide a reliable complete response-opcode catalogue. Plum should not claim "watch confirmed" merely because Android's GATT write callback succeeded.

---

## 6. Feature evidence: what is and is not established

| Feature | APK evidence | Plum recommendation |
|---|---|---|
| Find watch | Explicit builder `findBand` | Candidate after transport is identified |
| Battery/device info | Device-info request and incoming analyzer classes | Parse actual response and battery source |
| Heart rate | Standard health and request/response analyzers exist | Needs actual target service/notification trace |
| Alarms | Builder + caller-side alarm model conversion | Rebuild after exact alarm byte mapping and device test |
| Raise wrist / time format / language | Multiple builder variants | Treat each variant separately; confirm capability |
| Periodic HR/SpO₂ / body-temperature options | Builders exist | Feature availability and parameter mapping need target test |
| Sedentary / water / other reminders | Builders return two packets | Must send both and reproduce bitfield generation |
| Notification display/content | Display builder + split content builder | Needs correct split and app ID mappings |
| Sleep mode / time window / sleep history | Several distinct builders | Do not conflate three operations |
| Music control | Inbound analyzer and media control APIs exist | Determine target command route and Android media integration |
| Watchface | SiFli SDK file-push state machine exists | Only if the target exposes the matching SiFli service and handshake |
| Weather | Several APIs exist | Do not use old guessed seven-day payload; decode fully |
| DND | Two separate command builders exist | Do not assume old DE marker/payload |
| Contacts / SOS | APIs exist | Fragmentation and field layout not fully established |
| Sport / GPS / maps / OTA / Wi-Fi / calls / recordings / AI | Numerous APIs and analyzer classes exist | Capability/API evidence only; separate research required |

---

## 7. What this means for the current Plum implementation

The earlier Plum research and implementation assumed several packet layouts that do not match the actual methods in this APK. Known examples:

1. Time sync: old `0x90` claim → APK builder uses `0x93`.
2. Sleep history: old `0x83` claim → APK builder uses `0x52`.
3. Notification display: old `DE` marker → APK builder uses `EA`.
4. Water reminder: old `0xA3` claim → APK builder uses `0x53`.
5. Sleep mode, sleep-time range and DND schedule are separate packet variants with different markers/separators.
6. Sedentary, water and other reminder methods return a pair of orders; a single write is incomplete.
7. Alarm's third header byte is dynamic, not a constant header length.
8. Generic Wearfit command transport cannot be assumed to be the SiFli watchface characteristic.

These are sufficient reasons to treat the earlier `WearfitProtocol.kt` assumptions as unverified and not build more features on top of them.

### Recommended order for future Plum work

1. **Capture the target's GATT map:** service UUIDs, characteristic UUIDs, properties, descriptors and MTU.
2. **Capture a successful Wearfit Pro session with this exact watch:** connection/bonding, notification enable, handshake, device-info request, heartbeat, and one setting at a time.
3. **Compare target trace with these APK-built payloads:** confirm marker, length, command, field offsets, byte order, split headers, acknowledgements and retries.
4. **Identify the real app-to-stack routing:** establish which device family/transport backend and UUIDs Wearfit selects for the HK 10 Pro Max+.
5. **Implement one safe command end-to-end:** require GATT write success plus a watch-originated acknowledgement/read-back or visible state change.
6. **Only then add the rest of the settings and features.**

---

## 8. Source map inside the APK

| Purpose | DEX | Class / method |
|---|---|---|
| Wearfit command construction | `classes4.dex` | `com.wakeup.module.ble.BleWatchServiceImpl` |
| Command interface and order envelope | `classes2.dex` / `classes4.dex` | `BleWatchService`, `BleOrderModel` |
| App-level splitting | `classes4.dex` | `com.wakeup.module.ble.OrderUtil.handleMessageBytes` |
| Connection and synchronization | `classes4.dex` | `GetDeviceDataBiz.connectSend`, `deviceExpandSynchronize`, `deviceInfoBiz` |
| Generic BLE transport | `classes4.dex` | `FastBleStack`, `NordicBleStack`, `BleManager` |
| Incoming responses | `classes4.dex` | `com.wakeup.module.device.work.analyzer.*` |
| SiFli serial transport | `classes12.dex` | `com.sifli.serialtransport.serialTransService` |
| SiFli BLE manager | `classes14.dex` | `com.sifli.siflicore.blecore.SFBLEManager` |
| SiFli watchface SDK | `classes17.dex` | `com.sifli.watchfacesdk.*` |

## 9. Limitations

- No live BLE capture from the user's HK 10 Pro Max+ was provided.
- Wearfit's concrete `DeviceManagerService` transport adapter and all runtime UUID-selection paths were not reconstructed in this pass.
- Some command methods were inspected at byte-array construction level; all caller argument semantics and all acknowledgements were not decoded.
- The APK contains many optional APIs for device families other than the user's watch.
- Static APK evidence establishes what this Wearfit build can construct and process, not what the target firmware accepts.

**Do not promote a row marked Partially decoded / Capability only to "working" until a physical target-watch trace confirms it.**
