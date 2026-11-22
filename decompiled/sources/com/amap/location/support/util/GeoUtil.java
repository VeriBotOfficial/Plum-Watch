package com.amap.location.support.util;

/* loaded from: classes11.dex */
public class GeoUtil {
    public static final float PI = 3.1415927f;
    public static final float PI180 = 0.017453292f;
    public static final float Rc = 6378137.0f;
    public static final float Rj = 6356725.0f;

    public static double dist(double d, double d2, double d3, double d4) {
        double d5 = (((90.0d - d2) * 21412.0d) / 90.0d) + 6356725.0d;
        double cos = ((d3 * 0.01745329238474369d) - (d * 0.01745329238474369d)) * Math.cos((3.1415927410125732d * d2) / 180.0d) * d5;
        double d6 = ((d4 * 0.01745329238474369d) - (d2 * 0.01745329238474369d)) * d5;
        return Math.pow((cos * cos) + (d6 * d6), 0.5d);
    }
}
