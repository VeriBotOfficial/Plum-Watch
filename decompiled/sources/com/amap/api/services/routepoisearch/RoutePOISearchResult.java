package com.amap.api.services.routepoisearch;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RoutePOISearchResult {

    /* renamed from: a, reason: collision with root package name */
    private List<RoutePOIItem> f2212a;
    private RoutePOISearchQuery b;

    public RoutePOISearchResult(ArrayList<RoutePOIItem> arrayList, RoutePOISearchQuery routePOISearchQuery) {
        new ArrayList();
        this.f2212a = arrayList;
        this.b = routePOISearchQuery;
    }

    public RoutePOISearchQuery getQuery() {
        return this.b;
    }

    public List<RoutePOIItem> getRoutePois() {
        return this.f2212a;
    }
}
