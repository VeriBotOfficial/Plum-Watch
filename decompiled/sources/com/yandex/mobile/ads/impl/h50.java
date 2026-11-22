package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h50 implements op {
    @Override // com.yandex.mobile.ads.impl.op
    public final void a(View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setAlpha(0.4f);
        closeView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.op
    public final void b(View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.animate().alpha(1.0f).setDuration(200L);
        closeView.setEnabled(true);
    }
}
