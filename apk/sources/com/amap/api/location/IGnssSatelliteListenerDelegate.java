package com.amap.api.location;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface IGnssSatelliteListenerDelegate {
    void onFirstFix(int r1);

    void onSatelliteChanged(int r1, float f, List<Object> list);

    void onStarted();

    void onStopped();
}
