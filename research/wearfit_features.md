# Wearfit Pro BLE feature/API inventory

**APK:** `com.wakeup.howear hw_5.6.21`  
**Primary source:** APK/Dex symbol inventory plus the exported `BleWatchService` interface and readable analyzers/builders in `decompiled/sources/`. The concrete `BleWatchServiceImpl` is not present in the readable JADX export; API presence and decoded helper methods are distinguished below.  
**Companion reference:** [wearfit_protocol.md](wearfit_protocol.md)

This is an inventory of operations exposed by the supplied Wearfit Pro build. It is deliberately not a claim that every operation is supported by the HK 10 Pro Max+. An API or analyzer can exist for another watch family, require server/app setup, or depend on a model-specific capability flag.

## Evidence levels

- **Packet decoded:** byte array structure was directly inspected; see the master protocol document.
- **API present:** method exists in the Wearfit command-service interface/implementation, but full payload semantics were not reconstructed.
- **Receive path present:** an analyzer/handler exists for incoming data, but this does not provide a complete response format.
- **Target unknown:** no HK 10 Pro Max+ runtime test or capture.

---

## 1. Device connection, identity and capabilities

**Methods/API names found**

- `findBand`
- `sendConnectRequestType`
- `setSendPhoneSystem`
- `getDeviceInfoData`
- `getDeviceSN`
- `getDeviceFN`
- `getMtu`
- `getAudioBleMac`
- `getBtStatus`
- `sendBtStatus`
- `sendBtReconnect`
- `getAvailableMemory`
- `getScreen`
- `getDeviceLog`
- `getSicheLog`
- `requestDeviceCollapseData`
- `requestDeviceCpuUsed`
- `requestDevicePowerConsumption`
- `requestDeviceLicense`
- `requestDeviceOtaResult`
- `requestLicenseEncryption`
- `sendLicense`
- `setSendLicenseNum`
- `sendUserToken`
- `sendIsForeground`
- `checkDeviceNaviStatus`
- `checkSportDisConnectStatus`
- `getNetworkShareState`
- `getWifiState`
- `getDevVideoInfo`
- `getDeviceThumbInfo`
- `getDeviceThumbResolution`

**Useful confirmed path:** `GetDeviceDataBiz.connectSend` runs after connection and sends a series of identity/timezone/time/MTU/device requests. It checks OTA state and applies device-type filtering; it is not simply a generic "connected, send everything" routine.

**Plum relevance:** start by implementing observable identity/capability negotiation, not by enabling every toggle. Model-specific capability checks are part of the source app's behaviour.

## 2. Time, user profile and device settings

**Methods/API names found**

- `setTimeSync`
- `setTimeZoneSync`
- `sendUserInfo`
- `sendTemperatureUnit`
- `syncMetGoal`
- `set12HourSystem`
- `setBandLanguage`
- `setBandLanguage2`
- `setSetLanguageSettings`
- `setUpHandLightScreen`
- `setWakeUpScreenSettings`
- `setOnTimeMeasure`
- `setOnceOrRealTimeMeasure`
- `bodyTempMeasure`
- `setSharkTakePhoto`
- `setSleepMode`
- `setSleepTimeRange`
- `setDisturbanceModel`
- `notDisturbMode`
- `setPhysicalTraining`
- `setHrEarlyWarning`
- `setClearData`
- `setResetBand`
- `setSendUserinfoRequest`
- `sendHeartSetting`

**Packet-decoded entries:** clock/timezone, time format, language (one builder), wrist wake (two distinct builders), periodic measurement, single/real-time measurement, body-temperature mode, shake-to-photo, sleep mode, sleep range, two DND forms and physical-training options. See the master protocol document for their structures.

**Important distinction:** `setBandLanguage` and `setBandLanguage2` both exist. The business layer may call both. Treat them as different protocol variants until the target capture identifies which one is relevant.

## 3. Alarms, reminders and notifications

**Methods/API names found**

- `setAlertClock`
- `setSedentaryWarn`
- `setDrinkWater`
- `setRemind`
- `reminderSwitch`
- `heartReminder`
- `mesNotifyPush`
- `smartWarnNoContent`
- `setSmartWarnCarryContent`
- `sendProjectMessageNotification`
- `sendSwitchResponse`

**Decoded findings**

