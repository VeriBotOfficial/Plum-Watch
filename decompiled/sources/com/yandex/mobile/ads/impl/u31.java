package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.v31;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
final class u31 extends v31.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f17017a;

    @Override // com.yandex.mobile.ads.impl.v31.c
    final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f17017a);
    }

    u31(Comparator comparator) {
        this.f17017a = comparator;
    }
}
