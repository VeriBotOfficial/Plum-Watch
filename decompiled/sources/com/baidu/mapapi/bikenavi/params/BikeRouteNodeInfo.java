package com.baidu.mapapi.bikenavi.params;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.walknavi.h.b;
import com.baidu.platform.comapi.wnplatform.e.f.a;

/* loaded from: classes13.dex */
public class BikeRouteNodeInfo {
    protected String b;
    private LatLng d;
    private String e;

    /* renamed from: a, reason: collision with root package name */
    protected BikeRouteNodeType f7845a = BikeRouteNodeType.LOCATION;
    protected int c = -1;

    public static b create() {
        return new b();
    }

    public int getCityCode() {
        return 0;
    }

    public String getKeyword() {
        return this.b;
    }

    public LatLng getLocation() {
        return this.d;
    }

    public BikeRouteNodeType getType() {
        return this.f7845a;
    }

    public String getUid() {
        return this.e;
    }

    public void setCityCode(int i) {
        this.c = i;
    }

    public void setKeyword(String str) {
        this.b = str;
    }

    public void setLocation(LatLng latLng) {
        this.d = latLng;
    }

    public void setType(BikeRouteNodeType bikeRouteNodeType) {
        this.f7845a = bikeRouteNodeType;
    }

    public void setUid(String str) {
        this.e = str;
    }

    public String toQuery() {
        a aVar = new a();
        aVar.f();
        aVar.a("type").a(this.f7845a.getNativeType());
        aVar.a("uid").b(this.e);
        if (this.b != null) {
            aVar.a("keyword").b(this.b);
        } else {
            aVar.a("keyword").b("");
        }
        aVar.a("keyword2").b("");
        LatLng latLng = this.d;
        if (latLng == null) {
            aVar.a("xy").b("");
        } else if (latLng.longitude == 0.0d || latLng.latitude == 0.0d) {
            aVar.a("xy").b("");
        } else {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            aVar.a("xy").b(String.format("%d,%d", Integer.valueOf((int) ll2mc.getLongitudeE6()), Integer.valueOf((int) ll2mc.getLatitudeE6())));
        }
        aVar.d();
        return aVar.toString();
    }
}
