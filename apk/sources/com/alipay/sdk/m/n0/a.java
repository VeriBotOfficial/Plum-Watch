package com.alipay.sdk.m.n0;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1419a;
    public String b;
    public String c;
    public int d;

    public a(String str) {
        this.c = str;
    }

    public void a(int r1) {
        this.d = r1;
    }

    public void a(long j) {
        this.f1419a = j;
    }

    public void a(String str) {
        this.b = str;
    }

    public boolean a() {
        return this.f1419a > System.currentTimeMillis();
    }

    public void b() {
        this.f1419a = 0L;
    }
}
