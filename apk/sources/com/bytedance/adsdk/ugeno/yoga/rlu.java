package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public enum rlu {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int hm;

    rlu(int r3) {
        this.hm = r3;
    }

    public int fxn() {
        return this.hm;
    }

    public static rlu fxn(int r2) {
        if (r2 == 0) {
            return STATIC;
        }
        if (r2 == 1) {
            return RELATIVE;
        }
        if (r2 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(r2)));
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
