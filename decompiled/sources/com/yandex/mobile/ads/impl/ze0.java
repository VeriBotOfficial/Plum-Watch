package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ze0 {

    /* renamed from: a, reason: collision with root package name */
    private final it1 f17512a;
    private final Context b;
    private final af0 c;
    private final bf0 d;

    public /* synthetic */ ze0(Context context) {
        this(context, new it1());
    }

    public ze0(Context context, it1 safePackageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f17512a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
        this.c = new af0();
        this.d = new bf0();
    }

    public final lc a() {
        ResolveInfo resolveInfo;
        this.d.getClass();
        Intent intent = bf0.a();
        it1 it1Var = this.f17512a;
        Context context = this.b;
        it1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        lc lcVar = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                we0 we0Var = new we0();
                if (this.b.bindService(intent, we0Var, 1)) {
                    lc a2 = this.c.a(we0Var);
                    this.b.unbindService(we0Var);
                    lcVar = a2;
                } else {
                    sp0.a(new Object[0]);
                }
            } catch (Throwable unused2) {
                sp0.c(new Object[0]);
            }
        }
        return lcVar;
    }
}
