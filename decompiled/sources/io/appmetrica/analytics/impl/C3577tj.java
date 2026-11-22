package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.tj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3577tj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18517a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;

    public C3577tj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f18517a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f18517a, this.b, this.c);
    }
}
