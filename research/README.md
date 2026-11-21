# Wearfit Pro reverse-engineering research

Research generated from the user-supplied Wearfit Pro split APK set (`com.wakeup.howear hw_5.6.21`, version code `2026111322`).

## Documents

| Document | Contents |
|---|---|
| [wearfit_protocol.md](wearfit_protocol.md) | Master protocol reference: command byte arrays, setup, splitting, analyzers, connection flow and evidence limits |
| [wearfit_uuid_routes.md](wearfit_uuid_routes.md) | Confirmed default NUS command route, special FTP/OTA UUID routes and separate SiFli route |
| [wearfit_features.md](wearfit_features.md) | Broad Wearfit API/feature inventory, analyzers and Plum implementation priorities |
| [sifli_watchface_transport.md](sifli_watchface_transport.md) | Separate SiFli serial and watchface push state machine |
| [plum_implementation_audit.md](plum_implementation_audit.md) | Read-only comparison of the current Plum BLE code with the supplied APK |
| [apk/README.md](apk/README.md) | Package identity, split inventory, SHA-256 hashes and archive/storage status |

## Evidence and scope

- **APK command construction** establishes what this Wearfit build constructs.
- **Transport call paths** establish which UUID routes and queue/notification flows are used by the app code.
- **Feature/analyzer names** establish that an API or receive path exists, not that a feature is supported by a particular watch.
- **HK 10 Pro Max+ support** requires a real GATT trace and a successful visible result on that device.

The APKs were inspected with local ZIP/APK structure inspection, AXML manifest parsing and a local DEX method/code parser. A full JADX/APKTool decompilation and a live BLE session were not available during this analysis. The docs explicitly mark unresolved payload fields and device-specific claims instead of inventing them.

## Important correction

The previous single-file notes have been replaced because they conflated:
1. Wearfit app-level command packets;
2. Wearfit's regular NUS BLE command transport;
3. its special FTP/OTA channels; and
4. the separate SiFli watchface/serial transport.

These are distinct layers. Treat the new documents as the current research basis, not as proof that all listed commands work on every device.
