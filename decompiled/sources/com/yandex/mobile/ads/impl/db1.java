package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class db1 implements jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<jb1> f15266a = new CopyOnWriteArrayList<>();

    public final void a(jb1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15266a.add(listener);
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void b() {
        Iterator<jb1> it = this.f15266a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void b(jb1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15266a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a(long j, long j2) {
        Iterator<jb1> it = this.f15266a.iterator();
        while (it.hasNext()) {
            it.next().a(j, j2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a() {
        Iterator<jb1> it = this.f15266a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
