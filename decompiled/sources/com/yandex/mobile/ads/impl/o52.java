package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o52 implements n52 {
    @Override // com.yandex.mobile.ads.impl.n52
    public final TextView a(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("timer_value");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final View b(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("timer_container");
        if (findViewWithTag instanceof View) {
            return findViewWithTag;
        }
        return null;
    }
}
