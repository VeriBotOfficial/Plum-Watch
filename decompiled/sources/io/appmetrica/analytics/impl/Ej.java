package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes6.dex */
public final class Ej implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17834a;
    public final /* synthetic */ Map b;

    public Ej(String str, Map map) {
        this.f17834a = str;
        this.b = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f17834a, this.b);
    }
}
