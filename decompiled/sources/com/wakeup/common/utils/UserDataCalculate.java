package com.wakeup.common.utils;

import com.wakeup.common.storage.UserDao;
import com.wakeup.common.storage.model.UserModel;

/* loaded from: classes2.dex */
public class UserDataCalculate {
    public static float getMoveDistance(int stepAll) {
        return stepAll * getStepDistance().floatValue();
    }

    public static double getKcal(int step) {
        return (((UserDao.getWeight() < 15.0f ? 0.0f : r0 - 15.0f) * 6.938E-4d) + 0.005895d) * step;
    }

    public static Float getStepDistance() {
        UserModel user = UserDao.getUser();
        int gender = user == null ? 0 : user.getGender();
        int height = user != null ? user.getHeight() : 0;
        if (height == 0) {
            return Float.valueOf(0.7f);
        }
        if (gender == 1) {
            return Float.valueOf(((float) (height * 0.415d)) / 100.0f);
        }
        if (gender == 0) {
            return Float.valueOf(((float) (height * 0.413d)) / 100.0f);
        }
        return Float.valueOf(0.7f);
    }

    public static int getStep(int distance) {
        return (int) (distance / getStepDistance().floatValue());
    }
}
