package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ul1 implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    private final cn0 f17066a;
    private final an0 b;
    private final ol1 c;

    public /* synthetic */ ul1(cn0 cn0Var) {
        this(cn0Var, new an0(), new ol1());
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        bn0 a2 = this.f17066a.a();
        ProgressBar progressBar = null;
        t70 instreamAdView = a2 != null ? a2.b() : null;
        if (instreamAdView != null) {
            this.b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            ob2 adUiElements = instreamAdView.getAdUiElements();
            if (adUiElements != null) {
                progressBar = adUiElements.j();
            }
        }
        ProgressBar progressBar2 = progressBar;
        if (progressBar2 != null) {
            this.c.a(progressBar2, j2, j);
        }
    }

    public ul1(cn0 instreamAdViewsHolderManager, an0 instreamAdViewUiElementsManager, ol1 progressBarConfigurator) {
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        this.f17066a = instreamAdViewsHolderManager;
        this.b = instreamAdViewUiElementsManager;
        this.c = progressBarConfigurator;
    }
}
