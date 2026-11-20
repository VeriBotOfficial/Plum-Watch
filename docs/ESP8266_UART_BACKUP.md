# (Backup) ESP8266 as a USB-to-UART adapter

**Only use this if you lose or break your CP2102.** A real CP2102/FTDI/CH340 adapter is far more reliable for flashing the SF32LB525. The ESP8266 approach works for basic UART passthrough but is less stable at high baud rates and offers no hardware flow control.

## Principle

Flash a simple sketch onto an ESP8266 (e.g., NodeMCU / Wemos D1 Mini) that bridges its hardware UART (TX/RX pins) to its USB-CDC serial port. Your PC sees the ESP8266 as a COM port; you connect the watch to the ESP8266's TX/RX pins.

## Wiring (ESP8266 -> watch)

| Watch pad | ESP8266 pin | Note |
|---|---|---|
| `DBG_TX0` | ESP8266 RX (e.g., GPIO3 / RX) | Watch -> ESP8266 -> PC |
| `DBG_RX0` | ESP8266 TX (e.g., GPIO1 / TX) | PC -> ESP8266 -> Watch |
| `GND` | GND | Common ground |

Power the watch from its own battery; the ESP8266 from USB. Share GND between them.

## Example Arduino sketch

```cpp
// ESP8266 as a USB-to-UART bridge
// PC <-> ESP8266 USB <-> ESP8266 UART1 <-> Watch

#include <ESP8266WiFi.h>  // optional; can be removed for bare build

void setup() {
  // USB-CDC to PC
  Serial.begin(115200);
  // Hardware UART1 to watch (GPIO1=TX, GPIO3=RX on most ESP8266 boards)
  Serial.swap();          // move Serial to UART1 pins (TX=GPIO1, RX=GPIO3)
  // If your board uses a different UART, use:
  // SwapSerial.begin(115200, SERIAL_8N1, RX_PIN, TX_PIN);
}

void loop() {
  // PC -> Watch
  while (Serial.available()) {
    Serial.write(Serial.read());  // after swap(), Serial is UART1
  }
  // Watch -> PC
  while (Serial.available()) {
    Serial.write(Serial.read());
  }
}
```

> On many ESP8266 boards `Serial.swap()` redirects the hardware UART to GPIO1/TX and GPIO3/RX. Verify your board's pinout. Match baud rate to what sftool/watch expect (default 1,000,000 for flashing; the boot ROM may use a lower rate).

## Using it with sftool

Once the ESP8266 appears as a COM port (e.g., `COM5` or `/dev/ttyUSB0`), point sftool at it exactly as you would a CP2102:

```bash
sftool -c SF32LB52 -m nor -p /dev/ttyUSB0 --baud 1000000 read_flash dump.bin@0x12060000:0x380000
```

## Caveats

- ESP8266 UART is 3.3 V — matches the watch, good.
- No RTS/CTS hardware flow control; manual reset of the watch is required to enter download mode.
- High baud rates (1 Mbps) may be unreliable over the ESP8266 USB bridge. If flashing fails, lower baud (`--baud 115200`) — though the SF32 download stub typically negotiates 1 Mbps.
- Prefer your CP2102 for the actual dump/flash; keep this as a last resort.
