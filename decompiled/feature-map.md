# Wearfit feature map

| Feature | Wearfit APK evidence | Plum Watch status |
|---|---|---|
| Time sync | Standard Current Time Service is written during initial connection setup | Automatic; manual Quick Control removed |
| Heart rate / SpO2 history | Health sync analyzers and old-data persistence methods exist | Last 48 distinct readings per metric are stored locally and charted; watch history backfill is not implemented |
| Music | Separate audio/file-transfer APIs; file-transfer header/data operations exist | MP3/M4A picker UI; BLE upload not implemented pending verified target framing |
| Camera | CameraControlAnalyzer accepts camera mode and capture/switch events; a separate picture-transfer analyzer exists | Phone preview and watch remote shutter/switch remain; preview-frame streaming to watch is not implemented |
| Watchfaces | SiFli file-push state machine | Existing implementation retained; this does not prove music/camera use the same transport |

## Camera distinction

The `EA ... 15 04` packet toggles camera mode. It carries no pixels. Wearfit has a separate picture-transfer analyzer and image-data path. Plum currently uses the mode command and receives shutter/switch events. A watch-side camera view requires the missing preview-frame transfer path and confirmation of HK 10 Pro Max+ transport.

## Health-history distinction

Wearfit has historical-data synchronization and persistence. The exact date-bucket response schema and target-device compatibility remain unverified. Plum stores each distinct reading it receives locally (up to 48 per metric); it does not fabricate history.
