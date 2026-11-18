package com.anythink.core.common.m.b;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3999a;
    private int b;
    private long c;
    private boolean d;
    private int e;
    private Object f;

    private f() {
    }

    public static f a() {
        return new f();
    }

    public final String b() {
        return this.f3999a;
    }

    public final void a(String str) {
        this.f3999a = str;
    }

    public final int c() {
        return this.b;
    }

    public final void a(int r1) {
        this.b = r1;
    }

    public final long d() {
        return this.c;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final boolean e() {
        return this.d;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final int f() {
        return this.e;
    }

    public final void b(int r1) {
        this.e = r1;
    }

    public final Object g() {
        return this.f;
    }

    public final void a(Object obj) {
        this.f = obj;
    }

    public final String toString() {
        return "HttpRespEntity{urlKey='" + this.f3999a + "', statusCode=" + this.b + ", reqNextTime=" + this.c + ", isIntercept=" + this.d + ", interceptStatusCode=" + this.e + ", interceptResult=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }
}
