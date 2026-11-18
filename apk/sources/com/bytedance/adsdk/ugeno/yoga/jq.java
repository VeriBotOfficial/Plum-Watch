package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public class jq {
    public static long fxn(float f, float f2) {
        return ((long) Float.floatToRawIntBits(f2)) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static long fxn(int r0, int r1) {
        return fxn(r0, r1);
    }
}