- `setAlertClock` creates a 12-byte array with a dynamic third byte. Six integer arguments are accepted; the full caller-to-field mapping still needs decoding.
- `setSedentaryWarn`, `setDrinkWater` and `setRemind` each return an array of **two** command objects. One is the feature configuration; the second is the shared reminder-switch bitfield packet.
- Water reminder's builder uses opcode `0x53`, not the previously documented `0xA3`.
- `mesNotifyPush` uses marker `0xEA` and opcode `0x72`.
- `setSmartWarnCarryContent` has a split-content path; the helper uses 19-byte chunks.

The source app builds reminder control/other bitfields from stored setting strings and calls `BleUtil.bit2Byte`. The bit order and meaning of every bit have not yet been independently verified.

## 4. Health, measurement and historical data

**Methods/API names found**

- `activityHeat`
- `exerciseDuration`
- `numberOfActivities`
- `heartReminder`
- `sendBreathe`
- `sendGlucose`
- `sendWeight`
- `sendMetData`
- `sendMenstrualCheckData`
- `sendMenstrualInfo`
- `syncSleepData`
- `syncSleepApnea`
- `setSendBmi`
- `setSendBodyFatRate`
- `setSendMuscleMass`
- `setSendWeight`
- `sendFriendHealthData`

**Receive analyzers present**

- `RequestHealthAnalyzer`
- `HealthDataAnalyzer`
- `HealthDataAnalyzer2`
- `MenstrualAnalyzer`

The app has both watch-originated health requests and phone-to-watch send/reply methods. This implies that implementing "health sync" needs both directions and may require the phone's stored health data, not just sending a request opcode.

**Still unresolved:** full history response schemas, units/scaling for all measurements, dates/ranges, and exact integration with the HK 10 Pro Max+.

## 5. Music, audio, headset and media

**Methods/API names found**

- `sendAudioBle`
- `sendAudioSearchSwitch`
- `sendBtStatus`
- `sendBtReconnect`
- `getAudioBleMac`
- `sendXmlyResult`
- `sendYouJieKey`
- `sendStreamCtrl`
- `sendCallStatus`
- `sendBulletState`

**Analyzers present**

- `MusicControlAnalyzer`
- `EQModeAnalyzer`
- `HeadsetBoxAnalyzer`

The API surface indicates music/audio and external headset modes, but it does not establish that the user's watch exposes these transports. The app-level media command direction and phone-side Android media integration need to be analysed separately.

## 6. Watchfaces, dial market, files and firmware

**Methods/API names found**

- `sendDialData`
- `sendDialReq`
- `marketInstall`
- `sendFileTransHead`
- `sendFileTransData`
- `sendFileReceiveHeadResp`
- `sendFileReceiveDataResp`
- `ftpOTAStart`
- `ftpOTAFileList`
- `ftpOTAProgress`
- `ftpOTAEnd`
- `sendZkOtaFix1`
- `sendZkOtaFix2`
- `startZkOta`
- `requestDeviceOtaResult`
- `setResetBand`

**Analyzers / SDKs present**

- `DialAnalyzer`
- `NetFtpOtaAnalyzer`
- SiFli `SFWatchfaceFilePushManager` and its request/response packet classes.

The SiFli watchface SDK is a separate transport/state machine; see [sifli_watchface_transport.md](sifli_watchface_transport.md). It should not be treated as proof that every other Wearfit command uses the same characteristic or framing.

**Safety note:** OTA/reset methods are listed as source-app capabilities only. Do not experiment with firmware-update/reset commands on the target watch while protocol support is unknown.

## 7. GPS, location, maps and navigation

**Methods/API names found**

- `sendEphemerisState`
- `syncGpsData`
- `syncGpsLog`
- `sendLocation`
- `sendLocationStr`
- `sendAirPressureAndUV`
- `sendAltitudeAndPressure`
- `sendCityName`
- `sendCityWeather`
- `sendCityAllWeather`
- `sendWeatherInfo`
- `sendWeatherInfo2`
- `sendWeatherSwitch`
- `sendMapMode`
- `sendMapNaviData`
- `sendMapNaviDirection`
- `sendMapNaviStatus`
- `sendNaviState`
- `sendNaviTransferOverState`

**Analyzers present:** `GpsAnalyzer`, `MapNaviAnalyzer`.

