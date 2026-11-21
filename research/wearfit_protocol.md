# Wearfit Pro BLE Protocol Reference
*Reverse-engineered from `com.wakeup.howear` (Wearfit Pro) APK decompiled with jadx 1.5.1*

---

## Overview

Wearfit Pro uses **two BLE command channels** on the same SiFli serial data characteristic (`00000000-0000-0200-6473-5f696c666973`):

| Channel | Category | Marker | Description |
|---------|----------|--------|-------------|
| **SiFli Watchface** | 0x04 | 0x04 | Native watchface/file transfer (WFPUSH2) |
| **Proprietary Wearfit** | 0x04 | 0xAB / 0xEA | All other commands (alarms, weather, music, health, etc.) |

Both share the same GATT characteristic. The proprietary commands use a **different framing**:
- **Marker**: 0xAB (171) or 0xEA (234)
- **Length**: 2 bytes BE (payload length after header)
- **Separator**: usually 0xFF; documented heartbeat and physical-training frames use 0x00
- **Command ID**: 1 byte
- **Special marker**: some documented outgoing setting frames use 0xDE rather than 0xAB/0xEA
- **Data...**: Variable

---

## SiFli Watchface Protocol (Category 0x04)

### Inner Message Format
```
messageId (2 LE) + length (2 LE) + payload
```

### Serial Framing
- First frame: `category(1) + flag(1=0/1) + totalLen(2 LE) + payload`
- Continuation: `category(1) + flag(2/3) + payload`
- MTU-7 first, MTU-5 continuation

### Watchface Commands
| Msg ID | Name | Direction | Payload |
|--------|------|-----------|---------|
| 0 | ENTIRE_START_REQ | Phone→Watch | type(2) + phoneType(1=2) + totalBytes(4) |
| 1 | ENTIRE_START_RSP | Watch→Phone | result(2) + maxDataLen(2) + version(2) + blockLength(2) + blockLeft(4) |
| 2 | FILE_START_REQ | Phone→Watch | fileLen(4) + nameLen(2) + name(UTF-8) |
| 3 | FILE_START_RSP | Watch→Phone | result(2) |
| 4 | FILE_DATA_REQ | Phone→Watch | **index(4, starts at 1)** + data |
| 5 | FILE_DATA_RSP | Watch→Phone | result(2) + expectIndex(4) |
| 6 | FILE_END_REQ | Phone→Watch | (empty) |
| 7 | FILE_END_RSP | Watch→Phone | result(2) |
| 8 | ENTIRE_END_REQ | Phone→Watch | (empty) |
| 9 | ENTIRE_END_RSP | Watch→Phone | result(2) |
| 10 | LOSE_CHECK_REQ | Watch→Phone | expectIndex(4) |
| 11 | LOSE_CHECK_RSP | Phone→Watch | (empty) |
| 12 | ABORT_CMD | Phone→Watch | reason(1) |
| 13 | FILE_INFO_REQ | Phone→Watch | fileCount(4) |
| 14 | FILE_INFO_RSP | Watch→Phone | result(2) |

### File Transfer Rules (Type 0 = Watchface/DIALPLATE)
- **Unzip on phone**, push each file **separately**
- Destination path = `"/" + relativePathInZip` (e.g., `/dyn/dynamic_app/watchface/installer/wf_clock1003.dsc`)
- **File data index starts at 1** (not 0)
- **Sort**: descending by size, GIFs last
- **No padding/CRC** for type 0 (only for type 3/CUSTOM or withByteAlign=true)
- Max block length from START_RSP or 10KB default

---

## Proprietary Commands (Marker 0xAB/0xEA, Category 0x04)

### Common Header
```
0xAB/0xEA + lenHi + lenLo + 0xFF + cmdId + data...
```

### Outgoing Commands (Phone → Watch)

