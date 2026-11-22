package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bt0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15136a;
    private final jo1 b;
    private final Context c;

    public /* synthetic */ bt0(Context context, String str) {
        this(context, str, new jo1());
    }

    public bt0(Context context, String locationServicesClassName, jo1 reflectHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(reflectHelper, "reflectHelper");
        this.f15136a = locationServicesClassName;
        this.b = reflectHelper;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
    }

    public final he0 a() {
        Class<?> cls;
        jo1 jo1Var = this.b;
        String className = this.f15136a;
        jo1Var.getClass();
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            cls = Class.forName(className);
        } catch (Throwable unused) {
            sp0.c(className);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        jo1 jo1Var2 = this.b;
        Object[] objArr = {this.c};
        jo1Var2.getClass();
        Object a2 = jo1.a(cls, "getFusedLocationProviderClient", objArr);
        if (a2 != null) {
            return new he0(a2);
        }
        return null;
    }
}
