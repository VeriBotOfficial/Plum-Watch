package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g12 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final i12 f15546a;
    private final y82 b;

    public g12(i12 socialAdInfo, y82 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(socialAdInfo, "socialAdInfo");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f15546a = socialAdInfo;
        this.b = urlViewerLauncher;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Context context = v.getContext();
        String a2 = this.f15546a.a();
        y82 y82Var = this.b;
        Intrinsics.checkNotNull(context);
        y82Var.a(context, a2);
    }
}
