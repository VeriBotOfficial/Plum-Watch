package com.yandex.mobile.ads.impl;

import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ki {

    /* renamed from: a, reason: collision with root package name */
    private final ll1 f16022a = new ll1();

    public final boolean a() {
        String a2 = this.f16022a.a();
        if (a2 == null || !(StringsKt.endsWith$default(a2, ":Metrica", false, 2, (Object) null) || StringsKt.endsWith$default(a2, ":AppMetrica", false, 2, (Object) null))) {
            return false;
        }
        String str = "Auxiliary process '" + a2 + "' detected";
        sp0.d(new Object[0]);
        return true;
    }
}
