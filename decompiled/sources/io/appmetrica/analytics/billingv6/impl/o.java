package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class o extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f17662a;
    public final /* synthetic */ List b;
    public final /* synthetic */ k c;

    public o(p pVar, List list, k kVar) {
        this.f17662a = pVar;
        this.b = list;
        this.c = kVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (!this.f17662a.b.isReady()) {
            this.f17662a.c.getWorkerExecutor().execute(new n(this.f17662a, this.c));
            return;
        }
        BillingClient billingClient = this.f17662a.b;
        QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
        List list = this.b;
        p pVar = this.f17662a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(pVar.d).build());
        }
        billingClient.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), this.c);
    }
}
