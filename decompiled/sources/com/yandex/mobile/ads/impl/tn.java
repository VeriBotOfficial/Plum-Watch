package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tn implements fn0 {

    /* renamed from: a, reason: collision with root package name */
    private final ig<?> f16985a;
    private final wo b;

    public tn(ig<?> igVar, wo clickControlConfigurator) {
        Intrinsics.checkNotNullParameter(clickControlConfigurator, "clickControlConfigurator");
        this.f16985a = igVar;
        this.b = clickControlConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView e = uiElements.e();
        ImageView d = uiElements.d();
        if (e != null) {
            ig<?> igVar = this.f16985a;
            Object d2 = igVar != null ? igVar.d() : null;
            if (d2 instanceof String) {
                e.setVisibility(0);
                e.setText((CharSequence) d2);
            } else {
                e.setVisibility(8);
            }
            this.b.a(e);
        }
        if (d != null) {
            this.b.a(d);
        }
    }
}
