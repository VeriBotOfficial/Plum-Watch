package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaGutter {
    COLUMN(0),
    ROW(1),
    ALL(2);

    private final int mIntValue;

    YogaGutter(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaGutter fromInt(int r3) {
        if (r3 == 0) {
            return COLUMN;
        }
        if (r3 == 1) {
            return ROW;
        }
        if (r3 == 2) {
            return ALL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
