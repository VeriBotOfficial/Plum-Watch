package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3119b9 extends AbstractC3144c9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f18196a;

    public C3119b9(List<Object> list) {
        this.f18196a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f18196a;
    }
}
