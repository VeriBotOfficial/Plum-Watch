package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class gt0 {

    /* renamed from: a, reason: collision with root package name */
    private int f15627a;
    private long[] b;

    public gt0() {
        this(0);
    }

    public gt0(int i) {
        this.b = new long[32];
    }

    public final void a(long j) {
        int i = this.f15627a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.f15627a;
        this.f15627a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long[] b() {
        return Arrays.copyOf(this.b, this.f15627a);
    }

    public final long a(int i) {
        if (i >= 0 && i < this.f15627a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f15627a);
    }

    public final int a() {
        return this.f15627a;
    }
}
