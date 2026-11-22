package com.anythink.core.common.s.a;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
final class f {
    private static final int c = 2048;
    private static final String d = "Invalid String";

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4316a;
    public int b;
    private char[] e;

    private static int f(int i) {
        if ((i >> 7) == 0) {
            return 1;
        }
        if ((i >> 14) == 0) {
            return 2;
        }
        if ((i >> 21) == 0) {
            return 3;
        }
        return (i >> 28) == 0 ? 4 : 5;
    }

    public f(int i) {
        this(new byte[i], 0);
    }

    public f(byte[] bArr) {
        this(bArr, 0);
    }

    public f(byte[] bArr, int i) {
        this.e = null;
        this.f4316a = bArr;
        this.b = i;
    }

    public final byte a() {
        byte[] bArr = this.f4316a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i];
    }

    public final void a(byte b) {
        byte[] bArr = this.f4316a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public final short b() {
        byte[] bArr = this.f4316a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    public final void a(short s) {
        byte[] bArr = this.f4316a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = (byte) s;
        this.b = i + 2;
        bArr[i2] = (byte) (s >> 8);
    }

    public final int a(int i) {
        byte[] bArr = this.f4316a;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    public final int c() {
        byte[] bArr = this.f4316a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    public final int a(com.anythink.core.common.s.a.a.a aVar) {
        return aVar != null ? aVar.d() : c();
    }

    public final void b(int i) {
        byte[] bArr = this.f4316a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.b = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.b = i5;
        bArr[i4] = (byte) (i >> 16);
        this.b = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    public final void a(int i, int i2) {
        byte[] bArr = this.f4316a;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    private int e() {
        byte[] bArr = this.f4316a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        if ((b >> 7) == 0) {
            return b;
        }
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] << 7) | (b & Byte.MAX_VALUE);
        if ((i4 >> 14) == 0) {
            return i4;
        }
        int i5 = i + 3;
        this.b = i5;
        int i6 = (i4 & 16383) | (bArr[i3] << 14);
        if ((i6 >> 21) == 0) {
            return i6;
        }
        int i7 = i + 4;
        this.b = i7;
        int i8 = (i6 & 2097151) | (bArr[i5] << 21);
        if ((i8 >> 28) == 0) {
            return i8;
        }
        this.b = i + 5;
        return (bArr[i7] << 28) | (i8 & 268435455);
    }

    private int c(int i, int i2) {
        while ((i2 & com.alipay.sdk.m.p.a.g) != 0) {
            this.f4316a[i] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i++;
        }
        int i3 = i + 1;
        this.f4316a[i] = (byte) i2;
        return i3;
    }

    private void e(int i) {
        int i2 = this.b;
        while ((i & com.alipay.sdk.m.p.a.g) != 0) {
            this.f4316a[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        this.f4316a[i2] = (byte) i;
        this.b = i2 + 1;
    }

    public final void a(int i, long j) {
        byte[] bArr = this.f4316a;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    public final void a(long j) {
        a(this.b, j);
        this.b += 8;
    }

    public final long c(int i) {
        byte[] bArr = this.f4316a;
        int i2 = i + 6;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i2] & 255) << 48) | (bArr[i + 7] << 56);
    }

    public final long d() {
        long c2 = c(this.b);
        this.b += 8;
        return c2;
    }

    public final long b(com.anythink.core.common.s.a.a.a aVar) {
        return aVar != null ? aVar.f() : d();
    }

    private float c(com.anythink.core.common.s.a.a.a aVar) {
        return Float.intBitsToFloat(a(aVar));
    }

    private double d(com.anythink.core.common.s.a.a.a aVar) {
        return Double.longBitsToDouble(b(aVar));
    }

    private byte[] g(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4316a, this.b, bArr, 0, i);
        this.b += i;
        return bArr;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f4316a, this.b, length);
            this.b += length;
        }
    }

    public final String a(com.anythink.core.common.s.a.a.a aVar, int i) {
        String str;
        if (aVar == null || i <= 0) {
            return d(i);
        }
        byte[] bArr = this.f4316a;
        int i2 = this.b;
        Arrays.copyOfRange(bArr, i2, i2 + i);
        byte[] b = aVar.b();
        if (b == null) {
            str = null;
        } else {
            str = b.length > 2048 ? new String(b, StandardCharsets.UTF_8) : a(b, 0, b.length);
        }
        this.b += i;
        return str;
    }

    public final String d(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        String str = i > 2048 ? new String(this.f4316a, this.b, i, StandardCharsets.UTF_8) : a(this.f4316a, this.b, i);
        this.b += i;
        return str;
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f4316a;
        int i = this.b;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((charAt & '?') | 128);
            } else if (charAt < 55296 || charAt > 57343) {
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((charAt & '?') | 128);
            } else {
                i2 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i3)) - 56613888;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                bArr[i + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i6 = i + 3;
                bArr[i + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i += 4;
                bArr[i6] = (byte) ((charAt2 & 63) | 128);
            }
            i2 = i3;
        }
        this.b = i;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                i2++;
            } else if (charAt < 2048) {
                i2 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i2 += 3;
            } else {
                i += 2;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    private char[] h(int i) {
        char[] cArr;
        char[] cArr2 = this.e;
        if (cArr2 == null) {
            if (i <= 256) {
                cArr = new char[256];
            } else {
                cArr = new char[2048];
            }
            this.e = cArr;
            return cArr;
        }
        if (cArr2.length >= i) {
            return cArr2;
        }
        char[] cArr3 = new char[2048];
        this.e = cArr3;
        return cArr3;
    }

    private void c(String str) {
        byte[] bArr = this.f4316a;
        int i = this.b;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((charAt & '?') | 128);
            } else if (charAt < 55296 || charAt > 57343) {
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((charAt & '?') | 128);
            } else {
                i2 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i3)) - 56613888;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                bArr[i + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i6 = i + 3;
                bArr[i + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i += 4;
                bArr[i6] = (byte) ((charAt2 & 63) | 128);
            }
            i2 = i3;
        }
        this.b = i;
    }

    final long b(int i, int i2) {
        long j = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            j ^= c(i6);
            i6 += 8;
        }
        while (i5 < (i4 << 3)) {
            j ^= (this.f4316a[i6] & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i8 = (i & 7) << 3;
        return (j >>> (64 - i8)) | (j << i8);
    }

    private byte[] b(com.anythink.core.common.s.a.a.a aVar, int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4316a, this.b, bArr, 0, i);
        this.b += i;
        return aVar != null ? aVar.b() : bArr;
    }

    final synchronized String a(byte[] bArr, int i, int i2) {
        char[] cArr;
        int i3;
        int i4;
        cArr = this.e;
        if (cArr == null) {
            if (i2 <= 256) {
                cArr = new char[256];
            } else {
                cArr = new char[2048];
            }
            this.e = cArr;
        } else if (cArr.length < i2) {
            cArr = new char[2048];
            this.e = cArr;
        }
        int i5 = i2 + i;
        i3 = 0;
        while (i < i5) {
            int i6 = i + 1;
            byte b = bArr[i];
            if (b > 0) {
                cArr[i3] = (char) b;
                i3++;
                i = i6;
            } else {
                if (b < -32) {
                    i += 2;
                    byte b2 = bArr[i6];
                    if (b < -62 || b2 > -65) {
                        throw new IllegalArgumentException(d);
                    }
                    i4 = i3 + 1;
                    cArr[i3] = (char) ((b2 & 63) | ((b & 31) << 6));
                } else if (b < -16) {
                    int i7 = i + 2;
                    byte b3 = bArr[i6];
                    i += 3;
                    byte b4 = bArr[i7];
                    if ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || b3 > -65 || b4 > -65)) {
                        throw new IllegalArgumentException(d);
                    }
                    i4 = i3 + 1;
                    cArr[i3] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b4 & 63));
                } else {
                    byte b5 = bArr[i6];
                    int i8 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    byte b7 = bArr[i8];
                    if (b5 > -65 || (((b << 28) + (b5 + BuiltinOptions.ReadVariableOptions)) >> 30) != 0 || b6 > -65 || b7 > -65) {
                        throw new IllegalArgumentException(d);
                    }
                    int i9 = ((b5 & 63) << 12) | ((b & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                    int i10 = i3 + 1;
                    cArr[i3] = (char) ((i9 >>> 10) + 55232);
                    i3 += 2;
                    cArr[i10] = (char) ((i9 & 1023) + 56320);
                }
                i3 = i4;
            }
        }
        if (i > i5) {
            throw new IllegalArgumentException(d);
        }
        return new String(cArr, 0, i3);
    }
}
