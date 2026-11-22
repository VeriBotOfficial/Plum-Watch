package com.amap.api.location;

/* loaded from: classes11.dex */
public class CoordUtil {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2018a = false;

    public static native int convertToGcj(double[] dArr, double[] dArr2);

    public static boolean isLoadedSo() {
        return f2018a;
    }

    public static void setLoadedSo(boolean z) {
        f2018a = z;
    }
}
