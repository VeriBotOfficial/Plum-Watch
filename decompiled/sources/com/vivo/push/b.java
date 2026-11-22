package com.vivo.push;

import com.vivo.push.listener.IPushQueryActionListener;

/* compiled from: BasePushClient.java */
/* loaded from: classes2.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IPushQueryActionListener f14041a;
    final /* synthetic */ a b;

    b(a aVar, IPushQueryActionListener iPushQueryActionListener) {
        this.b = aVar;
        this.f14041a = iPushQueryActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String b = com.vivo.push.restructure.a.a().h().b();
        IPushQueryActionListener iPushQueryActionListener = this.f14041a;
        if (iPushQueryActionListener != null) {
            iPushQueryActionListener.onSuccess(b);
        }
    }
}
