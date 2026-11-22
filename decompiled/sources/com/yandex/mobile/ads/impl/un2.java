package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class un2 implements VideoPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    private final nu f17074a;

    public un2(lf2 videoPlayerListener) {
        Intrinsics.checkNotNullParameter(videoPlayerListener, "videoPlayerListener");
        this.f17074a = videoPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        this.f17074a.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f17074a.onVideoCompleted();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f17074a.onVideoResumed();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f17074a.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f17074a.onVideoError();
    }
}
