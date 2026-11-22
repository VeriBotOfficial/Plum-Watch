package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zb1 {

    /* renamed from: a, reason: collision with root package name */
    private final sa1 f17503a;

    public zb1(sa1 videoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        this.f17503a = videoAdPlayer;
    }

    public final void a(yb1 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        TextureView c = nativeVideoView.c();
        this.f17503a.a(c);
        c.setVisibility(0);
        nativeVideoView.a().setVisibility(0);
        nativeVideoView.b().setVisibility(0);
    }

    public final void b(yb1 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        TextureView c = nativeVideoView.c();
        this.f17503a.a((TextureView) null);
        c.setVisibility(8);
        nativeVideoView.a().setVisibility(8);
        nativeVideoView.b().setVisibility(8);
    }
}
