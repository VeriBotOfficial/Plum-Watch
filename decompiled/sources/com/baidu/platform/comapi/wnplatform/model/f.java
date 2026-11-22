package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;

/* compiled from: RealTimeInfoProxy.java */
/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f8932a;

    public f(Bundle bundle) {
        this.f8932a = bundle;
    }

    public int a() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("nCurRouteShapeIdx")) {
            return this.f8932a.getInt("nCurRouteShapeIdx", -1);
        }
        return -1;
    }

    public int b() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("mapLevel")) {
            return this.f8932a.getInt("mapLevel", -1);
        }
        return -1;
    }

    public int c() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("naviScene")) {
            return this.f8932a.getInt("naviScene", -1);
        }
        return -1;
    }

    public int d() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("naviType")) {
            return this.f8932a.getInt("naviType", -1);
        }
        return -1;
    }

    public int e() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("rotateAngle")) {
            return this.f8932a.getInt("rotateAngle", -1);
        }
        return -1;
    }

    public int f() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("routeAngle")) {
            return this.f8932a.getInt("routeAngle", -1);
        }
        return -1;
    }

    public LatLng g() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("stCurRouteProjectPosX") && this.f8932a.containsKey("stCurRouteProjectPosY")) {
            return new LatLng(this.f8932a.getDouble("stCurRouteProjectPosY", 0.0d), this.f8932a.getDouble("stCurRouteProjectPosX", 0.0d));
        }
        return null;
    }

    public LatLng h() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("stCurStartPosX") && this.f8932a.containsKey("stCurStartPosY")) {
            return new LatLng(this.f8932a.getDouble("stCurStartPosY", 0.0d), this.f8932a.getDouble("stCurStartPosX", 0.0d));
        }
        return null;
    }

    public LatLng i() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("stPosX") && this.f8932a.containsKey("stPosY")) {
            return new LatLng(this.f8932a.getDouble("stPosY", 0.0d), this.f8932a.getDouble("stPosX", 0.0d));
        }
        return null;
    }

    public boolean j() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("bGuide")) {
            return this.f8932a.getBoolean("bGuide", false);
        }
        return false;
    }

    public boolean k() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("bMatchPosLinkIsUnverified")) {
            return this.f8932a.getBoolean("bMatchPosLinkIsUnverified", false);
        }
        return false;
    }

    public boolean l() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("bIsNearOrFarawayStatus")) {
            return this.f8932a.getBoolean("bIsNearOrFarawayStatus", false);
        }
        return false;
    }

    public boolean m() {
        Bundle bundle = this.f8932a;
        if (bundle != null && bundle.containsKey("bRedLine")) {
            return this.f8932a.getBoolean("bRedLine", false);
        }
        return false;
    }
}
