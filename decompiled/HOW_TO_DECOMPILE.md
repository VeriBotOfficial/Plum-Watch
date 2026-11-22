# JADX export — status and targeted recovery

The user has already exported the Wearfit Pro APK with JADX into `decompiled/sources/`. The repository contains approximately 47,500 Java source files. Do not redo the complete export unless the existing output is incomplete or unreadable.

## Missing classes

The following concrete implementation classes are referenced by available sources or the APK inventory but are not present as readable Java files in `decompiled/sources/`:

- `com.wakeup.module.ble.BleWatchServiceImpl`
- `com.wakeup.module.device.work.dataSync.DataSyncProxy`
- `com.wakeup.module.device.work.dataSync.OldDataSyncProxy`
- `com.wakeup.module.device.work.analyzer.RequestHealthAnalyzer`
- `com.wakeup.module.device.work.analyzer.PictureTransferAnalyzer`
- Concrete implementation of `com.wakeup.commponent.module.device.DeviceTransferService`
- Concrete adapter behind `DeviceManagerService.sendData`

These classes are the remaining blockers for exact music upload, historical health decoding and camera picture-transfer orchestration.

## Best next export

If the classes are present in the DEX but JADX omitted them, provide:
1. JADX's decompilation error log for the base APK.
2. APKTool smali output for the DEX classes containing the missing descriptors.
3. Any generated `sources` or `resources` directory containing the missing package, rather than another full APK.

Example targeted APKTool export:

```bash
apktool d -f base.apk -o wearfit-apktool
```

Then locate the missing class descriptors under the smali folders. Keep the exact APK version/hash associated with the export.

## What to inspect

- Music: `startPushMusic` implementation, transfer service, type/fileType values, block size, package size, ACK handler, retry, final completion.
- Health: `setSyncDataHr` builder, `DataSyncProxy`, `OldDataSyncProxy`, record timestamps, units and date grouping.
- Camera: `PictureTransferAnalyzer`, `startPushCamera` implementation, frame encoding, package/ACK flow and preview refresh scheduling.
- Transport adapter: how `BleOrderModel` custom service/characteristic, split and MTU fields reach the actual GATT writer.
