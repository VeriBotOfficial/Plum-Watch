package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes6.dex */
public final class J implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f17913a;
    public final /* synthetic */ InterfaceC3651wi b;
    public final /* synthetic */ K c;

    public J(K k, Context context, InterfaceC3651wi interfaceC3651wi) {
        this.c = k;
        this.f17913a = context;
        this.b = interfaceC3651wi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.c.f17927a.a(this.f17913a, this.b);
    }
}
