package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes13.dex */
public enum rlu {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int hm;

    rlu(int i) {
        this.hm = i;
    }

    public int fxn() {
        return this.hm;
    }

    public static rlu fxn(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static rlu fxn(String str) {
        str.hashCode();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }
}
