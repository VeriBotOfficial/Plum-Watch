package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.entity.pb.IndoorNavi;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RoutePlanModel.java */
/* loaded from: classes13.dex */
public class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private int f8933a = 0;
    private int b = 0;
    private int c = 1;
    private ArrayList<LatLng> d = new ArrayList<>();
    private ArrayList<LatLng> e = new ArrayList<>();
    private WalkPlan f = null;

    public void a() {
        this.f8933a = 0;
        this.b = 0;
        ArrayList<LatLng> arrayList = this.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<LatLng> arrayList2 = this.e;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    public ArrayList<LatLng> b() {
        return this.e;
    }

    public int c() {
        return this.f8933a;
    }

    public int d() {
        return this.b;
    }

    public WalkPlan e() {
        return this.f;
    }

    public int b(WalkPlan walkPlan, int i) {
        int i2 = 0;
        if (walkPlan == null) {
            return 0;
        }
        WalkPlan.Routes routes = i < walkPlan.getRoutesCount() ? walkPlan.getRoutes(i) : null;
        if (routes != null) {
            Iterator<WalkPlan.Routes.Legs> it = routes.getLegsList().iterator();
            while (it.hasNext()) {
                i2 += it.next().getDuration();
            }
        }
        Iterator<IndoorNavi> it2 = walkPlan.getIndoorNavisList().iterator();
        while (it2.hasNext()) {
            Iterator<IndoorNavi.Routes> it3 = it2.next().getRoutesList().iterator();
            while (it3.hasNext()) {
                Iterator<IndoorNavi.Routes.Legs> it4 = it3.next().getLegsList().iterator();
                while (it4.hasNext()) {
                    i2 += it4.next().getDuration();
                }
            }
        }
        return i2;
    }

    public void a(Bundle bundle, int i) {
        WalkPlan walkPlan;
        WalkPlan walkPlan2;
        a();
        if (bundle == null) {
            return;
        }
        this.c = i;
        this.f8933a = bundle.getInt("totaldistance");
        this.b = bundle.getInt("totaltime");
        if (this.f8933a <= 0 && (walkPlan2 = this.f) != null) {
            this.f8933a = a(walkPlan2, com.baidu.platform.comapi.walknavi.b.n().A());
        }
        if (this.b <= 0 && (walkPlan = this.f) != null) {
            this.b = b(walkPlan, com.baidu.platform.comapi.walknavi.b.n().A());
        }
        double[] doubleArray = bundle.getDoubleArray("ptShapeX");
        double[] doubleArray2 = bundle.getDoubleArray("ptShapeY");
        if (doubleArray == null || doubleArray2 == null) {
            return;
        }
        LatLng latLng = new LatLng(0.0d, 0.0d);
        for (int i2 = 0; i2 < doubleArray.length; i2++) {
            LatLng gcjToBaidu = CoordTrans.gcjToBaidu(new LatLng(doubleArray2[i2], doubleArray[i2]));
            this.e.add(gcjToBaidu);
            if (Math.abs(latLng.longitude - gcjToBaidu.longitude) >= 1.0E-6d || Math.abs(latLng.latitude - gcjToBaidu.latitude) >= 1.0E-6d) {
                this.d.add(gcjToBaidu);
                latLng = gcjToBaidu;
            }
        }
    }

    public boolean a(com.baidu.platform.comapi.wnplatform.e.a aVar) {
        MessageMicro messageMicro;
        com.baidu.platform.comapi.wnplatform.e.c cVar = aVar instanceof com.baidu.platform.comapi.wnplatform.e.c ? (com.baidu.platform.comapi.wnplatform.e.c) aVar : null;
        if (cVar == null || (messageMicro = cVar.a().get(0)) == null) {
            return false;
        }
        try {
            this.f = (WalkPlan) messageMicro;
            com.baidu.platform.comapi.walknavi.b.n().a(this.f);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public int a(WalkPlan walkPlan, int i) {
        int i2 = 0;
        if (walkPlan == null) {
            return 0;
        }
        WalkPlan.Routes routes = i < walkPlan.getRoutesCount() ? walkPlan.getRoutes(i) : null;
        if (routes != null) {
            Iterator<WalkPlan.Routes.Legs> it = routes.getLegsList().iterator();
            while (it.hasNext()) {
                i2 += it.next().getDistance();
            }
        }
        Iterator<IndoorNavi> it2 = walkPlan.getIndoorNavisList().iterator();
        while (it2.hasNext()) {
            Iterator<IndoorNavi.Routes> it3 = it2.next().getRoutesList().iterator();
            while (it3.hasNext()) {
                Iterator<IndoorNavi.Routes.Legs> it4 = it3.next().getLegsList().iterator();
                while (it4.hasNext()) {
                    i2 += it4.next().getDistance();
                }
            }
        }
        return i2;
    }
}
