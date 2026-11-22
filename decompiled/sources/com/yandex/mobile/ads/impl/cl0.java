package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.n92;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cl0 {
    private static final List<n92.a> b = CollectionsKt.listOf((Object[]) new n92.a[]{n92.a.c, n92.a.d, n92.a.i});

    /* renamed from: a, reason: collision with root package name */
    private final dl0 f15201a;

    public final void a(FrameLayout adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f15201a.a(adView);
    }

    public /* synthetic */ cl0() {
        this(new dl0());
    }

    public final void a(n92 validationResult, FrameLayout adView) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f15201a.a(adView, validationResult, !b.contains(validationResult.b()));
    }

    public cl0(dl0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f15201a = renderer;
    }
}
