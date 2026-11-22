package com.wakeup.common.work;

import com.wakeup.common.utils.NumberUtils;

/* loaded from: classes2.dex */
public class WeightHelp {
    private WeightHelp() {
    }

    public static float getBMI(float weight, float height) {
        return NumberUtils.formatNumber(weight / (height * height), 1);
    }
}
