package com.yandex.mobile.ads.impl;

import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
final class ez1<E> extends mk0<E> {
    final transient E d;

    @Override // com.yandex.mobile.ads.impl.ik0
    final boolean f() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    final int a(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    ez1(E e) {
        this.d = (E) vj1.a(e);
    }

    @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.yandex.mobile.ads.impl.mk0, com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final i82<E> iterator() {
        return new lq0(this.d);
    }

    @Override // com.yandex.mobile.ads.impl.mk0, com.yandex.mobile.ads.impl.ik0
    public final kk0<E> b() {
        return kk0.a(this.d);
    }

    @Override // com.yandex.mobile.ads.impl.mk0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }
}
