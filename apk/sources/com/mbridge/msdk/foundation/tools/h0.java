package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: SameBase64Decoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11666a;
    public static final int[] b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f11666a = charArray;
        int[] r1 = new int[256];
        b = r1;
        Arrays.fill(r1, -1);
        int length = charArray.length;
        for (int r2 = 0; r2 < length; r2++) {
            b[f11666a[r2]] = r2;
        }
        b[61] = 0;
    }

    public static String a(String str) {
        byte[] bArrB = b(str);
        return (bArrB == null || bArrB.length == 0) ? "" : new String(bArrB, StandardCharsets.UTF_8);
    }

    public static byte[] b(String str) {
        int r5;
        int r1;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int r3 = length - 1;
        int r4 = 0;
        while (r4 < r3 && b[str.charAt(r4) & 255] < 0) {
            r4++;
        }
        while (r3 > 0 && b[str.charAt(r3) & 255] < 0) {
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
            int[] r12 = b;
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
                r2 |= b[str.charAt(r4)] << (18 - (r16 * 6));
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
