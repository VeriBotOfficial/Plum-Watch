package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.baidu.mapapi.SDKInitializer;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.a;
import com.yandex.mobile.ads.impl.op1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rx0<T extends com.monetization.ads.mediation.base.a, L> {

    /* renamed from: a, reason: collision with root package name */
    private final o3 f16808a;
    private final g5 b;
    private final yx0<T, L> c;
    private final gy0 d;
    private final sx0<T> e;
    private final ig1 f;
    private final dy0 g;
    private qx0<T> h;

    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        qx0<T> qx0Var = this.h;
        if (qx0Var != null) {
            Map<String, ? extends Object> mapOf = MapsKt.mapOf(TuplesKt.to("status", "success"));
            this.d.f(context, qx0Var.c(), mapOf, qx0Var.a().b().getNetworkName());
        }
    }

    public final void c(Context context, Map<String, ? extends Object> mediatedReportData) {
        lz0 c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedReportData, "mediatedReportData");
        qx0<T> qx0Var = this.h;
        List<String> d = (qx0Var == null || (c = qx0Var.c()) == null) ? null : c.d();
        v9 v9Var = new v9(context, this.f16808a);
        if (d != null) {
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                v9Var.a((String) it.next(), z62.g);
            }
        }
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(mediatedReportData);
        mutableMap.put("status", "success");
        qx0<T> qx0Var2 = this.h;
        if (qx0Var2 != null) {
            tx0 a2 = qx0Var2.a();
            this.g.getClass();
            mutableMap.putAll(dy0.a(a2));
            this.d.g(context, qx0Var2.c(), mutableMap, qx0Var2.a().b().getNetworkName());
        }
    }

    public final void d(Context context, Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qx0<T> qx0Var = this.h;
        if (qx0Var != null) {
            this.d.e(context, qx0Var.c(), additionalReportData, qx0Var.a().b().getNetworkName());
        }
    }

    public final void e(Context context, Map<String, ? extends Object> additionalReportData) {
        tx0 a2;
        MediatedAdapterInfo b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qx0<T> qx0Var = this.h;
        String str = null;
        lz0 c = qx0Var != null ? qx0Var.c() : null;
        if (c != null) {
            gy0 gy0Var = this.d;
            qx0<T> qx0Var2 = this.h;
            if (qx0Var2 != null && (a2 = qx0Var2.a()) != null && (b = a2.b()) != null) {
                str = b.getNetworkName();
            }
            gy0Var.b(context, c, additionalReportData, str);
        }
    }

    public /* synthetic */ rx0(o3 o3Var, g5 g5Var, yx0 yx0Var, gy0 gy0Var, sx0 sx0Var, ig1 ig1Var) {
        this(o3Var, g5Var, yx0Var, gy0Var, sx0Var, ig1Var, new dy0());
    }

    public rx0(o3 adConfiguration, g5 adLoadingPhasesManager, yx0<T, L> mediatedAdLoader, gy0 mediatedAdapterReporter, sx0<T> mediatedAdCreator, ig1 passbackAdLoader, dy0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(mediatedAdLoader, "mediatedAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdCreator, "mediatedAdCreator");
        Intrinsics.checkNotNullParameter(passbackAdLoader, "passbackAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f16808a = adConfiguration;
        this.b = adLoadingPhasesManager;
        this.c = mediatedAdLoader;
        this.d = mediatedAdapterReporter;
        this.e = mediatedAdCreator;
        this.f = passbackAdLoader;
        this.g = mediatedAdapterInfoReportDataProvider;
    }

    public final qx0<T> a() {
        return this.h;
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        qx0<T> qx0Var = this.h;
        if (qx0Var != null) {
            try {
                this.c.a(qx0Var.b());
            } catch (Throwable th) {
                lz0 c = qx0Var.c();
                String networkName = qx0Var.a().b().getNetworkName();
                sp0.c(new Object[0]);
                this.d.a(context, c, MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", th.toString())))), networkName);
            }
        }
    }

    public final void a(Context context, L l) {
        Context context2;
        L l2;
        lz0 c;
        Intrinsics.checkNotNullParameter(context, "context");
        qx0<T> a2 = this.e.a(context);
        this.h = a2;
        if (a2 != null) {
            this.f16808a.a(a2.c());
            this.f16808a.c(a2.a().b().getNetworkName());
            g5 g5Var = this.b;
            f5 f5Var = f5.c;
            bk.a(g5Var, f5Var, "adLoadingPhaseType", f5Var, null);
            lz0 c2 = a2.c();
            String networkName = a2.a().b().getNetworkName();
            this.d.b(context, c2, networkName);
            try {
                context2 = context;
                l2 = l;
                try {
                    this.c.a(context2, a2.b(), l2, a2.a(context), a2.d());
                } catch (Throwable th) {
                    th = th;
                    sp0.c(new Object[0]);
                    this.d.a(context2, c2, MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", th.toString())))), networkName);
                    qx0<T> qx0Var = this.h;
                    xa parametersProvider = new xa(op1.c.d, (qx0Var == null || (c = qx0Var.c()) == null) ? null : c.e());
                    g5 g5Var2 = this.b;
                    f5 adLoadingPhaseType = f5.c;
                    g5Var2.getClass();
                    Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                    Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
                    g5Var2.a(adLoadingPhaseType, parametersProvider, null);
                    a(context2, (Context) l2);
                }
            } catch (Throwable th2) {
                th = th2;
                context2 = context;
                l2 = l;
            }
        } else {
            this.f.a();
        }
    }

    public final void b(Context context, w3 adFetchRequestError, L l) {
        lz0 c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        qx0<T> qx0Var = this.h;
        xa parametersProvider = new xa(op1.c.d, (qx0Var == null || (c = qx0Var.c()) == null) ? null : c.e());
        g5 g5Var = this.b;
        f5 adLoadingPhaseType = f5.c;
        g5Var.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        g5Var.a(adLoadingPhaseType, parametersProvider, null);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(adFetchRequestError.b())), TuplesKt.to("error_description", adFetchRequestError.c()));
        qx0<T> qx0Var2 = this.h;
        if (qx0Var2 != null) {
            tx0 a2 = qx0Var2.a();
            this.g.getClass();
            mutableMapOf.putAll(dy0.a(a2));
            this.d.g(context, qx0Var2.c(), mutableMapOf, qx0Var2.a().b().getNetworkName());
        }
        a(context);
        a(context, (Context) l);
    }

    public final void b(Context context, Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qx0<T> qx0Var = this.h;
        if (qx0Var != null) {
            lz0 c = qx0Var.c();
            String networkName = qx0Var.a().b().getNetworkName();
            List<String> h = c.h();
            if (h != null) {
                Iterator<String> it = h.iterator();
                while (it.hasNext()) {
                    new v9(context, this.f16808a).a(it.next(), z62.f);
                }
            }
            this.d.d(context, c, additionalReportData, networkName);
        }
    }

    public final void c(Context context) {
        tx0 a2;
        MediatedAdapterInfo b;
        Intrinsics.checkNotNullParameter(context, "context");
        qx0<T> qx0Var = this.h;
        String str = null;
        lz0 c = qx0Var != null ? qx0Var.c() : null;
        if (c != null) {
            gy0 gy0Var = this.d;
            qx0<T> qx0Var2 = this.h;
            if (qx0Var2 != null && (a2 = qx0Var2.a()) != null && (b = a2.b()) != null) {
                str = b.getNetworkName();
            }
            gy0Var.a(context, c, str);
        }
    }

    public final void a(Context context, Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qx0<T> qx0Var = this.h;
        if (qx0Var != null) {
            lz0 c = qx0Var.c();
            String networkName = qx0Var.a().b().getNetworkName();
            List<String> g = c.g();
            if (g != null) {
                Iterator<String> it = g.iterator();
                while (it.hasNext()) {
                    new v9(context, this.f16808a).a(it.next(), z62.d);
                }
            }
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(additionalReportData);
            mutableMap.put("click_type", "default");
            this.d.c(context, c, mutableMap, networkName);
        }
    }

    public final void a(Context context, w3 adFetchRequestError, L l) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        qx0<T> qx0Var = this.h;
        if (qx0Var != null) {
            this.d.f(context, qx0Var.c(), MapsKt.mapOf(TuplesKt.to("status", "error"), TuplesKt.to(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(adFetchRequestError.b()))), qx0Var.a().b().getNetworkName());
        }
        a(context);
        a(context, (Context) l);
    }

    public final void a(Context context, o8<String> o8Var) {
        tx0 a2;
        MediatedAdapterInfo b;
        Intrinsics.checkNotNullParameter(context, "context");
        qx0<T> qx0Var = this.h;
        String str = null;
        lz0 c = qx0Var != null ? qx0Var.c() : null;
        if (c != null) {
            gy0 gy0Var = this.d;
            qx0<T> qx0Var2 = this.h;
            if (qx0Var2 != null && (a2 = qx0Var2.a()) != null && (b = a2.b()) != null) {
                str = b.getNetworkName();
            }
            gy0Var.a(context, c, o8Var, str);
        }
    }

    public final boolean b() {
        tx0 a2;
        qx0<T> qx0Var = this.h;
        if (qx0Var == null || (a2 = qx0Var.a()) == null) {
            return true;
        }
        return a2.c();
    }
}