| Command | Name | Payload (hex) | Description |
|---------|------|---------------|-------------|
| 0x0B (11) | Heartbeat Reply | `DE 00 03 00 0B 02` | Reply to watch heartbeat (cmd 11/1) |
| 0x20 (32) | Phone System | `AB 00 05 FF 20 80 01 02` | Tell watch we're Android (1=Android, 2=phone) |
| 0xE0 (-32) | Connect Request | `AB 00 LL FF E0 80 <type> <modelLen> <model...>` | Type 0/1/2 + phone model (max 11 bytes) |
| 0x92 (146) | Get Device Info | `AB 00 04 FF 92 80 01` | Request device info (triggers battery cmd 145) |
| 0x71 (113) | Find Band | `AB 00 03 FF 71 80` | Trigger watch vibration/alert |
| 0x72 (114) | Smart Warn | `AB 00 05 FF 72 80 <msgId> <type>` | Notification reminder |
| 0x73 (115) | Set Alarm | `AB 00 09 FF 73 80 <id> <status> <hour> <min> <repeat> <flags>` | Alarm config |
| 0x74 (116) | Send User Info | `AB 00 0C FF 74 80 <step> <age> <height> <weight> <unit> <goal> <tempUnit> <energy> <gender>` | User profile |
| 0x75 (117) | Sedentary Warn | `AB 00 09 FF 75 80 <ctrl> <sH> <sM> <eH> <eM> <interval>` | Sedentary reminder |
| 0x77 (119) | Raise Wrist | `AB 00 04 FF 77 80 <ctrl>` | Wake screen on wrist raise |
| 0x78 (120) | On-Time Measure | `AB 00 04 FF 78 80 <ctrl>` | Auto HR/SpO2 |
| 0x79 (121) | Shake Photo | `AB 00 04 FF 79 80 <ctrl>` | Shake to take photo |
| 0x7B (123) | Language | `AB 00 04 FF 7B 80 <lang>` | Language switch (0=CN, 1=EN, 5=RU, 6=JP, 13=FR, 24=VI, 8=DE, 9=KO, 10=TH, 11=AR) |
| 0x7C (124) | 12/24 Hour | `AB 00 04 FF 7C 80 <ctrl>` | Time format |
| 0x80 (128) | Set QR | Variable | QR code data |
| 0x83 (-125) | Sync Sleep | `AB 00 07 FF 83 80 00 <y-2000> <m> <d>` | Pull sleep data |
| 0x86 (-122) | Body Temp | `AB 00 04 FF 86 80 <ctrl>` | Temp measurement |
| 0x88 (-120) | Weather (old) | `AB 00 11 FF 88 80 <7 days: max/min>` | 7-day forecast |
| 0x90 (-112) | Time Sync | `AB 00 0B FF 90 80 00 <yHi> <yLo> <m> <d> <h> <m> <s>` | Set watch time |
| 0x91 (-111) | Time Zone | Variable | Timezone sync |
| 0xA0 (-96) | Reminder Switch | `AB 00 05 FF A0 80 <ctrlBits> <otherBits>` | Global reminder enable |
| 0xA3 (-93) | Drink Water | `AB 00 09 FF A3 80 <ctrl> <sH> <sM> <eH> <eM> <interval>` | Water reminder |
| 0xA4 (-92) | Contact Count | `AB 00 05 FF A4 80 <id> <num>` | SOS/contact count |
| 0xA5 (-91) | Contact Name | Variable (split) | Contact name (multi-packet) |
| 0xA6 (-90) | Contact Phone | Variable (split) | Contact phone (multi-packet) |
| 0xC9 (201) | Market Apps | - | Query installed market apps |
| 0xD5 (-43) | Music Control | - | Play/pause/next/prev/vol |
| 0xE7 (231) | Camera Preview | - | Camera control |
| 0xE8 (232) | Camera Photo | - | Photo taken event |
| 0xFC (-4) | HR Warning | `DE 00 0B FF FC 01 <aerobic> <max1> <rest> <min> <max2> <sleep> <min2> <max3>` | HR zones |

### Incoming Commands (Watch → Phone)

| Cmd ID | Name | Payload | Description |
|--------|------|---------|-------------|
| 0x0B (11) | Heartbeat Req | `01` | Watch requests keep-alive (arg=1) |
| 0x20 (32) | BLE Request | `00=paired, 01=fail, 02=already` | Pairing status response |
| 0x92 (146) | Device Info | `version(2) + hwVer(1) + fwVer(2) + ...` | Device capabilities |
| 0x91 (145) | Battery | `level` at index 7 | Battery percentage (0-100) |
| 0xE0 (224) | Connect State | `0=accept, 1=reject, 2=timeout, 3=unbound, 4=account` | Connection result |
| 0x78 (120) | Find Phone | `01=start, 00=stop` | Watch requests phone alert |
| 0xA8 (168) | QR Result | `result(1)` | QR scan result |
| 0xAA (170) | SN Report | `SN string` | Device serial number |
| 0x81 (129) | Language Ack | `lang` | Language set confirmation |
| 0x87 (135) | Switch State | `switches bitmap` | Reminder switches state |
| 0x89 (137) | Sport Disconnect | `status` | Sport mode disconnect |
| 0xC9 (201) | Market Apps | `bitmap` | Installed apps bitmap |
| 0xA1 (161) | Audio MAC | `6 bytes` | Classic BT MAC for audio |
| 0xA6 (166) | Audio MAC v2 | - | Alternative audio MAC |

