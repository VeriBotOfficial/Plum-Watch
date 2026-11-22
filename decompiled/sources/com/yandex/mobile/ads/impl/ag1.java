package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ag1 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f15006a;
    private int b;
    private int c;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j() {
        /*
            r8 = this;
            int r0 = r8.c
            int r1 = r8.b
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = r8.c
            r2 = 13
            r3 = 10
            if (r1 >= r0) goto L1f
            byte[] r0 = r8.f15006a
            r0 = r0[r1]
            int r4 = com.yandex.mobile.ads.impl.f92.f15466a
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L9
        L1f:
            int r0 = r8.b
            int r4 = r1 - r0
            r5 = 3
            if (r4 < r5) goto L41
            byte[] r4 = r8.f15006a
            r6 = r4[r0]
            r7 = -17
            if (r6 != r7) goto L41
            int r6 = r0 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L41
            int r6 = r0 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L41
            int r0 = r0 + r5
            r8.b = r0
        L41:
            byte[] r0 = r8.f15006a
            int r4 = r8.b
            int r5 = r1 - r4
            java.lang.String r0 = com.yandex.mobile.ads.impl.f92.a(r0, r4, r5)
            r8.b = r1
            int r4 = r8.c
            if (r1 != r4) goto L52
            goto L69
        L52:
            byte[] r5 = r8.f15006a
            r6 = r5[r1]
            if (r6 != r2) goto L5f
            int r1 = r1 + 1
            r8.b = r1
            if (r1 != r4) goto L5f
            goto L69
        L5f:
            int r1 = r8.b
            r2 = r5[r1]
            if (r2 != r3) goto L69
            int r1 = r1 + 1
            r8.b = r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ag1.j():java.lang.String");
    }

    public final String q() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.f15006a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f15006a;
        int i3 = this.b;
        String a2 = f92.a(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return a2;
    }

    public ag1() {
        this.f15006a = f92.f;
    }

    public ag1(int i) {
        this.f15006a = new byte[i];
        this.c = i;
    }

    public ag1(int i, byte[] bArr) {
        this.f15006a = bArr;
        this.c = i;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void a(int i) {
        byte[] bArr = this.f15006a;
        if (i > bArr.length) {
            this.f15006a = Arrays.copyOf(bArr, i);
        }
    }

    public final int e() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public ag1(byte[] bArr) {
        this.f15006a = bArr;
        this.c = bArr.length;
    }

    public final byte[] c() {
        return this.f15006a;
    }

    public final void c(int i) {
        byte[] bArr = this.f15006a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.f15006a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final int b() {
        return this.f15006a.length;
    }

    public final int g() {
        return this.f15006a[this.b] & 255;
    }

    public final char f() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int t() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int z() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final int o() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short r() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final short m() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int w() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public final int i() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public final void d(int i) {
        if (i >= 0 && i <= this.f15006a.length) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i) {
        if (i >= 0 && i <= this.c) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final long v() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i2] & 255) | j;
    }

    public final long n() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i2] & 255) << 24) | j;
    }

    public final int h() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    public final int k() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public final long p() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.b = i + 8;
        return (bArr[i2] & 255) | j;
    }

    public final long l() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = i + 7;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        this.b = i + 8;
        return ((bArr[i2] & 255) << 56) | j;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f15006a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void a(int i, byte[] bArr) {
        this.f15006a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final int u() {
        byte[] bArr = this.f15006a;
        int i = this.b;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return i2;
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int x() {
        int h = h();
        if (h >= 0) {
            return h;
        }
        throw new IllegalStateException(oe.a("Top bit not zero: ", h));
    }

    public final long y() {
        long p = p();
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException("Top bit not zero: " + p);
    }

    public final void f(int i) {
        e(this.b + i);
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f15006a = bArr;
        this.c = length;
        this.b = 0;
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.f15006a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final long A() {
        int i;
        int i2;
        long j = this.f15006a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f15006a[this.b + i] & 192) != 128) {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
                j = (j << 6) | (r3 & 63);
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public final String b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a2 = f92.a(this.f15006a, i2, (i3 >= this.c || this.f15006a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a2;
    }
}
