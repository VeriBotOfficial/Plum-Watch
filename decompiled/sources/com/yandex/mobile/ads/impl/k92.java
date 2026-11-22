package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k92 {

    /* renamed from: a, reason: collision with root package name */
    private final kb2 f15997a;
    private final j92 b;
    private final Context c;
    private final l92 d;

    public /* synthetic */ k92(Context context) {
        this(context, new kb2(), new j92());
    }

    public final void a() {
        kb2 kb2Var = this.f15997a;
        Context context = this.c;
        kb2Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (pa.a(context) && this.b.a(this.c)) {
            this.d.getClass();
            l92.b();
        }
    }

    public k92(Context context, kb2 versionValidationNeedChecker, j92 validationErrorLogChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(versionValidationNeedChecker, "versionValidationNeedChecker");
        Intrinsics.checkNotNullParameter(validationErrorLogChecker, "validationErrorLogChecker");
        this.f15997a = versionValidationNeedChecker;
        this.b = validationErrorLogChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
        this.d = new l92();
    }
}
