package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class CodecCapInfo {
    public int codecCapMask;
    public CodecCapLevels codecLevels;
    public int codecType;

    public CodecCapInfo(int codecType, int codecCapMask, CodecCapLevels levels) {
        this.codecType = codecType;
        this.codecCapMask = codecCapMask;
        this.codecLevels = levels;
    }

    public void SetCodecCapMask(int codecCapMask) {
        this.codecCapMask = codecCapMask;
    }

    public void SetCodecType(int codecType) {
        this.codecType = codecType;
    }
}
