package com.bytedance.sdk.openadsdk.core.jq.fxn;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class fxn {
    public static Pair<Float, Float> fxn(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = wc.gff(window.getContext(), fArr[0]);
        float gff = wc.gff(window.getContext(), fArr[1]);
        fArr[1] = gff;
        if (fArr[0] < 10.0f || gff < 10.0f) {
            fArr = fxn(window.getContext(), wc.gff(window.getContext(), wc.fxn()), i);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    private static float[] fxn(Context context, int i, int i2) {
        float fxn = fxn(context);
        float kg = kg(context);
        if ((i2 == 1) != (fxn > kg)) {
            float f = fxn + kg;
            kg = f - kg;
            fxn = f - kg;
        }
        if (i2 == 1) {
            fxn -= i;
        } else {
            kg -= i;
        }
        return new float[]{kg, fxn};
    }

    public static float fxn(Context context) {
        return wc.gff(context, wc.mvp(context));
    }

    public static float kg(Context context) {
        return wc.gff(context, wc.rlu(context));
    }
}
