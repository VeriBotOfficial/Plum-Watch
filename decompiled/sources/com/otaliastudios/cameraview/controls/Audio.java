package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum Audio implements Control {
    OFF(0),
    ON(1),
    MONO(2),
    STEREO(3);

    private int value;
    static final Audio DEFAULT = ON;

    Audio(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static Audio fromValue(int i) {
        for (Audio audio : values()) {
            if (audio.value() == i) {
                return audio;
            }
        }
        return DEFAULT;
    }
}
