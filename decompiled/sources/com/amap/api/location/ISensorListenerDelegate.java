package com.amap.api.location;

/* loaded from: classes11.dex */
public interface ISensorListenerDelegate {
    void onSetAccelerometer(long j, int i, float f, float f2, float f3, float f4, float f5, float f6);

    void onSetGyroscope(long j, int i, float f, float f2, float f3, float f4, float f5, float f6);

    void onSetHeading(long j, int i, float f);

    void onSetMagnetic(long j, int i, float f, float f2, float f3, float f4, float f5, float f6);

    void onSetOrientation(long j, int i, float f, float f2, float f3);

    void onSetPressure(long j, int i, float f);

    void onSetTemperature(long j, int i, float f);
}
