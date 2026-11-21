# SiFli BLE and watchface-transfer findings

**Source:** supplied Wearfit Pro split APK, package `com.wakeup.howear hw_5.6.21`  
**DEX areas:** `classes12.dex`, `classes14.dex`, `classes17.dex`  
**Purpose:** isolate the SiFli path from the generic Wearfit command path.

> The presence of this SDK inside Wearfit Pro does not prove that the HK 10 Pro Max+ uses it. Confirm the target watch's advertised GATT service, characteristics, notifications and successful handshake before attempting this protocol.

## 1. The SiFli GATT route

The APK contains the following service/characteristic identifiers.

| Role | UUID |
|---|---|
| SiFli serial GATT service | `00000000-0000-0000-6473-5f696c666973` |
| SiFli serial data characteristic | `00000000-0000-0200-6473-5f696c666973` |
| Additional SiFli characteristic | `00000000-0000-0100-6473-5f696c666973` |
| CCCD | `00002902-0000-1000-8000-00805f9b34fb` |

The data characteristic is resolved by the SiFli manager as the serial read/write characteristic. The additional characteristic exists in the SDK's UUID set; its exact role should be derived from the runtime service code for the target.

### Connection and notification setup

Two SiFli transport implementations are present:

- `com.sifli.serialtransport.serialTransService` in `classes12.dex`;
- `com.sifli.siflicore.blecore.SFBLEManager` in `classes14.dex`.

The service:
1. connects using `BluetoothDevice.connectGatt` with LE transport and preferred LE 1M/2M PHY;
2. waits for connection and service discovery;
3. resolves the target service and serial characteristic by UUID;
4. enables local characteristic notifications;
5. obtains the CCCD and writes its notification-enable value;
6. reports connection, MTU and transfer progress/errors through callbacks.

The core manager requests high connection priority and preferred PHY, requests an MTU up to 247, and schedules notification/MTU operations through a serialized transaction queue. Its write path refuses to send a list of commands before the internal BLE handshake flag is set.

The SDK explicitly handles failure cases such as:
- service/characteristic not found;
- service discovery not started or timing out;
- write/notification failure;
- missing handshake state;
- a file slice size that is too small or invalid.

**Plum implication:** notification setup and successful handshake are prerequisites for the response-driven watchface flow. Do not equate "GATT connected" with "SiFli protocol ready".

## 2. Serial transport chunking

The older `serialTransService.sendToSerial` method:
- selects payload handling based on the MTU-related values it receives;
- includes a 16-bit field helper based on `ByteBuffer`;
- builds one or more byte-array frames and passes them to a BLE handler;
- uses constants 247, 244 and 65535 in the length/fragment path.

This inspection confirms a dedicated serial-framing layer, but the exact complete frame layout and all index/flag semantics were not sufficiently reconstructed in this pass. Do not transplant an assumed 4-byte/MTU-7 framing scheme into Plum without a complete decode or capture.

## 3. Watchface SDK architecture

Key classes in `classes17.dex`:

- `SFWatchfaceFilePushManager`
- `SFPushFileModule`
- `SFPushInfoMaker`
- `SFPushInfos`
- `SFFile`
- `SFWatchfaceShell`
- `SFWatchfaceCommandTask`
- `SFWatchfaceRequestPacket`
- `SFWatchfaceResponsePacket`
- `SFWatchfaceResponseFactory`

The file-push manager accepts a ZIP path, extracts it into a cache directory, enumerates files and constructs push metadata. It validates the requested file-slice length; the public entry point logs a valid range of `1–10 KiB`. It rejects an empty file list, a busy SDK or an uninitialised SDK.

The transfer runs through a push module with a worker thread and progress/status/completion callbacks. The file model supports:
- number of slices;
- slice data retrieval;
- slice length;
- re-slicing;
- whether slices are present;
- byte padding where needed.

This is a negotiated block/slice transfer—not one large characteristic write.

## 4. Watchface command identifiers

The request classes construct these command type identifiers (16-bit command type values are marshalled by `SFWatchfaceRequestPacket.mashal` using `ByteUtil.intTo2Bytes`).

