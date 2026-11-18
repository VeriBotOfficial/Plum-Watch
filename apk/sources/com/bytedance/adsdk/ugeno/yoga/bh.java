package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public enum bh {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);


    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private final int f9304sg;

    bh(int r3) {
        this.f9304sg = r3;
    }

    public int fxn() {
        return this.f9304sg;
    }

    public static bh fxn(int r2) {
        if (r2 == 0) {
            return FLEX_START;
        }
        if (r2 == 1) {
            return CENTER;
        }
        if (r2 == 2) {
            return FLEX_END;
        }
        if (r2 == 3) {
            return SPACE_BETWEEN;
        }
        if (r2 == 4) {
            return SPACE_AROUND;
        }
        if (r2 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(r2)));
    }

    public static bh fxn(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "space_evenly":
                return SPACE_EVENLY;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }
}
