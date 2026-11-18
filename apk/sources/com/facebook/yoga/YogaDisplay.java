package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaDisplay {
    FLEX(0),
    NONE(1),
    CONTENTS(2);

    private final int mIntValue;

    YogaDisplay(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaDisplay fromInt(int r3) {
        if (r3 == 0) {
            return FLEX;
        }
        if (r3 == 1) {
            return NONE;
        }
        if (r3 == 2) {
            return CONTENTS;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
