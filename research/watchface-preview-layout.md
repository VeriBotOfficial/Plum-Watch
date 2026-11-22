# SiFli watchface preview clock layout

## Red John module findings

The Red John package contains a 410 × 494 background and ten native time-number EZIP resources (time_num_01 through time_num_10), each 168 px wide and about 194 px high. The resource numbering is one-based: 01 is digit 0 and 10 is digit 9.

The ARM ELF module is a 32-bit little-endian ARM shared object using Thumb code. Its dynamic symbol table exposes get_wf_clock_hour_num, get_wf_clock_min_num, wk_img_number_ext_display, wk_img_number_update_display, and lv_obj_align. The clock setup creates separate hour and minute number-image objects.

The two lv_obj_align call sites in the clock setup pass alignment value 1 (top-left alignment) and these literal offsets:

| Number object | X offset | Y offset |
|---|---:|---:|
| Hour | 38 | 42 |
| Minute | 32 | 258 |

These values are taken from the ARM Thumb call-site argument setup, not estimated from the background artwork. The preview renderer therefore lays out the hour digits at native resource dimensions in the upper row and minute digits in the lower row. It does not add a colon, crop glyph alpha bounds, or scale the glyphs to fit a guessed horizontal HH:MM layout.

## Scope and verification

This reconstructs the native clock placement and the two-row hour/minute composition for Red John. It is not a claim that every watchface uses the same layout: other modules may use different alignment calls, offsets, resources, or rendering helpers and must be inspected individually.

The generated preview is a static sample time (10 over 08). The real watch continues to show the live hour and minute. Pixel-for-pixel comparison against a photograph of the watch is still the final visual validation step, especially for any renderer-specific padding internal to wk_img_number_ext_display.
