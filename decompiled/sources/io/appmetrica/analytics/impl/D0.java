package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f17805a = C3562t4.i().e().a();
    public final C3484q0 b;
    public final Fe c;
    public final Ie d;

    public D0() {
        C3484q0 c3484q0 = new C3484q0();
        this.b = c3484q0;
        this.c = new Fe(c3484q0);
        this.d = new Ie();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        Fe fe = this.c;
        fe.f17850a.a(null);
        fe.b.a(pluginErrorDetails);
        Ie ie = this.d;
        Intrinsics.checkNotNull(pluginErrorDetails);
        ie.getClass();
        this.f17805a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.D0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                D0.a(D0.this, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        Fe fe = this.c;
        fe.f17850a.a(null);
        fe.b.a(pluginErrorDetails);
        if (fe.d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f17989a) {
            Ie ie = this.d;
            Intrinsics.checkNotNull(pluginErrorDetails);
            ie.getClass();
            this.f17805a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.D0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    D0.a(D0.this, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        Fe fe = this.c;
        fe.f17850a.a(null);
        fe.c.a(str);
        Ie ie = this.d;
        Intrinsics.checkNotNull(str);
        ie.getClass();
        this.f17805a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.D0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                D0.a(D0.this, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(D0 d0, PluginErrorDetails pluginErrorDetails, String str) {
        d0.b.getClass();
        C3459p0 c3459p0 = C3459p0.e;
        Intrinsics.checkNotNull(c3459p0);
        C3471pc i = c3459p0.f().i();
        Intrinsics.checkNotNull(i);
        i.f18451a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(D0 d0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        d0.b.getClass();
        C3459p0 c3459p0 = C3459p0.e;
        Intrinsics.checkNotNull(c3459p0);
        C3471pc i = c3459p0.f().i();
        Intrinsics.checkNotNull(i);
        i.f18451a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(D0 d0, PluginErrorDetails pluginErrorDetails) {
        d0.b.getClass();
        C3459p0 c3459p0 = C3459p0.e;
        Intrinsics.checkNotNull(c3459p0);
        C3471pc i = c3459p0.f().i();
        Intrinsics.checkNotNull(i);
        i.f18451a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