These APIs suggest location, ephemeris, map navigation, weather and altitude/air-pressure features. Payload layouts and required server data were not exhaustively decoded. The previous seven-day weather packet sketch should not be reused as a verified format.

## 8. Contacts, friends, communication and social features

**Methods/API names found**

- `setContactNum`
- `sendContactName`
- `sendContactPhone`
- `verifyFriendInfo`
- `sendFriendAddressAndLocation`
- `sendFriendHealthData`
- `sendFriendImage`
- `sendFriendImageData`
- `sendFriendNameAndDate`
- `sendRTTAvatarImgWithIndex`
- `sendContentPaste`
- `sendProjectMessageNotification`

**Analyzers present:** `FriendsAnalyzer`, `CallRecordAnalyzer`, `PictureTransferAnalyzer`.

These methods may use multi-packet transfers and phone-side app/account state. Method existence alone does not give enough detail to safely recreate contact/SOS transfer. In particular, do not reuse the old "20-byte per packet" description as a complete contact-fragment specification.

## 9. Wi-Fi, local networking and device data channels

**Methods/API names found**

- `setWiFi`
- `deleteWiFi`
- `switchWifiAP`
- `switchWifiP2P`
- `switchWifiUdp`
- `getWifiState`
- `getNetworkShareState`
- `sendFileTransHead`
- `sendFileTransData`
- `sendNucleicAcidCodeHead`
- `sendNucleicAcidCodeData`

These are broader device-family APIs. They should not be assumed to be BLE-only: some methods can negotiate another transport or use a network socket after a BLE setup command.

## 10. Sport, training and activity

**Methods/API names found**

- `exerciseDuration`
- `numberOfActivities`
- `activityHeat`
- `sendSportData`
- `sendSportStatus`
- `sendSwitchResponse`
- `switchSpeed`
- `switchSpeed2`
- `setPhysicalTraining`
- `checkSportDisConnectStatus`

**Analyzer present:** `SportAnalyzer`.

The app also checks/saves per-device settings for sport-related controls. Complete sport session packet schemas, GPS semantics and acknowledgement flow were not reconstructed in this pass.

## 11. Voice, AI, translation and assistant features

**Methods/API names found**

- `sendQuestionSteamResult`
- `sendTransLangId`
- `sendTransIdState`
- `sendRecordPermission`
- `sendRecordState`
- `sendRecordTimeOut`
- `sendStreamCtrl`
- `sendGptResult` / `sendGptSteamResult` / `sendGptTodo` (SDK/API references)
- `sendXmlyResult`

**Analyzers present:** `AiAnalyzer`, `RecordingAnalyzer`.

These operations rely on app services, microphone permissions, network-backed results and streaming/control state. They are not appropriate first targets for Plum's core BLE integration.

## 12. Additional APIs surfaced by the inventory

The following methods are present but have not been assigned a complete payload definition in this research pass:

- `sendDelPoint`
- `sendNfcState`
- `sendMetData`
- `sendMenstrualCheckData`
- `sendMenstrualInfo`
- `setClearData`
- `switchSpeed`
- `switchSpeed2`
- `sendBulletState`
- `sendCallStatus`
- `sendCameraPhotoState`
- `sendCameraPreviewState`
- `sendDevVideoInfo` (device video-info API name appears as `getDevVideoInfo`)
- `sendUserToken`
- `synchronousRequest`
- `sendNucleicAcidCodeHead`
- `sendNucleicAcidCodeData`
- `sendProjectMessageNotification`

This list preserves API names found in the DEX inventory; it is not a promise that each has a separate public screen or is relevant to the target model.

---

## 13. Analyzers and receive-side feature groups

The APK contains the following named analyzers/handlers:

