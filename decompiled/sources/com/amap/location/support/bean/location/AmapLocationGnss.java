package com.amap.location.support.bean.location;

/* loaded from: classes11.dex */
public class AmapLocationGnss extends AmapLocation {
    public short aveSnr;
    public long nmeaTime;
    public byte satelliteCount;

    public AmapLocationGnss() {
        super("gps");
    }
}
