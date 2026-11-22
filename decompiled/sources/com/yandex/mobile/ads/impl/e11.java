package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e11 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15334a;

    public e11(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f15334a = applicationContext;
    }

    public final d11 a(SSLSocketFactory sSLSocketFactory) {
        Context context = this.f15334a;
        return new d11(context, sSLSocketFactory, new c(context, sSLSocketFactory), new tn1(), d.b(context), new yc1(), new ki0());
    }
}
