package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tc {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16952a = new Object();
    private final WeakHashMap<vc, Object> b = new WeakHashMap<>();

    public final void b(nc advertisingInfoHolder) {
        Intrinsics.checkNotNullParameter(advertisingInfoHolder, "advertisingInfoHolder");
        a(advertisingInfoHolder);
    }

    public final void b(vc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16952a) {
            this.b.remove(listener);
        }
    }

    private final void a(nc ncVar) {
        ArrayList<vc> arrayList;
        synchronized (this.f16952a) {
            arrayList = new ArrayList(this.b.keySet());
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
        for (vc vcVar : arrayList) {
            if (vcVar != null) {
                vcVar.a(ncVar);
            }
        }
    }

    public final void a() {
        a((nc) null);
    }

    public final void a(vc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16952a) {
            this.b.put(listener, null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
