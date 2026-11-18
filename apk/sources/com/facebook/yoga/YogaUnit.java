package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);

    private final int mIntValue;

    YogaUnit(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaUnit fromInt(int r3) {
        if (r3 == 0) {
            return UNDEFINED;
        }
        if (r3 == 1) {
            return POINT;
        }
        if (r3 == 2) {
            return PERCENT;
        }
        if (r3 == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
