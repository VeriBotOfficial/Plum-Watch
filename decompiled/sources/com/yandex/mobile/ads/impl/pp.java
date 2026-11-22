package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pp extends qg<tp, String> {
    @Override // com.yandex.mobile.ads.impl.qg
    public final ig a(Object obj, String name) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return qg.a(name, "string", new tp(tp.a.b, value));
    }
}
