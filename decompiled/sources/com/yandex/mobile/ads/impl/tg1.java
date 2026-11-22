package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.hjq.permissions.Permission;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tg1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16966a;

    public tg1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f16966a = applicationContext;
    }

    public final boolean a() {
        try {
            return this.f16966a.checkCallingOrSelfPermission(Permission.ACCESS_COARSE_LOCATION) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b() {
        try {
            return this.f16966a.checkCallingOrSelfPermission(Permission.ACCESS_FINE_LOCATION) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
