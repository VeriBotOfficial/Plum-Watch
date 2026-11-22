package com.amap.location.support.bean.location;

import com.amap.location.support.util.GeoUtil;

/* loaded from: classes11.dex */
public class AmapLocation {
    public static final String FUSED_PROVIDER = "fused";
    public static final String GPS_PROVIDER = "gps";
    public static final String INDOOR_PROVIDER = "indoor";
    public static final String NETWORK_PROVIDER = "network";
    public static final String PASSIVE_PROVIDER = "passive";
    public String provider;
    public long locationUtcTime = 0;
    public long sytemUtcTime = 0;
    public double latitude = 0.0d;
    public double longitude = 0.0d;
    public double altitude = 0.0d;
    public float speed = 0.0f;
    public float bearing = 0.0f;
    public float accuracy = 0.0f;
    public boolean mock = false;

    public AmapLocation(String str) {
        this.provider = str;
    }

    public double distanceTo(AmapLocation amapLocation) {
        if (amapLocation != null) {
            return GeoUtil.dist(this.longitude, this.latitude, amapLocation.longitude, amapLocation.latitude);
        }
        return 0.0d;
    }
}
