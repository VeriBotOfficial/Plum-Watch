package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xm0 {

    /* renamed from: a, reason: collision with root package name */
    private final am0 f17349a;
    private final u00 b;

    public final ob2 a(t70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        ob2 a2 = this.f17349a.a();
        if (a2 != null) {
            return a2;
        }
        u00 u00Var = this.b;
        Context context = instreamAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return u00Var.a(context, instreamAdView);
    }

    public /* synthetic */ xm0(am0 am0Var, pn0 pn0Var) {
        this(am0Var, pn0Var, new u00(pn0Var));
    }

    public xm0(am0 customUiElementsHolder, pn0 instreamDesign, u00 defaultUiElementsCreator) {
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        Intrinsics.checkNotNullParameter(defaultUiElementsCreator, "defaultUiElementsCreator");
        this.f17349a = customUiElementsHolder;
        this.b = defaultUiElementsCreator;
    }
}
