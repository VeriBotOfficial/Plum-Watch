package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3643wa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18565a;
    public final boolean b;

    public C3643wa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f18565a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f18565a.toString();
    }

    public C3643wa(boolean z) {
        this.f18565a = new HashMap();
        this.b = z;
    }
}
