package com.wakeup.common.work;

/* loaded from: classes2.dex */
public class BloodPressureHelp {
    public static final int BP_LEVEL_HIGH_LIGHT = 4;
    public static final int BP_LEVEL_HIGH_MODERATE = 5;
    public static final int BP_LEVEL_HIGH_SEVERE = 6;
    public static final int BP_LEVEL_IDEAL = 1;
    public static final int BP_LEVEL_NORMAL = 2;
    public static final int BP_LEVEL_NORMAL_HIGH = 3;

    public static int getBpLevel(int low, int high) {
        if (low >= 110 || high >= 180) {
            return 6;
        }
        if (low >= 100 || high >= 160) {
            return 5;
        }
        if (low >= 90 || high >= 140) {
            return 4;
        }
        if (low >= 85 || high >= 130) {
            return 3;
        }
        return (low >= 80 || high >= 120) ? 2 : 1;
    }

    private BloodPressureHelp() {
    }
}
