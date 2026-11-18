package com.mbridge.msdk.splash.request;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: SplashV3ParamsEntity.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12100a;
    private String b;
    private int c;
    private int d;
    private int e;

    public void a(String str) {
        this.b = str;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f12100a;
    }

    public String e() {
        return this.b;
    }

    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f12100a + ", session_id='" + this.b + "', offset=" + this.c + ", expectWidth=" + this.d + ", expectHeight=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public int a() {
        return this.e;
    }

    public void b(int r1) {
        this.d = r1;
    }

    public void c(int r1) {
        this.c = r1;
    }

    public void d(int r1) {
        this.f12100a = r1;
    }

    public void a(int r1) {
        this.e = r1;
    }
}
