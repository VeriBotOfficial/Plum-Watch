package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RouteSegmentProxy.java */
/* loaded from: classes13.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f8934a;
    private final List<LatLng> b = new ArrayList();

    public h(Bundle bundle) {
        this.f8934a = bundle;
    }

    public List<LatLng> a() {
        if (!this.b.isEmpty()) {
            return this.b;
        }
        double[] doubleArray = this.f8934a.getDoubleArray("pointsX");
        if (doubleArray == null) {
            return this.b;
        }
        double[] doubleArray2 = this.f8934a.getDoubleArray("pointsY");
        if (doubleArray2 == null) {
            return this.b;
        }
        int length = doubleArray.length;
        int length2 = doubleArray2.length;
        if (length == 0 || length != length2) {
            return this.b;
        }
        for (int i = 0; i < length; i++) {
            this.b.add(CoordTrans.gcjToBaidu(new LatLng(doubleArray2[i], doubleArray[i])));
        }
        return this.b;
    }
}
