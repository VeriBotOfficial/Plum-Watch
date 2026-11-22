package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zx1 {

    /* renamed from: a, reason: collision with root package name */
    private int f17567a;
    private final int[] b = new int[10];

    public final int b() {
        if ((this.f17567a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final int d() {
        return Integer.bitCount(this.f17567a);
    }

    public final int c() {
        if ((this.f17567a & 16) != 0) {
            return this.b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int a() {
        if ((this.f17567a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final void a(zx1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.c(i)) {
                a(i, other.b[i]);
            }
        }
    }

    public final int b(int i) {
        return (this.f17567a & 32) != 0 ? this.b[5] : i;
    }

    public final boolean c(int i) {
        return ((1 << i) & this.f17567a) != 0;
    }

    public final void a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.f17567a = (1 << i) | this.f17567a;
            iArr[i] = i2;
        }
    }
}
