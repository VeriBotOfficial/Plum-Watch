package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ic1 implements ze1, s11 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<jc1> f15800a = new CopyOnWriteArrayList<>();

    public final void a(jc1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15800a.add(listener);
    }

    public final void b(jc1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15800a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.s11
    public final void a() {
        Iterator<jc1> it = this.f15800a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void a(boolean z) {
        Iterator<jc1> it = this.f15800a.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }
}
