package com.yandex.mobile.ads.impl;

import com.caverock.androidsvg.SVGParser;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sa0 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f16843a;

    public sa0(rt nativeAdAssets, li availableAssetsProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(availableAssetsProvider, "availableAssetsProvider");
        availableAssetsProvider.getClass();
        this.f16843a = li.a(nativeAdAssets);
    }

    public final boolean a() {
        return this.f16843a.size() == 2 && this.f16843a.contains("feedback") && this.f16843a.contains(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
    }
}
