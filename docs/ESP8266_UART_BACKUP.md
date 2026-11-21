# ESP8266 note — not recommended for SFTool flashing

A bare ESP8266 is **not** a USB-to-UART adapter. The previous sketch in this document was not a valid transparent bridge: an ESP8266's UART and a development board's USB-to-serial connection are not an independent USB-CDC interface that can be bridged by calling `Serial.swap()`.

For reliable SF32LB525 firmware reads/writes, use a dedicated 3.3 V TTL USB-to-UART adapter (CP2102, FTDI or CH340).

Some ESP8266 development boards include a USB-to-serial chip, but their USB/UART wiring and reset circuitry vary by board. Do not assume such a board can be used as a transparent adapter or connect its pins to the watch without checking its schematic.

Do not connect any 5 V signal or adapter power pin to the watch. See [HARDWARE_PINOUT_CP2102.md](HARDWARE_PINOUT_CP2102.md).
