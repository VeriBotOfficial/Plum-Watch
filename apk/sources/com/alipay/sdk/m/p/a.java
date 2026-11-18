package com.alipay.sdk.m.p;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1432a = 128;
    public static final int b = 64;
    public static final int c = 24;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 4;
    public static final int g = -128;
    public static final char h = '=';
    public static final byte[] i = new byte[128];
    public static final char[] j = new char[64];

    static {
        int r1 = 0;
        for (int r2 = 0; r2 < 128; r2++) {
            i[r2] = -1;
        }
        for (int r0 = 90; r0 >= 65; r0--) {
            i[r0] = (byte) (r0 - 65);
        }
        for (int r3 = 122; r3 >= 97; r3--) {
            i[r3] = (byte) (r3 - 71);
        }
        for (int r4 = 57; r4 >= 48; r4--) {
            i[r4] = (byte) (r4 + 4);
        }
        byte[] bArr = i;
        bArr[43] = BuiltinOptions.LogicalAndOptions;
        bArr[47] = 63;
        for (int r5 = 0; r5 <= 25; r5++) {
            j[r5] = (char) (r5 + 65);
        }
        int r6 = 26;
        int r7 = 0;
        while (r6 <= 51) {
            j[r6] = (char) (r7 + 97);
            r6++;
            r7++;
        }
        int r8 = 52;
        while (r8 <= 61) {
            j[r8] = (char) (r1 + 48);
            r8++;
            r1++;
        }
        char[] cArr = j;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static boolean a(char c2) {
        return c2 < 128 && i[c2] != -1;
    }

    public static boolean b(char c2) {
        return c2 == '=';
    }

    public static boolean c(char c2) {
        return c2 == ' ' || c2 == '\r' || c2 == '\n' || c2 == '\t';
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int r2 = length % 24;
        int r0 = length / 24;
        char[] cArr = new char[(r2 != 0 ? r0 + 1 : r0) * 4];
        int r5 = 0;
        int r6 = 0;
        for (int r4 = 0; r4 < r0; r4++) {
            byte b2 = bArr[r5];
            int r9 = r5 + 2;
            byte b3 = bArr[r5 + 1];
            r5 += 3;
            byte b4 = bArr[r9];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int r12 = b2 & (-128);
            int r8 = b2 >> 2;
            if (r12 != 0) {
                r8 ^= 192;
            }
            byte b7 = (byte) r8;
            int r13 = b3 & (-128);
            int r7 = b3 >> 4;
            if (r13 != 0) {
                r7 ^= 240;
            }
            byte b8 = (byte) r7;
            int r14 = (b4 & (-128)) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252;
            char[] cArr2 = j;
            cArr[r6] = cArr2[b7];
            cArr[r6 + 1] = cArr2[b8 | (b6 << 4)];
            int r10 = r6 + 3;
            cArr[r6 + 2] = cArr2[(b5 << 2) | ((byte) r14)];
            r6 += 4;
            cArr[r10] = cArr2[b4 & 63];
        }
        if (r2 == 8) {
            byte b9 = bArr[r5];
            byte b10 = (byte) (b9 & 3);
            int r3 = b9 & (-128);
            int r15 = b9 >> 2;
            if (r3 != 0) {
                r15 ^= 192;
            }
            char[] cArr3 = j;
            cArr[r6] = cArr3[(byte) r15];
            cArr[r6 + 1] = cArr3[b10 << 4];
            cArr[r6 + 2] = h;
            cArr[r6 + 3] = h;
        } else if (r2 == 16) {
            byte b11 = bArr[r5];
            byte b12 = bArr[r5 + 1];
            byte b13 = (byte) (b12 & 15);
            byte b14 = (byte) (b11 & 3);
            int r11 = b11 & (-128);
            int r1 = b11 >> 2;
            if (r11 != 0) {
                r1 ^= 192;
            }
            byte b15 = (byte) r1;
            int r16 = b12 & (-128);
            int r17 = b12 >> 4;
            if (r16 != 0) {
                r17 ^= 240;
            }
            char[] cArr4 = j;
            cArr[r6] = cArr4[b15];
            cArr[r6 + 1] = cArr4[((byte) r17) | (b14 << 4)];
            cArr[r6 + 2] = cArr4[b13 << 2];
            cArr[r6 + 3] = h;
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int r1 = a(charArray);
        if (r1 % 4 != 0) {
            return null;
        }
        int r2 = r1 / 4;
        if (r2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[r2 * 3];
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        while (r4 < r2 - 1) {
            int r7 = r5 + 1;
            char c2 = charArray[r5];
            if (a(c2)) {
                int r9 = r5 + 2;
                char c3 = charArray[r7];
                if (a(c3)) {
                    int r10 = r5 + 3;
                    char c4 = charArray[r9];
                    if (a(c4)) {
                        r5 += 4;
                        char c5 = charArray[r10];
                        if (a(c5)) {
                            byte[] bArr2 = i;
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            byte b5 = bArr2[c5];
                            bArr[r6] = (byte) ((b2 << 2) | (b3 >> 4));
                            int r8 = r6 + 2;
                            bArr[r6 + 1] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            r6 += 3;
                            bArr[r8] = (byte) ((b4 << 6) | b5);
                            r4++;
                        }
                    }
                }
            }
            return null;
        }
        int r3 = r5 + 1;
        char c6 = charArray[r5];
        if (!a(c6)) {
            return null;
        }
        int r11 = r5 + 2;
        char c7 = charArray[r3];
        if (!a(c7)) {
            return null;
        }
        byte[] bArr3 = i;
        byte b6 = bArr3[c6];
        byte b7 = bArr3[c7];
        char c8 = charArray[r11];
        char c9 = charArray[r5 + 3];
        if (a(c8) && a(c9)) {
            byte b8 = bArr3[c8];
            byte b9 = bArr3[c9];
            bArr[r6] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[r6 + 1] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
            bArr[r6 + 2] = (byte) (b9 | (b8 << 6));
            return bArr;
        }
        if (b(c8) && b(c9)) {
            if ((b7 & 15) != 0) {
                return null;
            }
            int r12 = r4 * 3;
            byte[] bArr4 = new byte[r12 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, r12);
            bArr4[r6] = (byte) ((b6 << 2) | (b7 >> 4));
            return bArr4;
        }
        if (b(c8) || !b(c9)) {
            return null;
        }
        byte b10 = bArr3[c8];
        if ((b10 & 3) != 0) {
            return null;
        }
        int r13 = r4 * 3;
        byte[] bArr5 = new byte[r13 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, r13);
        bArr5[r6] = (byte) ((b6 << 2) | (b7 >> 4));
        bArr5[r6 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
        return bArr5;
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int r2 = 0;
        for (int r0 = 0; r0 < length; r0++) {
            if (!c(cArr[r0])) {
                cArr[r2] = cArr[r0];
                r2++;
            }
        }
        return r2;
    }
}
