package com.anythink.core.common.h;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    HashMap<String, List<ad>> f3840a = new HashMap<>(2);

    public final synchronized void a(String str, ad adVar) {
        List<ad> list = this.f3840a.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f3840a.put(str, list);
        }
        list.add(adVar);
    }

    public final synchronized ad a(String str) {
        HashMap<String, List<ad>> hashMap = this.f3840a;
        ad adVar = null;
        if (hashMap == null) {
            return null;
        }
        List<ad> list = hashMap.get(str);
        if (list != null && list.size() != 0) {
            for (ad adVar2 : list) {
                new StringBuilder("CacehMotify: Query Adx/Direcyly BiddingCache price:").append(adVar2.price).append(", AdSourceId:");
                String str2 = adVar2.k;
                if (adVar != null && adVar2.price <= adVar.price) {
                }
                adVar = adVar2;
            }
            if (adVar != null) {
                list.remove(adVar);
                new StringBuilder("CacehMotify: Adx/Direcyly BiddingCache Max price:").append(adVar.price).append(", AdSourceId:");
                String str3 = adVar.k;
            }
            return adVar;
        }
        return null;
    }
}
