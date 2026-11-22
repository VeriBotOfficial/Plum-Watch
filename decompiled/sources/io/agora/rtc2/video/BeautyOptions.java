package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class BeautyOptions {
    public static final int LIGHTENING_CONTRAST_HIGH = 2;
    public static final int LIGHTENING_CONTRAST_LOW = 0;
    public static final int LIGHTENING_CONTRAST_NORMAL = 1;
    public int lighteningContrastLevel;
    public float lighteningLevel;
    public float rednessLevel;
    public float sharpnessLevel;
    public float smoothnessLevel;

    public BeautyOptions() {
        this.lighteningContrastLevel = 1;
        this.lighteningLevel = 0.6f;
        this.smoothnessLevel = 0.5f;
        this.rednessLevel = 0.1f;
        this.sharpnessLevel = 0.3f;
    }

    public BeautyOptions(int contrastLevel, float lightening, float smoothness, float redness, float sharpness) {
        this.lighteningContrastLevel = contrastLevel;
        this.lighteningLevel = lightening;
        this.smoothnessLevel = smoothness;
        this.rednessLevel = redness;
        this.sharpnessLevel = sharpness;
    }
}
