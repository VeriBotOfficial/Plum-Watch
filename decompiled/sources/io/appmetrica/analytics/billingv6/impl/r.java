package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class r implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f17665a;
    public final Function0 b;
    public final List c;
    public final List d;
    public final g e;

    public r(UtilsProvider utilsProvider, Function0 function0, List list, List list2, g gVar) {
        this.f17665a = utilsProvider;
        this.b = function0;
        this.c = list;
        this.d = list2;
        this.e = gVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f17665a.getWorkerExecutor().execute(new q(this, billingResult, list));
    }
}
