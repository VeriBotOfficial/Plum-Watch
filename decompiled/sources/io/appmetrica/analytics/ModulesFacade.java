package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC3228fi;
import io.appmetrica.analytics.impl.C3248gd;
import io.appmetrica.analytics.impl.C3298id;
import io.appmetrica.analytics.impl.C3322jd;
import io.appmetrica.analytics.impl.C3347kd;
import io.appmetrica.analytics.impl.C3372ld;
import io.appmetrica.analytics.impl.C3397md;
import io.appmetrica.analytics.impl.C3422nd;
import io.appmetrica.analytics.impl.C3459p0;

/* loaded from: classes6.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C3422nd f17626a = new C3422nd();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C3422nd c3422nd = f17626a;
        C3248gd c3248gd = c3422nd.b;
        c3248gd.b.a(context);
        c3248gd.d.a(str);
        c3422nd.c.f18513a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC3228fi.f18275a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z;
        C3422nd c3422nd = f17626a;
        c3422nd.b.getClass();
        c3422nd.c.getClass();
        c3422nd.f18415a.getClass();
        synchronized (C3459p0.class) {
            z = C3459p0.f;
        }
        return z;
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C3422nd c3422nd = f17626a;
        c3422nd.b.f18291a.a(null);
        c3422nd.c.getClass();
        c3422nd.d.execute(new C3322jd(c3422nd, moduleEvent));
    }

    public static void reportExternalAttribution(int i, String str) {
        C3422nd c3422nd = f17626a;
        c3422nd.b.getClass();
        c3422nd.c.getClass();
        c3422nd.d.execute(new C3347kd(c3422nd, i, str));
    }

    public static void sendEventsBuffer() {
        C3422nd c3422nd = f17626a;
        c3422nd.b.getClass();
        c3422nd.c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        C3422nd c3422nd = f17626a;
        c3422nd.b.getClass();
        c3422nd.c.getClass();
        c3422nd.d.execute(new C3372ld(c3422nd, z));
    }

    public static void setProxy(C3422nd c3422nd) {
        f17626a = c3422nd;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C3422nd c3422nd = f17626a;
        c3422nd.b.c.a(str);
        c3422nd.c.getClass();
        c3422nd.d.execute(new C3397md(c3422nd, str, bArr));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C3422nd c3422nd = f17626a;
        boolean booleanValue = bool.booleanValue();
        c3422nd.b.getClass();
        c3422nd.c.getClass();
        c3422nd.d.execute(new C3298id(c3422nd, adRevenue, booleanValue));
    }
}
