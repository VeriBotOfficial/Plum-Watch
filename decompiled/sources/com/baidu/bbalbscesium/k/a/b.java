package com.baidu.bbalbscesium.k.a;

import java.lang.reflect.Array;
import java.security.InvalidKeyException;

/* loaded from: classes12.dex */
public final class b implements a {
    private static int[] h;
    private static int[] i;
    private static final byte[] j = new byte[256];
    private static final byte[] k = new byte[256];
    private static final int[] l = new int[256];
    private static final int[] m = new int[256];
    private static final int[] n = new int[256];
    private static final int[] o = new int[256];
    private static final int[] p = new int[256];

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f7418q = new int[256];
    private static final int[] r = new int[256];
    private static final int[] s = new int[256];
    private static final int[] t = new int[256];
    private static final int[] u = new int[256];
    private static final int[] v = new int[256];
    private static final int[] w = new int[256];
    private static final byte[] x = new byte[30];
    private boolean c = false;
    private boolean d = false;
    private Object[] e = null;
    private int[] f = null;
    private int g = 0;

    static {
        byte b;
        int[] iArr = new int[256];
        h = iArr;
        i = new int[256];
        byte b2 = 0;
        byte b3 = 1;
        iArr[0] = 1;
        for (int i2 = 1; i2 < 256; i2++) {
            int[] iArr2 = h;
            int i3 = iArr2[i2 - 1];
            int i4 = i3 ^ (i3 << 1);
            if ((i4 & 256) != 0) {
                i4 ^= 283;
            }
            iArr2[i2] = i4;
        }
        for (int i5 = 1; i5 < 255; i5++) {
            i[h[i5]] = i5;
        }
        byte[][] bArr = {new byte[]{1, 1, 1, 1, 1, 0, 0, 0}, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, new byte[]{0, 0, 1, 1, 1, 1, 1, 0}, new byte[]{0, 0, 0, 1, 1, 1, 1, 1}, new byte[]{1, 0, 0, 0, 1, 1, 1, 1}, new byte[]{1, 1, 0, 0, 0, 1, 1, 1}, new byte[]{1, 1, 1, 0, 0, 0, 1, 1}, new byte[]{1, 1, 1, 1, 0, 0, 0, 1}};
        byte[] bArr2 = {0, 1, 1, 0, 0, 0, 1, 1};
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 8);
        bArr3[1][7] = 1;
        for (int i6 = 2; i6 < 256; i6++) {
            int i7 = h[255 - i[i6]];
            for (int i8 = 0; i8 < 8; i8++) {
                bArr3[i6][i8] = (byte) ((i7 >>> (7 - i8)) & 1);
            }
        }
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 8);
        int i9 = 0;
        while (i9 < 256) {
            int i10 = b2;
            byte b4 = b2;
            while (i10 < 8) {
                bArr4[i9][i10] = bArr2[i10];
                int i11 = b4;
                byte b5 = b4;
                while (i11 < 8) {
                    byte[] bArr5 = bArr4[i9];
                    bArr5[i10] = (byte) (bArr5[i10] ^ (bArr[i10][i11] * bArr3[i9][i11]));
                    i11++;
                    b5 = b5;
                }
                i10++;
                b4 = b5;
            }
            i9++;
            b2 = b4;
        }
        byte b6 = b2;
        for (int i12 = b2; i12 < 256; i12++) {
            j[i12] = (byte) (bArr4[i12][b6] << 7);
            for (int i13 = 1; i13 < 8; i13++) {
                byte[] bArr6 = j;
                bArr6[i12] = (byte) (bArr6[i12] ^ (bArr4[i12][i13] << (7 - i13)));
            }
            k[j[i12] & 255] = (byte) i12;
        }
        byte[][] bArr7 = {new byte[]{2, 1, 1, 3}, new byte[]{3, 2, 1, 1}, new byte[]{1, 3, 2, 1}, new byte[]{1, 1, 3, 2}};
        int[] iArr3 = new int[2];
        iArr3[1] = 8;
        iArr3[b6] = 4;
        byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr3);
        for (int i14 = b6; i14 < 4; i14++) {
            for (int i15 = b6; i15 < 4; i15++) {
                bArr8[i14][i15] = bArr7[i14][i15];
            }
            bArr8[i14][i14 + 4] = 1;
        }
        int[] iArr4 = new int[2];
        iArr4[1] = 4;
        iArr4[b6] = 4;
        byte[][] bArr9 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr4);
        int i16 = b6;
        while (i16 < 4) {
            byte b7 = bArr8[i16][i16];
            if (b7 == 0) {
                int i17 = i16 + 1;
                while (bArr8[i17][i16] == 0 && i17 < 4) {
                    i17++;
                }
                if (i17 == 4) {
                    throw new RuntimeException("G matrix is not invertible");
                }
                for (int i18 = b6; i18 < 8; i18++) {
                    byte[] bArr10 = bArr8[i16];
                    byte b8 = bArr10[i18];
                    byte[] bArr11 = bArr8[i17];
                    bArr10[i18] = bArr11[i18];
                    bArr11[i18] = b8;
                }
                b7 = bArr8[i16][i16];
            }
            int i19 = b6;
            while (i19 < 8) {
                byte[] bArr12 = bArr8[i16];
                byte b9 = bArr12[i19];
                if (b9 != 0) {
                    int[] iArr5 = h;
                    int[] iArr6 = i;
                    b = b3;
                    bArr12[i19] = (byte) iArr5[((iArr6[b9 & 255] + 255) - iArr6[b7 & 255]) % 255];
                } else {
                    b = b3;
                }
                i19++;
                b3 = b;
            }
            byte b10 = b3;
            for (int i20 = b6; i20 < 4; i20++) {
                if (i16 != i20) {
                    for (int i21 = i16 + 1; i21 < 8; i21++) {
                        byte[] bArr13 = bArr8[i20];
                        bArr13[i21] = (byte) (bArr13[i21] ^ a(bArr8[i16][i21], bArr13[i16]));
                    }
                    bArr8[i20][i16] = b6;
                }
            }
            i16++;
            b3 = b10;
        }
        byte b11 = b3;
        for (int i22 = b6; i22 < 4; i22++) {
            for (int i23 = b6; i23 < 4; i23++) {
                bArr9[i22][i23] = bArr8[i22][i23 + 4];
            }
        }
        for (int i24 = b6; i24 < 256; i24++) {
            byte b12 = j[i24];
            l[i24] = a(b12, bArr7[b6]);
            m[i24] = a(b12, bArr7[b11]);
            n[i24] = a(b12, bArr7[2]);
            o[i24] = a(b12, bArr7[3]);
            byte b13 = k[i24];
            p[i24] = a(b13, bArr9[b6]);
            f7418q[i24] = a(b13, bArr9[b11]);
            r[i24] = a(b13, bArr9[2]);
            s[i24] = a(b13, bArr9[3]);
            t[i24] = a(i24, bArr9[b6]);
            u[i24] = a(i24, bArr9[b11]);
            v[i24] = a(i24, bArr9[2]);
            w[i24] = a(i24, bArr9[3]);
        }
        x[b6] = b11;
        int i25 = b11;
        for (int i26 = i25; i26 < 30; i26++) {
            i25 = a(2, i25);
            x[i26] = (byte) i25;
        }
        i = null;
        h = null;
    }

    private static int a(int i2) {
        return (i2 >> 2) + 6;
    }

    private static final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = h;
        int[] iArr2 = i;
        return iArr[(iArr2[i2 & 255] + iArr2[i3 & 255]) % 255];
    }

    private static final int a(int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        int[] iArr = i;
        int i3 = iArr[i2 & 255];
        byte b = bArr[0];
        int i4 = b != 0 ? h[(iArr[b & 255] + i3) % 255] & 255 : 0;
        byte b2 = bArr[1];
        int i5 = b2 != 0 ? h[(iArr[b2 & 255] + i3) % 255] & 255 : 0;
        byte b3 = bArr[2];
        int i6 = b3 != 0 ? h[(iArr[b3 & 255] + i3) % 255] & 255 : 0;
        byte b4 = bArr[3];
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | (b4 != 0 ? h[(i3 + iArr[b4 & 255]) % 255] & 255 : 0);
    }

    private void a(boolean z) {
        int[][] iArr = (int[][]) this.e[z ? 1 : 0];
        int length = iArr.length;
        this.f = new int[length * 4];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                this.f[(i2 * 4) + i3] = iArr[i2][i3];
            }
        }
        if (z) {
            int[] iArr2 = this.f;
            int i4 = iArr2[iArr2.length - 4];
            int i5 = iArr2[iArr2.length - 3];
            int i6 = iArr2[iArr2.length - 2];
            int i7 = iArr2[iArr2.length - 1];
            for (int length2 = iArr2.length - 1; length2 > 3; length2--) {
                int[] iArr3 = this.f;
                iArr3[length2] = iArr3[length2 - 4];
            }
            int[] iArr4 = this.f;
            iArr4[0] = i4;
            iArr4[1] = i5;
            iArr4[2] = i6;
            iArr4[3] = i7;
        }
        this.c = length >= 13;
        this.d = length == 15;
        this.g = (length - 1) * 4;
    }

    private static Object[] a(byte[] bArr) throws InvalidKeyException {
        int i2;
        if (bArr == null) {
            throw new InvalidKeyException("Empty key");
        }
        if (!b(bArr.length)) {
            throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
        }
        int a2 = a(bArr.length);
        int i3 = a2 + 1;
        int i4 = i3 * 4;
        int i5 = 1;
        int i6 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, 4);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, 4);
        int length = bArr.length / 4;
        int[] iArr3 = new int[length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            iArr3[i7] = ((bArr[i8 + 2] & 255) << 8) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | (bArr[i8 + 3] & 255);
            i7++;
            i8 += 4;
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < length && i10 < i4) {
            int i11 = i10 / 4;
            int i12 = i10 % 4;
            iArr[i11][i12] = iArr3[i9];
            iArr2[a2 - i11][i12] = iArr3[i9];
            i9++;
            i10++;
        }
        int i13 = 0;
        while (i10 < i4) {
            int i14 = iArr3[length - 1];
            int i15 = iArr3[i6];
            byte[] bArr2 = j;
            int i16 = i5;
            int i17 = ((((bArr2[(i14 >>> 8) & 255] & 255) << 16) ^ (bArr2[(i14 >>> 16) & 255] << 24)) ^ ((bArr2[i14 & 255] & 255) << 8)) ^ (bArr2[i14 >>> 24] & 255);
            int i18 = i13 + 1;
            iArr3[i6] = ((x[i13] << 24) ^ i17) ^ i15;
            int i19 = i6;
            int i20 = i16;
            if (length != 8) {
                while (i20 < length) {
                    iArr3[i20] = iArr3[i20] ^ iArr3[i19];
                    i20++;
                    i19++;
                }
            } else {
                while (true) {
                    i2 = length / 2;
                    if (i20 >= i2) {
                        break;
                    }
                    iArr3[i20] = iArr3[i20] ^ iArr3[i19];
                    i20++;
                    i19++;
                }
                int i21 = iArr3[i2 - 1];
                int i22 = iArr3[i2];
                byte[] bArr3 = j;
                iArr3[i2] = ((bArr3[i21 >>> 24] << 24) ^ ((((bArr3[(i21 >>> 8) & 255] & 255) << 8) ^ (bArr3[i21 & 255] & 255)) ^ ((bArr3[(i21 >>> 16) & 255] & 255) << 16))) ^ i22;
                int i23 = i2 + 1;
                while (i23 < length) {
                    iArr3[i23] = iArr3[i23] ^ iArr3[i2];
                    i23++;
                    i2++;
                }
            }
            int i24 = 0;
            while (i24 < length && i10 < i4) {
                int i25 = i10 / 4;
                int i26 = i10 % 4;
                iArr[i25][i26] = iArr3[i24];
                iArr2[a2 - i25][i26] = iArr3[i24];
                i24++;
                i10++;
            }
            i13 = i18;
            i5 = i16;
            i6 = 0;
        }
        while (i5 < a2) {
            for (int i27 = 0; i27 < 4; i27++) {
                int[] iArr4 = iArr2[i5];
                int i28 = iArr4[i27];
                iArr4[i27] = w[i28 & 255] ^ ((t[(i28 >>> 24) & 255] ^ u[(i28 >>> 16) & 255]) ^ v[(i28 >>> 8) & 255]);
            }
            i5++;
        }
        return new Object[]{iArr, iArr2};
    }

    static final boolean b(int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = a.b;
            if (i3 >= iArr.length) {
                return false;
            }
            if (i2 == iArr[i3]) {
                return true;
            }
            i3++;
        }
    }

    int a() {
        return 16;
    }

    void a(boolean z, String str, byte[] bArr) throws InvalidKeyException {
        if (!b(bArr.length)) {
            throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
        }
        this.e = a(bArr);
        a(z);
    }

    void a(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | (bArr[i2] << 24) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
        int[] iArr = this.f;
        int i6 = i5 ^ iArr[4];
        int i7 = ((((bArr[i2 + 4] << 24) | ((bArr[i2 + 5] & 255) << 16)) | ((bArr[i2 + 6] & 255) << 8)) | (bArr[i2 + 7] & 255)) ^ iArr[5];
        int i8 = (((((bArr[i2 + 9] & 255) << 16) | (bArr[i2 + 8] << 24)) | ((bArr[i2 + 10] & 255) << 8)) | (bArr[i2 + 11] & 255)) ^ iArr[6];
        int i9 = (((((bArr[i2 + 13] & 255) << 16) | (bArr[i2 + 12] << 24)) | ((bArr[i2 + 14] & 255) << 8)) | (bArr[i2 + 15] & 255)) ^ iArr[7];
        if (this.c) {
            int[] iArr2 = p;
            int i10 = iArr2[i6 >>> 24];
            int[] iArr3 = f7418q;
            int i11 = i10 ^ iArr3[(i9 >>> 16) & 255];
            int[] iArr4 = r;
            int i12 = i11 ^ iArr4[(i8 >>> 8) & 255];
            int[] iArr5 = s;
            int i13 = (i12 ^ iArr5[i7 & 255]) ^ iArr[8];
            int i14 = (((iArr3[(i6 >>> 16) & 255] ^ iArr2[i7 >>> 24]) ^ iArr4[(i9 >>> 8) & 255]) ^ iArr5[i8 & 255]) ^ iArr[9];
            int i15 = (((iArr3[(i7 >>> 16) & 255] ^ iArr2[i8 >>> 24]) ^ iArr4[(i6 >>> 8) & 255]) ^ iArr5[i9 & 255]) ^ iArr[10];
            int i16 = (iArr5[i6 & 255] ^ (iArr4[(i7 >>> 8) & 255] ^ (iArr3[(i8 >>> 16) & 255] ^ iArr2[i9 >>> 24]))) ^ iArr[11];
            int i17 = (((iArr2[i13 >>> 24] ^ iArr3[(i16 >>> 16) & 255]) ^ iArr4[(i15 >>> 8) & 255]) ^ iArr5[i14 & 255]) ^ iArr[12];
            int i18 = (((iArr2[i14 >>> 24] ^ iArr3[(i13 >>> 16) & 255]) ^ iArr4[(i16 >>> 8) & 255]) ^ iArr5[i15 & 255]) ^ iArr[13];
            int i19 = (((iArr2[i15 >>> 24] ^ iArr3[(i14 >>> 16) & 255]) ^ iArr4[(i13 >>> 8) & 255]) ^ iArr5[i16 & 255]) ^ iArr[14];
            int i20 = (((iArr2[i16 >>> 24] ^ iArr3[(i15 >>> 16) & 255]) ^ iArr4[(i14 >>> 8) & 255]) ^ iArr5[i13 & 255]) ^ iArr[15];
            if (this.d) {
                int i21 = (((iArr2[i17 >>> 24] ^ iArr3[(i20 >>> 16) & 255]) ^ iArr4[(i19 >>> 8) & 255]) ^ iArr5[i18 & 255]) ^ iArr[16];
                int i22 = (((iArr2[i18 >>> 24] ^ iArr3[(i17 >>> 16) & 255]) ^ iArr4[(i20 >>> 8) & 255]) ^ iArr5[i19 & 255]) ^ iArr[17];
                int i23 = (((iArr2[i19 >>> 24] ^ iArr3[(i18 >>> 16) & 255]) ^ iArr4[(i17 >>> 8) & 255]) ^ iArr5[i20 & 255]) ^ iArr[18];
                int i24 = (((iArr2[i20 >>> 24] ^ iArr3[(i19 >>> 16) & 255]) ^ iArr4[(i18 >>> 8) & 255]) ^ iArr5[i17 & 255]) ^ iArr[19];
                int i25 = (((iArr2[i21 >>> 24] ^ iArr3[(i24 >>> 16) & 255]) ^ iArr4[(i23 >>> 8) & 255]) ^ iArr5[i22 & 255]) ^ iArr[20];
                int i26 = (((iArr2[i22 >>> 24] ^ iArr3[(i21 >>> 16) & 255]) ^ iArr4[(i24 >>> 8) & 255]) ^ iArr5[i23 & 255]) ^ iArr[21];
                int i27 = (((iArr2[i23 >>> 24] ^ iArr3[(i22 >>> 16) & 255]) ^ iArr4[(i21 >>> 8) & 255]) ^ iArr5[i24 & 255]) ^ iArr[22];
                i9 = (((iArr2[i24 >>> 24] ^ iArr3[(i23 >>> 16) & 255]) ^ iArr4[(i22 >>> 8) & 255]) ^ iArr5[i21 & 255]) ^ iArr[23];
                i6 = i25;
                i7 = i26;
                i8 = i27;
                i4 = 24;
            } else {
                i9 = i20;
                i6 = i17;
                i7 = i18;
                i8 = i19;
                i4 = 16;
            }
        } else {
            i4 = 8;
        }
        int[] iArr6 = p;
        int i28 = iArr6[i6 >>> 24];
        int[] iArr7 = f7418q;
        int i29 = i28 ^ iArr7[(i9 >>> 16) & 255];
        int[] iArr8 = r;
        int i30 = i29 ^ iArr8[(i8 >>> 8) & 255];
        int[] iArr9 = s;
        int i31 = (i30 ^ iArr9[i7 & 255]) ^ iArr[i4];
        int i32 = (((iArr7[(i6 >>> 16) & 255] ^ iArr6[i7 >>> 24]) ^ iArr8[(i9 >>> 8) & 255]) ^ iArr9[i8 & 255]) ^ iArr[i4 + 1];
        int i33 = (((iArr7[(i7 >>> 16) & 255] ^ iArr6[i8 >>> 24]) ^ iArr8[(i6 >>> 8) & 255]) ^ iArr9[i9 & 255]) ^ iArr[i4 + 2];
        int i34 = (iArr9[i6 & 255] ^ (iArr8[(i7 >>> 8) & 255] ^ (iArr7[(i8 >>> 16) & 255] ^ iArr6[i9 >>> 24]))) ^ iArr[i4 + 3];
        int i35 = iArr[i4 + 4] ^ (((iArr6[i31 >>> 24] ^ iArr7[(i34 >>> 16) & 255]) ^ iArr8[(i33 >>> 8) & 255]) ^ iArr9[i32 & 255]);
        int i36 = (((iArr6[i32 >>> 24] ^ iArr7[(i31 >>> 16) & 255]) ^ iArr8[(i34 >>> 8) & 255]) ^ iArr9[i33 & 255]) ^ iArr[i4 + 5];
        int i37 = (((iArr6[i33 >>> 24] ^ iArr7[(i32 >>> 16) & 255]) ^ iArr8[(i31 >>> 8) & 255]) ^ iArr9[i34 & 255]) ^ iArr[i4 + 6];
        int i38 = (((iArr6[i34 >>> 24] ^ iArr7[(i33 >>> 16) & 255]) ^ iArr8[(i32 >>> 8) & 255]) ^ iArr9[i31 & 255]) ^ iArr[i4 + 7];
        int i39 = iArr[i4 + 8] ^ (((iArr6[i35 >>> 24] ^ iArr7[(i38 >>> 16) & 255]) ^ iArr8[(i37 >>> 8) & 255]) ^ iArr9[i36 & 255]);
        int i40 = (((iArr6[i36 >>> 24] ^ iArr7[(i35 >>> 16) & 255]) ^ iArr8[(i38 >>> 8) & 255]) ^ iArr9[i37 & 255]) ^ iArr[i4 + 9];
        int i41 = (((iArr6[i37 >>> 24] ^ iArr7[(i36 >>> 16) & 255]) ^ iArr8[(i35 >>> 8) & 255]) ^ iArr9[i38 & 255]) ^ iArr[i4 + 10];
        int i42 = (((iArr6[i38 >>> 24] ^ iArr7[(i37 >>> 16) & 255]) ^ iArr8[(i36 >>> 8) & 255]) ^ iArr9[i35 & 255]) ^ iArr[i4 + 11];
        int i43 = iArr[i4 + 12] ^ (((iArr6[i39 >>> 24] ^ iArr7[(i42 >>> 16) & 255]) ^ iArr8[(i41 >>> 8) & 255]) ^ iArr9[i40 & 255]);
        int i44 = (((iArr6[i40 >>> 24] ^ iArr7[(i39 >>> 16) & 255]) ^ iArr8[(i42 >>> 8) & 255]) ^ iArr9[i41 & 255]) ^ iArr[i4 + 13];
        int i45 = (((iArr6[i41 >>> 24] ^ iArr7[(i40 >>> 16) & 255]) ^ iArr8[(i39 >>> 8) & 255]) ^ iArr9[i42 & 255]) ^ iArr[i4 + 14];
        int i46 = (((iArr6[i42 >>> 24] ^ iArr7[(i41 >>> 16) & 255]) ^ iArr8[(i40 >>> 8) & 255]) ^ iArr9[i39 & 255]) ^ iArr[i4 + 15];
        int i47 = iArr[i4 + 16] ^ (((iArr6[i43 >>> 24] ^ iArr7[(i46 >>> 16) & 255]) ^ iArr8[(i45 >>> 8) & 255]) ^ iArr9[i44 & 255]);
        int i48 = (((iArr6[i44 >>> 24] ^ iArr7[(i43 >>> 16) & 255]) ^ iArr8[(i46 >>> 8) & 255]) ^ iArr9[i45 & 255]) ^ iArr[i4 + 17];
        int i49 = (((iArr6[i45 >>> 24] ^ iArr7[(i44 >>> 16) & 255]) ^ iArr8[(i43 >>> 8) & 255]) ^ iArr9[i46 & 255]) ^ iArr[i4 + 18];
        int i50 = (((iArr6[i46 >>> 24] ^ iArr7[(i45 >>> 16) & 255]) ^ iArr8[(i44 >>> 8) & 255]) ^ iArr9[i43 & 255]) ^ iArr[i4 + 19];
        int i51 = iArr[i4 + 20] ^ (((iArr6[i47 >>> 24] ^ iArr7[(i50 >>> 16) & 255]) ^ iArr8[(i49 >>> 8) & 255]) ^ iArr9[i48 & 255]);
        int i52 = (((iArr6[i48 >>> 24] ^ iArr7[(i47 >>> 16) & 255]) ^ iArr8[(i50 >>> 8) & 255]) ^ iArr9[i49 & 255]) ^ iArr[i4 + 21];
        int i53 = (((iArr6[i49 >>> 24] ^ iArr7[(i48 >>> 16) & 255]) ^ iArr8[(i47 >>> 8) & 255]) ^ iArr9[i50 & 255]) ^ iArr[i4 + 22];
        int i54 = (((iArr6[i50 >>> 24] ^ iArr7[(i49 >>> 16) & 255]) ^ iArr8[(i48 >>> 8) & 255]) ^ iArr9[i47 & 255]) ^ iArr[i4 + 23];
        int i55 = iArr[i4 + 24] ^ (((iArr6[i51 >>> 24] ^ iArr7[(i54 >>> 16) & 255]) ^ iArr8[(i53 >>> 8) & 255]) ^ iArr9[i52 & 255]);
        int i56 = (((iArr6[i52 >>> 24] ^ iArr7[(i51 >>> 16) & 255]) ^ iArr8[(i54 >>> 8) & 255]) ^ iArr9[i53 & 255]) ^ iArr[i4 + 25];
        int i57 = (((iArr6[i53 >>> 24] ^ iArr7[(i52 >>> 16) & 255]) ^ iArr8[(i51 >>> 8) & 255]) ^ iArr9[i54 & 255]) ^ iArr[i4 + 26];
        int i58 = (((iArr6[i54 >>> 24] ^ iArr7[(i53 >>> 16) & 255]) ^ iArr8[(i52 >>> 8) & 255]) ^ iArr9[i51 & 255]) ^ iArr[i4 + 27];
        int i59 = iArr[i4 + 28] ^ (((iArr6[i55 >>> 24] ^ iArr7[(i58 >>> 16) & 255]) ^ iArr8[(i57 >>> 8) & 255]) ^ iArr9[i56 & 255]);
        int i60 = (((iArr6[i56 >>> 24] ^ iArr7[(i55 >>> 16) & 255]) ^ iArr8[(i58 >>> 8) & 255]) ^ iArr9[i57 & 255]) ^ iArr[i4 + 29];
        int i61 = (((iArr6[i57 >>> 24] ^ iArr7[(i56 >>> 16) & 255]) ^ iArr8[(i55 >>> 8) & 255]) ^ iArr9[i58 & 255]) ^ iArr[i4 + 30];
        int i62 = (((iArr6[i58 >>> 24] ^ iArr7[(i57 >>> 16) & 255]) ^ iArr8[(i56 >>> 8) & 255]) ^ iArr9[i55 & 255]) ^ iArr[i4 + 31];
        int i63 = iArr[i4 + 32] ^ (((iArr6[i59 >>> 24] ^ iArr7[(i62 >>> 16) & 255]) ^ iArr8[(i61 >>> 8) & 255]) ^ iArr9[i60 & 255]);
        int i64 = (((iArr6[i60 >>> 24] ^ iArr7[(i59 >>> 16) & 255]) ^ iArr8[(i62 >>> 8) & 255]) ^ iArr9[i61 & 255]) ^ iArr[i4 + 33];
        int i65 = (((iArr6[i61 >>> 24] ^ iArr7[(i60 >>> 16) & 255]) ^ iArr8[(i59 >>> 8) & 255]) ^ iArr9[i62 & 255]) ^ iArr[i4 + 34];
        int i66 = (((iArr6[i62 >>> 24] ^ iArr7[(i61 >>> 16) & 255]) ^ iArr8[(i60 >>> 8) & 255]) ^ iArr9[i59 & 255]) ^ iArr[i4 + 35];
        int i67 = iArr[0];
        byte[] bArr3 = k;
        bArr2[i3] = (byte) (bArr3[i63 >>> 24] ^ (i67 >>> 24));
        bArr2[i3 + 1] = (byte) (bArr3[(i66 >>> 16) & 255] ^ (i67 >>> 16));
        bArr2[i3 + 2] = (byte) (bArr3[(i65 >>> 8) & 255] ^ (i67 >>> 8));
        bArr2[i3 + 3] = (byte) (i67 ^ bArr3[i64 & 255]);
        int i68 = iArr[1];
        bArr2[i3 + 4] = (byte) (bArr3[i64 >>> 24] ^ (i68 >>> 24));
        bArr2[i3 + 5] = (byte) (bArr3[(i63 >>> 16) & 255] ^ (i68 >>> 16));
        bArr2[i3 + 6] = (byte) (bArr3[(i66 >>> 8) & 255] ^ (i68 >>> 8));
        bArr2[i3 + 7] = (byte) (i68 ^ bArr3[i65 & 255]);
        int i69 = iArr[2];
        bArr2[i3 + 8] = (byte) (bArr3[i65 >>> 24] ^ (i69 >>> 24));
        bArr2[i3 + 9] = (byte) (bArr3[(i64 >>> 16) & 255] ^ (i69 >>> 16));
        bArr2[i3 + 10] = (byte) (bArr3[(i63 >>> 8) & 255] ^ (i69 >>> 8));
        bArr2[i3 + 11] = (byte) (i69 ^ bArr3[i66 & 255]);
        int i70 = iArr[3];
        bArr2[i3 + 12] = (byte) (bArr3[i66 >>> 24] ^ (i70 >>> 24));
        bArr2[i3 + 13] = (byte) (bArr3[(i65 >>> 16) & 255] ^ (i70 >>> 16));
        bArr2[i3 + 14] = (byte) (bArr3[(i64 >>> 8) & 255] ^ (i70 >>> 8));
        bArr2[i3 + 15] = (byte) (bArr3[i63 & 255] ^ i70);
    }

    void b(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = ((bArr[i2 + 1] & 255) << 16) | (bArr[i2] << 24) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
        int[] iArr = this.f;
        int i5 = i4 ^ iArr[0];
        int i6 = ((((bArr[i2 + 4] << 24) | ((bArr[i2 + 5] & 255) << 16)) | ((bArr[i2 + 6] & 255) << 8)) | (bArr[i2 + 7] & 255)) ^ iArr[1];
        int i7 = (((((bArr[i2 + 9] & 255) << 16) | (bArr[i2 + 8] << 24)) | ((bArr[i2 + 10] & 255) << 8)) | (bArr[i2 + 11] & 255)) ^ iArr[2];
        int i8 = ((bArr[i2 + 13] & 255) << 16) | (bArr[i2 + 12] << 24) | ((bArr[i2 + 14] & 255) << 8) | (bArr[i2 + 15] & 255);
        char c = 3;
        int i9 = iArr[3] ^ i8;
        int i10 = 4;
        while (i10 < this.g) {
            int[] iArr2 = l;
            int i11 = iArr2[i5 >>> 24];
            int[] iArr3 = m;
            int i12 = i11 ^ iArr3[(i6 >>> 16) & 255];
            int[] iArr4 = n;
            int i13 = i12 ^ iArr4[(i7 >>> 8) & 255];
            int[] iArr5 = o;
            int i14 = i13 ^ iArr5[i9 & 255];
            int[] iArr6 = this.f;
            int i15 = i14 ^ iArr6[i10];
            int i16 = iArr6[i10 + 1] ^ (((iArr2[i6 >>> 24] ^ iArr3[(i7 >>> 16) & 255]) ^ iArr4[(i9 >>> 8) & 255]) ^ iArr5[i5 & 255]);
            char c2 = c;
            int i17 = ((iArr3[(i9 >>> 16) & 255] ^ iArr2[i7 >>> 24]) ^ iArr4[(i5 >>> 8) & 255]) ^ iArr5[i6 & 255];
            int i18 = i10 + 3;
            int i19 = i17 ^ iArr6[i10 + 2];
            i10 += 4;
            i9 = iArr6[i18] ^ (((iArr3[(i5 >>> 16) & 255] ^ iArr2[i9 >>> 24]) ^ iArr4[(i6 >>> 8) & 255]) ^ iArr5[i7 & 255]);
            i7 = i19;
            i5 = i15;
            i6 = i16;
            c = c2;
        }
        int[] iArr7 = this.f;
        int i20 = iArr7[i10];
        byte[] bArr3 = j;
        bArr2[i3] = (byte) (bArr3[i5 >>> 24] ^ (i20 >>> 24));
        bArr2[i3 + 1] = (byte) (bArr3[(i6 >>> 16) & 255] ^ (i20 >>> 16));
        bArr2[i3 + 2] = (byte) (bArr3[(i7 >>> 8) & 255] ^ (i20 >>> 8));
        bArr2[i3 + 3] = (byte) (i20 ^ bArr3[i9 & 255]);
        int i21 = iArr7[i10 + 1];
        bArr2[i3 + 4] = (byte) (bArr3[i6 >>> 24] ^ (i21 >>> 24));
        bArr2[i3 + 5] = (byte) (bArr3[(i7 >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[i3 + 6] = (byte) (bArr3[(i9 >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[i3 + 7] = (byte) (i21 ^ bArr3[i5 & 255]);
        int i22 = iArr7[i10 + 2];
        bArr2[i3 + 8] = (byte) (bArr3[i7 >>> 24] ^ (i22 >>> 24));
        bArr2[i3 + 9] = (byte) (bArr3[(i9 >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[i3 + 10] = (byte) (bArr3[(i5 >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[i3 + 11] = (byte) (i22 ^ bArr3[i6 & 255]);
        int i23 = iArr7[i10 + 3];
        bArr2[i3 + 12] = (byte) (bArr3[i9 >>> 24] ^ (i23 >>> 24));
        bArr2[i3 + 13] = (byte) (bArr3[(i5 >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[i3 + 14] = (byte) (bArr3[(i6 >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[i3 + 15] = (byte) (bArr3[i7 & 255] ^ i23);
    }
}
