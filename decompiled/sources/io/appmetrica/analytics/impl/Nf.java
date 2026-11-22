package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class Nf implements Jf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rf f17985a;

    public Nf(Rf rf) {
        this.f17985a = rf;
    }

    @Override // io.appmetrica.analytics.impl.Jf
    public final void a() {
        Rf rf = this.f17985a;
        ArrayList arrayList = rf.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C3151cg c3151cg = (C3151cg) next;
            rf.c.getClass();
            String str = c3151cg != null ? c3151cg.f18216a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        rf.a(rf.c.a(CollectionsKt.filterNotNull(arrayList2)));
    }
}
