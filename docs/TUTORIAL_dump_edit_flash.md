# HK 10 Pro Max - SF32LB525 dump, inspect and flash guide

This guide is for the `eh-lb525_hcpu` SiFli project in `firmware/hk10promax/`.

- **SoC family:** SiFli SF32LB52 family; the board configuration is `eh-lb525_hcpu` / SF32LB525.
- **Serial tool:** OpenSiFli `sftool`.
- **Recommended adapter:** 3.3 V TTL USB-to-UART (CP2102, FTDI or CH340).
- **Project:** `firmware/hk10promax/`.

## Critical compatibility note

The `ptab.json` in `firmware/hk10promax/project/eh-lb525_hcpu/` is an exact JSON match to:

`amir1387aht/hk_watchs_hack/projects/hk10ultra3_firmware/v1/watch/project/eh-lb525_hcpu/ptab.json`.

This establishes that the two projects describe the same LB525 reference partition layout. It does **not** prove that the user's physical HK 10 Pro Max has the same live flash table. The watch's own FTAB is authoritative. Dump it first and retain it before using the other offsets below.

SFTool's chip selector is `SF32LB52`; do not pass `SF32LB525`. The SDK board/project selector is `eh-lb525`.

## 1. UART connection

Read [HARDWARE_PINOUT_CP2102.md](HARDWARE_PINOUT_CP2102.md) before soldering. The PCB may expose several UART-labelled pad groups. `ptab.json` does not identify which PCB pads connect to the ROM download UART, so do not infer the correct pair from the labels alone.

Only connect:
- adapter GND to board GND;
- adapter TX to the **confirmed** watch ROM-UART RX;
- adapter RX to the **confirmed** watch ROM-UART TX.

Use 3.3 V logic. Do not connect adapter VCC, 3.3 V or 5 V power. Power the watch separately. Disconnect the battery before soldering.

## 2. Install SFTool

