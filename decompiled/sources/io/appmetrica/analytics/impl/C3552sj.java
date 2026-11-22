package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.sj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3552sj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f18498a;
    public final /* synthetic */ String b;

    public C3552sj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f18498a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f18498a, this.b);
    }
}
