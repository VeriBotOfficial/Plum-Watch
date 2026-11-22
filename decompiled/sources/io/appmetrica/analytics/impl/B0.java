package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes6.dex */
public final class B0 implements AppMetricaPlugins {

    /* renamed from: a, reason: collision with root package name */
    public final D0 f17774a;

    public B0(D0 d0) {
        this.f17774a = d0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f17774a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f17774a.a(pluginErrorDetails);
    }

    public B0() {
        this(new D0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f17774a.a(str, str2, pluginErrorDetails);
    }
}
