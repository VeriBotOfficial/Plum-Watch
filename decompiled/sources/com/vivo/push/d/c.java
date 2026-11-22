package com.vivo.push.d;

import android.app.Activity;
import com.vivo.push.IPushActionListener;
import com.vivo.push.util.v;
import com.vivo.push.util.w;

/* compiled from: NotifyGuideDialogManager.java */
/* loaded from: classes2.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14068a;
    final /* synthetic */ IPushActionListener b;
    final /* synthetic */ b c;

    c(b bVar, Activity activity, IPushActionListener iPushActionListener) {
        this.c = bVar;
        this.f14068a = activity;
        this.b = iPushActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2 = b.a(this.f14068a);
        if (a2 != 0) {
            this.b.onStateChanged(a2);
            return;
        }
        com.vivo.push.restructure.request.d.a().a(new com.vivo.push.restructure.request.b(new a(new g(v.a(), w.a(this.f14068a))), new d(this), 3000L));
    }
}
