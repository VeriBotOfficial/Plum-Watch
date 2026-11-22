package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class qg<T, V> {
    protected static ig a(String name, String type, Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ig(name, type, value, null, false, false);
    }

    public abstract ig a(Object obj, String str);
}
