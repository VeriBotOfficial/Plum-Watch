package com.baidu.mapapi.search.route;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class IndoorPlanNode {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f8158a;
    private String b;

    public IndoorPlanNode(LatLng latLng, String str) {
        this.f8158a = latLng;
        this.b = str;
    }

    public String getFloor() {
        return this.b;
    }

    public LatLng getLocation() {
        return this.f8158a;
    }
}
