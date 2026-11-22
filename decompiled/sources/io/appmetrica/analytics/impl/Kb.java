package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class Kb {

    /* renamed from: a, reason: collision with root package name */
    public final Z2 f17934a;
    public final C3336k2 b;
    public final ArrayList c;

    public Kb(Z2 z2, C3336k2 c3336k2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.f17934a = z2;
        arrayList.add(z2);
        this.b = c3336k2;
        arrayList.add(c3336k2);
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Vj) it.next()).onCreate();
        }
    }

    public final synchronized void a(C3568ta c3568ta) {
        this.c.add(c3568ta);
    }
}
