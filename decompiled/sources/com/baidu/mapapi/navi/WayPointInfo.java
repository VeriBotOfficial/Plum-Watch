package com.baidu.mapapi.navi;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class WayPointInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f8055a;
    private LatLng b;

    public LatLng getLatLng() {
        return this.b;
    }

    public String getWayPointName() {
        return this.f8055a;
    }

    public WayPointInfo setLatLng(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalStateException("BDMapSDKException: The latitude and longitude of the waypoint cannot be null");
        }
        this.b = latLng;
        return this;
    }

    public WayPointInfo setWayPointName(String str) {
        this.f8055a = str;
        return this;
    }
}
