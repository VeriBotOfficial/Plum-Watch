package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3568ta implements Vj {
    @Override // io.appmetrica.analytics.impl.Vj
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.Vj
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
