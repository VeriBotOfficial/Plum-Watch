package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d51 implements b51 {
    @Override // com.yandex.mobile.ads.impl.b51
    public final ProgressBar a(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ProgressBar) container.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.b51
    public final View b(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewWithTag("skip_button");
    }

    @Override // com.yandex.mobile.ads.impl.b51
    public final View c(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewWithTag("close");
    }
}
