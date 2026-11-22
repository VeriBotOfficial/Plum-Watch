package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class u32 implements tq0 {
    private final View b;

    public u32(yf1 htmlWebView) {
        Intrinsics.checkNotNullParameter(htmlWebView, "htmlWebView");
        this.b = htmlWebView;
    }

    @Override // com.yandex.mobile.ads.impl.tq0
    public final String a() {
        boolean isHardwareAccelerated = this.b.isHardwareAccelerated();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return z0.a(new Object[]{Boolean.valueOf(isHardwareAccelerated)}, 1, "supports: {inlineVideo: %s}", "format(...)");
    }
}
