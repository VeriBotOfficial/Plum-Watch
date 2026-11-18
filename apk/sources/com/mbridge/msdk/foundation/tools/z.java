package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: FastBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f11687a;
    public int b;
    private char[] c;

    public z(int r2) {
        this(new byte[r2], 0);
    }

    public static int b(String str) {
        int length = str.length();
        int r1 = 0;
        int r2 = 0;
        while (r1 < length) {
            int r3 = r1 + 1;
            char cCharAt = str.charAt(r1);
            if (cCharAt < 128) {
                r2++;
            } else if (cCharAt < 2048) {
                r2 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                r2 += 3;
            } else {
                r1 += 2;
                r2 += 4;
            }
            r1 = r3;
        }
        return r2;
    }

    public static int f(int r1) {
        if ((r1 >> 7) == 0) {
            return 1;
        }
        if ((r1 >> 14) == 0) {
            return 2;
        }
        if ((r1 >> 21) == 0) {
            return 3;
        }
        return (r1 >> 28) == 0 ? 4 : 5;
    }

    public byte a() {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        this.b = r1 + 1;
        return bArr[r1];
    }

    public float c() {
        return Float.intBitsToFloat(d());
    }

    public long d(int r10) {
        byte[] bArr = this.f11687a;
        int r6 = r10 + 6;
        return (((long) bArr[r10]) & 255) | ((((long) bArr[r10 + 1]) & 255) << 8) | ((((long) bArr[r10 + 2]) & 255) << 16) | ((((long) bArr[r10 + 3]) & 255) << 24) | ((((long) bArr[r10 + 4]) & 255) << 32) | ((((long) bArr[r10 + 5]) & 255) << 40) | ((((long) bArr[r6]) & 255) << 48) | (((long) bArr[r10 + 7]) << 56);
    }

    public long e() {
        long jD = d(this.b);
        this.b += 8;
        return jD;
    }

    public short f() {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        int r2 = r1 + 1;
        int r3 = bArr[r1] & 255;
        this.b = r1 + 2;
        return (short) ((bArr[r2] << 8) | r3);
    }

    public int g() {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        int r2 = r1 + 1;
        this.b = r2;
        byte b = bArr[r1];
        if ((b >> 7) == 0) {
            return b;
        }
        int r4 = r1 + 2;
        this.b = r4;
        int r3 = (bArr[r2] << 7) | (b & 127);
        if ((r3 >> 14) == 0) {
            return r3;
        }
        int r5 = r1 + 3;
        this.b = r5;
        int r6 = (r3 & 16383) | (bArr[r4] << 14);
        if ((r6 >> 21) == 0) {
            return r6;
        }
        int r7 = r1 + 4;
        this.b = r7;
        int r8 = (r6 & 2097151) | (bArr[r5] << 21);
        if ((r8 >> 28) == 0) {
            return r8;
        }
        this.b = r1 + 5;
        return (bArr[r7] << 28) | (r8 & 268435455);
    }

    public void h(int r2) {
        this.b = c(this.b, r2);
    }

    public z(byte[] bArr, int r3) {
        this.c = null;
        this.f11687a = bArr;
        this.b = r3;
    }

    private char[] c(int r3) {
        char[] cArr = this.c;
        if (cArr == null) {
            if (r3 <= 256) {
                this.c = new char[256];
            } else {
                this.c = new char[2048];
            }
        } else if (cArr.length < r3) {
            this.c = new char[2048];
        }
        return this.c;
    }

    long a(int r10, int r11) {
        long jD = 0;
        if (r11 <= 0) {
            return 0L;
        }
        int r2 = r11 >> 3;
        int r12 = r11 & 7;
        int r3 = 0;
        int r5 = r10;
        for (int r4 = 0; r4 < r2; r4++) {
            jD ^= d(r5);
            r5 += 8;
        }
        int r13 = r12 << 3;
        while (r3 < r13) {
            jD ^= (((long) this.f11687a[r5]) & 255) << r3;
            r3 += 8;
            r5++;
        }
        int r14 = (r10 & 7) << 3;
        return (jD >>> (64 - r14)) | (jD << r14);
    }

    public int d() {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        int r2 = ((bArr[r1 + 1] & 255) << 8) | (bArr[r1] & 255);
        int r3 = r1 + 3;
        int r4 = r2 | ((bArr[r1 + 2] & 255) << 16);
        this.b = r1 + 4;
        return (bArr[r3] << 24) | r4;
    }

    public String e(int r3) {
        if (r3 < 0) {
            return null;
        }
        if (r3 == 0) {
            return "";
        }
        String strA = a(r3);
        this.b += r3;
        return strA;
    }

    public byte[] b(int r5) {
        byte[] bArr = new byte[r5];
        System.arraycopy(this.f11687a, this.b, bArr, 0, r5);
        this.b += r5;
        return bArr;
    }

    public double b() {
        return Double.longBitsToDouble(e());
    }

    public void b(int r5, int r6) {
        byte[] bArr = this.f11687a;
        bArr[r5] = (byte) r6;
        bArr[r5 + 1] = (byte) (r6 >> 8);
        bArr[r5 + 2] = (byte) (r6 >> 16);
        bArr[r5 + 3] = (byte) (r6 >> 24);
    }

    private String a(int r10) {
        if (r10 > 2048) {
            return new String(this.f11687a, this.b, r10, StandardCharsets.UTF_8);
        }
        char[] cArrC = c(r10);
        byte[] bArr = this.f11687a;
        int r2 = this.b;
        int r11 = r10 + r2;
        int r4 = 0;
        while (r2 < r11) {
            int r5 = r2 + 1;
            byte b = bArr[r2];
            if (b > 0) {
                cArrC[r4] = (char) b;
                r4++;
                r2 = r5;
            } else if (b < -32) {
                r2 += 2;
                cArrC[r4] = (char) ((bArr[r5] & 63) | ((b & 31) << 6));
                r4++;
            } else if (b < -16) {
                int r7 = r2 + 2;
                r2 += 3;
                cArrC[r4] = (char) (((bArr[r5] & 63) << 6) | ((b & 15) << 12) | (bArr[r7] & 63));
                r4++;
            } else {
                byte b2 = bArr[r5];
                int r8 = r2 + 3;
                byte b3 = bArr[r2 + 2];
                r2 += 4;
                int r6 = ((b2 & 63) << 12) | ((b & 7) << 18) | ((b3 & 63) << 6) | (bArr[r8] & 63);
                int r9 = r4 + 1;
                cArrC[r4] = (char) ((r6 >>> 10) + 55232);
                r4 += 2;
                cArrC[r9] = (char) ((r6 & 1023) + 56320);
            }
        }
        if (r2 <= r11) {
            return new String(cArrC, 0, r4);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    public void g(int r6) {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        bArr[r1] = (byte) r6;
        bArr[r1 + 1] = (byte) (r6 >> 8);
        bArr[r1 + 2] = (byte) (r6 >> 16);
        this.b = r1 + 4;
        bArr[r1 + 3] = (byte) (r6 >> 24);
    }

    public z(byte[] bArr) {
        this(bArr, 0);
    }

    public void c(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        a(str);
    }

    public int c(int r4, int r5) {
        while ((r5 & com.alipay.sdk.m.p.a.g) != 0) {
            this.f11687a[r4] = (byte) ((r5 & 127) | 128);
            r5 >>>= 7;
            r4++;
        }
        int r1 = r4 + 1;
        this.f11687a[r4] = (byte) r5;
        return r1;
    }

    public final void a(byte b) {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        this.b = r1 + 1;
        bArr[r1] = b;
    }

    public void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f11687a, this.b, length);
            this.b += length;
        }
    }

    public void a(long j) {
        a(this.b, j);
        this.b += 8;
    }

    public void a(int r6, long j) {
        byte[] bArr = this.f11687a;
        bArr[r6] = (byte) j;
        bArr[r6 + 1] = (byte) (j >> 8);
        bArr[r6 + 2] = (byte) (j >> 16);
        bArr[r6 + 3] = (byte) (j >> 24);
        bArr[r6 + 4] = (byte) (j >> 32);
        bArr[r6 + 5] = (byte) (j >> 40);
        bArr[r6 + 6] = (byte) (j >> 48);
        bArr[r6 + 7] = (byte) (j >> 56);
    }

    public void a(short s) {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        bArr[r1] = (byte) s;
        this.b = r1 + 2;
        bArr[r1 + 1] = (byte) (s >> 8);
    }

    private void a(String str) {
        byte[] bArr = this.f11687a;
        int r1 = this.b;
        int length = str.length();
        int r3 = 0;
        while (r3 < length) {
            int r4 = r3 + 1;
            char cCharAt = str.charAt(r3);
            if (cCharAt < 128) {
                bArr[r1] = (byte) cCharAt;
                r1++;
            } else if (cCharAt < 2048) {
                int r5 = r1 + 1;
                bArr[r1] = (byte) ((cCharAt >>> 6) | 192);
                r1 += 2;
                bArr[r5] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                r3 += 2;
                int r6 = ((cCharAt << '\n') + str.charAt(r4)) - 56613888;
                bArr[r1] = (byte) ((r6 >>> 18) | 240);
                bArr[r1 + 1] = (byte) (((r6 >>> 12) & 63) | 128);
                int r7 = r1 + 3;
                bArr[r1 + 2] = (byte) (((r6 >>> 6) & 63) | 128);
                r1 += 4;
                bArr[r7] = (byte) ((r6 & 63) | 128);
            } else {
                bArr[r1] = (byte) ((cCharAt >>> '\f') | 224);
                int r8 = r1 + 2;
                bArr[r1 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                r1 += 3;
                bArr[r8] = (byte) ((cCharAt & '?') | 128);
            }
            r3 = r4;
        }
        this.b = r1;
    }
}
