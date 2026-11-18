package com.baidu.location.f;

/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7646a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public int h;
    public char i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public String n;
    public String o;
    public String p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7647q;

    public a() {
        this.f7646a = -1;
        this.b = -1L;
        this.c = -1;
        this.d = -1;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0L;
        this.h = -1;
        this.i = '0';
        this.j = Integer.MAX_VALUE;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = null;
        this.f7647q = false;
        this.g = System.currentTimeMillis();
    }

    public a(int r4, long j, int r7, int r8, int r9, char c, int r11) {
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0L;
        this.j = Integer.MAX_VALUE;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = null;
        this.f7647q = false;
        this.f7646a = r4;
        this.b = j;
        this.c = r7;
        this.d = r8;
        this.h = r9;
        this.i = c;
        this.g = System.currentTimeMillis();
        this.j = r11;
    }

    public a(a aVar) {
        this(aVar.f7646a, aVar.b, aVar.c, aVar.d, aVar.h, aVar.i, aVar.j);
        this.g = aVar.g;
        this.n = aVar.n;
        this.l = aVar.l;
        this.p = aVar.p;
        this.m = aVar.m;
        this.o = aVar.o;
        this.k = aVar.k;
    }

    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.g;
        return jCurrentTimeMillis - j > 0 && jCurrentTimeMillis - j < 3000;
    }

    public boolean a(a aVar) {
        if (this.f7646a != aVar.f7646a || this.b != aVar.b || this.d != aVar.d || this.c != aVar.c) {
            return false;
        }
        String str = this.o;
        if (str == null || !str.equals(aVar.o)) {
            return this.o == null && aVar.o == null;
        }
        return true;
    }

    public boolean b() {
        return this.f7646a > -1 && this.b > 0;
    }

    public boolean c() {
        return this.f7646a == -1 && this.b == -1 && this.d == -1 && this.c == -1;
    }

    public boolean d() {
        return this.f7646a > -1 && this.b > -1 && this.d == -1 && this.c == -1;
    }

    public boolean e() {
        return this.f7646a > -1 && this.b > -1 && this.d > -1 && this.c > -1;
    }
}
