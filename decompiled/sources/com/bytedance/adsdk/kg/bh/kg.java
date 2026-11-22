package com.bytedance.adsdk.kg.bh;

/* loaded from: classes13.dex */
public class kg {
    private static float fxn(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float kg(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int fxn(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float kg = kg(((i >> 16) & 255) / 255.0f);
        float kg2 = kg(((i >> 8) & 255) / 255.0f);
        float kg3 = kg((i & 255) / 255.0f);
        float kg4 = kg(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float kg5 = kg2 + ((kg(((i2 >> 8) & 255) / 255.0f) - kg2) * f);
        float kg6 = kg3 + (f * (kg((i2 & 255) / 255.0f) - kg3));
        return (Math.round(fxn(kg + ((kg4 - kg) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(fxn(kg5) * 255.0f) << 8) | Math.round(fxn(kg6) * 255.0f);
    }
}
