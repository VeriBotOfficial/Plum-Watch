# Plum Watch

Custom firmware and companion app for the HK 10 Pro Max (SiFli SF32LB525).

This repository contains the Android companion app, a reference SiFli firmware project, UART dump/flash tools, and reverse-engineering documentation.

## Repository layout

```
Plum-Watch/
├── app/                         # Android companion app
├── docs/                        # Hardware and firmware guides
├── firmware/
│   └── hk10promax/              # SiFli SDK project root
│       ├── project/
│       ├── src/
│       └── disk/
├── scripts/                     # Dump and guarded flash helpers
├── dumps/                       # Created by dump_firmware.sh; keep backups offline
└── watchfaces/                  # Companion-app watchface catalogue
```

The firmware project is based on the `eh-lb525_hcpu` configuration in `amir1387aht/hk_watchs_hack`. The `eh-lb525_hcpu/ptab.json` in this repository is structurally and value-for-value identical to that upstream HK10 Ultra 3 reference file.

**Important:** a matching reference partition table is not proof that a particular watch has the same live flash layout. Read and inspect the watch's own FTAB before using the reference offsets to dump other regions or flash anything.

## Start here

1. Read [the dump/edit/flash tutorial](docs/TUTORIAL_dump_edit_flash.md).
2. Check [the UART wiring guide](docs/HARDWARE_PINOUT_CP2102.md). The correct UART pads must be identified on the actual PCB; pad labels alone do not prove which UART is the ROM download interface.
3. Read the live FTAB first:

```bash
./scripts/dump_firmware.sh /dev/ttyUSB0 ./dumps/hk10promax-ftab
```

4. After the live table has been checked against the reference, dump the mapped regions:

```bash
./scripts/dump_firmware.sh /dev/ttyUSB0 ./dumps/hk10promax-original all
```

5. Build from the SiFli SDK environment:

```bash
cd firmware/hk10promax/project
scons --board=eh-lb525 -j8
```

6. Flash the core build outputs only after keeping a verified original backup:

```bash
./scripts/flash_firmware.sh /dev/ttyUSB0
```

The flash helper writes FTAB, bootloader and main only. It does not overwrite DFU, the filesystem, DFU download/info storage, or the additional flash regions unless explicitly requested.

## Reference flash map

The following C-BUS addresses are derived from the `eh-lb525_hcpu/ptab.json` reference table. The `flash2` memory base is `0x62000000`; the table's offsets are applied to its C-BUS alias at `0x12000000`.

| Region | C-BUS address | Size | Notes |
|---|---:|---:|---|
| FTAB | `0x12000000` | `0x00008000` | 32 KiB |
| Bootloader | `0x12020000` | `0x00020000` | 128 KiB reserved |
| Main | `0x12060000` | `0x00380000` | 3.5 MiB |
| DFU | `0x123E0000` | `0x00080000` | 512 KiB |
| DFU download | `0x12460000` | `0x00100000` | 1 MiB |
| DFU info | `0x12560000` | `0x00020000` | 128 KiB |
| Filesystem root | `0x12580000` | `0x07580000` | 117.5 MiB |
| Flash part 2 | `0x19B00000` | `0x00080000` | 512 KiB |
| Flash part 12 | `0x19B80000` | `0x00080000` | 512 KiB |

These are reference values, not a substitute for reading the target watch's FTAB. The DFU C-BUS address is `0x123E0000`, derived from offset `0x003E0000`.

## SFTool

The SiFli SFTool CLI identifies this chip family as `SF32LB52` (not `SF32LB525`). The board/project configuration is `eh-lb525_hcpu`.

Install SFTool from [OpenSiFli/sftool](https://github.com/OpenSiFli/sftool), then check the installed CLI with:

```bash
sftool --help
sftool --version
```

The scripts use `SFTOOL_BIN`, `BAUD`, and `CONNECT_ATTEMPTS` environment variables when set. They default to a 1,000,000 baud connection and keep retrying until the watch enters the ROM download interface.

## Safety and recovery

- Use 3.3 V UART logic. Connect adapter GND, adapter TX to the watch's confirmed ROM-UART RX, and adapter RX to the watch's confirmed ROM-UART TX.
- Do not connect the adapter's VCC, 3.3 V or 5 V power pin to the watch. Power the watch separately.
- Never solder while the battery is connected.
- Keep the complete original dump in at least two safe locations before flashing.
- The flash helper requires an explicit typed confirmation and verifies writes.
- The reference firmware's current `src/fs/fs.c` calls `dfs_mkfs()` if mounting fails. A custom firmware boot can therefore format the filesystem region at runtime even though the flash helper leaves that region untouched. Do not boot a modified image on the watch until this behaviour has been reviewed and the original filesystem has been backed up.
- Flashing is not yet verified on the user's physical watch. No script can guarantee compatibility until the live FTAB and the actual ROM-UART interface are confirmed.
