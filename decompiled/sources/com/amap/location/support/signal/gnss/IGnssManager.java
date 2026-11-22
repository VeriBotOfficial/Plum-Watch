package com.amap.location.support.signal.gnss;

import java.util.List;

/* loaded from: classes11.dex */
public interface IGnssManager {
    void addNmeaListener(AmapNmeaListener amapNmeaListener, Object obj);

    List<String> getAllProviders();

    boolean isOnGpsRequest();

    boolean isProviderEnabled(String str);

    void registerSatelliteStatusCallback(AmapSatelliteStatusListener amapSatelliteStatusListener, Object obj);

    void removeNmeaListener(AmapNmeaListener amapNmeaListener);

    void removeUpdates(AmapLocationListener amapLocationListener);

    void requestLocationUpdates(String str, long j, float f, AmapLocationListener amapLocationListener, Object obj);

    void unregisterSatelliteStatusCallback(AmapSatelliteStatusListener amapSatelliteStatusListener);
}
