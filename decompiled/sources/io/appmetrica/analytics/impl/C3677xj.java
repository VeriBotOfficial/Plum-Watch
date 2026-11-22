package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3677xj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f18581a;

    public C3677xj(Map map) {
        this.f18581a = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportAnr(this.f18581a);
    }
}
