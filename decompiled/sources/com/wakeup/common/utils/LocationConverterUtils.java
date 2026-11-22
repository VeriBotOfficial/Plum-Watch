package com.wakeup.common.utils;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.maps.LocationSource;

/* loaded from: classes2.dex */
public class LocationConverterUtils {
    private static final double RANGE_LAT_MAX = 55.8271d;
    private static final double RANGE_LAT_MIN = 0.8293d;
    private static final double RANGE_LON_MAX = 137.8347d;
    private static final double RANGE_LON_MIN = 72.004d;
    private static final double jzA = 6378245.0d;
    private static final double jzEE = 0.006693421622965943d;

    public static boolean outOfChina(double lat, double lon) {
        return lon < RANGE_LON_MIN || lon > RANGE_LON_MAX || lat < RANGE_LAT_MIN || lat > RANGE_LAT_MAX;
    }

    private static final double LAT_OFFSET_0(double x, double y) {
        return ((2.0d * x) - 100.0d) + (3.0d * y) + (y * 0.2d * y) + (0.1d * x * y) + (Math.sqrt(Math.abs(x)) * 0.2d);
    }

    private static final double LAT_OFFSET_1(double x, double y) {
        return (((Math.sin((6.0d * x) * 3.141592653589793d) * 20.0d) + (Math.sin((x * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d;
    }

    private static final double LAT_OFFSET_2(double x, double y) {
        return (((Math.sin(y * 3.141592653589793d) * 20.0d) + (Math.sin((y / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d;
    }

    private static final double LAT_OFFSET_3(double x, double y) {
        return (((Math.sin((y / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin((y * 3.141592653589793d) / 30.0d) * 320.0d)) * 2.0d) / 3.0d;
    }

    private static final double LON_OFFSET_0(double x, double y) {
        double d = x * 0.1d;
        return 300.0d + x + (2.0d * y) + (d * x) + (d * y) + (Math.sqrt(Math.abs(x)) * 0.1d);
    }

    private static final double LON_OFFSET_1(double x, double y) {
        return (((Math.sin((6.0d * x) * 3.141592653589793d) * 20.0d) + (Math.sin((x * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d;
    }

    private static final double LON_OFFSET_2(double x, double y) {
        return (((Math.sin(x * 3.141592653589793d) * 20.0d) + (Math.sin((x / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d;
    }

    private static final double LON_OFFSET_3(double x, double y) {
        return (((Math.sin((x / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((x / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d;
    }

    public static double transformLat(double x, double y) {
        return LAT_OFFSET_0(x, y) + LAT_OFFSET_1(x, y) + LAT_OFFSET_2(x, y) + LAT_OFFSET_3(x, y);
    }

    public static double transformLon(double x, double y) {
        return LON_OFFSET_0(x, y) + LON_OFFSET_1(x, y) + LON_OFFSET_2(x, y) + LON_OFFSET_3(x, y);
    }

    public static LatLng gcj02Encrypt(double ggLat, double ggLon) {
        LatLng latLng = new LatLng();
        if (outOfChina(ggLat, ggLon)) {
            latLng.latitude = ggLat;
            latLng.longitude = ggLon;
            return latLng;
        }
        double d = ggLon - 105.0d;
        double d2 = ggLat - 35.0d;
        double transformLat = transformLat(d, d2);
        double transformLon = transformLon(d, d2);
        double d3 = (ggLat / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d3);
        double d4 = 1.0d - ((0.006693421622965943d * sin) * sin);
        double sqrt = Math.sqrt(d4);
        double cos = ggLon + ((transformLon * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d3)) * 3.141592653589793d));
        latLng.latitude = ggLat + ((transformLat * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * 3.141592653589793d));
        latLng.longitude = cos;
        return latLng;
    }

    public static LatLng gcj02Decrypt(double gjLat, double gjLon) {
        LatLng gcj02Encrypt = gcj02Encrypt(gjLat, gjLon);
        double d = gcj02Encrypt.longitude - gjLon;
        double d2 = gcj02Encrypt.latitude - gjLat;
        LatLng latLng = new LatLng();
        latLng.latitude = gjLat - d2;
        latLng.longitude = gjLon - d;
        return latLng;
    }

    public static LatLng bd09Decrypt(double bdLat, double bdLon) {
        LatLng latLng = new LatLng();
        double d = bdLon - 0.0065d;
        double d2 = bdLat - 0.006d;
        double sqrt = Math.sqrt((d * d) + (d2 * d2)) - (Math.sin(d2 * 3.141592653589793d) * 2.0E-5d);
        double atan2 = Math.atan2(d2, d) - (Math.cos(d * 3.141592653589793d) * 3.0E-6d);
        latLng.longitude = Math.cos(atan2) * sqrt;
        latLng.latitude = sqrt * Math.sin(atan2);
        return latLng;
    }

    public static LatLng bd09Encrypt(double ggLat, double ggLon) {
        LatLng latLng = new LatLng();
        double sqrt = Math.sqrt((ggLon * ggLon) + (ggLat * ggLat)) + (Math.sin(ggLat * 3.141592653589793d) * 2.0E-5d);
        double atan2 = Math.atan2(ggLat, ggLon) + (Math.cos(ggLon * 3.141592653589793d) * 3.0E-6d);
        latLng.longitude = (Math.cos(atan2) * sqrt) + 0.0065d;
        latLng.latitude = (sqrt * Math.sin(atan2)) + 0.006d;
        return latLng;
    }

    public static LatLng wgs84ToGcj02(LatLng location) {
        return gcj02Encrypt(location.latitude, location.longitude);
    }

    public static LatLng gcj02ToWgs84(LatLng location) {
        return gcj02Decrypt(location.latitude, location.longitude);
    }

    public static LatLng wgs84ToBd09(LatLng location) {
        LatLng gcj02Encrypt = gcj02Encrypt(location.latitude, location.longitude);
        return bd09Encrypt(gcj02Encrypt.latitude, gcj02Encrypt.longitude);
    }

    public static LatLng gcj02ToBd09(LatLng location) {
        return bd09Encrypt(location.latitude, location.longitude);
    }

    public static LatLng bd09ToGcj02(LatLng location) {
        return bd09Decrypt(location.latitude, location.longitude);
    }

    public static LatLng bd09ToWgs84(LatLng location) {
        LatLng bd09ToGcj02 = bd09ToGcj02(location);
        return gcj02Decrypt(bd09ToGcj02.latitude, bd09ToGcj02.longitude);
    }

    public static String formatCoordinate(double longitude, double latitude) {
        return convertToDMS(longitude) + (longitude >= 0.0d ? "E" : ExifInterface.LONGITUDE_WEST) + " " + convertToDMS(latitude) + (latitude >= 0.0d ? "N" : "S");
    }

    private static String convertToDMS(double coordinate) {
        double abs = Math.abs(coordinate);
        int i = (int) abs;
        double d = (abs - i) * 60.0d;
        int i2 = (int) d;
        int round = (int) Math.round((d - i2) * 60.0d);
        if (round == 60) {
            i2++;
            round = 0;
            if (i2 == 60) {
                i++;
                i2 = 0;
            }
        }
        return String.format("%d°%02d'%02d\"", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(round));
    }

    public static class LatLng implements LocationSource {
        public double latitude;
        public double longitude;

        @Override // com.amap.api.maps.LocationSource
        public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        }

        @Override // com.amap.api.maps.LocationSource
        public void deactivate() {
        }

        public LatLng(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public LatLng() {
        }

        public double getLatitude() {
            return this.latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }
}
