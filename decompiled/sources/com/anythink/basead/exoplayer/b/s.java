package com.anythink.basead.exoplayer.b;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes11.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2401a = 65;
    private static final int b = 400;
    private static final int c = 4000;
    private final int d;
    private final int e;
    private final float f;
    private final float g;
    private final float h;
    private final int i;
    private final int j;
    private final int k;
    private final short[] l;
    private short[] m;
    private int n;
    private short[] o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private short[] f2402q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public s(int i, int i2, float f, float f2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = f2;
        this.h = i / i3;
        this.i = i / 400;
        int i4 = i / 65;
        this.j = i4;
        int i5 = i4 * 2;
        this.k = i5;
        this.l = new short[i5];
        this.m = new short[i5 * i2];
        this.o = new short[i5 * i2];
        this.f2402q = new short[i5 * i2];
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.e;
        int i2 = remaining / i;
        short[] a2 = a(this.m, this.n, i2);
        this.m = a2;
        shortBuffer.get(a2, this.n * this.e, ((i * i2) * 2) / 2);
        this.n += i2;
        d();
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.e, this.p);
        shortBuffer.put(this.o, 0, this.e * min);
        int i = this.p - min;
        this.p = i;
        short[] sArr = this.o;
        int i2 = this.e;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void a() {
        int i;
        int i2 = this.n;
        float f = this.f;
        float f2 = this.g;
        int i3 = this.p + ((int) ((((i2 / (f / f2)) + this.r) / (this.h * f2)) + 0.5f));
        this.m = a(this.m, i2, (this.k * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.k;
            int i5 = this.e;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.m[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.n += i * 2;
        d();
        if (this.p > i3) {
            this.p = i3;
        }
        this.n = 0;
        this.u = 0;
        this.r = 0;
    }

    public final void b() {
        this.n = 0;
        this.p = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
    }

    public final int c() {
        return this.p;
    }

    private short[] a(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.e;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private void a(int i) {
        int i2 = this.n - i;
        short[] sArr = this.m;
        int i3 = this.e;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.n = i2;
    }

    private void b(short[] sArr, int i, int i2) {
        short[] a2 = a(this.o, this.p, i2);
        this.o = a2;
        int i3 = this.e;
        System.arraycopy(sArr, i * i3, a2, this.p * i3, i3 * i2);
        this.p += i2;
    }

    private int b(int i) {
        int min = Math.min(this.k, this.u);
        b(this.m, i, min);
        this.u -= min;
        return min;
    }

    private void c(short[] sArr, int i, int i2) {
        int i3 = this.k / i2;
        int i4 = this.e;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.l[i7] = (short) (i8 / i5);
        }
    }

    private int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.e;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.x = i6 / i7;
        this.y = i8 / i5;
        return i7;
    }

    private boolean a(int i, int i2) {
        return i != 0 && this.v != 0 && i2 <= i * 3 && i * 2 > this.w * 3;
    }

    private int a(short[] sArr, int i) {
        int i2;
        int i3;
        int i4 = this.d;
        int i5 = i4 > 4000 ? i4 / 4000 : 1;
        if (this.e == 1 && i5 == 1) {
            i2 = a(sArr, i, this.i, this.j);
        } else {
            c(sArr, i, i5);
            int a2 = a(this.l, 0, this.i / i5, this.j / i5);
            if (i5 != 1) {
                int i6 = a2 * i5;
                int i7 = i5 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.i;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.j;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.e == 1) {
                    i2 = a(sArr, i, i8, i9);
                } else {
                    c(sArr, i, 1);
                    i2 = a(this.l, 0, i8, i9);
                }
            } else {
                i2 = a2;
            }
        }
        int i12 = this.x;
        int i13 = this.y;
        if (i12 == 0 || (i3 = this.v) == 0 || i13 > i12 * 3 || i12 * 2 <= this.w * 3) {
            i3 = i2;
        }
        this.w = i12;
        this.v = i2;
        return i3;
    }

    private void c(int i) {
        int i2 = this.p - i;
        short[] a2 = a(this.f2402q, this.r, i2);
        this.f2402q = a2;
        short[] sArr = this.o;
        int i3 = this.e;
        System.arraycopy(sArr, i * i3, a2, this.r * i3, i3 * i2);
        this.p = i;
        this.r += i2;
    }

    private void d(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f2402q;
        int i2 = this.e;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.r - i) * i2);
        this.r -= i;
    }

    private short b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.e];
        int i4 = this.t * i2;
        int i5 = this.s;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    private void a(float f, int i) {
        int i2;
        int i3;
        int i4;
        if (this.p == i) {
            return;
        }
        int i5 = this.d;
        int i6 = (int) (i5 / f);
        while (true) {
            if (i6 <= 16384 && i5 <= 16384) {
                break;
            }
            i6 /= 2;
            i5 /= 2;
        }
        int i7 = this.p - i;
        short[] a2 = a(this.f2402q, this.r, i7);
        this.f2402q = a2;
        short[] sArr = this.o;
        int i8 = this.e;
        System.arraycopy(sArr, i * i8, a2, this.r * i8, i8 * i7);
        this.p = i;
        this.r += i7;
        int i9 = 0;
        while (true) {
            i2 = this.r;
            if (i9 >= i2 - 1) {
                break;
            }
            while (true) {
                i3 = this.s;
                int i10 = (i3 + 1) * i6;
                i4 = this.t;
                if (i10 <= i4 * i5) {
                    break;
                }
                this.o = a(this.o, this.p, 1);
                int i11 = 0;
                while (true) {
                    int i12 = this.e;
                    if (i11 < i12) {
                        short[] sArr2 = this.o;
                        int i13 = (this.p * i12) + i11;
                        short[] sArr3 = this.f2402q;
                        int i14 = (i9 * i12) + i11;
                        short s = sArr3[i14];
                        short s2 = sArr3[i14 + i12];
                        int i15 = this.t * i5;
                        int i16 = this.s;
                        int i17 = i16 * i6;
                        int i18 = (i16 + 1) * i6;
                        int i19 = i18 - i15;
                        int i20 = i18 - i17;
                        sArr2[i13] = (short) (((s * i19) + ((i20 - i19) * s2)) / i20);
                        i11++;
                    }
                }
                this.t++;
                this.p++;
            }
            int i21 = i3 + 1;
            this.s = i21;
            if (i21 == i5) {
                this.s = 0;
                com.anythink.basead.exoplayer.k.a.b(i4 == i6);
                this.t = 0;
            }
            i9++;
        }
        int i22 = i2 - 1;
        if (i22 != 0) {
            short[] sArr4 = this.f2402q;
            int i23 = this.e;
            System.arraycopy(sArr4, i22 * i23, sArr4, 0, (i2 - i22) * i23);
            this.r -= i22;
        }
    }

    private int a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.u = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] a2 = a(this.o, this.p, i3);
        this.o = a2;
        a(i3, this.e, a2, this.p, sArr, i, sArr, i + i2);
        this.p += i3;
        return i3;
    }

    private int b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.u = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] a2 = a(this.o, this.p, i4);
        this.o = a2;
        int i5 = this.e;
        System.arraycopy(sArr, i * i5, a2, this.p * i5, i5 * i2);
        a(i3, this.e, this.o, this.p + i2, sArr, i + i2, sArr, i);
        this.p += i4;
        return i3;
    }

    private void a(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.n;
        if (i5 < this.k) {
            return;
        }
        int i6 = 0;
        do {
            int i7 = this.u;
            if (i7 <= 0) {
                short[] sArr = this.m;
                int i8 = this.d;
                int i9 = i8 > 4000 ? i8 / 4000 : 1;
                if (this.e == 1 && i9 == 1) {
                    i = a(sArr, i6, this.i, this.j);
                } else {
                    c(sArr, i6, i9);
                    int a2 = a(this.l, 0, this.i / i9, this.j / i9);
                    if (i9 != 1) {
                        int i10 = a2 * i9;
                        int i11 = i9 * 4;
                        int i12 = i10 - i11;
                        int i13 = i10 + i11;
                        int i14 = this.i;
                        if (i12 < i14) {
                            i12 = i14;
                        }
                        int i15 = this.j;
                        if (i13 > i15) {
                            i13 = i15;
                        }
                        if (this.e == 1) {
                            i = a(sArr, i6, i12, i13);
                        } else {
                            c(sArr, i6, 1);
                            i = a(this.l, 0, i12, i13);
                        }
                    } else {
                        i = a2;
                    }
                }
                int i16 = this.x;
                int i17 = (i16 == 0 || (i4 = this.v) == 0 || this.y > i16 * 3 || i16 * 2 <= this.w * 3) ? i : i4;
                this.w = i16;
                this.v = i;
                if (f > 1.0d) {
                    short[] sArr2 = this.m;
                    if (f >= 2.0f) {
                        i3 = (int) (i17 / (f - 1.0f));
                    } else {
                        this.u = (int) ((i17 * (2.0f - f)) / (f - 1.0f));
                        i3 = i17;
                    }
                    short[] a3 = a(this.o, this.p, i3);
                    this.o = a3;
                    a(i3, this.e, a3, this.p, sArr2, i6, sArr2, i6 + i17);
                    this.p += i3;
                    i6 += i17 + i3;
                } else {
                    short[] sArr3 = this.m;
                    if (f < 0.5f) {
                        i2 = (int) ((i17 * f) / (1.0f - f));
                    } else {
                        this.u = (int) ((i17 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                        i2 = i17;
                    }
                    int i18 = i17 + i2;
                    short[] a4 = a(this.o, this.p, i18);
                    this.o = a4;
                    int i19 = this.e;
                    System.arraycopy(sArr3, i6 * i19, a4, this.p * i19, i19 * i17);
                    int i20 = i6;
                    a(i2, this.e, this.o, this.p + i17, sArr3, i6 + i17, sArr3, i20);
                    i6 = i20;
                    this.p += i18;
                }
            } else {
                i2 = Math.min(this.k, i7);
                b(this.m, i6, i2);
                this.u -= i2;
            }
            i6 += i2;
        } while (this.k + i6 <= i5);
        int i21 = this.n - i6;
        short[] sArr4 = this.m;
        int i22 = this.e;
        System.arraycopy(sArr4, i6 * i22, sArr4, 0, i22 * i21);
        this.n = i21;
    }

    private void d() {
        int i = this.p;
        float f = this.f;
        float f2 = this.g;
        float f3 = f / f2;
        float f4 = this.h * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            a(f3);
        } else {
            b(this.m, 0, this.n);
            this.n = 0;
        }
        if (f4 != 1.0f) {
            a(f4, i);
        }
    }

    private static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
