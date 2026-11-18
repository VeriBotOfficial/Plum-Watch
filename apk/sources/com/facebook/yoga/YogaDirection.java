package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int mIntValue;

    YogaDirection(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaDirection fromInt(int r3) {
        if (r3 == 0) {
            return INHERIT;
        }
        if (r3 == 1) {
            return LTR;
        }
        if (r3 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
