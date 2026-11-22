package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a41 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final co0 f14971a;
    private final f6 b;
    private final ln0 c;
    private final z31 d;

    public a41(co0 instreamVastAdPlayer, f6 adPlayerVolumeConfigurator, ln0 instreamControlsState, z31 z31Var) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        Intrinsics.checkNotNullParameter(instreamControlsState, "instreamControlsState");
        this.f14971a = instreamVastAdPlayer;
        this.b = adPlayerVolumeConfigurator;
        this.c = instreamControlsState;
        this.d = z31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View volumeControl) {
        Intrinsics.checkNotNullParameter(volumeControl, "volumeControl");
        boolean z = !(this.f14971a.getVolume() == 0.0f);
        this.b.a(this.c.a(), z);
        z31 z31Var = this.d;
        if (z31Var != null) {
            z31Var.setMuted(z);
        }
    }
}