Install a current SFTool release or build it from the [OpenSiFli/sftool repository](https://github.com/OpenSiFli/sftool). Check the options supported by the installed version:

```bash
sftool --help
sftool --version
```

The current upstream CLI supports `SF32LB52`, NOR flash, multiple read/write file arguments, `--verify`, `--before no_reset`, `--after no_reset`, and `--connect-attempts 0` for unlimited connection attempts. Check the installed version before running the scripts.

## 3. Read the live FTAB first

Run this from the repository root:

```bash
chmod +x scripts/dump_firmware.sh scripts/flash_firmware.sh
./scripts/dump_firmware.sh /dev/ttyUSB0 ./dumps/hk10promax-ftab
```

The default scope is **FTAB only**. The script starts SFTool with connection retries enabled. Once it is waiting, reset or power-cycle the watch into its ROM download interface.

This produces `ftab.bin` (32 KiB according to the reference table). Keep this file. Do not continue with the full reference map if the live table cannot be confirmed as compatible.

## 4. Dump all reference regions

After verifying the live FTAB against the `eh-lb525_hcpu` reference layout, run:

```bash
./scripts/dump_firmware.sh /dev/ttyUSB0 ./dumps/hk10promax-original all
```

This reads each named region in one SFTool session:

| Region | C-BUS address | Size |
|---|---:|---:|
| FTAB | `0x12000000` | `0x00008000` |
| Bootloader | `0x12020000` | `0x00020000` |
| Main | `0x12060000` | `0x00380000` |
| DFU | `0x123E0000` | `0x00080000` |
| DFU download | `0x12460000` | `0x00100000` |
| DFU info | `0x12560000` | `0x00020000` |
| Filesystem root | `0x12580000` | `0x07580000` |
| Flash part 2 | `0x19B00000` | `0x00080000` |
| Flash part 12 | `0x19B80000` | `0x00080000` |

The filesystem region is 117.5 MiB. The final two regions are each 512 KiB. The download/info and extra regions do not have `img` fields in the ptab, but they are still listed flash regions and are included in the raw backup.

The previous bootloader dump size was only `0x10000` (64 KiB), although its flash partition's `max_size` is `0x20000` (128 KiB). The current scripts use the full partition allocation.

The helper creates a timestamped output directory by default, or uses the output directory supplied as its second argument. It writes SHA-256 checksums when `sha256sum` is installed.

## 5. Inspect and preserve the dump

```bash
find ./dumps -type f -name '*.bin' -printf '%p %s bytes\n'
sha256sum ./dumps/hk10promax-original/*.bin
file ./dumps/hk10promax-original/*.bin
```

Copy the complete backup somewhere outside the PC before changing firmware. Do not upload private device data publicly without reviewing it.

A `ptab.json` is a build-time partition description; it is not a plain-text dump of the binary FTAB. Keep the live `ftab.bin` for separate decoding/verification.

## 6. Build the reference project

Install the SiFli SDK and use its configured SDK terminal/environment. From the repository root:

```bash
cd firmware/hk10promax/project
scons --board=eh-lb525 -j8
```

The expected board build directory is `build_eh-lb525_hcpu/` under `project/`. Confirm the actual generated files before flashing. The flash helper defaults to this directory.

The SDK project has sibling `project/`, `src/`, and `disk/` directories under `firmware/hk10promax/`; keep that relationship intact when editing or moving source.

## 7. Flash a build

**Do this only after the full original dump is complete and the live FTAB layout has been confirmed.** Close serial terminals and ensure the watch is connected through the correct ROM-UART pair.

Default command:

```bash
./scripts/flash_firmware.sh /dev/ttyUSB0
```

The helper validates the required output files and their maximum sizes, then asks for the exact text `FLASH HK10PROMAX`. It writes and verifies only:
- `ftab.bin` at `0x12000000`;
- `bootloader.bin` at `0x12020000`;
- `main.bin` at `0x12060000`.

It deliberately leaves DFU, DFU download/info, filesystem root, flash part 2 and flash part 12 untouched by default.

Optional destructive regions:
- `--include-dfu` additionally writes `dfu.bin` at `0x123E0000`.
- `--include-fs-root` additionally writes `fs_root.bin` at `0x12580000` (up to 117.5 MiB). This replaces the watch's filesystem content and can remove factory apps/data. Do not use unless that is intentional and a complete backup exists.

Example:

```bash
./scripts/flash_firmware.sh /dev/ttyUSB0 firmware/hk10promax/project/build_eh-lb525_hcpu --include-dfu
```

The script starts SFTool with connection retries enabled. Once it is waiting, reset or power-cycle the watch into its ROM download interface. It uses `--verify` and does not use SFTool's `--erase-all` option.

## 8. Filesystem warning before first boot

The current reference source in `src/fs/fs.c` calls `dfs_mkfs()` if mounting the filesystem fails. This can format the filesystem at runtime after the main image boots, even when the flash helper did not write the filesystem partition. Review or disable that automatic-format path before booting a modified image on a watch containing original data.

## 9. Useful SFTool options

The scripts use these defaults (overridable with environment variables):

```bash
SFTOOL_BIN=sftool
CHIP=SF32LB52
MEM=nor
BAUD=1000000
CONNECT_ATTEMPTS=0
```

SFTool accepts multiple `FILE@ADDRESS:SIZE` inputs for `read_flash` and multiple `FILE@ADDRESS` inputs for `write_flash`. The flash helper enables `--verify`. Do not use `--erase-all` for routine firmware updates.

## References

- [OpenSiFli/sftool CLI documentation](https://github.com/OpenSiFli/sftool/blob/master/README_EN.md)
- [SiFli SF32LB52x SDK documentation](https://docs.sifli.com/projects/sdk/latest/sf32lb52x/)
- [Upstream HK10 Ultra 3 LB525 partition table](https://github.com/amir1387aht/hk_watchs_hack/blob/main/projects/hk10ultra3_firmware/v1/watch/project/eh-lb525_hcpu/ptab.json)
