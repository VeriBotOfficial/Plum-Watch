package com.baidu.ar.marker;

/* JADX INFO: loaded from: classes16.dex */
public interface IMarkerDataProvider {
    float[] getGPS();

    float[] getGravityDirection();

    String getSessionId();

    String getUserId();

    String getVersion();

    void queryFrameResult(int r1, String str);

    void setLocationData(boolean z, Object obj);

    void setLocationPoints(int r1, double[] dArr);

    void setLocationTransforms(float[] fArr);

    void setVpasState(int r1, int r2, float f);

    void setVpsLocation(float f, float f2);

    void transDataFromJNI(byte[] bArr);
}
