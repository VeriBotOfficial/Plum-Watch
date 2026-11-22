package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3563t5 implements Yn {

    /* renamed from: a, reason: collision with root package name */
    public final List f18507a;

    public C3563t5(List<? extends Pair<String, ? extends Yn>> list) {
        this.f18507a = list;
    }

    @Override // io.appmetrica.analytics.impl.Yn
    public final String a() {
        Iterator it = this.f18507a.iterator();
        while (it.hasNext()) {
            String a2 = ((Yn) ((Pair) it.next()).getSecond()).a();
            if (a2 != null && a2.length() > 0) {
                return a2;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Yn
    public final void a(String str) {
        Iterator it = this.f18507a.iterator();
        while (it.hasNext()) {
            ((Yn) ((Pair) it.next()).getSecond()).a(str);
        }
    }
}
