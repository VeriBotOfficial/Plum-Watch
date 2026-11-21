# UART hardware guide — HK 10 Pro Max / SF32LB525

Use a dedicated 3.3 V TTL USB-to-UART adapter such as CP2102, FTDI or CH340.

## Important

The board may expose more than one UART-related pad group. The partition table (`ptab.json`) does **not** tell us which physical pads are connected to the SF32LB525 ROM download UART. Do not assume that every pad marked RX/TX is the correct interface.

Pad labels reported on the board include `RX`, `TX`, `RX1`, `TX1`, `RXD`, `TXD`, `GND`, `3.3V`, `5V`, `VBA7`, and `OSC`. These labels alone are insufficient to identify the ROM UART.

## Connections once the correct pair is confirmed

| Watch | USB-UART adapter |
|---|---|
| Confirmed ROM-UART TX | RX |
| Confirmed ROM-UART RX | TX |
| GND | GND |

Use 3.3 V logic levels. Do not connect adapter VCC, 3.3 V, or 5 V power to the watch. Leave `VBA7`, `OSC`, and unverified pads disconnected. Power the watch independently.

## Before soldering

- Disconnect the watch battery before soldering.
- Avoid bridging neighbouring pads; use thin insulated wire and inspect the joints before powering the board.
- Do not probe unknown pads by applying voltage.
- Do not assume the battery/charger pads are logic ground or UART.
- If the ROM-UART pair is not confirmed, stop rather than trying every pad combination.

After soldering and checking for shorts, reconnect the watch's own battery for operation. The USB-UART adapter must not power the watch.

## SFTool settings

For this SoC family, SFTool's chip name is `SF32LB52`; the SDK project board name is `eh-lb525`.

A typical Linux port appears as `/dev/ttyUSB0`:

```bash
ls /dev/ttyUSB*
```

The scripts default to 1,000,000 baud and retry the ROM connection. Start the script first, then reset/power-cycle the watch into its ROM download interface.

See [the dump/edit/flash tutorial](TUTORIAL_dump_edit_flash.md) for the read-only FTAB-first workflow.
