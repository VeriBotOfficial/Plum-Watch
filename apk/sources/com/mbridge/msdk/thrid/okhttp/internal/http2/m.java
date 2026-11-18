package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: compiled from: Settings.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12211a;
    private final int[] b = new int[10];

    void a() {
        this.f12211a = 0;
        Arrays.fill(this.b, 0);
    }

    int b() {
        if ((this.f12211a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    int c(int r2) {
        return (this.f12211a & 32) != 0 ? this.b[5] : r2;
    }

    boolean d(int r3) {
        return ((1 << r3) & this.f12211a) != 0;
    }

    int b(int r2) {
        return (this.f12211a & 16) != 0 ? this.b[4] : r2;
    }

    int c() {
        if ((this.f12211a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    int d() {
        return Integer.bitCount(this.f12211a);
    }

    m a(int r4, int r5) {
        if (r4 >= 0) {
            int[] r0 = this.b;
            if (r4 < r0.length) {
                this.f12211a = (1 << r4) | this.f12211a;
                r0[r4] = r5;
            }
        }
        return this;
    }

    int a(int r2) {
        return this.b[r2];
    }

    void a(m mVar) {
        for (int r0 = 0; r0 < 10; r0++) {
            if (mVar.d(r0)) {
                a(r0, mVar.a(r0));
            }
        }
    }
}
