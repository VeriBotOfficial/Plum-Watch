package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Zi {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18170a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f18170a = iArr;
        try {
            iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18170a[CounterConfigurationReporterType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
