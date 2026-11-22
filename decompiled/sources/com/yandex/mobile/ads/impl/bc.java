package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bc extends yf1 {
    private final cc k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bc(Context context) {
        this(context, new au0());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.yf1, com.yandex.mobile.ads.impl.bh0
    public final void a(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.k.a(url);
    }

    @Override // com.yandex.mobile.ads.impl.yf1
    protected final void h() {
    }

    public final void setAdtuneWebViewListener(ec adtuneWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneWebViewListener, "adtuneWebViewListener");
        this.k.a(adtuneWebViewListener);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ bc(android.content.Context r3, com.yandex.mobile.ads.impl.au0 r4) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.ub r0 = new com.yandex.mobile.ads.impl.ub
            r0.<init>(r3)
            com.yandex.mobile.ads.impl.cc r1 = new com.yandex.mobile.ads.impl.cc
            r1.<init>(r0)
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bc.<init>(android.content.Context, com.yandex.mobile.ads.impl.au0):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(Context context, au0 manufacturerChecker, ub optOutRenderer, cc adtuneWebViewController) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manufacturerChecker, "manufacturerChecker");
        Intrinsics.checkNotNullParameter(optOutRenderer, "optOutRenderer");
        Intrinsics.checkNotNullParameter(adtuneWebViewController, "adtuneWebViewController");
        this.k = adtuneWebViewController;
        if (manufacturerChecker.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneWebViewController);
    }

    public final void setOptOutUrl(String str) {
        this.k.b(str);
    }
}
