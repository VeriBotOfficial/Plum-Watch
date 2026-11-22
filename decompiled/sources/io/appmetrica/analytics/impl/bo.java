package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes6.dex */
public final class bo implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18205a = "WebView interface setup failed because javascript is disabled for the WebView.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).warning(this.f18205a, new Object[0]);
    }
}
