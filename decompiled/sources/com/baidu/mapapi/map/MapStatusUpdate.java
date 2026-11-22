package com.baidu.mapapi.map;

import android.graphics.Point;
import android.util.Log;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes13.dex */
public final class MapStatusUpdate {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7939a = "MapStatusUpdate";
    private int b;
    MapStatus c;
    LatLng d;
    LatLngBounds e;
    int f;
    int g;
    float h;
    int i;
    int j;
    float k;
    Point l;
    int m = 0;
    int n = 0;
    int o = 0;
    int p = 0;

    private MapStatusUpdate() {
    }

    MapStatus a(com.baidu.mapsdkplatform.comapi.map.b bVar, MapStatus mapStatus) {
        Point point;
        if (bVar == null || mapStatus == null) {
            return null;
        }
        Point point2 = mapStatus.targetScreen;
        Point point3 = bVar.X;
        if (point3 != null) {
            if (point2 != null && (point = bVar.W) != null && (point.x != point3.x || point.y != point3.y)) {
                point2 = point;
            }
            bVar.X = null;
        } else {
            bVar.W = point2;
        }
        Point point4 = point2;
        switch (this.b) {
            case 1:
                MapStatus mapStatus2 = this.c;
                if (mapStatus2.targetScreen == null) {
                    MapStatus mapStatus3 = this.c;
                    break;
                }
                break;
            case 3:
                LatLngBounds latLngBounds = this.e;
                if (latLngBounds != null) {
                    GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.southwest);
                    GeoPoint ll2mc2 = CoordUtil.ll2mc(this.e.northeast);
                    double longitudeE6 = ll2mc.getLongitudeE6();
                    double latitudeE6 = ll2mc2.getLatitudeE6();
                    double longitudeE62 = ll2mc2.getLongitudeE6();
                    int latitudeE62 = (int) ll2mc.getLatitudeE6();
                    WinRound winRound = mapStatus.c.j;
                    break;
                }
                break;
            case 5:
                GeoPoint a2 = bVar.a((bVar.E() / 2) + this.i, (bVar.r() / 2) + this.j);
                break;
            case 7:
                Point point5 = this.l;
                break;
            case 9:
                LatLngBounds latLngBounds2 = this.e;
                if (latLngBounds2 != null) {
                    GeoPoint ll2mc3 = CoordUtil.ll2mc(latLngBounds2.southwest);
                    GeoPoint ll2mc4 = CoordUtil.ll2mc(this.e.northeast);
                    break;
                }
                break;
            case 10:
                if (this.e != null) {
                    int E = (bVar.E() - this.m) - this.o;
                    if (E < 0) {
                        E = bVar.E();
                        Log.e(f7939a, "Bound paddingLeft or paddingRight too larger, please check");
                    }
                    int r = (bVar.r() - this.n) - this.p;
                    if (r < 0) {
                        r = bVar.r();
                        Log.e(f7939a, "Bound paddingTop or paddingBottom too larger, please check");
                    }
                    float a3 = a(this.e, bVar, E, r);
                    LatLng a4 = a(this.e, bVar, a(a3));
                    if (a4 != null) {
                        bVar.X = new Point(this.m + (E / 2), this.n + (r / 2));
                        boolean a5 = a(this.e, bVar);
                        boolean a6 = a(this.m, this.n, this.o, this.p, bVar);
                        if (!a5 && !a6) {
                            if (bVar.s() != null) {
                                break;
                            }
                        } else {
                            MapStatus mapStatus4 = new MapStatus(0.0f, a4, mapStatus.overlook, a3, bVar.X, null);
                            bVar.a(a(mapStatus4));
                            break;
                        }
                    } else {
                        Log.e(f7939a, "Bound center error");
                        break;
                    }
                }
                break;
            case 11:
                if (this.e != null) {
                    int E2 = (bVar.E() - this.m) - this.o;
                    if (E2 < 0) {
                        E2 = bVar.E();
                        Log.e(f7939a, "Bound paddingLeft or paddingRight too larger, please check");
                    }
                    int i = E2;
                    int r2 = (bVar.r() - this.n) - this.p;
                    if (r2 < 0) {
                        r2 = bVar.r();
                        Log.e(f7939a, "Bound paddingTop or paddingBottom too larger, please check");
                    }
                    int i2 = r2;
                    GeoPoint ll2mc5 = CoordUtil.ll2mc(this.e.southwest);
                    GeoPoint ll2mc6 = CoordUtil.ll2mc(this.e.northeast);
                    float a7 = bVar.a((int) ll2mc5.getLongitudeE6(), (int) ll2mc6.getLatitudeE6(), (int) ll2mc6.getLongitudeE6(), (int) ll2mc5.getLatitudeE6(), i, i2);
                    bVar.X = new Point(this.m + (i / 2), this.n + (i2 / 2));
                    break;
                }
                break;
        }
        return null;
    }

    MapStatusUpdate(int i) {
        this.b = i;
    }

    private float a(LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.b bVar, int i, int i2) {
        GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.southwest);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLngBounds.northeast);
        int longitudeE6 = (int) ll2mc.getLongitudeE6();
        int latitudeE6 = (int) ll2mc.getLatitudeE6();
        return bVar.a(longitudeE6, (int) ll2mc2.getLatitudeE6(), (int) ll2mc2.getLongitudeE6(), latitudeE6, i, i2);
    }

    private boolean a(LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.b bVar) {
        MapStatusUpdate s = bVar.s();
        if (s == null) {
            return true;
        }
        LatLng latLng = latLngBounds.southwest;
        double d = latLng.latitude;
        double d2 = latLng.longitude;
        LatLng latLng2 = latLngBounds.northeast;
        double d3 = latLng2.latitude;
        double d4 = latLng2.longitude;
        LatLngBounds latLngBounds2 = s.e;
        LatLng latLng3 = latLngBounds2.southwest;
        double d5 = latLng3.latitude;
        double d6 = latLng3.longitude;
        LatLng latLng4 = latLngBounds2.northeast;
        return (d == d5 && d2 == d6 && d3 == latLng4.latitude && d4 == latLng4.longitude) ? false : true;
    }

    private boolean a(int i, int i2, int i3, int i4, com.baidu.mapsdkplatform.comapi.map.b bVar) {
        MapStatusUpdate s = bVar.s();
        return (s != null && i == s.m && i2 == s.n && i3 == s.o && i4 == s.p) ? false : true;
    }

    private LatLng a(LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.b bVar, float f) {
        double longitudeE6;
        double latitudeE6;
        double latitudeE62;
        if (latLngBounds == null || bVar == null) {
            return null;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.getCenter());
        int i = this.m;
        double d = i * f;
        int i2 = this.o;
        double d2 = i2 * f;
        double d3 = this.n * f;
        double d4 = this.p * f;
        if (i > i2) {
            longitudeE6 = ll2mc.getLongitudeE6() - ((d - d2) / 2.0d);
        } else if (i < i2) {
            longitudeE6 = ll2mc.getLongitudeE6() + ((d2 - d) / 2.0d);
        } else {
            longitudeE6 = ll2mc.getLongitudeE6();
        }
        int i3 = this.n;
        int i4 = this.p;
        if (i3 < i4) {
            latitudeE62 = ll2mc.getLatitudeE6() - ((d4 - d3) / 2.0d);
        } else if (i3 > i4) {
            latitudeE62 = ll2mc.getLatitudeE6();
            d3 -= d4;
        } else {
            latitudeE6 = ll2mc.getLatitudeE6();
            return CoordUtil.mc2ll(new GeoPoint(latitudeE6, longitudeE6));
        }
        latitudeE6 = latitudeE62 + (d3 / 2.0d);
        return CoordUtil.mc2ll(new GeoPoint(latitudeE6, longitudeE6));
    }

    private MapStatusUpdate a(MapStatus mapStatus) {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate();
        synchronized (this) {
            mapStatusUpdate.c = mapStatus;
            mapStatusUpdate.e = this.e;
            mapStatusUpdate.m = this.m;
            mapStatusUpdate.n = this.n;
            mapStatusUpdate.o = this.o;
            mapStatusUpdate.p = this.p;
        }
        return mapStatusUpdate;
    }

    private float a(float f) {
        return (float) (Math.pow(2.0d, 18.0f - f) / SysOSUtil.getDensityDpi());
    }
}
