package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaErrata {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);

    private final int mIntValue;

    YogaErrata(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaErrata fromInt(int r3) {
        if (r3 == 0) {
            return NONE;
        }
        if (r3 == 1) {
            return STRETCH_FLEX_BASIS;
        }
        if (r3 == 2) {
            return ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING;
        }
        if (r3 == 4) {
            return ABSOLUTE_PERCENT_AGAINST_INNER_SIZE;
        }
        switch (r3) {
            case 2147483646:
                return CLASSIC;
            case Integer.MAX_VALUE:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + r3);
        }
    }
}
