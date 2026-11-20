# Hardware Pinout — CP2102 USB-to-UART Adapter <-> HK 10 Pro Max+ (SF32LB525)

This guide describes how to connect a CP2102 USB 2.0 UART TTL adapter (or equivalent such as FTDI / CH340) to the HK 10 Pro Max+ debug pads.

## ⚠️ Safety rules (read before touching anything)

1. **NEVER connect the UART adapter 5V / VCC pin to the watch.** The watch runs on a battery (~3.7 V) and its logic is 3.3 V. Feeding 5 V into a watch data pad can destroy the SF32LB525.
2. **Only connect three wires: TX, RX, GND.** Do not connect VCC/5V.
3. **Logic level:** CP2102 outputs are 3.3 V logic, which matches the watch. If the adapter board has a 5V/3.3V jumper, set it to **3.3V**.
4. **Connect GND first**, then TX/RX. Disconnect GND last.
5. Power the watch from its own battery / magnetic charger — never from the UART adapter.

## Watch debug pads (DBG UART0)

The HK 10 Pro Max+ exposes a debug UART on pads typically labelled near the SF32LB525 SoC:

| Watch debug pad | UART adapter pin | Direction | Purpose |
|---|---|---|---|
| `DBG_TX0` | **RX** | Watch -> PC | Watch transmits (log / download monitor) |
| `DBG_RX0` | **TX** | PC -> Watch | PC transmits (commands / flash download) |
| `GND` | **GND** | Common ground | Shared reference |

> **RX connects to TX, TX connects to RX.** If there is no response, swap the two signal wires.

## How to find the pads inside the watch

1. Open the watch case (pry the back cover carefully; the screen is glued).
2. Look for the main PCB with the **SF32LB525** chip.
3. Look for a group of 3 test pads / vias near the SoC labelled something like:
   - `DBG_TX0`, `DBG_RX0`, `GND`
   - Or `TX0`, `RX0`, `GND`
   - Or `UART_TX`, `UART_RX`, `GND`
4. If they are not labelled, use a multimeter in **continuity mode** to trace each pad to the SF32LB525 UART pins and to ground.
5. Solder thin insulated wires (or use pogo pins / sewing needles held with tape) to the pads. Do not bridge adjacent pads.

## Adapter driver

- **Windows:** install the Silicon Labs CP210x USB-to-UART VCP driver from silabs.com. The adapter may show as an unknown device in Device Manager until the driver is installed.
- **Linux:** the `cp210x` driver is built into most kernels. Plug it in and check `dmesg | tail` — a new `/dev/ttyUSB0` should appear.

## Verify the port appears

- **Windows:** Device Manager -> Ports (COM & LPT) -> "Silicon Labs CP210x USB to UART Bridge (COMx)"
- **Linux:** `ls /dev/ttyUSB*` or `ls /dev/ttyACM*`

## Optional: automatic reset / download mode

The SF32LB52x BootROM stays in download mode for ~2000 ms after power-on/reset. sftool can toggle RTS to reset the chip automatically, but for a first dump you can simply power-cycle the watch (or press its reset button / reinsert the battery) right before running the dump command. Wiring RTS to the load-switch enable is an advanced step — skip it for now and do manual resets.

## Fallback: ESP8266 as a UART adapter

If no dedicated UART adapter is available, an ESP8266 can be used as a USB-to-UART bridge. See `docs/ESP8266_UART_BACKUP.md`. A real CP2102/FTDI/CH340 adapter is more reliable for flashing and is recommended.
