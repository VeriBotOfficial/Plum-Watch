package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* compiled from: SyncProfileInfoImpl.java */
/* loaded from: classes2.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f14079a;
    final /* synthetic */ d b;

    g(d dVar, IPushRequestCallback iPushRequestCallback) {
        this.b = dVar;
        this.f14079a = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.b("delete all profileIds");
        d.a(this.b, "", this.f14079a, 3);
    }
}
