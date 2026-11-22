package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes6.dex */
public final class Y implements Zm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f18143a;

    public Y(Z z) {
        this.f18143a = z;
    }

    @Override // io.appmetrica.analytics.impl.Zm
    public final Thread a() {
        return this.f18143a.b;
    }

    @Override // io.appmetrica.analytics.impl.Zm
    public final StackTraceElement[] b() {
        Z z = this.f18143a;
        return (StackTraceElement[]) z.f18160a.get(z.b);
    }

    @Override // io.appmetrica.analytics.impl.Zm
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f18143a.f18160a;
    }
}
