package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.location.CoordinateUtil;

/* compiled from: MapUtils.java */
/* loaded from: classes13.dex */
public class l {
    public static GeoPoint a(GeoPoint geoPoint) {
        Point bd09llTobd09mc = CoordinateUtil.bd09llTobd09mc(geoPoint.getLongitude(), geoPoint.getLatitude());
        if (bd09llTobd09mc != null) {
            return new GeoPoint(bd09llTobd09mc.getDoubleY(), bd09llTobd09mc.getDoubleX());
        }
        return null;
    }
}
