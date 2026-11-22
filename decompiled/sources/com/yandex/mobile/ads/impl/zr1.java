package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zr1 {

    /* renamed from: a, reason: collision with root package name */
    private final n52 f17552a;
    private final q42 b;

    public final void a(View timerView, long j, long j2) {
        Intrinsics.checkNotNullParameter(timerView, "timerView");
        timerView.setVisibility(0);
        TextView a2 = this.f17552a.a(timerView);
        if (a2 != null) {
            this.b.getClass();
            q42.a(a2, j, j2);
        }
    }

    public /* synthetic */ zr1(o52 o52Var) {
        this(o52Var, new q42());
    }

    public zr1(o52 timerViewProvider, q42 textDelayViewController) {
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(textDelayViewController, "textDelayViewController");
        this.f17552a = timerViewProvider;
        this.b = textDelayViewController;
    }
}
