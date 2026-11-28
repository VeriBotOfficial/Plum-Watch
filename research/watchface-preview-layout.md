# SiFli watchface preview rendering

## Rendering policy

A watchface's background and resource filenames do not reliably describe its clock layout. SiFli packages can contain split-row digital clocks, one-row digital clocks, analogue hands, and other module-defined elements. The existence of `time_num` assets alone is not sufficient evidence to place them.

The catalogue renderer therefore uses per-watchface layout profiles resolved from the package's internal SiFli module ID, not the ZIP filename. ZIP filenames are user-facing names and can change; the internal module/resource ID remains inside the archive. A profile is added only after inspecting that watchface's own module and recovering its rendering calls, offsets, alignment, resource mapping, and dimensions. Unknown layouts are published with the original background preview rather than receiving a guessed or borrowed clock overlay. This is intentional: an incomplete background preview is preferable to a misleading preview showing the wrong clock.

## Red John profile

The Red John package contains a 410 × 494 background and ten native time-number EZIP resources (`time_num_01` through `time_num_10`), each 168 px wide and about 194 px high. The resource numbering is one-based: `01` is digit 0 and `10` is digit 9.

Its 32-bit little-endian ARM ELF module uses Thumb code. The dynamic symbol table exposes `get_wf_clock_hour_num`, `get_wf_clock_min_num`, `wk_img_number_ext_display`, `wk_img_number_update_display`, and `lv_obj_align`. The module creates separate hour and minute number-image objects.

The two `lv_obj_align` call sites pass alignment value 1 (top-left) and these offsets:

| Number object | X offset | Y offset |
|---|---:|---:|
| Hour | 38 | 42 |
| Minute | 32 | 258 |

The Red John profile is keyed to the internal module ID `wf_clock1003` (including its paired resource module), not to the archive name `Red John.zip`. Renaming that ZIP therefore does not disable the clock profile. It renders a static sample time as two rows, using the native glyph canvases. It does not add a colon or resize/crop the assets.

## Analog profiles

The `wf_clock932`, `wf_clock933`, and `wf_clock1004` modules expose the native analog hour, minute, and second hand setters and matching `_h`, `_m`, and `_s` resources. Their resources use the raw format-5 RGB565-plus-alpha encoding handled by `ezip_preview.py`. The catalogue renderer now composes these three verified hand families over their own decoded backgrounds, using the shared 410 × 494 resource pivot and a sample time. It does not reuse the Red John digital layout.

## Known limitations

The `wf_clock935` digital-complication module is identified from its imports and resource families, but its exact runtime layout and complication positions have not yet been reconstructed. It therefore remains a background-only preview. Pixel-for-pixel comparison against photographs of the physical watchfaces is still needed to validate renderer-specific padding, pivot offsets, and animation timing.


## Additional native formats

Some analog modules store their hand sprites as raw format-5 RGB565-plus-alpha buffers with an 8-byte prefix, rather than compressed EZIP streams. The decoder recognizes this resource form directly before attempting the standard and legacy compressed paths. This is required for the `wf_clock932` and `wf_clock933` hour, minute, and second hands; without it, the background decodes while all three hands are silently omitted. The same format handling applies to later analog modules that use the same native resource encoding.
