package com.vivo.push.h;

import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* compiled from: NotifyOpenClientClickTask.java */
/* loaded from: classes2.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f14091a;
    final /* synthetic */ Map b;
    final /* synthetic */ e c;

    f(e eVar, Context context, Map map) {
        this.c = eVar;
        this.f14091a = context;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent launchIntentForPackage = this.f14091a.getPackageManager().getLaunchIntentForPackage(this.f14091a.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(268435456);
            e.b(launchIntentForPackage, this.b);
            this.f14091a.startActivity(launchIntentForPackage);
            return;
        }
        com.vivo.push.util.t.a("NotifyOpenClientTask", "LaunchIntent is null");
    }
}
