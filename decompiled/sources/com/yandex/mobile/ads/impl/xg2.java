package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.y51;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xg2 implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final View f17334a;

    public xg2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17334a = view;
    }

    @Override // com.yandex.mobile.ads.impl.ap
    public final void a(vr0 link, cp clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        Context context = this.f17334a.getContext();
        View.OnClickListener a2 = clickListenerCreator.a(link);
        Intrinsics.checkNotNull(context);
        to toVar = new to(context, a2);
        int i = y51.e;
        e71 e71Var = new e71(context, a2, toVar, y51.a.a());
        this.f17334a.setOnTouchListener(e71Var);
        this.f17334a.setOnClickListener(e71Var);
    }
}
