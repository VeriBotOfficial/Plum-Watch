package com.anythink.expressad.b;

/* loaded from: classes12.dex */
public class d {
    protected static final int b = 1;
    protected static final int c = 2;
    protected static final int d = 4;
    protected static final int e = 8;
    protected static final int f = 16;
    protected static final int g = 32;

    /* renamed from: a, reason: collision with root package name */
    private int f4720a = 1;
    protected e h;

    private int a() {
        return this.f4720a;
    }

    private void a(int i) {
        this.f4720a = i;
    }

    private boolean c() {
        int i = this.f4720a;
        return i == 8 || i == 16;
    }

    private boolean d() {
        return this.f4720a == 2;
    }

    private boolean e() {
        return this.f4720a == 32;
    }

    private boolean f() {
        return this.f4720a == 4;
    }

    public void b() {
        this.f4720a = 8;
    }

    private void a(e eVar) {
        this.h = eVar;
    }
}
