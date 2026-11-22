package com.anythink.basead.exoplayer.k;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2693a;
    private int b;
    private int c;

    public s() {
    }

    public s(int i) {
        this.f2693a = new byte[i];
        this.c = i;
    }

    public s(byte[] bArr) {
        this.f2693a = bArr;
        this.c = bArr.length;
    }

    public s(byte[] bArr, int i) {
        this.f2693a = bArr;
        this.c = i;
    }

    public final void a(byte[] bArr, int i) {
        this.f2693a = bArr;
        this.c = i;
        this.b = 0;
    }

    private void q() {
        this.b = 0;
        this.c = 0;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final int b() {
        return this.c;
    }

    public final void b(int i) {
        a.a(i >= 0 && i <= this.f2693a.length);
        this.c = i;
    }

    public final int c() {
        return this.b;
    }

    private int r() {
        byte[] bArr = this.f2693a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void c(int i) {
        a.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void d(int i) {
        c(this.b + i);
    }

    private void a(r rVar, int i) {
        a(rVar.f2692a, 0, i);
        rVar.a(0);
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f2693a, this.b, bArr, i, i2);
        this.b += i2;
    }

    private void a(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f2693a, this.b, i);
        this.b += i;
    }

    private int s() {
        return this.f2693a[this.b] & 255;
    }

    private char t() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int d() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int e() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    private int u() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short f() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    private short v() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int g() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    private int w() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    private int x() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    private int y() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public final long h() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    private long z() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int i() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    private int A() {
        byte[] bArr = this.f2693a;
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
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long j() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    private long B() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public final int k() {
        byte[] bArr = this.f2693a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final int l() {
        return (d() << 21) | (d() << 14) | (d() << 7) | d();
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i)));
    }

    public final long n() {
        long j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(j)));
    }

    private float D() {
        return Float.intBitsToFloat(i());
    }

    private double E() {
        return Double.longBitsToDouble(j());
    }

    public final String o() {
        String str = new String(this.f2693a, this.b, 4, Charset.forName("UTF-8"));
        this.b += 4;
        return str;
    }

    private String a(Charset charset) {
        String str = new String(this.f2693a, this.b, 4, charset);
        this.b += 4;
        return str;
    }

    public final String e(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a2 = af.a(this.f2693a, i2, (i3 >= this.c || this.f2693a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a2;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.f2693a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f2693a;
        int i2 = this.b;
        String a2 = af.a(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r0 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String F() {
        /*
            r6 = this;
            int r0 = r6.a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r6.b
        La:
            int r1 = r6.c
            if (r0 >= r1) goto L1b
            byte[] r1 = r6.f2693a
            r1 = r1[r0]
            boolean r1 = com.anythink.basead.exoplayer.k.af.a(r1)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto La
        L1b:
            int r1 = r6.b
            int r2 = r0 - r1
            r3 = 3
            if (r2 < r3) goto L3d
            byte[] r2 = r6.f2693a
            r4 = r2[r1]
            r5 = -17
            if (r4 != r5) goto L3d
            int r4 = r1 + 1
            r4 = r2[r4]
            r5 = -69
            if (r4 != r5) goto L3d
            int r4 = r1 + 2
            r2 = r2[r4]
            r4 = -65
            if (r2 != r4) goto L3d
            int r1 = r1 + r3
            r6.b = r1
        L3d:
            byte[] r1 = r6.f2693a
            int r2 = r6.b
            int r3 = r0 - r2
            java.lang.String r1 = com.anythink.basead.exoplayer.k.af.a(r1, r2, r3)
            r6.b = r0
            int r2 = r6.c
            if (r0 != r2) goto L4e
            goto L69
        L4e:
            byte[] r3 = r6.f2693a
            r4 = r3[r0]
            r5 = 13
            if (r4 != r5) goto L5d
            int r0 = r0 + 1
            r6.b = r0
            if (r0 != r2) goto L5d
            goto L69
        L5d:
            int r0 = r6.b
            r2 = r3[r0]
            r3 = 10
            if (r2 != r3) goto L69
            int r0 = r0 + 1
            r6.b = r0
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.k.s.F():java.lang.String");
    }

    private long G() {
        int i;
        int i2;
        long j = this.f2693a[this.b];
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
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j)));
        }
        for (i = 1; i < i2; i++) {
            if ((this.f2693a[this.b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j)));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public final void a(int i) {
        byte[] bArr = this.f2693a;
        if ((bArr == null ? 0 : bArr.length) < i) {
            bArr = new byte[i];
        }
        a(bArr, i);
    }

    private int C() {
        byte[] bArr = this.f2693a;
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
        int i8 = ((bArr[i6] & 255) << 24) | i7;
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i8)));
    }
}
