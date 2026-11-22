package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f17657a;
    public final /* synthetic */ r b;

    public j(k kVar, r rVar) {
        this.f17657a = kVar;
        this.b = rVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f17657a.b.isReady()) {
            this.f17657a.b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(this.f17657a.f17658a).build(), this.b);
        } else {
            this.f17657a.c.getWorkerExecutor().execute(new i(this.f17657a, this.b));
        }
    }
}
