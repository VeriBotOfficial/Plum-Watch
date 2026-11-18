package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaOverflow {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);

    private final int mIntValue;

    YogaOverflow(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaOverflow fromInt(int r3) {
        if (r3 == 0) {
            return VISIBLE;
        }
        if (r3 == 1) {
            return HIDDEN;
        }
        if (r3 == 2) {
            return SCROLL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
