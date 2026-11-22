package com.amap.location.support.signal.gnss;

import com.amap.location.support.bean.gnss.AmapSatellite;
import java.util.List;

/* loaded from: classes11.dex */
public interface AmapSatelliteStatusListener {
    void onFirstFix(int i);

    void onGpsStatusListener(int i, int i2, float f, List<AmapSatellite> list);

    void onStarted();

    void onStopped();
}
