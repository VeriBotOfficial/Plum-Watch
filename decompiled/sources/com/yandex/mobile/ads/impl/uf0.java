package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uf0 implements qc {

    /* renamed from: a, reason: collision with root package name */
    private final it1 f17047a;
    private final Context b;
    private final wf0 c;
    private final xf0 d;

    public /* synthetic */ uf0(Context context) {
        this(context, new it1());
    }

    public uf0(Context context, it1 safePackageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f17047a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
        this.c = new wf0();
        this.d = new xf0();
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final lc a() {
        ResolveInfo resolveInfo;
        this.d.getClass();
        Intent intent = xf0.a();
        it1 it1Var = this.f17047a;
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
                com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
                if (this.b.bindService(intent, aVar, 1)) {
                    lc a2 = this.c.a(aVar);
                    this.b.unbindService(aVar);
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
