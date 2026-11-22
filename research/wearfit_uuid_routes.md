# Wearfit Pro BLE UUID and transport-route map

**Source APK:** `com.wakeup.howear hw_5.6.21`  
**Primary source class:** `com.wakeup.module.device.work.DeviceConnectMgr` (`classes4.dex`)  
**Other route selector:** `com.wakeup.module.device.work.WriteQueue` (`classes4.dex`)

This file separates the regular watch command connection from special-purpose file-transfer, OTA and SiFli paths.

## 1. Default watch-command route: Nordic UART Service (NUS)

The regular `DeviceConnectMgr` path contains concrete UUID use in both notification setup and write submission.

| Role | UUID |
|---|---|
| NUS service | `6E400001-B5A3-F393-E0A9-E50E24DCCA9E` |
| Phone → watch write | `6E400002-B5A3-F393-E0A9-E50E24DCCA9E` |
| Watch → phone notify | `6E400003-B5A3-F393-E0A9-E50E24DCCA9E` |

**Code path:**
- `DeviceConnectMgr.onConnectSuccess()` calls `openWatchNotify()`.
- `openWatchNotify()` delegates to `openNotify()`.
- `openNotify()` requests notifications from the NUS service/notify characteristic above.
- `execWrite()` uses the NUS service/write characteristic when no per-order UUID override is present.
- `onNotifyReady()` flushes queued orders only after notification setup is complete.

This is an explicit default route in the supplied Wearfit Pro build. It is the strongest starting point for checking a packet capture from the HK 10 Pro Max+, but still does not prove the target watch uses this route.

## 2. Special-purpose routes

The `WriteQueue` class chooses additional service/characteristic pairs for special operations. The pair order below is service UUID then characteristic UUID as supplied to the BLE write/notify abstraction.

| Purpose / label in app code | Service UUID | Characteristic UUID | Notes |
|---|---|---|---|
| FTP / file transfer | `6E400011-B5A3-F393-E0A9-E50E24DCCA9E` | `6E400012-B5A3-F393-E0A9-E50E24DCCA9E` | Separate from regular command NUS service |
| FTP notify | `6E400011-B5A3-F393-E0A9-E50E24DCCA9E` | `6E400013-B5A3-F393-E0A9-E50E24DCCA9E` | Used by `DeviceConnectMgr.onOpenFtpNotify()` |
| ZK OTA repair route 1 | `0000FE59-0000-1000-8000-00805F9B34FB` | `8EC90001-F315-4F60-9FB8-838830DAEA50` | Special OTA/fix path |
| ZK OTA repair route 2 | `0000FE59-0000-1000-8000-00805F9B34FB` | `8EC90002-F315-4F60-9FB8-838830DAEA50` | Alternate special OTA/fix path |
| ZK FOTA data route | `0000FF12-0000-1000-8000-00805F9B34FB` | `0000FF15-0000-1000-8000-00805F9B34FB` | Separate firmware transfer path |

Do not use these special routes for ordinary settings just because they are present in the package. They are selected for specific data/OTA flows.

## 3. Separate SiFli serial route

The APK also bundles a different SiFli SDK transport.

| Role | UUID |
|---|---|
| SiFli serial service | `00000000-0000-0000-6473-5F696C666973` |
| SiFli data characteristic | `00000000-0000-0200-6473-5F696C666973` |
| Additional SiFli characteristic | `00000000-0000-0100-6473-5F696C666973` |
| CCCD | `00002902-0000-1000-8000-00805F9B34FB` |

This route is used by the SiFli serial and watchface SDK. It is not the NUS default command route described in section 1. For packet-level watchface transfer, see [sifli_watchface_transport.md](sifli_watchface_transport.md).

## 4. Additional BLE UUID strings not to confuse with the watch command route

The full APK contains other UUIDs from unrelated SDK modules (for example smart-device, payment-code, SPP and headset modules). Their presence in the package is not evidence that they are used by this watch's regular command protocol. The research intentionally excludes unrelated SDK UUIDs from the recommended Plum route list.

## 5. Implications for Plum Watch

1. Discover all services on the physical watch; record the full GATT tree and characteristic properties.
2. Compare the advertised service UUIDs against NUS, FTP and SiFli routes above.
3. Start with NUS for ordinary Wearfit command testing only if the target advertises the service and correct write/notify properties.
4. Enable the notify CCCD and wait for its callback before sending the first order, matching `DeviceConnectMgr`'s queue gate.
5. Serialize writes. Do not send the next queued order until the previous GATT write callback has completed.
6. Keep FTP and OTA operations isolated from normal settings commands.
7. Do not claim command success from the GATT write callback alone. Confirm with a watch response or a visible read-back/state change.

## 6. Limitations

This route map is static evidence from the supplied Wearfit Pro APK. It does not include a GATT trace from the user's HK 10 Pro Max+. The model may advertise another service, require a pairing/bonding sequence, or select a device-specific override. Confirm on the actual watch before implementing.


## 5. Source-level confirmation of file route assignment

The JADX source `com.wakeup.module.device.work.utils.WriteQueue` routes all five file-transfer order identifiers to the FTP route above:
- `SEND_TRANS_FILE_HEAD`
- `SEND_TRANS_FILE_HEAD_RESP`
- `SEND_TRANS_FILE_DATA`
- `SEND_TRANS_FILE_DATA_RESP`
- `SEND_TRANS_STREAM_CTRL`

The custom service and write characteristic are assigned by order identifier. This is not the normal NUS command path and is not the SiFli watchface route. The FTP notify characteristic is `6E400013-B5A3-F393-E0A9-E50E24DCCA9E`.

Plum currently does not select/discover this FTP route, queue file-transfer order IDs or parse transfer acknowledgements. See [the JADX source audit](wearfit_jadx_source_audit.md) for the A0/A1 packet builders and remaining unknowns.
