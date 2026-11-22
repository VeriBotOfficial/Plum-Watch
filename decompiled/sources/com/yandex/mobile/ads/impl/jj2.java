package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jj2<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final k41 f15917a;

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f15917a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }

    public /* synthetic */ jj2() {
        this(new k41());
    }

    public jj2(k41 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f15917a = nativeAdAssetViewProvider;
    }
}
