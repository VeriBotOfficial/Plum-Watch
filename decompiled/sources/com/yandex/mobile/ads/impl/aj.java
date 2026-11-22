package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.gz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class aj extends ko1 implements oj {
    private final np0 C;
    private final zi D;
    private final qe2 E;
    private final cj F;
    private final bj G;
    private final sg0 H;
    private ej I;
    private ej J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(Context context, np0 adView, zi bannerAdListener, g5 adLoadingPhasesManager, qe2 videoEventController, cj bannerAdSizeValidator, bj adResponseControllerFactoryCreator, sg0 htmlAdResponseReportManager) {
        super(context, adView, adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(bannerAdListener, "bannerAdListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(bannerAdSizeValidator, "bannerAdSizeValidator");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.C = adView;
        this.D = bannerAdListener;
        this.E = videoEventController;
        this.F = bannerAdSizeValidator;
        this.G = adResponseControllerFactoryCreator;
        this.H = htmlAdResponseReportManager;
        a(adView);
        bannerAdListener.a(htmlAdResponseReportManager);
    }

    private static void a(np0 np0Var) {
        np0Var.setHorizontalScrollBarEnabled(false);
        np0Var.setVerticalScrollBarEnabled(false);
        np0Var.setVisibility(8);
        np0Var.setBackgroundColor(0);
    }

    public final np0 C() {
        return this.C;
    }

    public final qe2 D() {
        return this.E;
    }

    public final String B() {
        ej ejVar = this.J;
        if (ejVar != null) {
            return ejVar.getAdInfo();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ko1, com.yandex.mobile.ads.impl.ck
    public final void d() {
        super.d();
        this.D.a((ys) null);
        zg2.a(this.C, true);
        this.C.setVisibility(8);
        wh2.a((ViewGroup) this.C);
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void u() {
        super.u();
        ej ejVar = this.I;
        if (ejVar != this.J) {
            ej[] ejVarArr = new ej[1];
            if (ejVar != null) {
                ejVar.a(l());
            }
            this.I = this.J;
        }
        gz1 r = f().r();
        if (gz1.a.d != (r != null ? r.a() : null) || this.C.getLayoutParams() == null) {
            return;
        }
        this.C.getLayoutParams().height = -2;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void e() {
        ej[] ejVarArr = {this.I, this.J};
        for (int i = 0; i < 2; i++) {
            ej ejVar = ejVarArr[i];
            if (ejVar != null) {
                ejVar.a(l());
            }
        }
        super.e();
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a(t4 t4Var) {
        this.D.a(t4Var);
    }

    @Override // com.yandex.mobile.ads.impl.ck, com.yandex.mobile.ads.impl.xq1.b
    public final void a(o8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.a((o8) adResponse);
        this.H.a(adResponse);
        this.H.a(f());
        ej a2 = this.G.a(adResponse).a(this);
        this.J = a2;
        a2.a(l(), adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void onLeftApplication() {
        this.D.b();
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void onReturnedToApplication() {
        this.D.c();
    }

    public final void A() {
        this.D.a();
    }

    public final boolean z() {
        o8<String> k = k();
        gz1 M = k != null ? k.M() : null;
        if (M == null) {
            return false;
        }
        gz1 r = f().r();
        o8<String> k2 = k();
        return (k2 == null || r == null || !iz1.a(l(), k2, M, this.F, r)) ? false : true;
    }

    public final void a(ys ysVar) {
        a(this.D);
        this.D.a(ysVar);
    }
}
