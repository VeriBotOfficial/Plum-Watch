# How to export Wearfit Pro with JADX

The analysis environment has the APK binary but cannot install/download JADX, so a full decompile must be generated locally and uploaded or committed for review.

## 1. Install JADX on Fedora

Download the cross-platform `jadx-1.5.7.zip` release from the official project:
https://github.com/skylot/jadx/releases

Extract it, then use the CLI in the extracted `bin/` directory. JADX requires a 64-bit Java 11+ runtime; the current release page lists 1.5.7. If you prefer a GUI, run `jadx-gui` from the same directory.

## 2. Decompile the base APK

The base APK contains the app's DEX code (17 DEX files). In a terminal, adjust the input path as needed:

```bash
mkdir -p ~/wearfit-analysis
cd ~/wearfit-analysis

# Replace this path with the extracted JADX directory.
JADX="$HOME/Downloads/jadx-1.5.7/bin/jadx"

"$JADX" -d wearfit-base ~/Downloads/WearfitPro/base.apk
```

If JADX reports individual decompilation errors, keep the output anyway. Do not omit the `classes*.dex` files or run only one DEX manually; JADX reads the multidex APK.

## 3. Optional: decode resources and split APKs

For the full set of app resources, run JADX on each split APK separately:

```bash
"$JADX" -d wearfit-arm64 ~/Downloads/WearfitPro/split_config.arm64_v8a.apk
"$JADX" -d wearfit-tr    ~/Downloads/WearfitPro/split_config.tr.apk
"$JADX" -d wearfit-xxhdpi ~/Downloads/WearfitPro/split_config.xxhdpi.apk
```

The Java/Kotlin logic is primarily in `base.apk`; the splits are supplementary. Do not merge split outputs into the base output because duplicate resource paths can overwrite each other.

## 4. Create a focused source bundle

The most useful output is the `sources/` tree from `wearfit-base/`. Keep these packages/classes if present:

- `com/wakeup/module/ble/`
- `com/wakeup/commponent/module/ble/`
- `com/wakeup/module/device/work/`
- `com/wakeup/module/device/stack/`
- `com/wakeup/commponent/module/device/work/`
- `com/sifli/`
- `com/wakeup/module/device/model/` and related model/DAO packages referenced by the analyzers.

A broad bundle is better than cherry-picking only method names because the key details are in callers, interfaces, callbacks, response models and persistence.

Example:

```bash
cd ~/wearfit-analysis/wearfit-base
zip -r ~/wearfit-analysis/wearfit-jadx-sources.zip sources resources
```

If the bundle is too large, zip the package folders above plus the complete `resources/` folder and the JADX error log.

## 5. Optional APKTool output

JADX is the important part for Java-like source. APKTool output is useful for manifest/resources and smali cross-checks:

```bash
apktool d -f ~/Downloads/WearfitPro/base.apk -o ~/wearfit-analysis/apktool-base
```

Do not repackage or modify the APK. We only need static source/resource inspection.

## 6. Send the result

Upload `wearfit-jadx-sources.zip` here, or commit the extracted source under:

```
decompiled/jadx/base/sources/
decompiled/jadx/base/resources/
```

Do not upload the original APK again; it is already represented in `research/apk/`. Include the exact APK version/hash if the input APK differs from the one already inventoried.

## 7. What I will inspect from the export

1. Complete method bodies and callers for music header/data transfer.
2. File transfer route selection, queue, chunk framing, ack/retry and completion.
3. Health-history request initiation, response models, date grouping, units and persistence.
4. Camera mode/control packet semantics and picture-transfer framing/direction.
5. Device model/capability routing for the HK 10 Pro Max+.
6. Other Wearfit features with complete, relevant call paths that can be safely supported by this watch.

A JADX export is not a guarantee that every obfuscated method decompiles cleanly. Keep the APKTool/smali output for methods that JADX cannot reconstruct.
