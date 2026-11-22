package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class st1 extends e42 {
    private long b;
    private long[] c;
    private long[] d;

    public st1() {
        super(new r40());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public final long a() {
        return this.b;
    }

    protected final boolean a(long j, ag1 ag1Var) {
        if (ag1Var.t() != 2) {
            return false;
        }
        int z = ag1Var.z();
        int d = ag1Var.d();
        ag1Var.f(z);
        if (!"onMetaData".equals(new String(ag1Var.c(), d, z)) || ag1Var.a() == 0 || ag1Var.t() != 8) {
            return false;
        }
        HashMap<String, Object> a2 = a(ag1Var);
        Object obj = a2.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = a2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final long[] c() {
        return this.c;
    }

    public final long[] b() {
        return this.d;
    }

    private static Serializable a(int i, ag1 ag1Var) {
        if (i == 8) {
            return a(ag1Var);
        }
        if (i == 10) {
            int x = ag1Var.x();
            ArrayList arrayList = new ArrayList(x);
            for (int i2 = 0; i2 < x; i2++) {
                Serializable a2 = a(ag1Var.t(), ag1Var);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(ag1Var.p()));
            ag1Var.f(2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(ag1Var.p()));
        }
        if (i == 1) {
            return Boolean.valueOf(ag1Var.t() == 1);
        }
        if (i == 2) {
            int z = ag1Var.z();
            int d = ag1Var.d();
            ag1Var.f(z);
            return new String(ag1Var.c(), d, z);
        }
        if (i != 3) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            int z2 = ag1Var.z();
            int d2 = ag1Var.d();
            ag1Var.f(z2);
            String str = new String(ag1Var.c(), d2, z2);
            int t = ag1Var.t();
            if (t == 9) {
                return hashMap;
            }
            Serializable a3 = a(t, ag1Var);
            if (a3 != null) {
                hashMap.put(str, a3);
            }
        }
    }

    private static HashMap<String, Object> a(ag1 ag1Var) {
        int x = ag1Var.x();
        HashMap<String, Object> hashMap = new HashMap<>(x);
        for (int i = 0; i < x; i++) {
            int z = ag1Var.z();
            int d = ag1Var.d();
            ag1Var.f(z);
            String str = new String(ag1Var.c(), d, z);
            Serializable a2 = a(ag1Var.t(), ag1Var);
            if (a2 != null) {
                hashMap.put(str, a2);
            }
        }
        return hashMap;
    }
}
