package com.amap.api.col.p0003sl;

/* compiled from: ThreadUtil.java */
/* loaded from: classes11.dex */
public class s4 {
    private static volatile s4 b;

    /* renamed from: a, reason: collision with root package name */
    private pc f1869a;

    private s4() {
        this.f1869a = null;
        this.f1869a = x.b("AMapThreadUtil");
    }

    public static void a() {
        if (b != null) {
            try {
                if (b.f1869a != null) {
                    b.f1869a.a();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            b.f1869a = null;
            b = null;
        }
    }

    public static s4 b() {
        if (b == null) {
            synchronized (s4.class) {
                if (b == null) {
                    b = new s4();
                }
            }
        }
        return b;
    }

    public void a(qc qcVar) {
        try {
            this.f1869a.b(qcVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
