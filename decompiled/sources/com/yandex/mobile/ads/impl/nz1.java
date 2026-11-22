package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nz1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final co0 f16395a;

    public nz1(co0 instreamVastAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f16395a = instreamVastAdPlayer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f16395a.e();
    }
}
