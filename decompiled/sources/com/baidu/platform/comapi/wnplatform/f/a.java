package com.baidu.platform.comapi.wnplatform.f;

/* compiled from: OperateElementInfo.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f8899a;
    private String b;
    private String c;

    private a() {
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (f8899a == null) {
                f8899a = new a();
            }
            aVar = f8899a;
        }
        return aVar;
    }

    public String a() {
        return this.c;
    }

    public String c() {
        return this.b;
    }
}
