package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3240g5 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f18284a = new CopyOnWriteArrayList();

    public final void a(InterfaceC3637w4 interfaceC3637w4) {
        this.f18284a.add(interfaceC3637w4);
    }

    public final void b(InterfaceC3637w4 interfaceC3637w4) {
        this.f18284a.remove(interfaceC3637w4);
    }

    public final List<InterfaceC3637w4> a() {
        return this.f18284a;
    }
}
