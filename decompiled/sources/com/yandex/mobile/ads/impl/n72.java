package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.ts.TsExtractor;
import java.io.IOException;

/* loaded from: classes5.dex */
final class n72 {
    private boolean d;
    private boolean e;
    private boolean f;

    /* renamed from: a, reason: collision with root package name */
    private final int f16314a = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;
    private final p52 b = new p52(0);
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private final ag1 c = new ag1();

    n72() {
    }

    public final boolean c() {
        return this.d;
    }

    public final long a() {
        return this.i;
    }

    public final int a(wz wzVar, pj1 pj1Var, int i) throws IOException {
        if (i <= 0) {
            this.c.a(f92.f);
            this.d = true;
            wzVar.c();
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f) {
            long b = wzVar.b();
            int min = (int) Math.min(this.f16314a, b);
            long j2 = b - min;
            if (wzVar.a() != j2) {
                pj1Var.f16573a = j2;
                return 1;
            }
            this.c.c(min);
            wzVar.c();
            wzVar.b(this.c.c(), 0, min, false);
            ag1 ag1Var = this.c;
            int d = ag1Var.d();
            int e = ag1Var.e();
            int i2 = e - 188;
            while (true) {
                if (i2 < d) {
                    break;
                }
                byte[] c = ag1Var.c();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < d || i5 >= e || c[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long a2 = q72.a(i2, i, ag1Var);
                            if (a2 != -9223372036854775807L) {
                                j = a2;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.h = j;
            this.f = true;
            return 0;
        }
        if (this.h == -9223372036854775807L) {
            this.c.a(f92.f);
            this.d = true;
            wzVar.c();
            return 0;
        }
        if (!this.e) {
            int min2 = (int) Math.min(this.f16314a, wzVar.b());
            long j3 = 0;
            if (wzVar.a() != j3) {
                pj1Var.f16573a = j3;
                return 1;
            }
            this.c.c(min2);
            wzVar.c();
            wzVar.b(this.c.c(), 0, min2, false);
            ag1 ag1Var2 = this.c;
            int d2 = ag1Var2.d();
            int e2 = ag1Var2.e();
            while (true) {
                if (d2 >= e2) {
                    break;
                }
                if (ag1Var2.c()[d2] == 71) {
                    long a3 = q72.a(d2, i, ag1Var2);
                    if (a3 != -9223372036854775807L) {
                        j = a3;
                        break;
                    }
                }
                d2++;
            }
            this.g = j;
            this.e = true;
            return 0;
        }
        long j4 = this.g;
        if (j4 == -9223372036854775807L) {
            this.c.a(f92.f);
            this.d = true;
            wzVar.c();
            return 0;
        }
        long b2 = this.b.b(this.h) - this.b.b(j4);
        this.i = b2;
        if (b2 < 0) {
            et0.d("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = -9223372036854775807L;
        }
        this.c.a(f92.f);
        this.d = true;
        wzVar.c();
        return 0;
    }

    public final p52 b() {
        return this.b;
    }
}
