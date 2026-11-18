package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7343a;
    public int b = 0;
    public long c = 0;

    public y3(int r3) {
        this.f7343a = 33;
        if (r3 > 0) {
            this.f7343a = 1000 / r3;
        }
    }

    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.c == 0) {
            this.c = jCurrentTimeMillis;
        }
        long j = jCurrentTimeMillis % 1000;
        if (jCurrentTimeMillis / 1000 != this.c / 1000) {
            this.c = jCurrentTimeMillis;
            this.b = 0;
        }
        int r0 = this.b;
        if (this.f7343a * r0 >= j) {
            return false;
        }
        this.b = r0 + 1;
        return true;
    }
}
