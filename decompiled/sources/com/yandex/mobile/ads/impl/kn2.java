package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kn2 implements bb2 {

    /* renamed from: a, reason: collision with root package name */
    private final qe1 f16041a;
    private final Object b;
    private final ArrayList c;

    public kn2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16041a = qe1.g.a(context);
        this.b = new Object();
        this.c = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    public final void a() {
        List list;
        synchronized (this.b) {
            list = CollectionsKt.toList(this.c);
            this.c.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f16041a.a((cb2) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    public final void a(cb2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.b) {
            this.c.add(listener);
            this.f16041a.b(listener);
            Unit unit = Unit.INSTANCE;
        }
    }
}
