package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dd2 implements cd2, ed2 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f15273a = new LinkedHashSet();
    private final LinkedHashSet b = new LinkedHashSet();

    public final void a(cd2... newProgressChangeListeners) {
        Intrinsics.checkNotNullParameter(newProgressChangeListeners, "newProgressChangeListeners");
        CollectionsKt.addAll(this.f15273a, newProgressChangeListeners);
    }

    public final void a(ed2... newProgressLifecycleListeners) {
        Intrinsics.checkNotNullParameter(newProgressLifecycleListeners, "newProgressLifecycleListeners");
        CollectionsKt.addAll(this.b, newProgressLifecycleListeners);
    }

    @Override // com.yandex.mobile.ads.impl.ed2
    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ed2) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        Iterator it = this.f15273a.iterator();
        while (it.hasNext()) {
            ((cd2) it.next()).a(j, j2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed2
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ed2) it.next()).a();
        }
    }
}
