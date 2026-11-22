package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ml2 {

    /* renamed from: a, reason: collision with root package name */
    private final oq1 f16258a;

    public final v7 a(String adUnitId, AdRequest adRequest) {
        nq1 nq1Var;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            this.f16258a.getClass();
            nq1Var = oq1.a(preferredTheme);
        } else {
            nq1Var = null;
        }
        return new v7.a(adUnitId).a(adRequest.getCom.anythink.core.api.ATCustomRuleKeys.AGE java.lang.String()).d(adRequest.getBiddingData()).c(adRequest.getGender()).b(adRequest.getContextQuery()).a(adRequest.getContextTags()).a(adRequest.getLocation()).a(adRequest.getParameters()).a(nq1Var).a();
    }

    public /* synthetic */ ml2() {
        this(new oq1());
    }

    public ml2(oq1 requestedAdThemeFactory) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f16258a = requestedAdThemeFactory;
    }
}
