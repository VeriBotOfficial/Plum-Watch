package com.baidu.mapapi.search.recommendstop;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class RecommendStopSearchOption {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8152a = false;
    public LatLng mLocation;

    public LatLng getLocation() {
        return this.mLocation;
    }

    public boolean isNeedStationInfo() {
        return this.f8152a;
    }

    public RecommendStopSearchOption location(LatLng latLng) {
        this.mLocation = latLng;
        return this;
    }

    public RecommendStopSearchOption setNeedStationInfo(boolean z) {
        this.f8152a = z;
        return this;
    }
}
