package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class CodecCapLevels {
    public int hwDecodingLevel;
    public int swDecodingLevel;

    public CodecCapLevels() {
        this.hwDecodingLevel = -1;
        this.swDecodingLevel = -1;
    }

    public CodecCapLevels(int hwDecLevel, int swDecLevel) {
        this.hwDecodingLevel = hwDecLevel;
        this.swDecodingLevel = swDecLevel;
    }
}
