package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u30 implements fn0 {

    /* renamed from: a, reason: collision with root package name */
    private final ig<?> f17016a;
    private final mg b;

    public u30(ig<?> igVar, mg clickConfigurator) {
        Intrinsics.checkNotNullParameter(clickConfigurator, "clickConfigurator");
        this.f17016a = igVar;
        this.b = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView f = uiElements.f();
        ig<?> igVar = this.f17016a;
        Object d = igVar != null ? igVar.d() : null;
        if (f != null) {
            if (!(d instanceof String)) {
                f.setVisibility(8);
                return;
            }
            f.setText((CharSequence) d);
            f.setVisibility(0);
            this.b.a(f, this.f17016a);
        }
    }
}
