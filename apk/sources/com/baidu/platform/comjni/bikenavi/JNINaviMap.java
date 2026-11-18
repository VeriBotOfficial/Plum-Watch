package com.baidu.platform.comjni.bikenavi;

/* JADX INFO: loaded from: classes15.dex */
public class JNINaviMap {
    public native boolean convertGeoPoint2ScrPt(long j, int[] r3, int[] r4);

    public native boolean convertGeoPoint2ScrPt4Ar(long j, int[] r3, int[] r4);

    public native boolean convertScrPt2GeoPoint(long j, int[] r3, int[] r4);

    public native void dragMap(long j, int r3, int r4, int r5, int r6, long j2, long j3);

    public native float getRouteDirection(long j);

    public native boolean initExtMap(long j, long j2);

    public native boolean move2ScreenPoint(long j, int r3, int r4, int r5);

    public native boolean resetBackgroundColor(long j);

    public native boolean resetMapStatusLimits(long j);

    public native boolean setArMapStatusLimits(long j);

    public native boolean setBackgroundTransparent(long j);

    public native void setExtDefaultLevel(long j, float f);

    public native void setExtDefaultOverlooking(long j, float f);

    public native void setExtRotateMode(long j, int r3);

    public native boolean setLevel(long j, float f);

    public native void setRouteMargin(long j, float f, float f2, float f3, float f4);

    public native boolean showBaseLayers(long j, boolean z);

    public native boolean showLayer(long j, int r3, boolean z);

    public native void uninitExtMap(long j);

    public native boolean updataBaseLayers(long j);

    public native boolean updateLayer(long j, int r3);
}
