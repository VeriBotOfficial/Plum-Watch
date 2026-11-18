package com.huawei.hms.scankit.aiscan.common;

/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public final class n {
    public static float a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public static int a(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static float a(int r0, int r1, int r2, int r3) {
        int r4 = r0 - r2;
        int r5 = r1 - r3;
        return (float) Math.sqrt((r4 * r4) + (r5 * r5));
    }

    public static int a(int[] r4) {
        int r2 = 0;
        for (int r0 : r4) {
            r2 += r0;
        }
        return r2;
    }
}
