package com.iflytek.cloud.util;

/* JADX INFO: loaded from: classes2.dex */
public class VolumeUtil {
    public static int computeVolume(byte[] bArr, int r14) {
        int r7;
        if (bArr == null || r14 <= 2) {
            return 0;
        }
        int r15 = r14 / 2;
        long j = 0;
        int r4 = 0;
        long j2 = 0;
        while (true) {
            r7 = (r15 * 2) - 1;
            if (r4 >= r7) {
                break;
            }
            j2 += (long) (bArr[r4] + (bArr[r4 + 1] * 256));
            r4 += 2;
        }
        long j3 = r15;
        long j4 = j2 / j3;
        for (int r16 = 0; r16 < r7; r16 += 2) {
            int r11 = (int) (((long) (bArr[r16] + (bArr[r16 + 1] * 256))) - j4);
            j += (long) ((r11 * r11) >> 9);
        }
        long j5 = j / j3;
        if (j5 < 329) {
            return 0;
        }
        if (j5 < 421) {
            return 1;
        }
        if (j5 < 543) {
            return 2;
        }
        if (j5 < 694) {
            return 3;
        }
        if (j5 < 895) {
            return 4;
        }
        if (j5 < 1146) {
            return 5;
        }
        if (j5 < 1476) {
            return 6;
        }
        if (j5 < 1890) {
            return 7;
        }
        if (j5 < 2433) {
            return 8;
        }
        if (j5 < 3118) {
            return 9;
        }
        if (j5 < 4011) {
            return 10;
        }
        if (j5 < 5142) {
            return 11;
        }
        if (j5 < 6612) {
            return 12;
        }
        if (j5 < 8478) {
            return 13;
        }
        if (j5 < 10900) {
            return 14;
        }
        if (j5 < 13982) {
            return 15;
        }
        if (j5 < 17968) {
            return 16;
        }
        if (j5 < 23054) {
            return 17;
        }
        if (j5 < 29620) {
            return 18;
        }
        if (j5 < 38014) {
            return 19;
        }
        if (j5 < 48828) {
            return 20;
        }
        if (j5 < 62654) {
            return 21;
        }
        if (j5 < 80491) {
            return 22;
        }
        if (j5 < 103294) {
            return 23;
        }
        if (j5 < 132686) {
            return 24;
        }
        if (j5 < 170366) {
            return 25;
        }
        if (j5 < 218728) {
            return 26;
        }
        return j5 < 280830 ? 27 : 30;
    }
}
