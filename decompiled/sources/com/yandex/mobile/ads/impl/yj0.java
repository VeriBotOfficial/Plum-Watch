package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yj0 extends qg<xj0, xj0> {
    @Override // com.yandex.mobile.ads.impl.qg
    public final ig a(Object obj, String name) {
        xj0 value = (xj0) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return qg.a(name, "image", value);
    }
}
