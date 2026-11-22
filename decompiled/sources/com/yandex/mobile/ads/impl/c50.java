package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c50 implements gc {
    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView p = uiElements.p();
        if (p != null) {
            p.setVisibility(8);
        }
        ImageView o = uiElements.o();
        if (o == null) {
            return;
        }
        o.setVisibility(8);
    }
}
