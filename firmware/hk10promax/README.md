# HK10 Pro Max firmware workspace

This directory is the root of the SiFli firmware application workspace. The previous redundant `v1/watch/hk10promaxplus_firmware/v1/watch` nesting has been removed; the original contents are preserved here.

- `project/`: SiFli SCons project and board configuration.
- `project/eh-lb525_hcpu/ptab.json`: the LB525 flash partition layout.
- `src/`: C application sources and resources.
- `disk/`: optional filesystem image input.

Build from `project/` in the configured SiFli SDK environment:

```bash
scons --board=eh-lb525 -j8
```

The board configuration describes an SF32LB525-class target. SFTool selects this chip family using `-c SF32LB52`.

The included LB525 `ptab.json` is identical to the file in the upstream HK10 Ultra 3 reference project. Confirm it against the actual watch's live FTAB before relying on its addresses. See [the repository dump/flash guide](../../docs/TUTORIAL_dump_edit_flash.md).
