package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vj2 {

    /* renamed from: a, reason: collision with root package name */
    private final yf1 f17168a;
    private final dz1 b;

    public vj2(yf1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f17168a = parentHtmlWebView;
        this.b = new dz1();
    }

    public final void a(final Map<String, String> trackingParameters) {
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.vj2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                vj2.a(vj2.this, trackingParameters);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vj2 this$0, Map trackingParameters) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trackingParameters, "$trackingParameters");
        this$0.f17168a.setVisibility(0);
        sp0.d(new Object[0]);
        dh0 j = this$0.f17168a.j();
        if (j != null) {
            j.a(this$0.f17168a, trackingParameters);
        }
    }
}
