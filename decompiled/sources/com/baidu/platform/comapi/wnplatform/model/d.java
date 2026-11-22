package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;

/* compiled from: GPSMatchModel.java */
/* loaded from: classes13.dex */
public class d extends a {

    /* renamed from: a, reason: collision with root package name */
    private float f8928a;
    private float b;
    private double c;
    private double d;
    private float e;
    private float f;
    private double g;
    private double h;

    public boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.f8928a = bundle.getFloat("gpsDirection", -1.0f);
        this.b = bundle.getFloat("gpsSpeed", 0.0f);
        LatLng gcjToBaidu = CoordTrans.gcjToBaidu(new LatLng(bundle.getDouble("gpsLatitude", 0.0d), bundle.getDouble("gpsLongitude", 0.0d)));
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            gcjToBaidu = CoordTrans.baiduToGcj(gcjToBaidu);
        }
        this.d = gcjToBaidu.latitude;
        this.c = gcjToBaidu.longitude;
        this.e = bundle.getFloat("postDirection", -1.0f);
        this.f = bundle.getFloat("postSpeed", 0.0f);
        LatLng gcjToBaidu2 = CoordTrans.gcjToBaidu(new LatLng(bundle.getDouble("postLatitude", 0.0d), bundle.getDouble("postLongitude", 0.0d)));
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            gcjToBaidu2 = CoordTrans.baiduToGcj(gcjToBaidu2);
        }
        this.h = gcjToBaidu2.latitude;
        this.g = gcjToBaidu2.longitude;
        return true;
    }

    public double b() {
        return this.d;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.e;
    }

    public double f() {
        return this.h;
    }

    public double g() {
        return this.g;
    }

    public float h() {
        return this.f;
    }

    public float a() {
        return this.f8928a;
    }
}
