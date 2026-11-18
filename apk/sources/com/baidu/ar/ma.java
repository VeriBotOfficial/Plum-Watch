package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public class ma {
    public long b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7084a = 100;
    public long c = 0;
    public boolean d = false;

    public ma(long j) {
        this.b = j;
    }

    public int a(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            return 0;
        }
        long j3 = this.c;
        if (j3 == 0) {
            return 0;
        }
        return (int) (((j - j3) * ((double) this.f7084a)) / j2);
    }

    public boolean a() {
        return this.d;
    }

    public void b(long j) {
        this.c = j;
        this.d = true;
    }
}
