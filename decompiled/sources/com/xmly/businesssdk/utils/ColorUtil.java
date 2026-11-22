package com.xmly.businesssdk.utils;

import androidx.core.graphics.ColorUtils;

/* loaded from: classes3.dex */
public class ColorUtil {
    public static int convertColorToDarkMuted(int i) {
        try {
            float[] fArr = new float[3];
            ColorUtils.colorToHSL(i, fArr);
            float f = fArr[1];
            if (f < 0.3f || f > 0.3f) {
                fArr[1] = (f * 0.0f) + 0.3f;
            }
            float f2 = fArr[2];
            if (f2 < 0.35f || f2 > 0.35f) {
                fArr[2] = (f2 * 0.0f) + 0.35f;
            }
            return ColorUtils.HSLToColor(fArr);
        } catch (Exception unused) {
            return i;
        }
    }
}
