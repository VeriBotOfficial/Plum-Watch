package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaExperimentalFeature {
    WEB_FLEX_BASIS(0);

    private final int mIntValue;

    YogaExperimentalFeature(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaExperimentalFeature fromInt(int r3) {
        if (r3 == 0) {
            return WEB_FLEX_BASIS;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
