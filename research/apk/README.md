# Wearfit Pro APK source set

These files are the exact source inputs used for the static research in this directory.

## Package identity

- Package: `com.wakeup.howear`
- Version name: `hw_5.6.21`
- Version code: `2026111322`
- Base APK DEX count: 17
- Split set supplied: base, arm64-v8a, tr, xxhdpi

The four files form one split-APK installation set; they are not four separate Wearfit app versions.

## File inventory and hashes

| Supplied file | Bytes | SHA-256 | Archive status |
|---|---:|---|---|
| `base.apk` | 210,859,037 | `9ea2ebbed95d543b313dd6238a87f9af0b02c8b7f1fed198535f00dfb1607230` | Original chat attachment; permanent Library upload failed because of storage quota |
| `split_config.arm64_v8a.apk` | 140,008,864 | `a92545a014d3c6a5ac8cf0255e112458c797068e113141ed1dfab8ec810e2a86` | Original chat attachment; permanent Library upload failed because of storage quota |
| `split_config.tr.apk` | 602,862 | `60e7111ae6f012cee4f27f18a1b7c931be132c0915b57efbc3c793a9747bee03` | Saved in ChatGPT Library at `/Plum Watch Research/APK/split_config.tr.apk` |
| `split_config.xxhdpi.apk` | 1,401,164 | `8c7e296b7047a8501f97c67fbbcc244ed229219bdd4f4f369f9389d7a650fd11` | Saved in ChatGPT Library at `/Plum Watch Research/APK/split_config.xxhdpi.apk` |

**Important:** the two large APKs could not be copied to permanent Library storage because the user's Library storage quota was full. No existing user files were deleted to make room. GitHub's normal Git file storage is also unsuitable for these APKs (the base and ARM64 files exceed GitHub's regular 100 MiB per-file limit). This repository therefore stores the inventory and hashes, not the binary APKs.

The original base/ARM64 APKs were accessible as attachments for this analysis. Keep the original files or move them to a separate object store / cloud drive if long-term archival is required.

## Split contents

- `base.apk`: manifest, app resources and 17 DEX files. Main BLE command builders are in `classes4.dex`; SiFli serial transport appears in `classes12.dex`; SiFli core BLE manager in `classes14.dex`; watchface SDK in `classes17.dex`.
- `split_config.arm64_v8a.apk`: ARM64 native libraries (93 shared objects).
- `split_config.tr.apk`: Turkish locale resources.
- `split_config.xxhdpi.apk`: xxhdpi density resources.

## Analysis method and limitations

The supplied APKs were inspected using ZIP/APK structure inspection, AXML manifest parsing and a local DEX table/code parser. A full JADX/APKTool source decompilation was not performed in the available environment. Therefore, the research documents identify concrete class/method evidence and decoded byte arrays where visible, and mark unresolved fields rather than presenting guesses as confirmed protocol facts.

No runtime BLE session, rooted-device memory dump, watch firmware dump or packet capture from the HK 10 Pro Max+ was supplied. Static analysis does not establish that every Wearfit command is accepted by that model's firmware.
