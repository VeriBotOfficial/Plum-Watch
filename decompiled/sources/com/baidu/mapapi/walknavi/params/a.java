package com.baidu.mapapi.walknavi.params;

import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* compiled from: RouteNodeInfo.java */
/* loaded from: classes13.dex */
public abstract class a {
    protected String b;
    protected LatLng c;
    protected String g;

    /* renamed from: a, reason: collision with root package name */
    protected RouteNodeType f8236a = RouteNodeType.LOCATION;
    protected int d = -1;
    protected String e = "";
    protected String f = "";

    public String getBuildingID() {
        return this.f;
    }

    public int getCitycode() {
        return this.d;
    }

    public String getFloorID() {
        return this.e;
    }

    public String getKeyword() {
        return this.b;
    }

    public LatLng getLocation() {
        return this.c;
    }

    public RouteNodeType getType() {
        return this.f8236a;
    }

    public String getUid() {
        return this.g;
    }

    public abstract void setBuildingID(String str);

    public void setCitycode(int i) {
        this.d = i;
    }

    public abstract void setFloorID(String str);

    public abstract void setKeyword(String str);

    public abstract void setLocation(LatLng latLng);

    public abstract void setType(RouteNodeType routeNodeType);

    public void setUid(String str) {
        this.g = str;
    }

    public String toQuery() {
        com.baidu.platform.comapi.wnplatform.e.f.a aVar = new com.baidu.platform.comapi.wnplatform.e.f.a();
        aVar.f();
        aVar.a("type").a(this.f8236a.getNativeType());
        aVar.a("uid").b(this.g);
        if (this.b != null) {
            aVar.a("keyword").b(this.b);
        } else {
            aVar.a("keyword").b("");
        }
        aVar.a("keyword2").b("");
        LatLng latLng = this.c;
        if (latLng == null) {
            aVar.a("xy").b("");
        } else if (latLng.longitude == 0.0d || latLng.latitude == 0.0d) {
            aVar.a("xy").b("");
        } else {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            aVar.a("xy").b(String.format("%d,%d", Integer.valueOf((int) ll2mc.getLongitudeE6()), Integer.valueOf((int) ll2mc.getLatitudeE6())));
        }
        RouteNodeType routeNodeType = this.f8236a;
        if (routeNodeType == RouteNodeType.KEYWORD || (routeNodeType == RouteNodeType.LOCATION && PermissionUtils.getInstance().isIndoorNaviAuthorized())) {
            if (!TextUtils.isEmpty(this.e)) {
                aVar.a(Const.JSON_KEY_FLOOR).b(this.e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                aVar.a("building").b(this.f);
            }
            if (this.d != -1) {
                aVar.a("city").a(this.d);
            }
        }
        aVar.d();
        return aVar.toString();
    }
}
