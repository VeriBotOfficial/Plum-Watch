package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    private final j80 f16208a;
    private final me2 b;
    private final r9 c;
    private final p5 d;

    public m5(p9 adStateDataController, j80 fakePositionConfigurator, me2 videoCompletedNotifier, r9 adStateHolder, p5 adPlaybackStateController) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(fakePositionConfigurator, "fakePositionConfigurator");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        this.f16208a = fakePositionConfigurator;
        this.b = videoCompletedNotifier;
        this.c = adStateHolder;
        this.d = adPlaybackStateController;
    }

    public final void a(Player player, boolean z) {
        Intrinsics.checkNotNullParameter(player, "player");
        boolean b = this.b.b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState a2 = this.d.a();
            long contentPosition = player.getContentPosition();
            long contentDuration = player.getContentDuration();
            if (contentDuration == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = a2.getAdGroupIndexForPositionUs(timeUnit.toMicros(contentPosition), timeUnit.toMicros(contentDuration));
            }
        }
        boolean b2 = this.c.b();
        if (b || z || currentAdGroupIndex == -1 || b2) {
            return;
        }
        AdPlaybackState a3 = this.d.a();
        if (a3.getAdGroup(currentAdGroupIndex).timeUs == Long.MIN_VALUE) {
            this.b.a();
        } else {
            this.f16208a.a(a3, currentAdGroupIndex);
        }
    }
}