| Analyzer | What the class name / call graph indicates |
|---|---|
| `ConnectAnalyzer` | Connect request/state, pairing/device information, audio MAC and version handling |
| `CommonAnalyzer` | Common commands such as battery, language, find-phone and QR-related events |
| `OtherAnalyzer` | Heartbeat, foreground state, memory/screen and other common events |
| `SettingsAnalyzer` | Reminder/settings state and persisted bitfields |
| `SportAnalyzer` | Sport start/stop/status and related events |
| `RequestHealthAnalyzer` | Requests for historical health data |
| `HealthDataAnalyzer`, `HealthDataAnalyzer2` | Sleep/health response parsing |
| `CameraControlAnalyzer` | Camera preview/photo control messages |
| `MusicControlAnalyzer` | Watch-originated media commands |
| `GpsAnalyzer`, `MapNaviAnalyzer` | GPS and map-navigation messages |
| `ScheduleAnalyzer` | Schedule/calendar operations |
| `NetFtpOtaAnalyzer` | File/FTP/OTA event handling |
| `RecordingAnalyzer` | Voice recording permissions/state |
| `CallRecordAnalyzer` | Call-record events |
| `DialAnalyzer` | Dial/watchface market |
| `FriendsAnalyzer` | Friend/account data |
| `PictureTransferAnalyzer` | Image transfer |
| `MenstrualAnalyzer` | Cycle/menstrual records |
| `AiAnalyzer` | Assistant/AI flow |
| `NucleicAcidCodeAnalyzer` | Specific code/image delivery feature |

The source also has a `DataPackager` layer with buffer assembly and reset logic. A complete response schema still requires method-level decoding plus an on-device trace.

---

## 14. Prioritisation for Plum Watch

### First: core link and settings

1. Identify actual target GATT service/characteristic UUIDs and properties.
2. Confirm notification setup and response channel.
3. Confirm phone-system/device handshake and device-info response.
4. Confirm heartbeat and battery/device-state messages.
5. Test one switch setting with a verified acknowledgement/read-back.
6. Reproduce device capability gating and paired reminder packets.

### Second: useful companion features

- alarms;
- time and timezone sync;
- language and time format;
- wrist wake;
- notification display and app notifications;
- sedentary/water reminders;
- heart-rate/health measurements (only after reading the exact target data format).

### Later / only after evidence

- custom watchface transfers (SiFli target path only);
- weather;
- contacts/SOS;
- sport, GPS and maps;
- Wi-Fi, OTA and firmware features;
- audio, voice, AI and translation features.

**Do not implement from method names alone.** For every feature, retain the packet bytes, selected service/characteristic, write type, negotiated MTU, notification response and observed watch result in a test log.


## 15. Full service-implementation symbol inventory

The following method names were extracted from `BleWatchServiceImpl` in `classes4.dex`. This is a symbol inventory for future targeted inspection, **not** a claim that every method has a fully decoded packet or works on the HK 10 Pro Max+. Names are retained as they appear in the DEX symbol table.

### Connection, diagnostics and device information

`findBand`, `sendConnectRequestType`, `setSendPhoneSystem`, `getDeviceInfoData`, `getDeviceSN`, `getDeviceFN`, `getMtu`, `getAudioBleMac`, `getBtStatus`, `sendBtStatus`, `sendBtReconnect`, `getAvailableMemory`, `getScreen`, `getDeviceLog`, `getSicheLog`, `requestDeviceCollapseData`, `requestDeviceCpuUsed`, `requestDevicePowerConsumption`, `requestDeviceLicense`, `requestDeviceOtaResult`, `requestLicenseEncryption`, `sendLicense`, `setSendLicenseNum`, `sendUserToken`, `sendIsForeground`, `checkDeviceNaviStatus`, `checkSportDisConnectStatus`, `getNetworkShareState`, `getWifiState`, `getDevVideoInfo`, `getDeviceThumbInfo`, `getDeviceThumbResolution`.

### Time, identity, settings and reminders

`setTimeSync`, `setTimeZoneSync`, `sendUserInfo`, `sendTemperatureUnit`, `syncMetGoal`, `set12HourSystem`, `setBandLanguage`, `setBandLanguage2`, `setSetLanguageSettings`, `setUpHandLightScreen`, `setWakeUpScreenSettings`, `setOnTimeMeasure`, `setOnceOrRealTimeMeasure`, `bodyTempMeasure`, `setSharkTakePhoto`, `setSleepMode`, `setSleepTimeRange`, `setDisturbanceModel`, `notDisturbMode`, `setPhysicalTraining`, `setHrEarlyWarning`, `setClearData`, `setResetBand`, `setSendUserinfoRequest`, `sendHeartSetting`, `setAlertClock`, `setSedentaryWarn`, `setDrinkWater`, `setRemind`, `reminderSwitch`, `heartReminder`, `mesNotifyPush`, `smartWarnNoContent`, `setSmartWarnCarryContent`, `sendProjectMessageNotification`.

