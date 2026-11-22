package com.wakeup.common.work;

/* loaded from: classes2.dex */
public class BloodGlucoseHelp {
    public static final int BLOOD_GLUCOSE_TYPE_HIGH = 2;
    public static final int BLOOD_GLUCOSE_TYPE_LOW = 1;
    public static final int BLOOD_GLUCOSE_TYPE_NORMAL = 0;

    public static int getBloodGlucoseType(float value, int type) {
        if (type == 2 || type == 4 || type == 6) {
            if (value < 4.4f) {
                return 1;
            }
            return (((double) value) < 4.4d || value > 7.0f) ? 2 : 0;
        }
        if (value < 4.4f) {
            return 1;
        }
        return (((double) value) < 4.4d || value > 10.0f) ? 2 : 0;
    }

    private BloodGlucoseHelp() {
    }
}
