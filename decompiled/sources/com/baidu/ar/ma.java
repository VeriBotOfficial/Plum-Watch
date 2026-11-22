package com.baidu.ar;

/* loaded from: classes12.dex */
public class ma {
    public long b;

    /* renamed from: a, reason: collision with root package name */
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
        if (this.c == 0) {
            return 0;
        }
        return (int) (((j - r4) * this.f7084a) / j2);
    }

    public boolean a() {
        return this.d;
    }

    public void b(long j) {
        this.c = j;
        this.d = true;
    }
}
