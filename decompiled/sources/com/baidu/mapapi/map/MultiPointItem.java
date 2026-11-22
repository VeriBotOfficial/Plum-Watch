package com.baidu.mapapi.map;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public final class MultiPointItem {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7954a;
    private String b;

    public MultiPointItem(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: MultiPointItem point can not be null");
        }
        this.f7954a = latLng;
    }

    public LatLng getPoint() {
        return this.f7954a;
    }

    public String getTitle() {
        return this.b;
    }

    public void setTitle(String str) {
        this.b = str;
    }
}
