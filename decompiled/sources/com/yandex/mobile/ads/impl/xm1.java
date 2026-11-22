package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes5.dex */
final class xm1 {
    private boolean c;
    private boolean d;
    private boolean e;

    /* renamed from: a, reason: collision with root package name */
    private final p52 f17350a = new p52(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final ag1 b = new ag1();

    xm1() {
    }

    public final boolean c() {
        return this.c;
    }

    public final p52 b() {
        return this.f17350a;
    }

    public final long a() {
        return this.h;
    }

    public final int a(wz wzVar, pj1 pj1Var) throws IOException {
        long j = -9223372036854775807L;
        if (!this.e) {
            long b = wzVar.b();
            int min = (int) Math.min(20000L, b);
            long j2 = b - min;
            if (wzVar.a() != j2) {
                pj1Var.f16573a = j2;
                return 1;
            }
            this.b.c(min);
            wzVar.c();
            wzVar.b(this.b.c(), 0, min, false);
            ag1 ag1Var = this.b;
            int d = ag1Var.d();
            int e = ag1Var.e() - 4;
            while (true) {
                if (e < d) {
                    break;
                }
                byte[] c = ag1Var.c();
                if (((c[e + 3] & 255) | ((c[e] & 255) << 24) | ((c[e + 1] & 255) << 16) | ((c[e + 2] & 255) << 8)) == 442) {
                    ag1Var.e(e + 4);
                    long a2 = a(ag1Var);
                    if (a2 != -9223372036854775807L) {
                        j = a2;
                        break;
                    }
                }
                e--;
            }
            this.g = j;
            this.e = true;
            return 0;
        }
        if (this.g == -9223372036854775807L) {
            this.b.a(f92.f);
            this.c = true;
            wzVar.c();
            return 0;
        }
        if (!this.d) {
            int min2 = (int) Math.min(20000L, wzVar.b());
            long j3 = 0;
            if (wzVar.a() != j3) {
                pj1Var.f16573a = j3;
                return 1;
            }
            this.b.c(min2);
            wzVar.c();
            wzVar.b(this.b.c(), 0, min2, false);
            ag1 ag1Var2 = this.b;
            int d2 = ag1Var2.d();
            int e2 = ag1Var2.e();
            while (true) {
                if (d2 >= e2 - 3) {
                    break;
                }
                byte[] c2 = ag1Var2.c();
                int i = d2 + 1;
                if (((c2[d2 + 3] & 255) | ((c2[d2] & 255) << 24) | ((c2[i] & 255) << 16) | ((c2[d2 + 2] & 255) << 8)) == 442) {
                    ag1Var2.e(d2 + 4);
                    long a3 = a(ag1Var2);
                    if (a3 != -9223372036854775807L) {
                        j = a3;
                        break;
                    }
                }
                d2 = i;
            }
            this.f = j;
            this.d = true;
            return 0;
        }
        long j4 = this.f;
        if (j4 == -9223372036854775807L) {
            this.b.a(f92.f);
            this.c = true;
            wzVar.c();
            return 0;
        }
        long b2 = this.f17350a.b(this.g) - this.f17350a.b(j4);
        this.h = b2;
        if (b2 < 0) {
            et0.d("PsDurationReader", "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = -9223372036854775807L;
        }
        this.b.a(f92.f);
        this.c = true;
        wzVar.c();
        return 0;
    }

    public static long a(ag1 ag1Var) {
        int d = ag1Var.d();
        if (ag1Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ag1Var.a(bArr, 0, 9);
        ag1Var.e(d);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
