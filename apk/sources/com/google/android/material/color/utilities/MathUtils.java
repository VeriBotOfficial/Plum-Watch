package com.google.android.material.color.utilities;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes3.dex */
public class MathUtils {
    public static double clampDouble(double d, double d2, double d3) {
        if (d3 < d) {
            return d;
        }
        return d3 > d2 ? d2 : d3;
    }

    public static int clampInt(int r0, int r1, int r2) {
        if (r2 < r0) {
            return r0;
        }
        return r2 > r1 ? r1 : r2;
    }

    public static double lerp(double d, double d2, double d3) {
        return ((1.0d - d3) * d) + (d3 * d2);
    }

    public static double sanitizeDegreesDouble(double d) {
        double d2 = d % 360.0d;
        return d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? d2 + 360.0d : d2;
    }

    public static int signum(double d) {
        if (d < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return -1;
        }
        return d == AudioStats.AUDIO_AMPLITUDE_NONE ? 0 : 1;
    }

    private MathUtils() {
    }

    public static int sanitizeDegreesInt(int r0) {
        int r1 = r0 % 360;
        return r1 < 0 ? r1 + 360 : r1;
    }

    public static double rotationDirection(double d, double d2) {
        return sanitizeDegreesDouble(d2 - d) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double differenceDegrees(double d, double d2) {
        return 180.0d - Math.abs(Math.abs(d - d2) - 180.0d);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = d2 + (dArr3[1] * d3);
        double d5 = dArr[2];
        double d6 = d4 + (dArr3[2] * d5);
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[0] * d) + (dArr4[1] * d3) + (dArr4[2] * d5);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }
}
