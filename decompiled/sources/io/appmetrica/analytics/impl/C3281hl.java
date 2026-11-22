package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3281hl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3330jl f18312a;

    public C3281hl(C3330jl c3330jl) {
        this.f18312a = c3330jl;
    }

    public final void a(String str, EnumC3380ll enumC3380ll, Hl hl) {
        ArrayList arrayList;
        synchronized (this.f18312a.b) {
            Collection collection = (Collection) this.f18312a.f18347a.f18565a.get(str);
            arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3554sl) it.next()).a(enumC3380ll, hl);
        }
    }
}
