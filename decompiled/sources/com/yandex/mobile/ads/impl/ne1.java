package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ne1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16334a = new Object();
    private final WeakHashMap<cb2, Object> b = new WeakHashMap<>();

    public final void b() {
        ArrayList<cb2> arrayList;
        synchronized (this.f16334a) {
            arrayList = new ArrayList(this.b.keySet());
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
        for (cb2 cb2Var : arrayList) {
            if (cb2Var != null) {
                cb2Var.a();
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f16334a) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public final void b(cb2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16334a) {
            this.b.remove(listener);
        }
    }

    public final void a(cb2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16334a) {
            this.b.put(listener, null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
