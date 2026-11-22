# SiFli watchface preview rendering

## Rendering policy

A watchface's background and resource filenames do not reliably describe its clock layout. SiFli packages can contain split-row digital clocks, one-row digital clocks, analogue hands, and other module-defined elements. The existence of `time_num` assets alone is not sufficient evidence to place them.

The catalogue renderer therefore uses per-watchface layout profiles. A profile is added only after inspecting that watchface's own module and recovering its rendering calls, offsets, alignment, resource mapping, and dimensions. Unknown layouts are published with the original background preview rather than receiving a guessed or borrowed clock overlay. This is intentional: an incomplete background preview is preferable to a misleading preview showing the wrong clock.

## Red John profile

The Red John package contains a 410 × 494 background and ten native time-number EZIP resources (`time_num_01` through `time_num_10`), each 168 px wide and about 194 px high. The resource numbering is one-based: `01` is digit 0 and `10` is digit 9.

Its 32-bit little-endian ARM ELF module uses Thumb code. The dynamic symbol table exposes `get_wf_clock_hour_num`, `get_wf_clock_min_num`, `wk_img_number_ext_display`, `wk_img_number_update_display`, and `lv_obj_align`. The module creates separate hour and minute number-image objects.

The two `lv_obj_align` call sites pass alignment value 1 (top-left) and these offsets:

| Number object | X offset | Y offset |
|---|---:|---:|
| Hour | 38 | 42 |
| Minute | 32 | 258 |

The Red John profile renders a static sample time as two rows, using the native glyph canvases. It does not add a colon or resize/crop the assets.

## Known limitations

Red John's profile must not be reused for any other face. One-row digital and analogue faces still need their own module analysis and renderer profile. Until then, the catalogue deliberately leaves their original background untouched. Pixel-for-pixel comparison against a photograph of each physical watchface is also still needed to validate renderer-specific padding and composition.
