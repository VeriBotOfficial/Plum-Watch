package io.agora.rtc2;

/* loaded from: classes6.dex */
public class RecorderInfo {
    public int durationMs;
    public String fileName;
    public int fileSize;

    public RecorderInfo(String fileName, int durationMs, int fileSize) {
        this.fileName = fileName;
        this.durationMs = durationMs;
        this.fileSize = fileSize;
    }
}
