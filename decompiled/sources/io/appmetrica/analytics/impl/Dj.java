package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Dj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17818a;
    public final /* synthetic */ String b;

    public Dj(String str, String str2) {
        this.f17818a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f17818a, this.b);
    }
}
