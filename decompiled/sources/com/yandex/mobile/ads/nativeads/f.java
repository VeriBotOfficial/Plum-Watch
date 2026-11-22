package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.nq1;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.v7;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final oq1 f17594a;
    private final w61 b;

    public f(oq1 requestedAdThemeFactory, w61 adRequestReadyResponseProvider) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        Intrinsics.checkNotNullParameter(adRequestReadyResponseProvider, "adRequestReadyResponseProvider");
        this.f17594a = requestedAdThemeFactory;
        this.b = adRequestReadyResponseProvider;
    }

    public final v7 a(NativeAdRequestConfiguration adRequestConfiguration) {
        nq1 nq1Var;
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "nativeAdConfiguration");
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f17594a.getClass();
            nq1Var = oq1.a(preferredTheme);
        } else {
            nq1Var = null;
        }
        this.b.getClass();
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        return new v7.a(adRequestConfiguration.getCom.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID java.lang.String()).a(adRequestConfiguration.getCom.anythink.core.api.ATCustomRuleKeys.AGE java.lang.String()).d(adRequestConfiguration.getBiddingData()).c(adRequestConfiguration.getGender()).b(adRequestConfiguration.getContextQuery()).a(adRequestConfiguration.getContextTags()).a(adRequestConfiguration.getLocation()).a(adRequestConfiguration.getParameters()).a(nq1Var).a(adRequestConfiguration.getShouldLoadImagesAutomatically()).b().a();
    }

    public /* synthetic */ f() {
        this(new oq1(), new w61());
    }
}
