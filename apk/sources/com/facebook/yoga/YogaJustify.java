package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaJustify {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int mIntValue;

    YogaJustify(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaJustify fromInt(int r3) {
        if (r3 == 0) {
            return FLEX_START;
        }
        if (r3 == 1) {
            return CENTER;
        }
        if (r3 == 2) {
            return FLEX_END;
        }
        if (r3 == 3) {
            return SPACE_BETWEEN;
        }
        if (r3 == 4) {
            return SPACE_AROUND;
        }
        if (r3 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