---

## Analyzers & Their Command IDs

| Analyzer | Marker | Cmd IDs (datas[4]) | Handles |
|----------|--------|-------------------|---------|
| ConnectAnalyzer | 171 (0xAB) | 32, 33, 146, 155, 161, 166, 203, 224 | Pairing, device info, connect state, audio MAC |
| CommonAnalyzer | 171 (0xAB) | 121, 123, 125, 135, 145, 168, 170, 201 | Take photo, language, find phone, switches, **battery**, QR, SN, market apps |
| OtherAnalyzer | 234 (0xEA) | 2, 11, 16, 17, 19, 20, 26, etc. | Memory, packages, music, license, MTU, screen, active, foreground |
| RequestHealthAnalyzer | 234 (0xEA) | 199 (sub: 1=glucose, 2=breathe, 3=weight, 6=BMI) | Health data requests |
| HealthDataAnalyzer | 234 (0xEA) | 131 | Sleep data |
| HealthDataAnalyzer2 | 234 (0xEA) | 158 | Apnea data |
| SportAnalyzer | 171/234 | 10, 11, 12, 13, 14, 15, 16 | Sport start/stop/pause/resume, GPS, HR |
| SettingsAnalyzer | 234 (0xEA) | 34, 35, 36, 37, 38, 39 | Various settings ack |
| CameraControlAnalyzer | 234 (0xEA) | 21 | Camera preview/photo state |
| MusicControlAnalyzer | 234 (0xEA) | 19 (sub: 1=play, 2=pause, 3=next, 4=prev, 5=vol) | Music control from watch |
| GpsAnalyzer | 234 (0xEA) | 9 | GPS/ephemeris |
| MapNaviAnalyzer | 234 (0xEA) | 9, 10, 11, 12, 13 | Navigation data |
| NetFtpOtaAnalyzer | 234 (0xEA) | 37 | FOTA over FTP |
| DialAnalyzer | 171 (0xAB) | 138 | Watchface market index |
| ScheduleAnalyzer | 234 (0xEA) | 54 | Calendar/schedule sync |
| RecordingAnalyzer | 234 (0xEA) | 23 | Voice recording control |
| CallRecordAnalyzer | 234 (0xEA) | 33, 34, 35 | Call logs |

---

## Key Feature Payloads

### Weather (sendWeatherInfo2 - cmd 0x88 / -120)
```
AB 00 11 FF 88 80
  [7 days × 2 bytes: maxTemp, minTemp]
  [7 bytes: weatherIcon codes]
  [7 bytes: windLevel]
```
Total 20 bytes payload. Icons: 0=sunny, 1=cloudy, 2=overcast, 3=shower, 4=thunder, 5=fog, 6=rain, 7=snow, 8=dust, 9=sand, 10=wind, 11=haze, 12=sleet.

### Alarms (setAlertClock - cmd 0x73 / 115)
```
AB 00 09 FF 73 80 <id> <status> <hour> <min> <repeat> <remindFlags>
```
- `id`: 0-7 (8 alarms)
- `status`: 1=on, 0=off
- `repeat`: bitmask (1=Mon, 2=Tue, 4=Wed, 8=Thu, 16=Fri, 32=Sat, 64=Sun, 128=once)
- `remindFlags`: 1=vibrate, 2=sound

### Find Watch (findBand - cmd 0x71 / 113)
```
AB 00 03 FF 71 80
```
Watch vibrates/alerts. Uses standard Immediate Alert Service (0x1802) as fallback.

### Music Control (from watch → phone, cmd 19)
Watch sends: `EA 00 03 FF 13 <ctrl>`
- ctrl: 1=play, 2=pause, 3=next, 4=prev, 5=volume

