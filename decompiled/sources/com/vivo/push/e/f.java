package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* compiled from: SyncProfileInfoImpl.java */
/* loaded from: classes2.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14078a;
    final /* synthetic */ IPushRequestCallback b;
    final /* synthetic */ d c;

    f(d dVar, String str, IPushRequestCallback iPushRequestCallback) {
        this.c = dVar;
        this.f14078a = str;
        this.b = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.b("delete profileId");
        d.a(this.c, this.f14078a, this.b, 2);
    }
}
