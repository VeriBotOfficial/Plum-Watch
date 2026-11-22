package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ek1 implements u82 {

    /* renamed from: a, reason: collision with root package name */
    private final tp1 f15392a;
    private final f42 b;
    private final s82 c;
    private String d;

    public ek1(Context context, tp1 reporter, f42 targetUrlHandler, s82 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f15392a = reporter;
        this.b = targetUrlHandler;
        this.c = urlModifier;
    }

    @Override // com.yandex.mobile.ads.impl.u82
    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String a2 = this.c.a(url);
        if (url.length() != 0) {
            url = a2;
        }
        this.d = url;
        String str = null;
        if (url == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
            url = null;
        }
        if (url.length() == 0) {
            sp0.b(new Object[0]);
            return;
        }
        f42 f42Var = this.b;
        tp1 tp1Var = this.f15392a;
        String str2 = this.d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
        } else {
            str = str2;
        }
        f42Var.a(tp1Var, str);
    }
}
