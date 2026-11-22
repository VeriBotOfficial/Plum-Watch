package com.vivo.push.restructure.b;

import android.content.Context;
import com.vivo.push.PushConfig;
import com.vivo.push.util.ah;

/* compiled from: PushRelyImpl.java */
/* loaded from: classes2.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f14126a;
    final /* synthetic */ PushConfig b;
    final /* synthetic */ d c;

    e(d dVar, Context context, PushConfig pushConfig) {
        this.c = dVar;
        this.f14126a = context;
        this.b = pushConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f14126a;
        ah.a(context, context.getPackageName(), this.b.isAgreePrivacyStatement());
    }
}
