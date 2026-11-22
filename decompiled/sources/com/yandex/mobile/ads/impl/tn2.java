package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tn2 implements mu {

    /* renamed from: a, reason: collision with root package name */
    private final VideoPlayer f16987a;

    public tn2(VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f16987a = videoPlayer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn2) && Intrinsics.areEqual(this.f16987a, ((tn2) obj).f16987a);
    }

    public final int hashCode() {
        return this.f16987a.hashCode();
    }

    public final String toString() {
        return "YandexVideoPlayerAdapter(videoPlayer=" + this.f16987a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void a(lf2 lf2Var) {
        this.f16987a.setVideoPlayerListener(lf2Var != null ? new un2(lf2Var) : null);
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final float getVolume() {
        return this.f16987a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final long getVideoPosition() {
        return this.f16987a.getVideoPosition();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final long getVideoDuration() {
        return this.f16987a.getVideoDuration();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void prepareVideo() {
        this.f16987a.prepareVideo();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void pauseVideo() {
        this.f16987a.pauseVideo();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void resumeVideo() {
        this.f16987a.resumeVideo();
    }
}
