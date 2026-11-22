package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class kb0 implements su0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f16002a;
    private final su0.a b;

    public kb0(ExtendedVideoAdControlsContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f16002a = container;
        this.b = new su0.a();
    }

    @Override // com.yandex.mobile.ads.impl.su0
    public final su0.a a(int i, int i2) {
        int roundToInt = MathKt.roundToInt(this.f16002a.getHeight() * 0.1f);
        su0.a aVar = this.b;
        aVar.f16895a = i;
        aVar.b = View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824);
        return this.b;
    }
}
