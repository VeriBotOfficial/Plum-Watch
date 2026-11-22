package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Y4 implements InterfaceC3192e7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18148a;
    public final String b;

    public Y4(C3215f5 c3215f5) {
        this.f18148a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c3215f5.d() ? "main" : c3215f5.b()}, 1));
        this.b = "db_metrica_" + c3215f5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3192e7
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3192e7
    public final String b() {
        return this.f18148a;
    }
}
