package com.baidu.platform.comapi.wnplatform.f;

/* JADX INFO: compiled from: OperateElementInfo.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f8899a;
    private String b;
    private String c;

    private a() {
    }

    public static synchronized a b() {
        if (f8899a == null) {
            f8899a = new a();
        }
        return f8899a;
    }

    public String a() {
        return this.c;
    }

    public String c() {
        return this.b;
    }
}
