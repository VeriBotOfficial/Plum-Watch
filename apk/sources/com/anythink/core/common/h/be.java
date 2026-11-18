package com.anythink.core.common.h;

/* JADX INFO: loaded from: classes16.dex */
public final class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3870a;
    private String b;
    private long c;
    private int d;
    private int e;

    public be() {
    }

    public be(int r1, String str) {
        this.f3870a = r1;
        this.b = str;
        this.d = 0;
        this.e = 0;
        this.c = -1L;
    }

    public final String a() {
        return this.b;
    }

    private void a(String str) {
        this.b = str;
    }

    public final long b() {
        return this.c;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final int c() {
        return this.d;
    }

    public final void a(int r1) {
        this.d = r1;
    }

    public final int d() {
        return this.e;
    }

    public final void b(int r1) {
        this.e = r1;
    }

    public final int e() {
        return this.f3870a;
    }

    private void c(int r1) {
        this.f3870a = r1;
    }
}
