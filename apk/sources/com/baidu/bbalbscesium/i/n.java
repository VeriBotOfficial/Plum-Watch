package com.baidu.bbalbscesium.i;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes16.dex */
class n {
    private static final int g = 16;
    private static final int h = 13;
    private static final int i = -1640531535;
    private static final int j = -2048144777;
    private static final int k = -1028477379;
    private static final int l = 668265263;
    private static final int m = 374761393;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f7395a;
    private final int[] b;
    private final byte[] c;
    private final int d;
    private int e;
    private int f;

    protected n() {
        this(0);
    }

    protected n(int r2) {
        this.f7395a = new byte[1];
        this.b = new int[4];
        this.c = new byte[16];
        this.d = r2;
        b();
    }

    private static int a(byte[] bArr, int r3) {
        return (int) (b(bArr, r3, 4) & BodyPartID.bodyIdMax);
    }

    private static long b(byte[] bArr, int r8, int r9) {
        if (r9 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long j2 = 0;
        for (int r2 = 0; r2 < r9; r2++) {
            j2 |= (((long) bArr[r8 + r2]) & 255) << (r2 * 8);
        }
        return j2;
    }

    private void b() {
        int[] r0 = this.b;
        int r1 = this.d;
        r0[0] = 606290984 + r1;
        r0[1] = j + r1;
        r0[2] = r1;
        r0[3] = r1 - i;
    }

    private void b(byte[] bArr, int r14) {
        int[] r0 = this.b;
        int r2 = r0[0];
        int r4 = r0[1];
        int r6 = r0[2];
        int r1 = r0[3];
        int r3 = Integer.rotateLeft(r2 + (a(bArr, r14) * j), 13) * i;
        int r5 = Integer.rotateLeft(r4 + (a(bArr, r14 + 4) * j), 13) * i;
        int r7 = Integer.rotateLeft(r6 + (a(bArr, r14 + 8) * j), 13) * i;
        int r13 = Integer.rotateLeft(r1 + (a(bArr, r14 + 12) * j), 13) * i;
        int[] r15 = this.b;
        r15[0] = r3;
        r15[1] = r5;
        r15[2] = r7;
        r15[3] = r13;
        this.f = 0;
    }

    protected long a() {
        int r2 = 0;
        int r0 = (this.e > 16 ? Integer.rotateLeft(this.b[0], 1) + Integer.rotateLeft(this.b[1], 7) + Integer.rotateLeft(this.b[2], 12) + Integer.rotateLeft(this.b[3], 18) : this.b[2] + m) + this.e;
        int r1 = this.f - 4;
        while (r2 <= r1) {
            r0 = Integer.rotateLeft(r0 + (a(this.c, r2) * k), 17) * l;
            r2 += 4;
        }
        while (r2 < this.f) {
            r0 = Integer.rotateLeft(r0 + ((this.c[r2] & 255) * m), 11) * i;
            r2++;
        }
        int r3 = (r0 ^ (r0 >>> 15)) * j;
        int r4 = (r3 ^ (r3 >>> 13)) * k;
        return ((long) (r4 ^ (r4 >>> 16))) & BodyPartID.bodyIdMax;
    }

    protected void a(int r3) {
        byte[] bArr = this.f7395a;
        bArr[0] = (byte) (r3 & 255);
        a(bArr, 0, 1);
    }

    protected void a(byte[] bArr, int r6, int r7) {
        if (r7 <= 0) {
            return;
        }
        this.e += r7;
        int r0 = r6 + r7;
        int r1 = this.f;
        if (r1 + r7 < 16) {
            System.arraycopy(bArr, r6, this.c, r1, r7);
            this.f += r7;
            return;
        }
        if (r1 > 0) {
            int r2 = 16 - r1;
            System.arraycopy(bArr, r6, this.c, r1, r2);
            b(this.c, 0);
            r6 += r2;
        }
        int r3 = r0 - 16;
        while (r6 <= r3) {
            b(bArr, r6);
            r6 += 16;
        }
        if (r6 < r0) {
            int r4 = r0 - r6;
            this.f = r4;
            System.arraycopy(bArr, r6, this.c, 0, r4);
        }
    }

    protected void c() {
        b();
        this.e = 0;
        this.f = 0;
    }
}
