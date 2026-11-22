package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3156cl implements V2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18220a;

    public C3156cl(Context context) {
        this.f18220a = context;
    }

    @Override // io.appmetrica.analytics.impl.V2, io.appmetrica.analytics.impl.Ml
    public final void a(Hl hl) {
    }

    public final Context b() {
        return this.f18220a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
