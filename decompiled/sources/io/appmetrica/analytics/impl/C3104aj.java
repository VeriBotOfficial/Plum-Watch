package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3104aj {

    /* renamed from: a, reason: collision with root package name */
    public final String f18186a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final C3179dj d;

    public C3104aj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C3179dj c3179dj) {
        this.f18186a = str;
        this.b = context;
        int i = Zi.f18170a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = c3179dj;
    }
}
