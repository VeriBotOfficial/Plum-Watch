package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.j7;
import com.amap.api.services.core.LatLonPoint;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: RequestCacheWorkerCheckDistance.java */
/* loaded from: classes11.dex */
class l7 extends k7 {
    private double j;

    /* compiled from: RequestCacheWorkerCheckDistance.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        LatLonPoint f1745a;
        double b;

        public a(double d, double d2, double d3) {
            this.f1745a = null;
            this.b = 0.0d;
            this.f1745a = new LatLonPoint(d, d2);
            this.b = d3;
        }

        public boolean a(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                LatLonPoint latLonPoint = this.f1745a;
                a aVar = (a) obj;
                if (latLonPoint == aVar.f1745a) {
                    return true;
                }
                if (latLonPoint != null && b6.a(latLonPoint, r3) <= aVar.b) {
                    return true;
                }
            }
            return false;
        }
    }

    public l7(String... strArr) {
        super(strArr);
        this.j = 0.0d;
    }

    @Override // com.amap.api.col.p0003sl.k7
    protected boolean a(LinkedHashMap<j7.b, Object> linkedHashMap, j7.b bVar) {
        String str;
        if (linkedHashMap != null) {
            if (bVar.b == null) {
                return super.a(linkedHashMap, bVar);
            }
            for (j7.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.f1702a) != null && str.equals(bVar.f1702a)) {
                    Object obj = bVar2.b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.k7
    protected Object b(LinkedHashMap<j7.b, Object> linkedHashMap, j7.b bVar) {
        String str;
        if (linkedHashMap != null) {
            if (bVar.b == null) {
                return super.b(linkedHashMap, bVar);
            }
            for (j7.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.f1702a) != null && str.equals(bVar.f1702a)) {
                    Object obj = bVar2.b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.b)) {
                        return linkedHashMap.get(bVar2);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.amap.api.col.p0003sl.k7
    protected Object c(LinkedHashMap<j7.b, Object> linkedHashMap, j7.b bVar) {
        j7.b bVar2;
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.c(linkedHashMap, bVar);
            }
            Iterator<j7.b> it = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar2 = null;
                    break;
                }
                bVar2 = it.next();
                if (bVar2 != null && (str = bVar2.f1702a) != null && str.equals(bVar.f1702a)) {
                    Object obj = bVar2.b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.b)) {
                        break;
                    }
                }
            }
            if (bVar2 != null) {
                return linkedHashMap.remove(bVar2);
            }
        }
        return null;
    }

    @Override // com.amap.api.col.p0003sl.k7
    public void a(j7.a aVar) {
        super.a(aVar);
        this.j = aVar.a();
    }

    public double b() {
        return this.j;
    }
}
