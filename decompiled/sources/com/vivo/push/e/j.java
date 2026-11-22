package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* compiled from: SyncProfileInfoImpl.java */
/* loaded from: classes2.dex */
final class j implements com.vivo.push.restructure.request.c<com.vivo.push.e.a.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f14082a;
    final /* synthetic */ int b;
    final /* synthetic */ d c;

    j(d dVar, IPushRequestCallback iPushRequestCallback, int i) {
        this.c = dVar;
        this.f14082a = iPushRequestCallback;
        this.b = i;
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(com.vivo.push.e.a.b bVar) {
        if (this.f14082a != null) {
            t.b(this.b + " sync success");
            this.f14082a.onSuccess(0);
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.f14082a != null) {
            t.b(this.b + " sync err : " + i);
            this.f14082a.onError(i);
        }
    }
}
