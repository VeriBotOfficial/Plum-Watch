package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b41 {

    /* renamed from: a, reason: collision with root package name */
    private final co0 f15070a;
    private final f6 b;

    public final void a(ob2 uiElements, ln0 controlsState) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        float a2 = controlsState.a();
        boolean d = controlsState.d();
        z31 i = uiElements.i();
        a41 a41Var = new a41(this.f15070a, this.b, controlsState, i);
        if (i != null) {
            i.setOnClickListener(a41Var);
        }
        if (i != null) {
            i.setMuted(d);
        }
        this.b.a(a2, d);
    }

    public /* synthetic */ b41(co0 co0Var) {
        this(co0Var, new f6(co0Var));
    }

    public b41(co0 instreamVastAdPlayer, f6 adPlayerVolumeConfigurator) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        this.f15070a = instreamVastAdPlayer;
        this.b = adPlayerVolumeConfigurator;
    }
}
