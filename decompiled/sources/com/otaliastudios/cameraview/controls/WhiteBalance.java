package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum WhiteBalance implements Control {
    AUTO(0),
    INCANDESCENT(1),
    FLUORESCENT(2),
    DAYLIGHT(3),
    CLOUDY(4);

    private int value;
    static final WhiteBalance DEFAULT = AUTO;

    WhiteBalance(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static WhiteBalance fromValue(int i) {
        for (WhiteBalance whiteBalance : values()) {
            if (whiteBalance.value() == i) {
                return whiteBalance;
            }
        }
        return DEFAULT;
    }
}
