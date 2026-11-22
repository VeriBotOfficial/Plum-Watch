package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t81 implements w51 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f16944a = new CopyOnWriteArrayList();
    private boolean b;

    public final void a(s81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16944a.add(listener);
        if (this.b) {
            listener.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w51
    public final void b() {
        this.b = true;
        Iterator it = this.f16944a.iterator();
        while (it.hasNext()) {
            ((w51) it.next()).b();
        }
    }

    public final void b(s81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16944a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.w51
    public final void a() {
        this.b = false;
        Iterator it = this.f16944a.iterator();
        while (it.hasNext()) {
            ((w51) it.next()).a();
        }
    }
}
