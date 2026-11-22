package com.amap.location.support.signal.gnss;

import com.amap.location.support.bean.location.AmapLocation;

/* loaded from: classes11.dex */
public interface AmapLocationListener {
    void onLocationChanged(AmapLocation amapLocation);

    void onProviderDisabled(String str);

    void onProviderEnabled(String str);

    void onStatusChanged(String str, int i);
}
