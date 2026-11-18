package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int mIntValue;

    YogaWrap(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaWrap fromInt(int r3) {
        if (r3 == 0) {
            return NO_WRAP;
        }
        if (r3 == 1) {
            return WRAP;
        }
        if (r3 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
