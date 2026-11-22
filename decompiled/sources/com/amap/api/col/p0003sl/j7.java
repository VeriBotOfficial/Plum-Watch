package com.amap.api.col.p0003sl;

import java.util.HashMap;

/* compiled from: RequestCacheControl.java */
/* loaded from: classes11.dex */
public class j7 {
    private static volatile j7 b;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, k7> f1700a = new HashMap<>();

    /* compiled from: RequestCacheControl.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1701a = true;
        private long b = 86400;
        private int c = 10;
        private double d = 0.0d;

        a() {
        }

        public void a(boolean z) {
            this.f1701a = z;
        }

        public int b() {
            return this.c;
        }

        public long c() {
            return this.b;
        }

        public boolean d() {
            return this.f1701a;
        }

        public void a(long j) {
            this.b = j;
        }

        public void a(int i) {
            this.c = i;
        }

        public double a() {
            return this.d;
        }

        public void a(double d) {
            this.d = d;
        }
    }

    /* compiled from: RequestCacheControl.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        String f1702a;
        Object b;

        b() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                String str = this.f1702a;
                if (str == null) {
                    return bVar.f1702a == null && this.b == bVar.b;
                }
                if (str.equals(bVar.f1702a) && this.b == bVar.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f1702a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            Object obj = this.b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* compiled from: RequestCacheControl.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        Object f1703a;
        boolean b;

        public c(Object obj, boolean z) {
            this.f1703a = obj;
            this.b = z;
        }
    }

    public static j7 a() {
        if (b == null) {
            synchronized (j7.class) {
                if (b == null) {
                    b = new j7();
                }
            }
        }
        return b;
    }

    public boolean b(b bVar) {
        if (bVar == null) {
            return false;
        }
        for (k7 k7Var : this.f1700a.values()) {
            if (k7Var != null && k7Var.b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public synchronized k7 a(String str) {
        return this.f1700a.get(str);
    }

    public synchronized void a(String str, k7 k7Var) {
        this.f1700a.put(str, k7Var);
    }

    public c a(b bVar) {
        c a2;
        if (bVar == null) {
            return null;
        }
        for (k7 k7Var : this.f1700a.values()) {
            if (k7Var != null && (a2 = k7Var.a(bVar)) != null) {
                return a2;
            }
        }
        return null;
    }

    public void a(b bVar, Object obj) {
        for (k7 k7Var : this.f1700a.values()) {
            if (k7Var != null) {
                k7Var.a(bVar, obj);
            }
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        for (k7 k7Var : this.f1700a.values()) {
            if (k7Var != null) {
                k7Var.a(aVar);
            }
        }
    }

    public void a(String str, a aVar) {
        k7 k7Var;
        if (aVar == null || (k7Var = this.f1700a.get(str)) == null) {
            return;
        }
        k7Var.a(aVar);
    }
}
