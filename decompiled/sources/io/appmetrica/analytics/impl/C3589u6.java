package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3589u6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f18526a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, S s) {
        Iterator it = this.f18526a.iterator();
        while (it.hasNext()) {
            ((Ma) it.next()).a(th, s);
        }
    }

    public final void a(Ma... maArr) {
        CollectionsKt.addAll(this.f18526a, maArr);
    }

    public final void a(List<? extends Ma> list) {
        this.f18526a.addAll(list);
    }

    public final void a() {
        this.f18526a.clear();
    }
}
