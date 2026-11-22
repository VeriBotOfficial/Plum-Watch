package com.vivo.push;

/* compiled from: BasePushClient.java */
/* loaded from: classes2.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IPushActionListener f14063a;
    final /* synthetic */ a b;

    c(a aVar, IPushActionListener iPushActionListener) {
        this.b = aVar;
        this.f14063a = iPushActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2 = com.vivo.push.restructure.a.a().h().a();
        IPushActionListener iPushActionListener = this.f14063a;
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(a2);
        }
    }
}
