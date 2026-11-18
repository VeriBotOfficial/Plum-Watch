package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public enum zu {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int hm;

    zu(int r3) {
        this.hm = r3;
    }

    public int fxn() {
        return this.hm;
    }

    public static zu fxn(int r2) {
        if (r2 == 0) {
            return NO_WRAP;
        }
        if (r2 == 1) {
            return WRAP;
        }
        if (r2 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(r2)));
    }

    public static zu fxn(String str) {
        str.hashCode();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }
}
