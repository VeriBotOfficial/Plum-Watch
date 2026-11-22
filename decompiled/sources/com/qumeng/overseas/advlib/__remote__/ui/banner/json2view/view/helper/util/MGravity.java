package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util;

import android.text.TextUtils;
import android.view.Gravity;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;

/* loaded from: classes17.dex */
public class MGravity {
    public static int getGravityInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = -1;
        for (String str2 : str.split("\\|")) {
            try {
                int i2 = Gravity.class.getField(str2.toUpperCase()).getInt(Gravity.class);
                i = i == -1 ? i2 : i | i2;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
        }
        return i;
    }

    public static float getWeightFloat(IView iView) {
        String weight = iView.getWeight();
        if (TextUtils.isEmpty(weight)) {
            return 0.0f;
        }
        try {
            return Float.valueOf(weight).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }
}
