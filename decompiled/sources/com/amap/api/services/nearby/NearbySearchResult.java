package com.amap.api.services.nearby;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class NearbySearchResult {

    /* renamed from: a, reason: collision with root package name */
    private List<NearbyInfo> f2132a = new ArrayList();
    private int b = 0;

    public List<NearbyInfo> getNearbyInfoList() {
        return this.f2132a;
    }

    public int getTotalNum() {
        return this.b;
    }

    public void setNearbyInfoList(List<NearbyInfo> list) {
        this.f2132a = list;
        this.b = list.size();
    }
}
