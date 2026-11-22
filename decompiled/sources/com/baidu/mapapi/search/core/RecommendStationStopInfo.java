package com.baidu.mapapi.search.core;

import java.util.List;

/* loaded from: classes13.dex */
public class RecommendStationStopInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f8072a;
    private List<RecommendStopInfo> b;

    public List<RecommendStopInfo> getRecommendStopInfoList() {
        return this.b;
    }

    public String getStationName() {
        return this.f8072a;
    }

    public void setRecommendStopInfoList(List<RecommendStopInfo> list) {
        this.b = list;
    }

    public void setStationName(String str) {
        this.f8072a = str;
    }
}
