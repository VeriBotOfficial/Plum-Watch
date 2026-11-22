package com.amap.api.location;

import java.util.List;

/* loaded from: classes11.dex */
public interface IGnssSatelliteListenerDelegate {
    void onFirstFix(int i);

    void onSatelliteChanged(int i, float f, List<Object> list);

    void onStarted();

    void onStopped();
}
