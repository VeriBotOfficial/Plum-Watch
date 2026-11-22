package com.yandex.mobile.ads.impl;

import com.anythink.core.api.ATCustomRuleKeys;
import com.caverock.androidsvg.SVGParser;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class li {
    public static Set a(rt nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Set createSetBuilder = SetsKt.createSetBuilder();
        if (nativeAdAssets.a() != null) {
            createSetBuilder.add(ATCustomRuleKeys.AGE);
        }
        if (nativeAdAssets.b() != null) {
            createSetBuilder.add("body");
        }
        if (nativeAdAssets.c() != null) {
            createSetBuilder.add("call_to_action");
        }
        if (nativeAdAssets.d() != null) {
            createSetBuilder.add("domain");
        }
        if (nativeAdAssets.e() != null) {
            createSetBuilder.add("favicon");
        }
        if (nativeAdAssets.g() != null) {
            createSetBuilder.add("icon");
        }
        if (nativeAdAssets.h() != null) {
            createSetBuilder.add(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
        }
        if (nativeAdAssets.i() != null) {
            createSetBuilder.add(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
        }
        if (nativeAdAssets.j() != null) {
            createSetBuilder.add("price");
        }
        if (nativeAdAssets.k() != null) {
            createSetBuilder.add("rating");
        }
        if (nativeAdAssets.l() != null) {
            createSetBuilder.add("review_count");
        }
        if (nativeAdAssets.m() != null) {
            createSetBuilder.add("sponsored");
        }
        if (nativeAdAssets.n() != null) {
            createSetBuilder.add("title");
        }
        if (nativeAdAssets.o() != null) {
            createSetBuilder.add("warning");
        }
        if (nativeAdAssets.f()) {
            createSetBuilder.add("feedback");
        }
        return SetsKt.build(createSetBuilder);
    }
}
