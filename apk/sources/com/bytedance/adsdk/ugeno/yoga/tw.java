package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public enum tw {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int hm;

    tw(int r3) {
        this.hm = r3;
    }

    public static tw fxn(int r2) {
        if (r2 == 0) {
            return UNDEFINED;
        }
        if (r2 == 1) {
            return EXACTLY;
        }
        if (r2 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(r2)));
    }
}
