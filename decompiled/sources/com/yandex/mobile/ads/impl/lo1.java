package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* loaded from: classes5.dex */
final class lo1<E> extends kk0<E> {
    static final kk0<Object> g = new lo1(0, new Object[0]);
    final transient Object[] e;
    private final transient int f;

    @Override // com.yandex.mobile.ads.impl.ik0
    final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final boolean f() {
        return false;
    }

    lo1(int i, Object[] objArr) {
        this.e = objArr;
        this.f = i;
    }

    @Override // com.yandex.mobile.ads.impl.kk0, com.yandex.mobile.ads.impl.ik0
    final int a(int i, Object[] objArr) {
        System.arraycopy(this.e, 0, objArr, i, this.f);
        return i + this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final Object[] c() {
        return this.e;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final int d() {
        return this.f;
    }

    @Override // java.util.List
    public final E get(int i) {
        vj1.a(i, this.f);
        return (E) Objects.requireNonNull(this.e[i]);
    }
}
