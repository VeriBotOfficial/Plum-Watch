package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class go1 implements ReadWriteProperty<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Object> f15618a;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f15618a.get();
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty<?> property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f15618a = new WeakReference<>(obj2);
    }

    go1(Object obj) {
        this.f15618a = new WeakReference<>(obj);
    }
}
