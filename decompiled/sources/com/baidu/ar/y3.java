package com.baidu.ar;

/* loaded from: classes12.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7343a;
    public int b = 0;
    public long c = 0;

    public y3(int i) {
        this.f7343a = 33;
        if (i > 0) {
            this.f7343a = 1000 / i;
        }
    }

    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.c == 0) {
            this.c = currentTimeMillis;
        }
        long j = currentTimeMillis % 1000;
        if (currentTimeMillis / 1000 != this.c / 1000) {
            this.c = currentTimeMillis;
            this.b = 0;
        }
        int i = this.b;
        if (this.f7343a * i >= j) {
            return false;
        }
        this.b = i + 1;
        return true;
    }
}
