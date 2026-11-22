package com.vivo.push.restructure.request;

/* compiled from: RequestManager.java */
/* loaded from: classes2.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f14136a;
    final /* synthetic */ e b;

    f(e eVar, b bVar) {
        this.b = eVar;
        this.f14136a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f14136a;
        if (bVar == null || bVar.b() == null) {
            return;
        }
        this.f14136a.b().a(1003);
    }
}
