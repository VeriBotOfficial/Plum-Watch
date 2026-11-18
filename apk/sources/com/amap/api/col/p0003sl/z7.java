package com.amap.api.col.p0003sl;

/* JADX INFO: compiled from: XXTEA.java */
/* JADX INFO: loaded from: classes7.dex */
public class z7 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length;
        int r1 = 4 - (length % 4);
        int r3 = ((length / 4) + 1) * 4;
        byte[] bArr3 = new byte[r3];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        while (length < r3) {
            bArr3[length] = (byte) r1;
            length++;
        }
        int[] r13 = a(bArr3);
        int[] r14 = a(bArr2);
        int length2 = r13.length;
        int r2 = length2 - 1;
        if (r2 >= 1) {
            if (r14.length < 4) {
                int[] r4 = new int[4];
                System.arraycopy(r14, 0, r4, 0, r14.length);
                r14 = r4;
            }
            int r5 = r13[r2];
            int r6 = r13[0];
            int r7 = (52 / length2) + 6;
            int r0 = 0;
            while (true) {
                int r8 = r7 - 1;
                if (r7 <= 0) {
                    break;
                }
                r0 -= 1640531527;
                int r9 = (r0 >>> 2) & 3;
                int r10 = 0;
                while (r10 < r2) {
                    int r11 = r10 + 1;
                    int r12 = r13[r11];
                    r5 = ((((r5 >>> 5) ^ (r12 << 2)) + ((r12 >>> 3) ^ (r5 << 4))) ^ ((r12 ^ r0) + (r5 ^ r14[(r10 & 3) ^ r9]))) + r13[r10];
                    r13[r10] = r5;
                    r10 = r11;
                }
                int r15 = r13[0];
                r5 = ((((r5 >>> 5) ^ (r15 << 2)) + ((r15 >>> 3) ^ (r5 << 4))) ^ ((r15 ^ r0) + (r5 ^ r14[r9 ^ (r10 & 3)]))) + r13[r2];
                r13[r2] = r5;
                r7 = r8;
            }
        }
        int length3 = r13.length << 2;
        byte[] bArr4 = new byte[length3];
        for (int r16 = 0; r16 < length3; r16++) {
            bArr4[r16] = (byte) ((r13[r16 >>> 2] >>> ((r16 & 3) << 3)) & 255);
        }
        return bArr4;
    }

    private static int[] a(byte[] bArr) {
        int[] r0 = new int[bArr.length >>> 2];
        int length = bArr.length;
        for (int r2 = 0; r2 < length; r2++) {
            int r3 = r2 >>> 2;
            r0[r3] = r0[r3] | ((bArr[r2] & 255) << ((r2 & 3) << 3));
        }
        return r0;
    }
}