| ID | Request/response class | Purpose inferred from class/call sites |
|---:|---|---|
| 0 | `SFWatchfaceEntireStartRequest` | Begin an entire transfer |
| 1 | `SFWatchfaceEntireStartResponse` | Start response; returns result, max data length, version, block length and remaining block count |
| 2 | `SFWatchfaceFileStartRequest` | Begin one file; includes file length and UTF-8 filename/path data |
| 3 | `SFWatchfaceFileStartResponse` | File-start result |
| 4 | `SFWatchfaceFileDataRequest` | Send a file data slice; includes a 4-byte index and slice bytes |
| 5 | `SFWatchfaceFileDataResponse` | Data result and expected index |
| 6 | `SFWatchfaceFileEndRequest` | End one file |
| 7 | `SFWatchfaceFileEndResponse` | File-end result |
| 8 | `SFWatchfaceEntireEndRequest` | End the complete transfer |
| 9 | `SFWatchfaceEntireEndResponse` | Entire-transfer result |
| 10 | Response-factory lost-check path | Watch requests lost/missing slice handling |
| 11 | `SFWatchfaceLoseCheckRspRequest` | Phone response to lost-slice check |
| 12 | `SFWatchfaceTeminateRequest` | Terminate/abort |
| 13 | `SFWatchfaceFileSpaceRequest` | Query/check file-space information |
| 14 | Space response class | Returns available-space result |
| 15 | `SFWatchfaceVideoDataRequest` | Preview video data |
| 16 | Video response class | Video data response |

The mapping above is based on request/response class constructors and the response factory. It is stronger than guessing the IDs from an unrelated sample, but the precise reserved-data offsets and every response field should still be checked before reimplementation.

### Packet fields

The base request packet marshals:
- the command type as a 2-byte integer;
- the payload/data length as a 2-byte integer;
- command-specific reserved data after the base fields.

Specific request builders show:
- entire-start: a 2-byte value and a 4-byte total-file-size value are merged into its data;
- file-start: 4-byte file length, UTF-8 filename and 2-byte filename/path length are merged;
- file-data: 4-byte slice index followed by the slice bytes;
- file-space: 4-byte request field;
- file-end and entire-end: empty or minimal reserved data;
- video-data: type-specific metadata and payload.

The exact outer SiFli serial frame/fragment flags sit below this request packet and should not be mixed with the application-level Wearfit `AB/EA` command packets.

## 5. High-level transfer state machine

The class and call graph supports this sequence:

1. **Initialise SDK** — `SFWatchfaceFilePushManager.init` initialises `SFBLEManager` and cache storage.
2. **Connect and discover GATT** — find the SiFli service/data characteristic.
3. **Enable notifications and complete handshake** — no file writes until the internal ready/handshake state is true.
4. **Unzip archive on phone** — extract files to a controlled cache directory and build push metadata.
5. **Entire-start request** — send transfer metadata/total size.
6. **Entire-start response** — read the negotiated max data length, block length, version and block-left fields.
7. **File-space check** — handle available-space response.
8. **Per-file start** — send file metadata/name.
9. **File data slices** — send sequential slices, track expected index and handle missing-slice checks/retransmission.
10. **File-end response** — close each file.
11. **Entire-end request/response** — close the full transfer and report completion.
12. **Error/abort path** — terminate and surface failure instead of claiming installation succeeded.

The task/response manager has request-response matching and timeout handling. Therefore, a raw write callback alone is not sufficient to move the transfer state machine forward.

## 6. Plum Watch compatibility checklist

Before using this SDK protocol in Plum, verify all of the following on the physical HK 10 Pro Max+:

- [ ] The exact SiFli service UUID is advertised.
- [ ] The data characteristic exists with compatible write properties.
- [ ] A notification/indication channel is available and CCCD configuration succeeds.
- [ ] The SiFli handshake reaches the ready state.
- [ ] Entire-start receives a valid response.
- [ ] The watch accepts the file type and archive contents.
- [ ] The negotiated slice/block limits are respected.
- [ ] File responses and expected indexes are parsed correctly.
- [ ] A deliberate disconnect/failure does not leave the watch in a partial transfer state.

If the service UUID is absent, do not try to "force" this transfer on a different proprietary GATT channel. It is a different protocol.

## 7. Relevance to the existing Plum implementation

The prior Plum code's custom file transfer and the SDK's packet/state-machine architecture must be compared step by step. The Wearfit APK proves that this SDK exists and defines a robust response-driven SiFli file transfer. It does not independently prove that the HK 10 Pro Max+'s firmware implements this precise receiver.

The most valuable next test is to capture a real successful watchface transfer from Wearfit Pro on the HK watch and compare:
- service/characteristic UUIDs;
- handshake;
- request command IDs and packet headers;
- negotiated block/slice lengths;
- per-file paths and ordering;
- acknowledgements, retries and final success state.
