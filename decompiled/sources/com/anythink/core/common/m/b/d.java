package com.anythink.core.common.m.b;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f3997a = "";
    private String b = "";

    private d() {
    }

    private static d c() {
        return new d();
    }

    public static d a(String str) {
        d dVar = new d();
        dVar.f3997a = str;
        return dVar;
    }

    public static d a(String str, String str2) {
        d dVar = new d();
        dVar.f3997a = str;
        dVar.b = str2;
        return dVar;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f3997a;
    }

    private void b(String str) {
        this.b = str;
    }

    public final String toString() {
        return "HttpReqEntity{urlType='" + this.f3997a + "', interceptKey='" + this.b + "'}";
    }
}
