package com.wakeup.commponent.module.sport.util;

import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.commponent.module.sport.LocationEntity;
import java.util.List;

/* loaded from: classes2.dex */
public class LocationUtil {
    private LocationUtil() {
    }

    public static double getDistance(List<LocationEntity> list) {
        double d = 0.0d;
        if (!CollectionUtils.isEmpty(list) && list.size() != 1) {
            int i = 0;
            while (i < list.size() - 1) {
                LocationEntity locationEntity = list.get(i);
                i++;
                d += getDistance(locationEntity, list.get(i));
            }
        }
        return d;
    }

    public static double getDistance(LocationEntity locationEntity, LocationEntity locationEntity2) {
        return gMapGetDistance(locationEntity, locationEntity2);
    }

    private static double aMapGetDistance(LocationEntity locationEntity, LocationEntity locationEntity2) {
        return AMapUtils.calculateLineDistance(new LatLng(locationEntity.getLatitude(), locationEntity.getLongitude()), new LatLng(locationEntity2.getLatitude(), locationEntity2.getLongitude()));
    }

    public static double aMapGetDistance(List<LatLng> list) {
        double d = 0.0d;
        int i = 0;
        while (i < list.size() - 1) {
            LatLng latLng = list.get(i);
            i++;
            d += AMapUtils.calculateLineDistance(latLng, list.get(i));
        }
        return d;
    }

    public static double gMapGetDistance(List<com.google.android.gms.maps.model.LatLng> list) {
        double d = 0.0d;
        int i = 0;
        while (i < list.size() - 1) {
            com.google.android.gms.maps.model.LatLng latLng = list.get(i);
            i++;
            d += GMapUtils.calculateLineDistance(latLng, list.get(i));
        }
        return d;
    }

    private static double gMapGetDistance(LocationEntity locationEntity, LocationEntity locationEntity2) {
        return GMapUtils.calculateLineDistance(new com.google.android.gms.maps.model.LatLng(locationEntity.getLatitude(), locationEntity.getLongitude()), new com.google.android.gms.maps.model.LatLng(locationEntity2.getLatitude(), locationEntity2.getLongitude()));
    }

    public static float getAngle(LatLng latLng, LatLng latLng2) {
        double d = latLng.latitude;
        double d2 = latLng.longitude;
        double d3 = latLng2.latitude;
        double d4 = latLng2.longitude - d2;
        double degrees = Math.toDegrees(Math.atan2(Math.sin(d4) * Math.cos(d3), (Math.cos(d) * Math.sin(d3)) - ((Math.sin(d) * Math.cos(d3)) * Math.cos(d4))));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        return (float) degrees;
    }
}
