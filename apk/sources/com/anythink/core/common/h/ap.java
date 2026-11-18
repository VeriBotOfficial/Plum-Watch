package com.anythink.core.common.h;

/* JADX INFO: loaded from: classes16.dex */
public final class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3853a;
    private String b;
    private String c;
    private int d;
    private int e;
    private String f;

    private static ap g() {
        return new ap();
    }

    public final String toString() {
        return "EcpmEncDecInfo{uniqueId='" + this.f3853a + "', ecpmEncryptInfo='" + this.b + "', ecpmEncPubKey='" + this.c + "', ecpmDecPvtKeyServerId=" + this.d + ", ecpmDecPvtKeyClientId=" + this.e + ", ecpmRmbEncryptInfo='" + this.f + "'}";
    }

    public final String a() {
        return this.f3853a;
    }

    public final void a(String str) {
        this.f3853a = str;
    }

    public final String b() {
        return this.b;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final String c() {
        return this.c;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final int d() {
        return this.d;
    }

    public final void a(int r1) {
        this.d = r1;
    }

    public final int e() {
        return this.e;
    }

    public final void b(int r1) {
        this.e = r1;
    }

    public final String f() {
        return this.f;
    }

    public final void d(String str) {
        this.f = str;
    }
}
