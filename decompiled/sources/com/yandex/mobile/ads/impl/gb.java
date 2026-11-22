package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    private final ql f15572a;
    private final p5 b;
    private final pe2 c;
    private final uj1 d;
    private boolean e;

    public gb(ql bindingControllerHolder, p5 adPlaybackStateController, pe2 videoDurationHolder, uj1 positionProviderHolder) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f15572a = bindingControllerHolder;
        this.b = adPlaybackStateController;
        this.c = videoDurationHolder;
        this.d = positionProviderHolder;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b() {
        ml a2 = this.f15572a.a();
        if (a2 != null) {
            pi1 b = this.d.b();
            if (b != null) {
                this.e = true;
                int adGroupIndexForPositionUs = this.b.a().getAdGroupIndexForPositionUs(Util.msToUs(b.a()), Util.msToUs(this.c.a()));
                if (adGroupIndexForPositionUs != -1) {
                    if (adGroupIndexForPositionUs == this.b.a().adGroupCount) {
                        this.f15572a.c();
                        return;
                    } else {
                        a2.a();
                        return;
                    }
                }
                a2.a();
                return;
            }
            sp0.b(new Object[0]);
        }
    }
}
