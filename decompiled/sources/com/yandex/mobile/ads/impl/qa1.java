package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qa1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final hp1 f16647a;
    private final aw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qa1(Context context, hp1 replayActionView, aw0 aw0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        this.f16647a = replayActionView;
        this.b = aw0Var;
        addView(replayActionView);
        if (aw0Var == 0 || !(aw0Var instanceof View)) {
            return;
        }
        addView((View) aw0Var);
    }

    public final hp1 b() {
        return this.f16647a;
    }

    public final aw0 a() {
        return this.b;
    }
}
