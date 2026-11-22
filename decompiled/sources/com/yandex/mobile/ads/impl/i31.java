package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.su0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i31 {

    /* renamed from: a, reason: collision with root package name */
    private final o31 f15772a = new o31();

    public final ExtendedViewContainer a(Context context, List<xj0> imageValues) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        this.f15772a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new lm1((float) o31.a(imageValues), new su0.a()));
        return extendedViewContainer;
    }
}