### Camera Control
- **Shake to Photo** (cmd 0x79/121): `AB 00 04 FF 79 80 <1=on/0=off>`
- **Preview State** (watch→phone, cmd 21): `EA ... 15 <0=stop/1=start> <frame>`
- **Photo Taken** (watch→phone, cmd 21): `EA ... 15 <2=photo> <result>`

### Notifications (mesNotifyPush - cmd 0x72/114 variant)
```
DE 00 06 FF 72 01 <iconPrompt> <notifyDisplay> <hideDetail>
```
- iconPrompt: 0=none, 1=call, 2=msg, 3=app...
- notifyDisplay: 1=show
- hideDetail: 1=hide content

### Sleep Mode (setSleepMode - cmd 0x7F/127)
```
DE 00 07 FF 7F 01 <autoOpen> <mode> <tracking> <chargeRemind>
```
- mode: 0=off, 1=manual, 2=auto

### Physical Training (setPhysicalTraining - cmd 0x01)
```
DE 00 07 00 01 01 <autoPause> <startPrompt> <stopPrompt> <keyPause>
```

### HR Early Warning (setHrEarlyWarning - cmd 0xFC/252)
```
DE 00 0B FF FC 01 <aerobic> <max1> <rest> <min> <max2> <sleep> <min2> <max3>
```

### Sedentary / Water / Drink Reminders
All use `reminderSwitch` (cmd 0xA0/-96) bitmap + specific command:
- Sedentary: 0x75 (117)
- Drink Water: 0xA3 (163)
- Medicine/Book/Travel: 0x9E (158) REMIND_4

### Contacts
- Count + SOS: cmd 0xA4 (-92) `AB 00 05 FF A4 80 <id> <num>`
- Name: cmd 0xA5 (-91) split across packets (max 20 bytes/packet)
- Phone: cmd 0xA6 (-90) split across packets

### Health Data Requests (watch→phone, cmd 199 sub-commands)
| Sub | Type | Description |
|-----|------|-------------|
| 1 | Glucose | Request glucose history |
| 2 | Breathe | Request breath training data |
| 3 | Weight | Request weight history |
| 6 | BMI | Request BMI history |

Watch expects phone to reply with data via `sendGlucose`, `sendBreathe`, `sendWeight`, `sendBmi`.

### File Transfer (Non-watchface)
Uses `sendFileTransHead` / `sendFileTransData` with MTU-sized chunks.
- Head: `50 00 LL LL <fileInfo>`
- Data: `51 00 LL LL <chunk>`
- Response codes: 0=OK, 1=busy, 2=error, 3=retry

---

## Connection Handshake Sequence

1. **GATT connect** → service discovery
2. **Enable notifications/indications** on the SiFli data characteristic when the watch exposes a CCCD; this is required for response-driven watchface transfer, but not for write-only settings
3. **Request MTU 247** for the SiFli file-transfer path
4. **Proprietary handshake** (once the writable serial characteristic is available):
   - `setSendPhoneSystem()` → `AB 00 05 FF 20 80 01 02`
   - `sendConnectRequestType(0, model)` → `AB 00 LL FF E0 80 00 <model>`
   - `getDeviceInfoData()` → `AB 00 04 FF 92 80 01`
5. **Watch replies** with device info (cmd 146) + battery (cmd 145)
6. **Heartbeat**: reply to each received cmd 11/1 with `DE 00 03 00 0B 02`; do not send unsolicited periodic replies

---

## Battery Reporting

Two paths:
1. **Standard BLE Battery Service** (0x180F/0x2A19) - read/notify
2. **Proprietary** (cmd 145 from watch, index 7) - auto-reported after device info request

Battery refresh belongs to the device connection/card flow and uses the standard Battery Level characteristic and/or a device-info request. Health refresh is separate and is reserved for health measurements such as heart rate.

---

## Music File Transfer

`startPushMusic` → ZIP `music/song/<filename>` → `startTransfer(type=4, withByteAlign=true)`

Uses SiFli file transfer (type 4 = music) with byte alignment + CRC.

---

## Watchface Market Install

`marketInstall(typeId, data, weChatPaySwitch)` → `AB 00 05 FF CB 80 <typeId> <data> <pay>`

Not the same as custom watchface transfer.

---

## OTA / Firmware

- **FTP OTA**: `ftpOTAStart(v1,v2,size)` → `ftpOTAFileList` → `ftpOTAProgress` → `ftpOTAEnd`
- **ZK OTA**: `sendZkOtaFix1/2`, `startZkOta`
- **Nucleic Acid Code**: `sendNucleicAcidCodeHead/Data` (COVID health codes)

