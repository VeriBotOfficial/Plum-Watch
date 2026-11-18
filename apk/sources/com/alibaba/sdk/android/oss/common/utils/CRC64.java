package com.alibaba.sdk.android.oss.common.utils;

import java.lang.reflect.Array;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes7.dex */
public class CRC64 implements Checksum {
    private static final int GF2_DIM = 64;
    private static final long POLY = -3932672073523589310L;
    private static final long[][] table = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 8, 256);
    private long value = 0;

    static {
        for (int r0 = 0; r0 < 256; r0++) {
            long j = r0;
            for (int r7 = 0; r7 < 8; r7++) {
                j = (j & 1) == 1 ? (j >>> 1) ^ POLY : j >>> 1;
            }
            table[0][r0] = j;
        }
        for (int r1 = 0; r1 < 256; r1++) {
            long j2 = table[0][r1];
            for (int r5 = 1; r5 < 8; r5++) {
                long[][] jArr = table;
                j2 = (j2 >>> 8) ^ jArr[0][(int) (255 & j2)];
                jArr[r5][r1] = j2;
            }
        }
    }

    private static long gf2MatrixTimes(long[] jArr, long j) {
        int r2 = 0;
        long j2 = 0;
        while (j != 0) {
            if ((j & 1) == 1) {
                j2 ^= jArr[r2];
            }
            j >>>= 1;
            r2++;
        }
        return j2;
    }

    private static void gf2MatrixSquare(long[] jArr, long[] jArr2) {
        for (int r0 = 0; r0 < 64; r0++) {
            jArr[r0] = gf2MatrixTimes(jArr2, jArr2[r0]);
        }
    }

    public static long combine(long j, long j2, long j3) {
        if (j3 == 0) {
            return j;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j4 = 1;
        for (int r8 = 1; r8 < 64; r8++) {
            jArr2[r8] = j4;
            j4 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long jGf2MatrixTimes = j;
        long j5 = j3;
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j5 & 1) == 1) {
                jGf2MatrixTimes = gf2MatrixTimes(jArr, jGf2MatrixTimes);
            }
            long j6 = j5 >>> 1;
            if (j6 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j6 & 1) == 1) {
                jGf2MatrixTimes = gf2MatrixTimes(jArr2, jGf2MatrixTimes);
            }
            j5 >>>= 2;
        } while (j5 != 0);
        return jGf2MatrixTimes ^ j2;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.value;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.value = 0L;
    }

    @Override // java.util.zip.Checksum
    public void update(int r4) {
        update(new byte[]{(byte) (r4 & 255)}, 1);
    }

    public void update(byte[] bArr, int r3) {
        update(bArr, 0, r3);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int r18, int r19) {
        this.value = ~this.value;
        int r1 = r18;
        int r2 = r19;
        while (r2 >= 8) {
            long[][] jArr = table;
            long[] jArr2 = jArr[7];
            long j = this.value;
            this.value = ((((((jArr[6][(int) (((long) (bArr[r1 + 1] & 255)) ^ ((j >>> 8) & 255))] ^ jArr2[(int) ((j & 255) ^ ((long) (bArr[r1] & 255)))]) ^ jArr[5][(int) (((j >>> 16) & 255) ^ ((long) (bArr[r1 + 2] & 255)))]) ^ jArr[4][(int) (((j >>> 24) & 255) ^ ((long) (bArr[r1 + 3] & 255)))]) ^ jArr[3][(int) (((j >>> 32) & 255) ^ ((long) (bArr[r1 + 4] & 255)))]) ^ jArr[2][(int) (((j >>> 40) & 255) ^ ((long) (bArr[r1 + 5] & 255)))]) ^ jArr[1][(int) ((255 & (j >>> 48)) ^ ((long) (bArr[r1 + 6] & 255)))]) ^ jArr[0][(int) ((j >>> 56) ^ ((long) (bArr[r1 + 7] & 255)))];
            r1 += 8;
            r2 -= 8;
        }
        while (r2 > 0) {
            long[] jArr3 = table[0];
            long j2 = this.value;
            this.value = (j2 >>> 8) ^ jArr3[(int) ((((long) bArr[r1]) ^ j2) & 255)];
            r1++;
            r2--;
        }
        this.value = ~this.value;
    }
}
