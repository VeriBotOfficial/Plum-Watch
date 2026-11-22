package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o00 implements lz1 {
    @Override // com.yandex.mobile.ads.impl.lz1
    public final void a(View skipView) {
        Intrinsics.checkNotNullParameter(skipView, "skipView");
        skipView.setVisibility(8);
        skipView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.lz1
    public final void b(View skipView) {
        Intrinsics.checkNotNullParameter(skipView, "skipView");
        skipView.setVisibility(0);
        skipView.setEnabled(true);
    }
}
