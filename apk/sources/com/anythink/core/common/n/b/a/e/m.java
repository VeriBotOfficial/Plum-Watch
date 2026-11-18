package com.anythink.core.common.n.b.a.e;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f4131a = 65535;
    static final int b = 1;
    static final int c = 2;
    static final int d = 4;
    static final int e = 5;
    static final int f = 6;
    static final int g = 7;
    static final int h = 10;
    private int i;
    private final int[] j = new int[10];

    final void a() {
        this.i = 0;
        Arrays.fill(this.j, 0);
    }

    final m a(int r4, int r5) {
        if (r4 >= 0) {
            int[] r0 = this.j;
            if (r4 < r0.length) {
                this.i = (1 << r4) | this.i;
                r0[r4] = r5;
            }
        }
        return this;
    }

    final boolean a(int r3) {
        return ((1 << r3) & this.i) != 0;
    }

    final int b(int r2) {
        return this.j[r2];
    }

    final int b() {
        return Integer.bitCount(this.i);
    }

    final int c() {
        if ((this.i & 2) != 0) {
            return this.j[1];
        }
        return -1;
    }

    private boolean a(boolean z) {
        int r4;
        if ((this.i & 4) != 0) {
            r4 = this.j[2];
        } else {
            r4 = z ? 1 : 0;
        }
        return r4 == 1;
    }

    final int d() {
        if ((this.i & 16) != 0) {
            return this.j[4];
        }
        return Integer.MAX_VALUE;
    }

    final int c(int r2) {
        return (this.i & 32) != 0 ? this.j[5] : r2;
    }

    private int d(int r2) {
        return (this.i & 64) != 0 ? this.j[6] : r2;
    }

    final int e() {
        if ((this.i & 128) != 0) {
            return this.j[7];
        }
        return 65535;
    }

    final void a(m mVar) {
        for (int r0 = 0; r0 < 10; r0++) {
            if (mVar.a(r0)) {
                a(r0, mVar.j[r0]);
            }
        }
    }
}
