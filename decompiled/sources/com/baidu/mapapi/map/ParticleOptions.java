package com.baidu.mapapi.map;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes13.dex */
public class ParticleOptions {

    /* renamed from: a, reason: collision with root package name */
    private List<BitmapDescriptor> f7964a;
    private LatLng b;

    public List<BitmapDescriptor> getParticleImgs() {
        return this.f7964a;
    }

    public LatLng getParticlePos() {
        return this.b;
    }

    public void setParticleImgs(List<BitmapDescriptor> list) {
        this.f7964a = list;
    }

    public void setParticlePos(LatLng latLng) {
        this.b = latLng;
    }
}
