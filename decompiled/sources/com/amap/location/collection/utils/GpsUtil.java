package com.amap.location.collection.utils;

import com.amap.location.support.bean.location.AmapLocationGnss;

/* loaded from: classes11.dex */
public class GpsUtil {
    private static final String TAG = "GpsUtil";

    public static boolean isValid(AmapLocationGnss amapLocationGnss) {
        if (amapLocationGnss == null || !"gps".equalsIgnoreCase(amapLocationGnss.provider)) {
            return false;
        }
        double d = amapLocationGnss.latitude;
        if (d <= -90.0d || d >= 90.0d) {
            return false;
        }
        double d2 = amapLocationGnss.longitude;
        return d2 > -180.0d && d2 < 180.0d;
    }

    public static void transformGps(AmapLocationGnss amapLocationGnss, short s, byte b, AmapLocationGnss amapLocationGnss2, long j, long j2) {
        amapLocationGnss.aveSnr = s;
        amapLocationGnss.satelliteCount = b;
        transformGps(amapLocationGnss, amapLocationGnss2, j, j2);
    }

    public static void transformGps(AmapLocationGnss amapLocationGnss, AmapLocationGnss amapLocationGnss2, long j, long j2) {
        amapLocationGnss.nmeaTime = j;
        amapLocationGnss.locationUtcTime = j;
        amapLocationGnss.sytemUtcTime = j2;
        amapLocationGnss.longitude = amapLocationGnss2.longitude;
        amapLocationGnss.latitude = amapLocationGnss2.latitude;
        amapLocationGnss.altitude = amapLocationGnss2.altitude;
        amapLocationGnss.accuracy = amapLocationGnss2.accuracy;
        amapLocationGnss.speed = amapLocationGnss2.speed;
        amapLocationGnss.bearing = amapLocationGnss2.bearing;
    }
}
