package com.google.android.material.math;

/* JADX INFO: loaded from: classes3.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    public static boolean geq(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    public static float lerp(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float max(float f, float f2, float f3, float f4) {
        if (f > f2 && f > f3 && f > f4) {
            return f;
        }
        if (f2 <= f3 || f2 <= f4) {
            return f3 > f4 ? f3 : f4;
        }
        return f2;
    }

    private MathUtils() {
    }

    public static float dist(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float distanceToFurthestCorner(float f, float f2, float f3, float f4, float f5, float f6) {
        return max(dist(f, f2, f3, f4), dist(f, f2, f5, f4), dist(f, f2, f5, f6), dist(f, f2, f3, f6));
    }

    public static float floorMod(float f, int r4) {
        float f2 = r4;
        int r1 = (int) (f / f2);
        if (Math.signum(f) * f2 < 0.0f && r1 * r4 != f) {
            r1--;
        }
        return f - (r1 * r4);
    }

    public static int floorMod(int r2, int r3) {
        int r0 = r2 / r3;
        if ((r2 ^ r3) < 0 && r0 * r3 != r2) {
            r0--;
        }
        return r2 - (r0 * r3);
    }
}