### Health, activity, sport and wellness

`activityHeat`, `exerciseDuration`, `numberOfActivities`, `sendBreathe`, `sendGlucose`, `sendWeight`, `sendMetData`, `sendMenstrualCheckData`, `sendMenstrualInfo`, `syncSleepData`, `syncSleepApnea`, `setSendBmi`, `setSendBodyFatRate`, `setSendMuscleMass`, `setSendWeight`, `sendFriendHealthData`, `sendSportData`, `sendSportStatus`, `sendSwitchResponse`, `switchSpeed`, `switchSpeed2`, `setSyncDataHr`.

### Music, audio, camera and recording

`sendAudioBle`, `sendAudioSearchSwitch`, `sendBtStatus`, `sendBtReconnect`, `getAudioBleMac`, `sendXmlyResult`, `sendYouJieKey`, `sendStreamCtrl`, `sendCallStatus`, `sendBulletState`, `sendCameraPhotoState`, `sendCameraPreviewState`, `sendRecordPermission`, `sendRecordState`, `sendRecordTimeOut`, `sendQuestionSteamResult`.

### Watchfaces, file transfer, OTA and device networking

`sendDialData`, `sendDialReq`, `marketInstall`, `sendFileTransHead`, `sendFileTransData`, `sendFileReceiveHeadResp`, `sendFileReceiveDataResp`, `ftpOTAStart`, `ftpOTAFileList`, `ftpOTAProgress`, `ftpOTAEnd`, `sendZkOtaFix1`, `sendZkOtaFix2`, `startZkOta`, `requestDeviceOtaResult`, `setWiFi`, `deleteWiFi`, `switchWifiAP`, `switchWifiP2P`, `switchWifiUdp`, `getWifiState`, `getNetworkShareState`, `sendNucleicAcidCodeHead`, `sendNucleicAcidCodeData`.

### Location, weather, maps and contacts

`sendEphemerisState`, `syncGpsData`, `syncGpsLog`, `sendLocation`, `sendLocationStr`, `sendAirPressureAndUV`, `sendAltitudeAndPressure`, `sendCityName`, `sendCityWeather`, `sendCityAllWeather`, `sendWeatherInfo`, `sendWeatherInfo2`, `sendWeatherSwitch`, `sendMapMode`, `sendMapNaviData`, `sendMapNaviDirection`, `sendMapNaviStatus`, `sendNaviState`, `sendNaviTransferOverState`, `setContactNum`, `sendContactName`, `sendContactPhone`, `verifyFriendInfo`, `sendFriendAddressAndLocation`, `sendFriendHealthData`, `sendFriendImage`, `sendFriendImageData`, `sendFriendNameAndDate`, `sendRTTAvatarImgWithIndex`, `sendContentPaste`, `sendDelPoint`, `sendNfcState`, `syncSchedule`, `synchronousRequest`.

For an implementation decision, use the packet-level sections above rather than the symbol inventory. A method name proves the API exists; it does not prove the target model's feature, payload shape, framing, units, transport or acknowledgement.


## JADX source-level additions (2026-11-22)

The user's JADX export provides these new source-level confirmations:
- `DeviceTransferService.startPushMusic(path, callback)` exists; music upload is a file transfer, not `MusicControlAnalyzer`.
- `FileTransferOrder` constructs an A0 file header and A1 block packets with length and CRC.
- `WriteQueue` explicitly routes file-transfer order IDs to the FTP service `6E400011...` and write characteristic `6E400012...`.
- `DataSyncMgr.startSyncData()` reads a per-MAC last-sync timestamp and triggers HR, sleep-apnea, GPS and subsequent sleep-history sync.
- `HealthDataAnalyzer` routes `0x51` subtypes 17/18 to history HR/SpO₂ storage, separate from `0x31` single/current reads.
- `CameraControlAnalyzer` distinguishes direct lens-switch event byte 2 from action-envelope byte 1 followed by state 1 (shutter) or 2 (switch).
- `TransferOrder` includes a separate `0xAD/0xAE` picture-transfer helper family.

The concrete `BleWatchServiceImpl`, old-data health proxies, picture-transfer analyzer and `DeviceTransferService` implementation are absent from the readable source export. See [the detailed source audit](wearfit_jadx_source_audit.md); do not infer those omitted implementations.
