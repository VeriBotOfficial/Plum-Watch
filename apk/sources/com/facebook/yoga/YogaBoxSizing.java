package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaBoxSizing {
    BORDER_BOX(0),
    CONTENT_BOX(1);

    private final int mIntValue;

    YogaBoxSizing(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaBoxSizing fromInt(int r3) {
        if (r3 == 0) {
            return BORDER_BOX;
        }
        if (r3 == 1) {
            return CONTENT_BOX;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
