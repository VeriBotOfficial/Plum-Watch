package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jo1;
import com.yandex.mobile.ads.impl.mz0;
import com.yandex.mobile.ads.impl.qz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a01 {

    /* renamed from: a, reason: collision with root package name */
    private String f14956a;

    public final ArrayList a(List networks) {
        com.monetization.ads.mediation.base.a aVar;
        qz0.c cVar;
        Intrinsics.checkNotNullParameter(networks, "networks");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(networks, 10));
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            mz0 mz0Var = (mz0) it.next();
            List<mz0.b> b = mz0Var.b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
            for (mz0.b bVar : b) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) jo1.a.a(bVar.a(), new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    cVar = new qz0.c(bVar.b(), null, false);
                } else {
                    tx0 tx0Var = new tx0(aVar);
                    if (this.f14956a == null) {
                        this.f14956a = tx0Var.b().getNetworkSdkVersion();
                    }
                    cVar = new qz0.c(bVar.b(), tx0Var.b().getAdapterVersion(), true);
                }
                arrayList2.add(cVar);
            }
            String str = this.f14956a;
            this.f14956a = null;
            arrayList.add(new qz0(mz0Var.d(), mz0Var.c(), str, arrayList2));
        }
        return arrayList;
    }
}
