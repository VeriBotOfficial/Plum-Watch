package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaPositionType {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int mIntValue;

    YogaPositionType(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaPositionType fromInt(int r3) {
        if (r3 == 0) {
            return STATIC;
        }
        if (r3 == 1) {
            return RELATIVE;
        }
        if (r3 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
