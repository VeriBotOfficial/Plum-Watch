package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oz1 {

    /* renamed from: a, reason: collision with root package name */
    private final co0 f16504a;
    private final od2 b;

    public final void a(View skipControl, ln0 controlsState) {
        Intrinsics.checkNotNullParameter(skipControl, "skipControl");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        if (this.b == null) {
            skipControl.setVisibility(8);
            return;
        }
        skipControl.setOnClickListener(new nz1(this.f16504a));
        if (controlsState.c()) {
            skipControl.setVisibility(0);
        }
        skipControl.setEnabled(controlsState.c());
    }

    public /* synthetic */ oz1(co0 co0Var, go0 go0Var) {
        this(co0Var, go0Var, go0Var.h());
    }

    public oz1(co0 instreamVastAdPlayer, go0 instreamVideoAd, od2 od2Var) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        this.f16504a = instreamVastAdPlayer;
        this.b = od2Var;
    }
}
