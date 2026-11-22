package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wx0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<p51, Object> f17290a = new WeakHashMap<>();

    public final void a(p51 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f17290a.put(nativeAdEventController, null);
    }

    public final void b() {
        Iterator<p51> it = this.f17290a.keySet().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void a() {
        Iterator<p51> it = this.f17290a.keySet().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void c() {
        Iterator<p51> it = this.f17290a.keySet().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void d() {
        Iterator<p51> it = this.f17290a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public final void a(t4 t4Var) {
        Iterator<p51> it = this.f17290a.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(t4Var);
        }
    }
}
