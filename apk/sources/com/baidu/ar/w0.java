package com.baidu.ar;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes16.dex */
public class w0 {
    public static double a(byte[] bArr) {
        double dAbs = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (int r2 = 0; r2 < bArr.length; r2 += 2) {
            dAbs += (double) Math.abs(a(bArr[r2], bArr[r2 + 1]));
        }
        return Math.log10(((dAbs / ((double) bArr.length)) / 2.0d) + 1.0d) * 10.0d;
    }

    public static int a(byte b, byte b2) {
        int r0 = (b & 255) + ((b2 & 255) << 8);
        return r0 >= 32768 ? r0 - 65535 : r0;
    }

    public static void a(byte[] bArr, double d) {
        for (int r0 = 0; r0 < bArr.length; r0 += 2) {
            int r2 = r0 + 1;
            int r1 = a(bArr[r0], bArr[r2]);
            int r3 = (int) (((double) r1) * d);
            if (r3 < 32767 && r3 > -32768) {
                r1 = (short) r3;
            } else if (r3 > 32767) {
                r1 = 32767;
            } else if (r3 < -32768) {
                r1 = -32768;
            }
            bArr[r0] = (byte) (r1 & 255);
            bArr[r2] = (byte) ((r1 >> 8) & 255);
        }
    }

    public static double b(byte[] bArr) {
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (int r2 = 0; r2 < bArr.length; r2 += 2) {
            int r3 = a(bArr[r2], bArr[r2 + 1]);
            d += (double) (r3 * r3);
        }
        return Math.min(5000.0d, Math.sqrt((d / ((double) bArr.length)) / 2.0d)) / 50.0d;
    }
}
