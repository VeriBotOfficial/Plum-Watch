package com.baidu.bbalbscesium.i;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes12.dex */
class n {
    private static final int g = 16;
    private static final int h = 13;
    private static final int i = -1640531535;
    private static final int j = -2048144777;
    private static final int k = -1028477379;
    private static final int l = 668265263;
    private static final int m = 374761393;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7395a;
    private final int[] b;
    private final byte[] c;
    private final int d;
    private int e;
    private int f;

    protected n() {
        this(0);
    }

    protected n(int i2) {
        this.f7395a = new byte[1];
        this.b = new int[4];
        this.c = new byte[16];
        this.d = i2;
        b();
    }

    private static int a(byte[] bArr, int i2) {
        return (int) (b(bArr, i2, 4) & BodyPartID.bodyIdMax);
    }

    private static long b(byte[] bArr, int i2, int i3) {
        if (i3 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long j2 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j2 |= (bArr[i2 + i4] & 255) << (i4 * 8);
        }
        return j2;
    }

    private void b() {
        int[] iArr = this.b;
        int i2 = this.d;
        iArr[0] = 606290984 + i2;
        iArr[1] = j + i2;
        iArr[2] = i2;
        iArr[3] = i2 - i;
    }

    private void b(byte[] bArr, int i2) {
        int[] iArr = this.b;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int rotateLeft = Integer.rotateLeft(i3 + (a(bArr, i2) * j), 13) * i;
        int rotateLeft2 = Integer.rotateLeft(i4 + (a(bArr, i2 + 4) * j), 13) * i;
        int rotateLeft3 = Integer.rotateLeft(i5 + (a(bArr, i2 + 8) * j), 13) * i;
        int rotateLeft4 = Integer.rotateLeft(i6 + (a(bArr, i2 + 12) * j), 13) * i;
        int[] iArr2 = this.b;
        iArr2[0] = rotateLeft;
        iArr2[1] = rotateLeft2;
        iArr2[2] = rotateLeft3;
        iArr2[3] = rotateLeft4;
        this.f = 0;
    }

    protected long a() {
        int i2 = 0;
        int rotateLeft = (this.e > 16 ? Integer.rotateLeft(this.b[0], 1) + Integer.rotateLeft(this.b[1], 7) + Integer.rotateLeft(this.b[2], 12) + Integer.rotateLeft(this.b[3], 18) : this.b[2] + m) + this.e;
        int i3 = this.f - 4;
        while (i2 <= i3) {
            rotateLeft = Integer.rotateLeft(rotateLeft + (a(this.c, i2) * k), 17) * l;
            i2 += 4;
        }
        while (i2 < this.f) {
            rotateLeft = Integer.rotateLeft(rotateLeft + ((this.c[i2] & 255) * m), 11) * i;
            i2++;
        }
        int i4 = (rotateLeft ^ (rotateLeft >>> 15)) * j;
        int i5 = (i4 ^ (i4 >>> 13)) * k;
        return (i5 ^ (i5 >>> 16)) & BodyPartID.bodyIdMax;
    }

    protected void a(int i2) {
        byte[] bArr = this.f7395a;
        bArr[0] = (byte) (i2 & 255);
        a(bArr, 0, 1);
    }

    protected void a(byte[] bArr, int i2, int i3) {
        if (i3 <= 0) {
            return;
        }
        this.e += i3;
        int i4 = i2 + i3;
        int i5 = this.f;
        if (i5 + i3 < 16) {
            System.arraycopy(bArr, i2, this.c, i5, i3);
            this.f += i3;
            return;
        }
        if (i5 > 0) {
            int i6 = 16 - i5;
            System.arraycopy(bArr, i2, this.c, i5, i6);
            b(this.c, 0);
            i2 += i6;
        }
        int i7 = i4 - 16;
        while (i2 <= i7) {
            b(bArr, i2);
            i2 += 16;
        }
        if (i2 < i4) {
            int i8 = i4 - i2;
            this.f = i8;
            System.arraycopy(bArr, i2, this.c, 0, i8);
        }
    }

    protected void c() {
        b();
        this.e = 0;
        this.f = 0;
    }
}
