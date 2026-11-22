package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* compiled from: SyncProfileInfoImpl.java */
/* loaded from: classes2.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14077a;
    final /* synthetic */ IPushRequestCallback b;
    final /* synthetic */ d c;

    e(d dVar, String str, IPushRequestCallback iPushRequestCallback) {
        this.c = dVar;
        this.f14077a = str;
        this.b = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.b("add profileId");
        d.a(this.c, this.f14077a, this.b, 1);
    }
}
