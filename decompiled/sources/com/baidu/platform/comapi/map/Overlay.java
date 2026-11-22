package com.baidu.platform.comapi.map;

import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class Overlay {

    /* renamed from: id, reason: collision with root package name */
    public String f8614id = System.currentTimeMillis() + "_" + hashCode();
    public long mLayerID;
    public int mType;

    protected Overlay() {
    }

    public static void putColorInfoIntoBundle(int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i & 255) / 255.0f);
        bundle2.putFloat("alpha", (i >>> 24) / 255.0f);
        bundle.putBundle("color", bundle2);
    }

    public static void putPointsInfoIntoBundle(List<GeoPoint> list, Bundle bundle) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i = 0; i < size; i++) {
            GeoPoint a2 = l.a(list.get(i));
            dArr[i] = a2.getLongitude();
            dArr2[i] = a2.getLatitude();
        }
        bundle.putDoubleArray("x_array", dArr);
        bundle.putDoubleArray("y_array", dArr2);
    }
}
