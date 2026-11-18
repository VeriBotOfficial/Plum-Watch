package com.alibaba.fastjson.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class Base64 {
    public static final char[] CA;
    public static final int[] IA;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        CA = charArray;
        int[] r1 = new int[256];
        IA = r1;
        Arrays.fill(r1, -1);
        int length = charArray.length;
        for (int r2 = 0; r2 < length; r2++) {
            IA[CA[r2]] = r2;
        }
        IA[61] = 0;
    }

    public static byte[] decodeFast(char[] cArr, int r17, int r18) {
        int r5;
        int r0;
        int r1 = 0;
        if (r18 == 0) {
            return new byte[0];
        }
        int r2 = (r17 + r18) - 1;
        int r4 = r17;
        while (r4 < r2 && IA[cArr[r4]] < 0) {
            r4++;
        }
        while (r2 > 0 && IA[cArr[r2]] < 0) {
            r2--;
        }
        if (cArr[r2] == '=') {
            r5 = cArr[r2 + (-1)] == '=' ? 2 : 1;
        } else {
            r5 = 0;
        }
        int r6 = (r2 - r4) + 1;
        if (r18 > 76) {
            r0 = (cArr[76] == '\r' ? r6 / 78 : 0) << 1;
        } else {
            r0 = 0;
        }
        int r7 = (((r6 - r0) * 6) >> 3) - r5;
        byte[] bArr = new byte[r7];
        int r8 = (r7 / 3) * 3;
        int r9 = 0;
        int r10 = 0;
        while (r9 < r8) {
            int[] r11 = IA;
            int r14 = r4 + 4;
            int r12 = r11[cArr[r4 + 3]] | (r11[cArr[r4 + 1]] << 12) | (r11[cArr[r4]] << 18) | (r11[cArr[r4 + 2]] << 6);
            bArr[r9] = (byte) (r12 >> 16);
            int r13 = r9 + 2;
            bArr[r9 + 1] = (byte) (r12 >> 8);
            r9 += 3;
            bArr[r13] = (byte) r12;
            if (r0 <= 0 || (r10 = r10 + 1) != 19) {
                r4 = r14;
            } else {
                r4 += 6;
                r10 = 0;
            }
        }
        if (r9 < r7) {
            int r3 = 0;
            while (r4 <= r2 - r5) {
                r1 |= IA[cArr[r4]] << (18 - (r3 * 6));
                r3++;
                r4++;
            }
            int r15 = 16;
            while (r9 < r7) {
                bArr[r9] = (byte) (r1 >> r15);
                r15 -= 8;
                r9++;
            }
        }
        return bArr;
    }

    public static byte[] decodeFast(String str, int r18, int r19) {
        int r6;
        int r1;
        if (r19 == 0) {
            return new byte[0];
        }
        int r3 = (r18 + r19) - 1;
        int r5 = r18;
        while (r5 < r3 && IA[str.charAt(r5)] < 0) {
            r5++;
        }
        while (r3 > 0 && IA[str.charAt(r3)] < 0) {
            r3--;
        }
        if (str.charAt(r3) == '=') {
            r6 = str.charAt(r3 + (-1)) == '=' ? 2 : 1;
        } else {
            r6 = 0;
        }
        int r7 = (r3 - r5) + 1;
        if (r19 > 76) {
            r1 = (str.charAt(76) == '\r' ? r7 / 78 : 0) << 1;
        } else {
            r1 = 0;
        }
        int r8 = (((r7 - r1) * 6) >> 3) - r6;
        byte[] bArr = new byte[r8];
        int r9 = (r8 / 3) * 3;
        int r10 = 0;
        int r11 = 0;
        while (r10 < r9) {
            int[] r12 = IA;
            int r15 = r5 + 4;
            int r13 = r12[str.charAt(r5 + 3)] | (r12[str.charAt(r5 + 1)] << 12) | (r12[str.charAt(r5)] << 18) | (r12[str.charAt(r5 + 2)] << 6);
            bArr[r10] = (byte) (r13 >> 16);
            int r14 = r10 + 2;
            bArr[r10 + 1] = (byte) (r13 >> 8);
            r10 += 3;
            bArr[r14] = (byte) r13;
            if (r1 <= 0 || (r11 = r11 + 1) != 19) {
                r5 = r15;
            } else {
                r5 += 6;
                r11 = 0;
            }
        }
        if (r10 < r8) {
            int r2 = 0;
            int r16 = 0;
            while (r5 <= r3 - r6) {
                r2 |= IA[str.charAt(r5)] << (18 - (r16 * 6));
                r16++;
                r5++;
            }
            int r0 = 16;
            while (r10 < r8) {
                bArr[r10] = (byte) (r2 >> r0);
                r0 -= 8;
                r10++;
            }
        }
        return bArr;
    }

    public static byte[] decodeFast(String str) {
        int r5;
        int r1;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int r3 = length - 1;
        int r4 = 0;
        while (r4 < r3 && IA[str.charAt(r4) & 255] < 0) {
            r4++;
        }
        while (r3 > 0 && IA[str.charAt(r3) & 255] < 0) {
            r3--;
        }
        if (str.charAt(r3) == '=') {
            r5 = str.charAt(r3 + (-1)) == '=' ? 2 : 1;
        } else {
            r5 = 0;
        }
        int r6 = (r3 - r4) + 1;
        if (length > 76) {
            r1 = (str.charAt(76) == '\r' ? r6 / 78 : 0) << 1;
        } else {
            r1 = 0;
        }
        int r7 = (((r6 - r1) * 6) >> 3) - r5;
        byte[] bArr = new byte[r7];
        int r9 = (r7 / 3) * 3;
        int r10 = 0;
        int r11 = 0;
        while (r10 < r9) {
            int[] r12 = IA;
            int r15 = r4 + 4;
            int r13 = r12[str.charAt(r4 + 3)] | (r12[str.charAt(r4 + 1)] << 12) | (r12[str.charAt(r4)] << 18) | (r12[str.charAt(r4 + 2)] << 6);
            bArr[r10] = (byte) (r13 >> 16);
            int r14 = r10 + 2;
            bArr[r10 + 1] = (byte) (r13 >> 8);
            r10 += 3;
            bArr[r14] = (byte) r13;
            if (r1 <= 0 || (r11 = r11 + 1) != 19) {
                r4 = r15;
            } else {
                r4 += 6;
                r11 = 0;
            }
        }
        if (r10 < r7) {
            int r2 = 0;
            int r16 = 0;
            while (r4 <= r3 - r5) {
                r2 |= IA[str.charAt(r4)] << (18 - (r16 * 6));
                r16++;
                r4++;
            }
            int r0 = 16;
            while (r10 < r7) {
                bArr[r10] = (byte) (r2 >> r0);
                r0 -= 8;
                r10++;
            }
        }
        return bArr;
    }
}
