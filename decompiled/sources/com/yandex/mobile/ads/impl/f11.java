package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f11 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15445a = new Object();
    private final ArrayList b = new ArrayList();

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f15445a) {
            arrayList = new ArrayList(this.b);
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hl0 hl0Var = (hl0) it.next();
            if (hl0Var != null) {
                hl0Var.a();
            }
        }
    }

    public final void a(hl0 initializationObserver) {
        Intrinsics.checkNotNullParameter(initializationObserver, "initializationObserver");
        synchronized (this.f15445a) {
            this.b.add(initializationObserver);
        }
    }
}
