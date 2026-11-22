package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final xc0 f16690a;
    private final gd0 b;
    private final dw c;

    public qp(xc0 fullScreenCloseButtonListener, gd0 fullScreenHtmlWebViewAdapter, dw debugEventsReporter) {
        Intrinsics.checkNotNullParameter(fullScreenCloseButtonListener, "fullScreenCloseButtonListener");
        Intrinsics.checkNotNullParameter(fullScreenHtmlWebViewAdapter, "fullScreenHtmlWebViewAdapter");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        this.f16690a = fullScreenCloseButtonListener;
        this.b = fullScreenHtmlWebViewAdapter;
        this.c = debugEventsReporter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.a();
        this.f16690a.c();
        this.c.a(cw.c);
    }
}
