package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c51 implements b51 {
    @Override // com.yandex.mobile.ads.impl.b51
    public final ProgressBar a(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.b51
    public final View b(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.b51
    public final View c(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewById(R.id.close);
    }
}
