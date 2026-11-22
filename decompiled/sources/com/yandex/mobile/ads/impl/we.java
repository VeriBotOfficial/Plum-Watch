package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class we {

    /* renamed from: a, reason: collision with root package name */
    private final AppMetricaAdapter f17242a;

    public we(Context context) {
        AppMetricaAdapter appMetricaAdapter;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            appMetricaAdapter = new AppMetricaAdapter(context);
        } catch (Throwable th) {
            String str = "Couldn't create AppMetricaAdapter, cause = " + th;
            sp0.b(new Object[0]);
            appMetricaAdapter = null;
        }
        this.f17242a = appMetricaAdapter;
    }

    public final void a(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f17242a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setCustomReporter(apiKey);
            }
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }

    public final void b(String experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f17242a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setExperiments(experiments);
            }
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }

    public final void a(Set<Long> testIds) {
        Intrinsics.checkNotNullParameter(testIds, "testIds");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f17242a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setTriggeredTestIds(testIds);
            }
        } catch (Throwable unused) {
            testIds.toString();
            sp0.c(new Object[0]);
        }
    }
}
