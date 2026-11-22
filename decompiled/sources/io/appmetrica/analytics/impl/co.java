package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes6.dex */
public final class co implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f18223a;
    public final /* synthetic */ String b = "WebView interface setup failed because of an exception.";

    public co(Throwable th) {
        this.f18223a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f18223a, this.b, new Object[0]);
    }
}
