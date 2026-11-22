package com.wakeup.commonui.utils;

import com.wakeup.common.storage.UserDao;
import com.wakeup.common.storage.model.UserModel;
import com.wakeup.common.utils.NumberUtils;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class UnitConvertUtils {
    public static float Mile2Km(float f) {
        return f * 1.609344f;
    }

    private UnitConvertUtils() {
    }

    public static float kgToLb(float f) {
        return NumberUtils.formatNumber(f * 2.2d, 1);
    }

    public static float lbToKg(float f) {
        return NumberUtils.formatNumber(f / 2.2d, 1);
    }

    public static float cToF(float f) {
        return NumberUtils.formatNumber((f * 1.8f) + 32.0f, 1);
    }

    public static float kmToMile(float f) {
        return NumberUtils.formatNumber(f / 1.609344f, 2);
    }

    public static int getUnit() {
        UserModel user = UserDao.getUser();
        return (user != null && user.getUnit() == 2) ? 2 : 1;
    }

    public static float Km2Mile(float f) {
        return getUnit() == 1 ? f : f / 1.609344f;
    }

    public static float Meter2Foot(float f) {
        return getUnit() == 1 ? f : f / 0.3048f;
    }

    public static float CM2Inch(float f) {
        return getUnit() == 1 ? f : f / 2.54f;
    }

    public static int PaceKm2Mile(int i) {
        return getUnit() == 1 ? i : (int) (i * 1.609344f);
    }

    public static String getEnergyUnit() {
        return com.wakeup.common.utils.StringUtils.getString(R.string.home_qianka);
    }
}
