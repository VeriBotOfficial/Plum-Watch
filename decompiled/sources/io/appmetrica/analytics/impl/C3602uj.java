package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3602uj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f18539a;

    public C3602uj(ModuleEvent moduleEvent) {
        this.f18539a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f18539a);
    }
}
