package com.baidu.mapapi.map.track;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public interface TraceAnimationListener {
    void onTraceAnimationFinish();

    void onTraceAnimationUpdate(float f);

    void onTraceUpdatePosition(LatLng latLng);
}
