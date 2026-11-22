package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pa0 implements z<oa0> {

    /* renamed from: a, reason: collision with root package name */
    private final ya0 f16537a;

    public pa0(ya0 feedbackRenderer) {
        Intrinsics.checkNotNullParameter(feedbackRenderer, "feedbackRenderer");
        this.f16537a = feedbackRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.z
    public final gf0 a(View view, oa0 oa0Var) {
        oa0 action = oa0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Context context = view.getContext();
        ya0 ya0Var = this.f16537a;
        Intrinsics.checkNotNull(context);
        ya0Var.a(context, action);
        return new gf0(false);
    }
}
