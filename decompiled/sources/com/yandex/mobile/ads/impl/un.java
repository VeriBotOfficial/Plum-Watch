package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class un implements fn0 {
    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        View c = uiElements.c();
        TextView f = uiElements.f();
        ImageView g = uiElements.g();
        if (f == null || f.getVisibility() != 8 || g == null || g.getVisibility() != 8 || c == null) {
            return;
        }
        c.setBackground(null);
    }
}
