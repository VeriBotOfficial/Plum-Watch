package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qn<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final k41 f16687a;
    private final pn b;

    public qn(Context context, k41 nativeAdAssetViewProvider, pn callToActionAnimationController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        Intrinsics.checkNotNullParameter(callToActionAnimationController, "callToActionAnimationController");
        this.f16687a = nativeAdAssetViewProvider;
        this.b = callToActionAnimationController;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f16687a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.call_to_action);
        if (textView != null) {
            this.b.a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
        this.b.a();
    }
}
