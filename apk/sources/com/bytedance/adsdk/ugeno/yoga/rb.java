package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public enum rb {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int rb;

    rb(int r3) {
        this.rb = r3;
    }

    public int fxn() {
        return this.rb;
    }

    public static rb fxn(int r2) {
        if (r2 == 0) {
            return COLUMN;
        }
        if (r2 == 1) {
            return COLUMN_REVERSE;
        }
        if (r2 == 2) {
            return ROW;
        }
        if (r2 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(r2)));
    }

    public static rb fxn(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }
}
