package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wo {

    /* renamed from: a, reason: collision with root package name */
    private final zb2<go0> f17271a;
    private final View.OnClickListener b;
    private final l10 c;

    public wo(Context context, bv1 sdkEnvironmentModule, gt coreInstreamAdBreak, zb2<go0> videoAdInfo, mg2 videoTracker, lo0 playbackListener, he2 videoClicks, View.OnClickListener clickListener, l10 deviceTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        this.f17271a = videoAdInfo;
        this.b = clickListener;
        this.c = deviceTypeProvider;
    }

    public final void a(View clickControl) {
        Intrinsics.checkNotNullParameter(clickControl, "clickControl");
        l10 l10Var = this.c;
        Context context = clickControl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k10 a2 = l10Var.a(context);
        String c = this.f17271a.b().c();
        if ((c == null || c.length() == 0) || a2 == k10.d) {
            clickControl.setVisibility(8);
        } else {
            clickControl.setOnClickListener(this.b);
        }
    }
}
