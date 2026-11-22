package com.wakeup.common.location;

/* loaded from: classes2.dex */
public final class CoordinateUtils {
    private static final double A = 6378245.0d;
    private static final double EE = 0.006693421622965943d;
    private static final double X_PI = 52.35987755982988d;

    private static boolean outOfChina(double lng, double lat) {
        return lng < 72.004d || lng > 137.8347d || lat < 0.8293d || lat > 55.8271d;
    }

    public static double[] bd09ToGcj02(double lng, double lat) {
        double d = lng - 0.0065d;
        double d2 = lat - 0.006d;
        double sqrt = Math.sqrt((d * d) + (d2 * d2)) - (Math.sin(d2 * X_PI) * 2.0E-5d);
        double atan2 = Math.atan2(d2, d) - (Math.cos(d * X_PI) * 3.0E-6d);
        return new double[]{Math.cos(atan2) * sqrt, sqrt * Math.sin(atan2)};
    }

    public static double[] gcj02ToBd09(double lng, double lat) {
        double sqrt = Math.sqrt((lng * lng) + (lat * lat)) + (Math.sin(lat * X_PI) * 2.0E-5d);
        double atan2 = Math.atan2(lat, lng) + (Math.cos(lng * X_PI) * 3.0E-6d);
        return new double[]{(Math.cos(atan2) * sqrt) + 0.0065d, (sqrt * Math.sin(atan2)) + 0.006d};
    }

    public static double[] gcj02ToWGS84(double lng, double lat) {
        if (outOfChina(lng, lat)) {
            return new double[]{lng, lat};
        }
        double d = lng - 105.0d;
        double d2 = lat - 35.0d;
        double transformLat = transformLat(d, d2);
        double transformLng = transformLng(d, d2);
        double d3 = (lat / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d3);
        double d4 = 1.0d - ((0.006693421622965943d * sin) * sin);
        double sqrt = Math.sqrt(d4);
        return new double[]{(lng * 2.0d) - (lng + ((transformLng * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d3)) * 3.141592653589793d))), (lat * 2.0d) - (lat + ((transformLat * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * 3.141592653589793d)))};
    }

    public static double[] wgs84ToGcj02(double lng, double lat) {
        if (outOfChina(lng, lat)) {
            return new double[]{lng, lat};
        }
        double d = lng - 105.0d;
        double d2 = lat - 35.0d;
        double transformLat = transformLat(d, d2);
        double transformLng = transformLng(d, d2);
        double d3 = (lat / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d3);
        double d4 = 1.0d - ((0.006693421622965943d * sin) * sin);
        double sqrt = Math.sqrt(d4);
        return new double[]{lng + ((transformLng * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d3)) * 3.141592653589793d)), lat + ((transformLat * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * 3.141592653589793d))};
    }

    public static double[] bd09ToWGS84(double lng, double lat) {
        double[] bd09ToGcj02 = bd09ToGcj02(lng, lat);
        return gcj02ToWGS84(bd09ToGcj02[0], bd09ToGcj02[1]);
    }

    public static double[] wgs84ToBd09(double lng, double lat) {
        double[] wgs84ToGcj02 = wgs84ToGcj02(lng, lat);
        return gcj02ToBd09(wgs84ToGcj02[0], wgs84ToGcj02[1]);
    }

    public static double[] mercatorToWGS84(double lng, double lat) {
        return new double[]{(lng / 2.003750834E7d) * 180.0d, ((Math.atan(Math.exp((((lat / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d};
    }

    public static double[] wgs84ToMercator(double lng, double lat) {
        return new double[]{(lng * 2.003750834E7d) / 180.0d, ((Math.log(Math.tan(((lat + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d};
    }

    private static double transformLat(double lng, double lat) {
        double d = lng * 2.0d;
        double sqrt = (-100.0d) + d + (lat * 3.0d) + (lat * 0.2d * lat) + (0.1d * lng * lat) + (Math.sqrt(Math.abs(lng)) * 0.2d) + ((((Math.sin((6.0d * lng) * 3.141592653589793d) * 20.0d) + (Math.sin(d * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d2 = lat * 3.141592653589793d;
        return sqrt + ((((Math.sin(d2) * 20.0d) + (Math.sin((lat / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((lat / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d2 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private static double transformLng(double lng, double lat) {
        double d = lng * 0.1d;
        return lng + 300.0d + (lat * 2.0d) + (d * lng) + (d * lat) + (Math.sqrt(Math.abs(lng)) * 0.1d) + ((((Math.sin((6.0d * lng) * 3.141592653589793d) * 20.0d) + (Math.sin((lng * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(lng * 3.141592653589793d) * 20.0d) + (Math.sin((lng / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((lng / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((lng / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }
}
