package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class c extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17650a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p c;

    public c(d dVar, String str, p pVar) {
        this.f17650a = dVar;
        this.b = str;
        this.c = pVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f17650a.b.isReady()) {
            this.f17650a.b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(this.b).build(), this.c);
        } else {
            this.f17650a.c.getWorkerExecutor().execute(new b(this.f17650a, this.c));
        }
    }
}
