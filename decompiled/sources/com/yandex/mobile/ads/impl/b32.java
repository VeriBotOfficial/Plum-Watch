package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b32 extends qg<String, String> {
    @Override // com.yandex.mobile.ads.impl.qg
    public final ig a(Object obj, String name) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return qg.a(name, "string", value);
    }
}
