package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vy implements z<uy> {

    /* renamed from: a, reason: collision with root package name */
    private final yy f17202a;

    public vy(yy deeplinkRenderer) {
        Intrinsics.checkNotNullParameter(deeplinkRenderer, "deeplinkRenderer");
        this.f17202a = deeplinkRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.z
    public final gf0 a(View view, uy uyVar) {
        uy action = uyVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Context context = view.getContext();
        yy yyVar = this.f17202a;
        Intrinsics.checkNotNull(context);
        yyVar.a(context, action);
        return new gf0(true);
    }
}
