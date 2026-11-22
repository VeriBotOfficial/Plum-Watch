package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes13.dex */
public enum zu {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int hm;

    zu(int i) {
        this.hm = i;
    }

    public int fxn() {
        return this.hm;
    }

    public static zu fxn(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
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
