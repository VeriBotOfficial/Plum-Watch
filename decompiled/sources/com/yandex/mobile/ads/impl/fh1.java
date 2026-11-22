package com.yandex.mobile.ads.impl;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fh1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15498a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ fh1(android.content.Context r3) {
        /*
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fh1.<init>(android.content.Context):void");
    }

    public final dh1 a() {
        Object systemService = this.f15498a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean valueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (valueOf != null && !valueOf.booleanValue()) {
            return dh1.c;
        }
        Object systemService2 = this.f15498a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? dh1.d : dh1.b;
    }

    public fh1(Context context, Context appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f15498a = appContext;
    }
}
