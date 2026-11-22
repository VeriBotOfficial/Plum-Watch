package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import com.amap.api.location.DPoint;
import com.autonavi.util.a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class OffsetUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final double f6704a = 6378245.0d;
    private static final List<DPoint> b = new ArrayList(Arrays.asList(new DPoint(23.379947d, 119.757001d), new DPoint(24.983296d, 120.474496d), new DPoint(25.518722d, 121.359866d), new DPoint(25.41329d, 122.443582d), new DPoint(24.862708d, 122.288354d), new DPoint(24.461292d, 122.188319d), new DPoint(21.584761d, 120.968923d), new DPoint(21.830837d, 120.654445d)));
    public static final double ee = 0.006693421622965943d;

    private static double a(double d, int i) {
        return new BigDecimal(d).setScale(i, 4).doubleValue();
    }

    public static DPoint b2G(DPoint dPoint) {
        if (dPoint != null) {
            try {
                if (CoreUtil.isChina(dPoint.getLatitude(), dPoint.getLongitude())) {
                    return a(dPoint, 2);
                }
                if (isInTaiWan(dPoint.getLatitude(), dPoint.getLongitude())) {
                    DPoint a2 = a(dPoint, 2);
                    double latitude = a2.getLatitude();
                    double longitude = a2.getLongitude();
                    double d = longitude - 105.0d;
                    double d2 = latitude - 35.0d;
                    double transformLat = transformLat(d, d2);
                    double transformLon = transformLon(d, d2);
                    double d3 = (latitude / 180.0d) * 3.141592653589793d;
                    double sin = Math.sin(d3);
                    double d4 = 1.0d - ((0.006693421622965943d * sin) * sin);
                    double sqrt = Math.sqrt(d4);
                    DPoint dPoint2 = new DPoint(((transformLat * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * 3.141592653589793d)) + latitude, ((transformLon * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d3)) * 3.141592653589793d)) + longitude);
                    return new DPoint((latitude * 2.0d) - dPoint2.getLatitude(), (longitude * 2.0d) - dPoint2.getLongitude());
                }
            } catch (Throwable th) {
                CoreUtil.reportError(th, "OffsetUtil", "b2G");
            }
        }
        return dPoint;
    }

    public static boolean isInTaiWan(double d, double d2) {
        return CoreUtil.isInPolygon(new DPoint(d, d2), b);
    }

    public static DPoint marbar2G(Context context, DPoint dPoint) {
        try {
            if (!CoreUtil.isChina(dPoint.getLatitude(), dPoint.getLongitude())) {
                return dPoint;
            }
            double longitude = ((long) (dPoint.getLongitude() * 100000.0d)) % 36000000;
            double latitude = ((long) (dPoint.getLatitude() * 100000.0d)) % 36000000;
            double d = (int) ((-xConvert(longitude, latitude)) + longitude);
            double d2 = (int) ((-yConvert(longitude, latitude)) + latitude);
            int i = 1;
            double d3 = (int) ((-xConvert(d, d2)) + longitude + (longitude > 0.0d ? 1 : -1));
            double d4 = (-yConvert(d3, d2)) + latitude;
            if (latitude <= 0.0d) {
                i = -1;
            }
            return offset(context, new DPoint(((int) (d4 + i)) / 100000.0d, d3 / 100000.0d));
        } catch (Throwable th) {
            CoreUtil.reportError(th, "OffsetUtil", "marbar2G");
            return dPoint;
        }
    }

    public static DPoint offset(Context context, double d, double d2) {
        if (context == null) {
            return null;
        }
        return offset(context, new DPoint(d2, d));
    }

    public static double transformLat(double d, double d2) {
        double d3 = d * 2.0d;
        double sqrt = (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d4 = d2 * 3.141592653589793d;
        return sqrt + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static double transformLon(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static double xConvert(double d, double d2) {
        return (Math.cos(d2 / 100000.0d) * (d / 18000.0d)) + (Math.sin(d / 100000.0d) * (d2 / 9000.0d));
    }

    public static double yConvert(double d, double d2) {
        return (Math.sin(d2 / 100000.0d) * (d / 18000.0d)) + (Math.cos(d / 100000.0d) * (d2 / 9000.0d));
    }

    private static DPoint a(DPoint dPoint, int i) {
        double d = 0.006401062d;
        double d2 = 0.0060424805d;
        DPoint dPoint2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            double longitude = dPoint.getLongitude();
            double latitude = dPoint.getLatitude();
            dPoint2 = new DPoint();
            double d3 = longitude - d;
            double d4 = latitude - d2;
            DPoint dPoint3 = new DPoint();
            double d5 = d3 * 3000.0d * 0.017453292519943295d;
            double d6 = 3000.0d * d4 * 0.017453292519943295d;
            double d7 = (d3 * d3) + (d4 * d4);
            double cos = Math.cos((Math.cos(d5) * 3.0E-6d) + Math.atan2(d4, d3)) * ((Math.sin(d6) * 2.0E-5d) + Math.sqrt(d7));
            double sin = (Math.sin((Math.cos(d5) * 3.0E-6d) + Math.atan2(d4, d3)) * ((Math.sin(d6) * 2.0E-5d) + Math.sqrt(d7))) + 0.006d;
            dPoint3.setLongitude(a(cos + 0.0065d, 8));
            dPoint3.setLatitude(a(sin, 8));
            dPoint2.setLongitude(a((longitude + d3) - dPoint3.getLongitude(), 8));
            dPoint2.setLatitude(a((latitude + d4) - dPoint3.getLatitude(), 8));
            d = dPoint.getLongitude() - dPoint2.getLongitude();
            d2 = dPoint.getLatitude() - dPoint2.getLatitude();
        }
        return dPoint2;
    }

    public static DPoint offset(Context context, DPoint dPoint) {
        if (context == null) {
            return null;
        }
        try {
            if (CoreUtil.isChina(dPoint.getLatitude(), dPoint.getLongitude())) {
                double[] a2 = a.a(dPoint.getLongitude(), dPoint.getLatitude());
                return new DPoint(a2[1], a2[0]);
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "OffsetUtil", "cover part2");
        }
        return dPoint;
    }
}
