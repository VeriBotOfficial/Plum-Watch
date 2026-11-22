package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum AudioCodec implements Control {
    DEVICE_DEFAULT(0),
    AAC(1),
    HE_AAC(2),
    AAC_ELD(3);

    private int value;
    static final AudioCodec DEFAULT = DEVICE_DEFAULT;

    AudioCodec(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static AudioCodec fromValue(int i) {
        for (AudioCodec audioCodec : values()) {
            if (audioCodec.value() == i) {
                return audioCodec;
            }
        }
        return DEFAULT;
    }
}
