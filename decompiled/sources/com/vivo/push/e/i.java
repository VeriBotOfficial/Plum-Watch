package com.vivo.push.e;

import com.vivo.push.util.t;

/* compiled from: SyncProfileInfoImpl.java */
/* loaded from: classes2.dex */
final class i implements com.vivo.push.restructure.request.c<com.vivo.push.e.a.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f14081a;

    i(h hVar) {
        this.f14081a = hVar;
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(com.vivo.push.e.a.b bVar) {
        com.vivo.push.e.a.b bVar2 = bVar;
        if (this.f14081a.f14080a != null) {
            t.b("query success");
            this.f14081a.f14080a.onSuccess(bVar2.a());
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.f14081a.f14080a != null) {
            t.b("query err : ".concat(String.valueOf(i)));
            this.f14081a.f14080a.onError(i);
        }
    }
}
