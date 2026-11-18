package com.bytedance.adsdk.kg.bh;

/* JADX INFO: loaded from: classes15.dex */
public class kg {
    private static float fxn(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float kg(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int fxn(float f, int r8, int r9) {
        if (r8 == r9) {
            return r8;
        }
        float f2 = ((r8 >> 24) & 255) / 255.0f;
        float fKg = kg(((r8 >> 16) & 255) / 255.0f);
        float fKg2 = kg(((r8 >> 8) & 255) / 255.0f);
        float fKg3 = kg((r8 & 255) / 255.0f);
        float fKg4 = kg(((r9 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((r9 >> 24) & 255) / 255.0f) - f2) * f);
        float fKg5 = fKg2 + ((kg(((r9 >> 8) & 255) / 255.0f) - fKg2) * f);
        float fKg6 = fKg3 + (f * (kg((r9 & 255) / 255.0f) - fKg3));
        return (Math.round(fxn(fKg + ((fKg4 - fKg) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(fxn(fKg5) * 255.0f) << 8) | Math.round(fxn(fKg6) * 255.0f);
    }
}
