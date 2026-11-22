package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmArc;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class Arc extends Overlay {
    int g;
    int h;
    LatLng i;
    LatLng j;
    LatLng k;
    boolean l = true;
    double m;
    double n;
    double o;
    boolean p;

    /* renamed from: q, reason: collision with root package name */
    com.baidu.platform.comapi.bmsdk.b f7854q;
    LatLng r;
    private BmArc s;
    BmLineStyle t;

    Arc() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.arc;
    }

    private void a(double d, double d2, double d3) {
        if (d < d2) {
            if (d >= d3) {
                if (d <= d3 || d2 < d3 || d2 <= d3) {
                    return;
                }
                this.n = d;
                this.o = d3 + 6.283185307179586d;
                this.p = false;
                return;
            }
            if (d2 < d3) {
                this.n = d;
                this.o = d3;
                this.p = false;
                return;
            } else {
                if (d2 > d3) {
                    this.n = d3;
                    this.o = d + 6.283185307179586d;
                    this.p = false;
                    return;
                }
                return;
            }
        }
        if (d > d2) {
            if (d < d3) {
                if (d2 < d3) {
                    this.n = d3;
                    this.o = d + 6.283185307179586d;
                    this.p = false;
                    return;
                }
                return;
            }
            if (d > d3) {
                if (d2 < d3) {
                    this.n = d;
                    this.o = d3 + 6.283185307179586d;
                    this.p = false;
                } else if (d2 > d3) {
                    this.n = d3;
                    this.o = d;
                    this.p = false;
                }
            }
        }
    }

    private double b(GeoPoint geoPoint, GeoPoint geoPoint2) {
        double longitudeE6 = geoPoint.getLongitudeE6();
        double latitudeE6 = geoPoint.getLatitudeE6();
        double longitudeE62 = longitudeE6 - geoPoint2.getLongitudeE6();
        double latitudeE62 = latitudeE6 - geoPoint2.getLatitudeE6();
        return Math.sqrt((longitudeE62 * longitudeE62) + (latitudeE62 * latitudeE62));
    }

    private void c() {
        LatLng latLng = this.i;
        if (latLng == null && this.j == null && this.k == null) {
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(this.j);
        GeoPoint ll2mc3 = CoordUtil.ll2mc(this.k);
        GeoPoint a2 = a(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6(), ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6(), ll2mc3.getLongitudeE6(), ll2mc3.getLatitudeE6());
        this.f7854q = new com.baidu.platform.comapi.bmsdk.b(a2.getLongitudeE6(), a2.getLatitudeE6());
        this.m = b(ll2mc, a2);
        a(a(ll2mc, a2), a(ll2mc2, a2), a(ll2mc3, a2));
    }

    public BmArc getBmArc() {
        return this.s;
    }

    public int getColor() {
        return this.g;
    }

    public LatLng getEndPoint() {
        return this.k;
    }

    public LatLng getMiddlePoint() {
        return this.j;
    }

    public LatLng getStartPoint() {
        return this.i;
    }

    public int getWidth() {
        return this.h;
    }

    public boolean isClickable() {
        return this.l;
    }

    public void setClickable(boolean z) {
        this.l = z;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        BmArc bmArc = this.s;
        if (bmArc == null || this.f == null || this.t == null) {
            return;
        }
        bmArc.a(z);
        this.f.b();
    }

    public void setColor(int i) {
        BmLineStyle bmLineStyle;
        this.g = i;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        if (this.s == null || this.f == null || (bmLineStyle = this.t) == null) {
            return;
        }
        bmLineStyle.a(this.g);
        this.s.a(this.t);
        this.f.b();
    }

    public void setPoints(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        BmLineStyle bmLineStyle;
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new IllegalArgumentException("BDMapSDKException:start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new IllegalArgumentException("BDMapSDKException: start and middle and end points can not be same");
        }
        this.i = latLng;
        this.j = latLng2;
        this.k = latLng3;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        if (this.s == null || this.f == null || (bmLineStyle = this.t) == null) {
            return;
        }
        bmLineStyle.a(this.g);
        c();
        this.s.a(this.f7854q);
        this.s.c(this.p);
        this.s.a(this.o);
        this.s.c(this.n);
        this.s.b(this.m);
        this.f.b();
    }

    public void setWidth(int i) {
        BmLineStyle bmLineStyle;
        if (i > 0) {
            this.h = i;
            if (!OverlayUtil.isOverlayUpgrade()) {
                this.listener.c(this);
                return;
            }
            if (this.s == null || this.f == null || (bmLineStyle = this.t) == null) {
                return;
            }
            bmLineStyle.a(i);
            this.s.a(this.t);
            this.f.b();
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    public BmDrawItem toDrawItem() {
        BmArc bmArc = new BmArc();
        this.s = bmArc;
        bmArc.a(this);
        setDrawItem(this.s);
        super.toDrawItem();
        BmLineStyle bmLineStyle = new BmLineStyle();
        this.t = bmLineStyle;
        bmLineStyle.a(this.h);
        this.t.a(this.g);
        this.s.a(this.t);
        if (this.i == null || this.j == null || this.k == null) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.r);
            if (ll2mc != null) {
                this.f7854q = new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6());
            }
        } else {
            c();
        }
        this.s.a(this.f7854q);
        this.s.c(this.p);
        this.s.a(this.o);
        this.s.c(this.n);
        this.s.b(this.m);
        this.s.a(this.l);
        return this.s;
    }

    private double a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        double latitudeE6 = geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6();
        double longitudeE6 = geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6();
        if (longitudeE6 == 0.0d) {
            longitudeE6 = 1.0E-5d;
        }
        if (latitudeE6 == 0.0d) {
            latitudeE6 = 1.0E-5d;
        }
        double atan = Math.atan(latitudeE6 / longitudeE6);
        return (longitudeE6 <= 0.0d || latitudeE6 <= 0.0d) ? ((longitudeE6 >= 0.0d || latitudeE6 <= 0.0d) && (longitudeE6 >= 0.0d || latitudeE6 >= 0.0d)) ? atan + 6.283185307179586d : atan + 3.141592653589793d : atan * 1.0d;
    }

    private GeoPoint a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = (d + d3) / 2.0d;
        double d9 = (d2 + d4) / 2.0d;
        double d10 = (d3 + d5) / 2.0d;
        double d11 = (d4 + d6) / 2.0d;
        double d12 = d4 - d2;
        if (d12 == 0.0d) {
            double d13 = d6 - d4;
            if (d13 == 0.0d) {
                return null;
            }
            d7 = ((((d5 - d3) * (-1.0d)) / d13) * (d8 - d10)) + d11;
        } else {
            double d14 = ((d3 - d) * (-1.0d)) / d12;
            double d15 = d6 - d4;
            if (d15 == 0.0d) {
                d7 = d9 + (d14 * (d10 - d8));
                d8 = d10;
            } else {
                double d16 = ((d5 - d3) * (-1.0d)) / d15;
                if (d14 == d16) {
                    return null;
                }
                double d17 = (((d11 - d9) + (d14 * d8)) - (d10 * d16)) / (d14 - d16);
                d7 = d9 + (d14 * (d17 - d8));
                d8 = d17;
            }
        }
        return new GeoPoint(d7, d8);
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this.i);
        arrayList.add(this.j);
        arrayList.add(this.k);
        GeoPoint ll2mc = CoordUtil.ll2mc((LatLng) arrayList.get(0));
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("width", this.h);
        Overlay.c(arrayList, bundle);
        Overlay.d(this.g, bundle);
        bundle.putInt("isClickable", this.l ? 1 : 0);
        return bundle;
    }
}
