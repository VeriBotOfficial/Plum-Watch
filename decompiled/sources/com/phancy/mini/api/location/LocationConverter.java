package com.phancy.mini.api.location;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationConverter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015J\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010!\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004J\u0016\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/phancy/mini/api/location/LocationConverter;", "", "()V", "RANGE_LAT_MAX", "", "RANGE_LAT_MIN", "RANGE_LON_MAX", "RANGE_LON_MIN", "jzA", "jzEE", "LAT_OFFSET_0", "x", "y", "LAT_OFFSET_1", "LAT_OFFSET_2", "LAT_OFFSET_3", "LON_OFFSET_0", "LON_OFFSET_1", "LON_OFFSET_2", "LON_OFFSET_3", "bd09Decrypt", "Lcom/phancy/mini/api/location/LocationConverter$LatLng;", "bdLat", "bdLon", "bd09Encrypt", "ggLat", "ggLon", "bd09ToGcj02", "location", "bd09ToWgs84", "gcj02Decrypt", "gjLat", "gjLon", "gcj02Encrypt", "gcj02ToBd09", "gcj02ToWgs84", "outOfChina", "", "lat", "lon", "transformLat", "transformLon", "wgs84ToBd09", "wgs84ToGcj02", "LatLng", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocationConverter {
    public static final LocationConverter INSTANCE = new LocationConverter();
    private static final double RANGE_LAT_MAX = 55.8271d;
    private static final double RANGE_LAT_MIN = 0.8293d;
    private static final double RANGE_LON_MAX = 137.8347d;
    private static final double RANGE_LON_MIN = 72.004d;
    private static final double jzA = 6378245.0d;
    private static final double jzEE = 0.006693421622965943d;

    public final boolean outOfChina(double lat, double lon) {
        return lon < RANGE_LON_MIN || lon > RANGE_LON_MAX || lat < RANGE_LAT_MIN || lat > RANGE_LAT_MAX;
    }

    private LocationConverter() {
    }

    private final double LAT_OFFSET_0(double x, double y) {
        return ((2.0d * x) - 100.0d) + (3.0d * y) + (y * 0.2d * y) + (0.1d * x * y) + (Math.sqrt(Math.abs(x)) * 0.2d);
    }

    private final double LAT_OFFSET_1(double x, double y) {
        return (((Math.sin((6.0d * x) * 3.141592653589793d) * 20.0d) + (Math.sin((x * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d;
    }

    private final double LAT_OFFSET_2(double x, double y) {
        return (((Math.sin(y * 3.141592653589793d) * 20.0d) + (Math.sin((y / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d;
    }

    private final double LAT_OFFSET_3(double x, double y) {
        return (((Math.sin((y / 12.0d) * 3.141592653589793d) * 160.0d) + (320 * Math.sin((y * 3.141592653589793d) / 30.0d))) * 2.0d) / 3.0d;
    }

    private final double LON_OFFSET_0(double x, double y) {
        double d = x * 0.1d;
        return 300.0d + x + (2.0d * y) + (d * x) + (d * y) + (Math.sqrt(Math.abs(x)) * 0.1d);
    }

    private final double LON_OFFSET_1(double x, double y) {
        return (((Math.sin((6.0d * x) * 3.141592653589793d) * 20.0d) + (Math.sin((x * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d;
    }

    private final double LON_OFFSET_2(double x, double y) {
        return (((Math.sin(x * 3.141592653589793d) * 20.0d) + (Math.sin((x / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d;
    }

    private final double LON_OFFSET_3(double x, double y) {
        return (((Math.sin((x / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((x / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d;
    }

    public final double transformLat(double x, double y) {
        return LAT_OFFSET_0(x, y) + LAT_OFFSET_1(x, y) + LAT_OFFSET_2(x, y) + LAT_OFFSET_3(x, y);
    }

    public final double transformLon(double x, double y) {
        return LON_OFFSET_0(x, y) + LON_OFFSET_1(x, y) + LON_OFFSET_2(x, y) + LON_OFFSET_3(x, y);
    }

    public final LatLng gcj02Encrypt(double ggLat, double ggLon) {
        LatLng latLng = new LatLng();
        if (outOfChina(ggLat, ggLon)) {
            latLng.setLatitude(ggLat);
            latLng.setLongitude(ggLon);
            return latLng;
        }
        double d = ggLon - 105.0d;
        double d2 = ggLat - 35.0d;
        double transformLat = transformLat(d, d2);
        double transformLon = transformLon(d, d2);
        double d3 = (ggLat / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d3);
        double d4 = 1 - ((0.006693421622965943d * sin) * sin);
        double sqrt = Math.sqrt(d4);
        double cos = ggLon + ((transformLon * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d3)) * 3.141592653589793d));
        latLng.setLatitude(ggLat + ((transformLat * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * 3.141592653589793d)));
        latLng.setLongitude(cos);
        return latLng;
    }

    public final LatLng gcj02Decrypt(double gjLat, double gjLon) {
        LatLng gcj02Encrypt = gcj02Encrypt(gjLat, gjLon);
        double longitude = gcj02Encrypt.getLongitude() - gjLon;
        double latitude = gcj02Encrypt.getLatitude() - gjLat;
        LatLng latLng = new LatLng();
        latLng.setLatitude(gjLat - latitude);
        latLng.setLongitude(gjLon - longitude);
        return latLng;
    }

    public final LatLng bd09Decrypt(double bdLat, double bdLon) {
        LatLng latLng = new LatLng();
        double d = bdLon - 0.0065d;
        double d2 = bdLat - 0.006d;
        double sqrt = Math.sqrt((d * d) + (d2 * d2)) - (Math.sin(d2 * 3.141592653589793d) * 2.0E-5d);
        double atan2 = Math.atan2(d2, d) - (Math.cos(d * 3.141592653589793d) * 3.0E-6d);
        latLng.setLongitude(Math.cos(atan2) * sqrt);
        latLng.setLatitude(sqrt * Math.sin(atan2));
        return latLng;
    }

    public final LatLng bd09Encrypt(double ggLat, double ggLon) {
        LatLng latLng = new LatLng();
        double sqrt = Math.sqrt((ggLon * ggLon) + (ggLat * ggLat)) + (Math.sin(ggLat * 3.141592653589793d) * 2.0E-5d);
        double atan2 = Math.atan2(ggLat, ggLon) + (Math.cos(ggLon * 3.141592653589793d) * 3.0E-6d);
        latLng.setLongitude((Math.cos(atan2) * sqrt) + 0.0065d);
        latLng.setLatitude((sqrt * Math.sin(atan2)) + 0.006d);
        return latLng;
    }

    public final LatLng wgs84ToGcj02(LatLng location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return gcj02Encrypt(location.getLatitude(), location.getLongitude());
    }

    public final LatLng gcj02ToWgs84(LatLng location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return gcj02Decrypt(location.getLatitude(), location.getLongitude());
    }

    public final LatLng wgs84ToBd09(LatLng location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LatLng gcj02Encrypt = gcj02Encrypt(location.getLatitude(), location.getLongitude());
        return bd09Encrypt(gcj02Encrypt.getLatitude(), gcj02Encrypt.getLongitude());
    }

    public final LatLng gcj02ToBd09(LatLng location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return bd09Encrypt(location.getLatitude(), location.getLongitude());
    }

    public final LatLng bd09ToGcj02(LatLng location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return bd09Decrypt(location.getLatitude(), location.getLongitude());
    }

    public final LatLng bd09ToWgs84(LatLng location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LatLng bd09ToGcj02 = bd09ToGcj02(location);
        return gcj02Decrypt(bd09ToGcj02.getLatitude(), bd09ToGcj02.getLongitude());
    }

    /* compiled from: LocationConverter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/phancy/mini/api/location/LocationConverter$LatLng;", "", "latitude", "", "longitude", "(DD)V", "()V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LatLng {
        private double latitude;
        private double longitude;

        public final double getLatitude() {
            return this.latitude;
        }

        public final void setLatitude(double d) {
            this.latitude = d;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final void setLongitude(double d) {
            this.longitude = d;
        }

        public LatLng(double d, double d2) {
            this.latitude = d;
            this.longitude = d2;
        }

        public LatLng() {
        }
    }
}
