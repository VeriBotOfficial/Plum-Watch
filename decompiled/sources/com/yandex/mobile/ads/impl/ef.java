package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ef {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15379a = new Object();
    private final ArrayList b = new ArrayList();

    public final void a(df appMetricaIdentifiers) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (this.f15379a) {
            arrayList = new ArrayList(this.b);
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((aj0) it.next()).a(appMetricaIdentifiers);
        }
    }

    public final void a() {
        synchronized (this.f15379a) {
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(aj0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f15379a) {
            this.b.add(observer);
        }
    }
}
