package com.amap.api.maps.model;

import com.amap.api.col.p0003sl.d4;
import com.autonavi.amap.mapcore.DPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PointQuadTree.java */
/* loaded from: classes11.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final d4 f2058a;
    private final int b;
    private List<WeightedLatLng> c;
    private List<a> d;

    protected a(d4 d4Var) {
        this(d4Var, 0);
    }

    protected void a(WeightedLatLng weightedLatLng) {
        DPoint point = weightedLatLng.getPoint();
        if (this.f2058a.a(point.x, point.y)) {
            a(point.x, point.y, weightedLatLng);
        }
    }

    private a(double d, double d2, double d3, double d4, int i) {
        this(new d4(d, d2, d3, d4), i);
    }

    private a(d4 d4Var, int i) {
        this.d = null;
        this.f2058a = d4Var;
        this.b = i;
    }

    private void a(double d, double d2, WeightedLatLng weightedLatLng) {
        a aVar = this;
        List<a> list = aVar.d;
        if (list != null) {
            d4 d4Var = aVar.f2058a;
            if (d2 < d4Var.f) {
                if (d < d4Var.e) {
                    list.get(0).a(d, d2, weightedLatLng);
                    return;
                } else {
                    list.get(1).a(d, d2, weightedLatLng);
                    return;
                }
            }
            if (d < d4Var.e) {
                list.get(2).a(d, d2, weightedLatLng);
                return;
            } else {
                list.get(3).a(d, d2, weightedLatLng);
                return;
            }
        }
        if (aVar.c == null) {
            aVar.c = new ArrayList();
        }
        aVar.c.add(weightedLatLng);
        if (aVar.c.size() <= 50 || aVar.b >= 40) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        aVar.d = arrayList;
        d4 d4Var2 = aVar.f2058a;
        arrayList.add(new a(d4Var2.f1599a, d4Var2.e, d4Var2.b, d4Var2.f, aVar.b + 1));
        List<a> list2 = aVar.d;
        d4 d4Var3 = aVar.f2058a;
        list2.add(new a(d4Var3.e, d4Var3.c, d4Var3.b, d4Var3.f, aVar.b + 1));
        List<a> list3 = aVar.d;
        d4 d4Var4 = aVar.f2058a;
        list3.add(new a(d4Var4.f1599a, d4Var4.e, d4Var4.f, d4Var4.d, aVar.b + 1));
        List<a> list4 = aVar.d;
        d4 d4Var5 = aVar.f2058a;
        list4.add(new a(d4Var5.e, d4Var5.c, d4Var5.f, d4Var5.d, aVar.b + 1));
        List<WeightedLatLng> list5 = aVar.c;
        aVar.c = null;
        for (WeightedLatLng weightedLatLng2 : list5) {
            aVar.a(weightedLatLng2.getPoint().x, weightedLatLng2.getPoint().y, weightedLatLng2);
            aVar = this;
        }
    }

    protected Collection<WeightedLatLng> a(d4 d4Var) {
        ArrayList arrayList = new ArrayList();
        a(d4Var, arrayList);
        return arrayList;
    }

    private void a(d4 d4Var, Collection<WeightedLatLng> collection) {
        if (this.f2058a.a(d4Var)) {
            List<a> list = this.d;
            if (list != null) {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(d4Var, collection);
                }
                return;
            }
            List<WeightedLatLng> list2 = this.c;
            if (list2 != null) {
                d4 d4Var2 = this.f2058a;
                if (d4Var2.f1599a >= d4Var.f1599a && d4Var2.c <= d4Var.c && d4Var2.b >= d4Var.b && d4Var2.d <= d4Var.d) {
                    collection.addAll(list2);
                    return;
                }
                for (WeightedLatLng weightedLatLng : list2) {
                    DPoint point = weightedLatLng.getPoint();
                    if (d4Var.a(point.x, point.y)) {
                        collection.add(weightedLatLng);
                    }
                }
            }
        }
    }
}
