package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* compiled from: Settings.java */
/* loaded from: classes17.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
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

    int c(int i) {
        return (this.f12211a & 32) != 0 ? this.b[5] : i;
    }

    boolean d(int i) {
        return ((1 << i) & this.f12211a) != 0;
    }

    int b(int i) {
        return (this.f12211a & 16) != 0 ? this.b[4] : i;
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

    m a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.f12211a = (1 << i) | this.f12211a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    int a(int i) {
        return this.b[i];
    }

    void a(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.d(i)) {
                a(i, mVar.a(i));
            }
        }
    }
}
