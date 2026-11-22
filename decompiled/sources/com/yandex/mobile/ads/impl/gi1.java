package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gi1 {

    /* renamed from: a, reason: collision with root package name */
    private final p5 f15596a;
    private final ri1 b;
    private final js0 c;

    public gi1(p5 adPlaybackStateController, uj1 positionProviderHolder, pe2 videoDurationHolder, ri1 playerStateChangedListener, js0 loadingAdGroupIndexProvider) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateChangedListener, "playerStateChangedListener");
        Intrinsics.checkNotNullParameter(loadingAdGroupIndexProvider, "loadingAdGroupIndexProvider");
        this.f15596a = adPlaybackStateController;
        this.b = playerStateChangedListener;
        this.c = loadingAdGroupIndexProvider;
    }

    public final void a(int i, Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (i == 2 && !player.isPlayingAd()) {
            AdPlaybackState a2 = this.f15596a.a();
            int a3 = this.c.a(a2);
            if (a3 == -1) {
                return;
            }
            AdPlaybackState.AdGroup adGroup = a2.getAdGroup(a3);
            Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
            int i2 = adGroup.count;
            if (i2 != -1 && i2 != 0 && adGroup.states[0] != 0) {
                return;
            }
        }
        this.b.a(player.getPlayWhenReady(), i);
    }
}
