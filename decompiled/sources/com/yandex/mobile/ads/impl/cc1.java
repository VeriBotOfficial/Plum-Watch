package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cc1 implements sg2 {

    /* renamed from: a, reason: collision with root package name */
    private final rg2 f15176a;

    public cc1(rg2 videoViewAdapter) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        this.f15176a = videoViewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.sg2
    public final List<xb2> a() {
        return CollectionsKt.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.sg2
    public final View getView() {
        return this.f15176a.b();
    }
}
