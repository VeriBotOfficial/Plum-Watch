package com.xiaomi.push;

/* loaded from: classes4.dex */
public class dh {

    /* renamed from: a, reason: collision with root package name */
    private static volatile dh f14523a;

    /* renamed from: a, reason: collision with other field name */
    private dg f343a;

    public static dh a() {
        if (f14523a == null) {
            synchronized (dh.class) {
                if (f14523a == null) {
                    f14523a = new dh();
                }
            }
        }
        return f14523a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public dg m12002a() {
        return this.f343a;
    }

    public void a(dg dgVar) {
        this.f343a = dgVar;
    }
}
