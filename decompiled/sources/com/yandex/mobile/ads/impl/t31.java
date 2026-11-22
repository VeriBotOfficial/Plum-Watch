package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
/* loaded from: classes5.dex */
public interface t31<K, V> {
    Map<K, Collection<V>> a();

    boolean put(K k, V v);

    Collection<V> values();
}
