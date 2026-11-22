package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum PictureFormat implements Control {
    JPEG(0),
    DNG(1);

    private int value;
    static final PictureFormat DEFAULT = JPEG;

    PictureFormat(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static PictureFormat fromValue(int i) {
        for (PictureFormat pictureFormat : values()) {
            if (pictureFormat.value() == i) {
                return pictureFormat;
            }
        }
        return DEFAULT;
    }
}
