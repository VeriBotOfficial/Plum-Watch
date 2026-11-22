package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gh {

    /* renamed from: a, reason: collision with root package name */
    private final List<fn0> f15590a;

    /* JADX WARN: Multi-variable type inference failed */
    public gh(List<? extends fn0> assetViewConfigurators) {
        Intrinsics.checkNotNullParameter(assetViewConfigurators, "assetViewConfigurators");
        this.f15590a = assetViewConfigurators;
    }

    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Iterator<fn0> it = this.f15590a.iterator();
        while (it.hasNext()) {
            it.next().a(uiElements);
        }
    }
}
