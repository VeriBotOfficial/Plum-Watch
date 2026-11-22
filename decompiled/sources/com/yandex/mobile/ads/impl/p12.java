package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes5.dex */
final class p12<V> {
    private final yr<V> c;
    private final SparseArray<V> b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f16514a = -1;

    public p12(yr<V> yrVar) {
        this.c = yrVar;
    }

    public final V b(int i) {
        if (this.f16514a == -1) {
            this.f16514a = 0;
        }
        while (true) {
            int i2 = this.f16514a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.f16514a--;
        }
        while (this.f16514a < this.b.size() - 1 && i >= this.b.keyAt(this.f16514a + 1)) {
            this.f16514a++;
        }
        return this.b.valueAt(this.f16514a);
    }

    public final void a(int i, V v) {
        if (this.f16514a == -1) {
            if (this.b.size() == 0) {
                this.f16514a = 0;
            } else {
                throw new IllegalStateException();
            }
        }
        if (this.b.size() > 0) {
            int keyAt = this.b.keyAt(r0.size() - 1);
            if (i < keyAt) {
                throw new IllegalArgumentException();
            }
            if (keyAt == i) {
                this.c.accept(this.b.valueAt(r1.size() - 1));
            }
        }
        this.b.append(i, v);
    }

    public final boolean c() {
        return this.b.size() == 0;
    }

    public final V b() {
        return this.b.valueAt(r0.size() - 1);
    }

    public final void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.f16514a = -1;
        this.b.clear();
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.f16514a;
            if (i4 > 0) {
                this.f16514a = i4 - 1;
            }
            i2 = i3;
        }
    }
}