---

## GPS / Navigation

- `sendEphemerisState(isOffline)` → `syncGpsData` → `sendLocation`
- Navigation: `sendMapNaviStatus/Start/Data/Direction/Mode`
- Commands: 0xE9-0xED range

---

## AI / Voice / Translation

- `sendGptResult`, `sendGptSteamResult`, `sendGptTodo`
- `sendTransLangId`, `sendTransIdState`
- `sendQuestionSteamResult`

---

## Error Codes (SiFli Watchface)

| Code | Constant | Meaning |
|------|----------|---------|
| 21 | FILE_SIZE_ALIGNED_MISSING | Size not 4-byte aligned |
| 22 | STATUS_FILE_PATH_ERROR | **Destination path rejected** (fix: use `/` + relative path) |
| 23 | STATUS_FILE_TYPE_ERROR | Invalid file type |
| 29 | STATUS_FILE_EXTENSION_ERROR | Bad extension |
| 30 | MKDIR_ERROR | Cannot create directory |
| 31 | SWITCH_DIRECTORY_ERROR | Cannot change directory |
| 34 | FILE_SIZE_ERROR | File size mismatch |

---

## Implementation Notes for Plum Watch

### Packet Construction Helper
```kotlin
fun proprietaryPacket(cmdId: Int, data: ByteArray): ByteArray {
    val bodyLen = 2 + data.size  // 0xFF + cmdId + data
    return byteArrayOf(
        -85,                    // 0xAB marker
        (bodyLen shr 8).toByte(),
        (bodyLen and 0xFF).toByte(),
        -1,                     // 0xFF separator
        cmdId.toByte()
    ) + data
}
```

### Response Parsing
```kotlin
fun parseProprietaryResponse(bytes: ByteArray): ProprietaryResponse? {
    if (bytes.size < 5) return null
    if (bytes[0].toInt() and 0xFF != 0xAB && bytes[0].toInt() and 0xFF != 0xEA) return null
    val len = ((bytes[1].toInt() and 0xFF) shl 8) | (bytes[2].toInt() and 0xFF)
    if (bytes.size < 3 + len) return null
    if (bytes[3].toInt() and 0xFF != 0xFF) return null
    val cmdId = bytes[4].toInt() and 0xFF
    val data = bytes.copyOfRange(5, 5 + len - 2)
    return ProprietaryResponse(cmdId, data)
}
```

---

## File References (Decompiled Sources)

| File | Path | Description |
|------|------|-------------|
| WatchBleOrder | `out2/sources/com/wakeup/commponent/module/ble/WatchBleOrder.java` | All command name constants |
| BleWatchServiceImpl | `out4/sources/com/wakeup/module/ble/BleWatchServiceImpl.java` | Outgoing command payloads |
| ConnectAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/ConnectAnalyzer.java` | Pairing/device info handlers |
| CommonAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/CommonAnalyzer.java` | Battery, language, find phone, QR, SN |
| OtherAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/OtherAnalyzer.java` | Memory, music, license, MTU, screen |
| SportAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/SportAnalyzer.java` | Sport control |
| RequestHealthAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/RequestHealthAnalyzer.java` | Health data requests |
| HealthDataAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/HealthDataAnalyzer.java` | Sleep data |
| CameraControlAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/CameraControlAnalyzer.java` | Camera |
| MusicControlAnalyzer | `out4/sources/com/wakeup/module/device/work/analyzer/MusicControlAnalyzer.java` | Music |
| SicheTransferMgr | `out4/sources/com/wakeup/module/device/trans/SicheTransferMgr.java` | File/music/watchface transfer |
| SFWatchfaceFilePushManager | `out17/sources/com/sifli/watchfacesdk/manager/SFWatchfaceFilePushManager.java` | SiFli watchface protocol |
| SFWatchfacePushFileTask | `out17/sources/com/sifli/watchfacesdk/task/SFWatchfacePushFileTask.java` | Per-file push logic |
| SifliWFService | `out17/sources/com/sifli/watchfacelibrary/SifliWFService.java` | Legacy watchface service |

---

*Generated from Wearfit Pro `com.wakeup.howear` v2.x (base.apk 202MB, 17 DEX files)*
*Decompiled with jadx 1.5.1 (`--no-res` per DEX)*