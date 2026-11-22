package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class C1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17788a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ F1 c;

    public C1(F1 f1, int i, Bundle bundle) {
        this.c = f1;
        this.f17788a = i;
        this.b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.c.b.reportData(this.f17788a, this.b);
    }
}
