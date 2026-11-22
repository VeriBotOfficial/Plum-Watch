package com.baidu.mapapi.map;

import android.os.Bundle;
import java.util.Collection;

/* loaded from: classes13.dex */
public class HexagonMapData {

    /* renamed from: a, reason: collision with root package name */
    private double[] f7923a;
    private double[] b;
    private double[] c;
    private float d;

    public HexagonMapData(Collection<WeightedLatLng> collection, float f) {
        int size = collection.size();
        this.f7923a = new double[size];
        this.b = new double[size];
        this.c = new double[size];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (WeightedLatLng weightedLatLng : collection) {
            this.f7923a[i] = weightedLatLng.getPoint().x;
            this.b[i2] = weightedLatLng.getPoint().y;
            this.c[i3] = weightedLatLng.getIntensity();
            i3++;
            i2++;
            i++;
        }
        this.d = f;
    }

    public void toBundle(Bundle bundle) {
        bundle.putDoubleArray("x_array", this.f7923a);
        bundle.putDoubleArray("y_array", this.b);
        bundle.putDoubleArray("z_array", this.c);
    }
}
