package com.baidu.mapsdkplatform.comapi.map;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.Point;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GeodesicLineAlgorithm.java */
/* loaded from: classes13.dex */
public class f {
    private static double a(double d) {
        return (d / 3.141592653589793d) * 180.0d;
    }

    private static double a(LatLng latLng, LatLng latLng2) {
        double b = b(latLng.latitude);
        double b2 = b(latLng2.latitude);
        double b3 = b(latLng.longitude);
        return Math.acos((Math.sin(b) * Math.sin(b2)) + (Math.cos(b) * Math.cos(b2) * Math.cos(Math.abs(b(latLng2.longitude) - b3))));
    }

    private static double b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static List<LatLng> b(LatLng latLng, LatLng latLng2) {
        double c = c(latLng, latLng2);
        ArrayList arrayList = new ArrayList();
        if (150000.0d > c || c < 250000.0d) {
            arrayList.add(latLng);
            arrayList.add(latLng2);
            return arrayList;
        }
        double round = Math.round(c / 150000.0d);
        double a2 = a(latLng, latLng2);
        arrayList.add(latLng);
        double d = 0.0d;
        while (d < round) {
            LatLng latLng3 = latLng;
            LatLng latLng4 = latLng2;
            arrayList.add(a(latLng3, latLng4, d / round, a2));
            d += 1.0d;
            latLng = latLng3;
            latLng2 = latLng4;
        }
        arrayList.add(latLng2);
        return arrayList;
    }

    public static double c(LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
            Point ll2point = CoordUtil.ll2point(latLng);
            Point ll2point2 = CoordUtil.ll2point(latLng2);
            if (ll2point != null && ll2point2 != null) {
                return CoordUtil.getDistance(ll2point, ll2point2);
            }
        }
        return -1.0d;
    }

    private static LatLng a(LatLng latLng, LatLng latLng2, double d, double d2) {
        double d3 = latLng.latitude;
        double d4 = latLng2.latitude;
        double d5 = latLng.longitude;
        double d6 = latLng2.longitude;
        double sin = Math.sin((1.0d - d) * d2) / Math.sin(d2);
        double sin2 = Math.sin(d * d2) / Math.sin(d2);
        double b = b(d3);
        double b2 = b(d4);
        double b3 = b(d5);
        double b4 = b(d6);
        double cos = (Math.cos(b) * sin * Math.cos(b3)) + (Math.cos(b2) * sin2 * Math.cos(b4));
        double cos2 = (Math.cos(b) * sin * Math.sin(b3)) + (Math.cos(b2) * sin2 * Math.sin(b4));
        return new LatLng(a(Math.atan2((sin * Math.sin(b)) + (sin2 * Math.sin(b2)), Math.sqrt(Math.pow(cos, 2.0d) + Math.pow(cos2, 2.0d)))), a(Math.atan2(cos2, cos)));
    }
}
