package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes13.dex */
public class jq {
    public static long fxn(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long fxn(int i, int i2) {
        return fxn(i, i2);
    }
}
