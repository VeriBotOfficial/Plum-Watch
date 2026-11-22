package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class di2 implements op {
    @Override // com.yandex.mobile.ads.impl.op
    public final void a(View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.op
    public final void b(View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setVisibility(0);
    }
}
