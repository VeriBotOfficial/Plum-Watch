package com.amap.location.support.bean.gnss;

/* JADX INFO: loaded from: classes7.dex */
public class AmapSatellite {
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_UNKNOWN = 0;
    public float azimuth;
    public float carrierFrequencyHz = 0.0f;
    public float cn0;
    public float elevation;
    public boolean hasAlmanac;
    public boolean hasEphemeris;
    public int prn;
    public int systemType;
    public boolean usedInFix;
}
