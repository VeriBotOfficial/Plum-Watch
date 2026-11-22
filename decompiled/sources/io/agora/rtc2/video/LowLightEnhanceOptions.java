package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class LowLightEnhanceOptions {
    public static final int LOW_LIGHT_ENHANCE_AUTO = 0;
    public static final int LOW_LIGHT_ENHANCE_LEVEL_FAST = 1;
    public static final int LOW_LIGHT_ENHANCE_LEVEL_HIGH_QUALITY = 0;
    public static final int LOW_LIGHT_ENHANCE_MANUAL = 1;
    public int lowlightEnhanceLevel;
    public int lowlightEnhanceMode;

    public LowLightEnhanceOptions() {
        this.lowlightEnhanceMode = 0;
        this.lowlightEnhanceLevel = 0;
    }

    public LowLightEnhanceOptions(int mode, int level) {
        this.lowlightEnhanceMode = mode;
        this.lowlightEnhanceLevel = level;
    }
}
