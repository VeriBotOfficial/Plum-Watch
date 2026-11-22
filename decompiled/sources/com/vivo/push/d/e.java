package com.vivo.push.d;

import android.app.Activity;
import com.vivo.push.IPushActionListener;
import com.vivo.push.util.v;
import com.vivo.push.util.w;

/* compiled from: NotifyGuideDialogManager.java */
/* loaded from: classes2.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14070a;
    final /* synthetic */ IPushActionListener b;
    final /* synthetic */ long c;
    final /* synthetic */ b d;

    e(b bVar, Activity activity, IPushActionListener iPushActionListener, long j) {
        this.d = bVar;
        this.f14070a = activity;
        this.b = iPushActionListener;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2 = b.a(this.f14070a);
        if (a2 != 0) {
            this.b.onStateChanged(a2);
            return;
        }
        com.vivo.push.restructure.request.d.a().a(new com.vivo.push.restructure.request.b(new a(new g(this.c, v.a(), w.a(this.f14070a))), new f(this), 3000L));
    }
}
