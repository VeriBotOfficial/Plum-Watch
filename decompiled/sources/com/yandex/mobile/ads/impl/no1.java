package com.yandex.mobile.ads.impl;

import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class no1<E> extends mk0<E> {
    private static final Object[] i = null;
    static final no1<Object> j;
    final transient Object[] d;
    private final transient int e;
    final transient Object[] f;
    private final transient int g;
    private final transient int h;

    @Override // com.yandex.mobile.ads.impl.ik0
    final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final int a(int i2, Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    static {
        Object[] objArr = new Object[0];
        j = new no1<>(objArr, 0, objArr, 0, 0);
    }

    no1(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a2 = jf0.a(obj.hashCode());
        while (true) {
            int i2 = a2 & this.g;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i2 + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // com.yandex.mobile.ads.impl.mk0, com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final i82<E> iterator() {
        return b().listIterator(0);
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final Object[] c() {
        return this.d;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final int d() {
        return this.h;
    }

    @Override // com.yandex.mobile.ads.impl.mk0
    final kk0<E> g() {
        return kk0.b(this.h, this.d);
    }

    @Override // com.yandex.mobile.ads.impl.mk0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }
}
