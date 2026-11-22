package com.wakeup.commponent.module.sport.util;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class GMapUtils {
    private static final double DEGREES_TO_RADIANS = 57.29577951308232d;

    private GMapUtils() {
    }

    public static double calculateLineDistance(LatLng latLng, LatLng latLng2) {
        return calclateArc(latLng.latitude, latLng.longitude, latLng2.latitude, latLng2.longitude) * 6378.1d * 1000.0d;
    }

    private static double calclateArc(double d, double d2, double d3, double d4) {
        double d5 = d / DEGREES_TO_RADIANS;
        double d6 = d2 / DEGREES_TO_RADIANS;
        double d7 = d3 / DEGREES_TO_RADIANS;
        double d8 = d4 / DEGREES_TO_RADIANS;
        return Math.acos((Math.cos(d5) * Math.cos(d6) * Math.cos(d7) * Math.cos(d8)) + (Math.cos(d5) * Math.sin(d6) * Math.cos(d7) * Math.sin(d8)) + (Math.sin(d5) * Math.sin(d7)));
    }
}
