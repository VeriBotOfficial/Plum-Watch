package com.baidu.mapapi.walknavi.model;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes13.dex */
public class WalkRouteResult {
    private int lightCount;
    private List<LatLng> positions;
    private int routeIndex = -1;
    private int distance = 0;
    private int duration = 0;

    public int getDistance() {
        return this.distance;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getLightCount() {
        return this.lightCount;
    }

    public List<LatLng> getPositions() {
        return this.positions;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setLightCount(int i) {
        this.lightCount = i;
    }

    public void setPositions(List<LatLng> list) {
        this.positions = list;
    }

    public void setRouteIndex(int i) {
        this.routeIndex = i;
    }
}
