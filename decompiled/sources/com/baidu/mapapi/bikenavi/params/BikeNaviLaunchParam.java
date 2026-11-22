package com.baidu.mapapi.bikenavi.params;

import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.walknavi.h.a;
import com.baidu.platform.comapi.walknavi.h.b;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class BikeNaviLaunchParam {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7844a;
    private LatLng b;
    private BikeRouteNodeInfo c;
    private BikeRouteNodeInfo d;
    private int f;
    private int e = 0;
    public String mRoadPrefer = "0";
    private List<BikeRouteNodeInfo> g = new LinkedList();

    public static a create() {
        return new b();
    }

    public BikeNaviLaunchParam copy() {
        BikeNaviLaunchParam bikeNaviLaunchParam = new BikeNaviLaunchParam();
        bikeNaviLaunchParam.c = this.c;
        bikeNaviLaunchParam.d = this.d;
        bikeNaviLaunchParam.e = this.e;
        bikeNaviLaunchParam.f7844a = this.f7844a;
        bikeNaviLaunchParam.b = this.b;
        bikeNaviLaunchParam.f = this.f;
        bikeNaviLaunchParam.mRoadPrefer = this.mRoadPrefer;
        bikeNaviLaunchParam.g = this.g;
        return bikeNaviLaunchParam;
    }

    public BikeNaviLaunchParam endNodeInfo(BikeRouteNodeInfo bikeRouteNodeInfo) {
        this.d = bikeRouteNodeInfo;
        return this;
    }

    public BikeNaviLaunchParam endPt(LatLng latLng) {
        this.b = latLng;
        return this;
    }

    public BikeNaviLaunchParam extraNaviMode(int i) {
        this.f = i;
        return this;
    }

    public BikeRouteNodeInfo getEndNodeInfo() {
        return this.d;
    }

    public LatLng getEndPt() {
        return this.b;
    }

    public int getExtraNaviMode() {
        return this.f;
    }

    public BikeRouteNodeInfo getStartNodeInfo() {
        return this.c;
    }

    public LatLng getStartPt() {
        return this.f7844a;
    }

    public int getVehicle() {
        return this.e;
    }

    public List<BikeRouteNodeInfo> getViaNodes() {
        return this.g;
    }

    public BikeNaviLaunchParam roadPrefer(String str) {
        this.mRoadPrefer = str;
        return this;
    }

    public void setViaNodes(List<BikeRouteNodeInfo> list) {
        this.g.addAll(list);
    }

    public BikeNaviLaunchParam stPt(LatLng latLng) {
        this.f7844a = latLng;
        return this;
    }

    public BikeNaviLaunchParam startNodeInfo(BikeRouteNodeInfo bikeRouteNodeInfo) {
        this.c = bikeRouteNodeInfo;
        return this;
    }

    public BikeNaviLaunchParam vehicle(int i) {
        this.e = i;
        return this;
    }
}
