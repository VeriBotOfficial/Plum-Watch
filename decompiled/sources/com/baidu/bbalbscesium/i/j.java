package com.baidu.bbalbscesium.i;

/* loaded from: classes12.dex */
class j {
    protected static final boolean b = false;
    private static final boolean c = false;
    public static final long d = 1099511627775L;
    public static int e = 5;
    public static int f = 40;

    /* renamed from: a, reason: collision with root package name */
    private b f7392a;

    public j() {
        b bVar = new b(f);
        this.f7392a = bVar;
        bVar.a(0, f, true);
    }

    public b a() {
        return this.f7392a;
    }

    public void a(b bVar, int i, int i2, int i3) {
        b d2 = this.f7392a.d(i, i + i2);
        if (i3 == 0) {
            d2.a(bVar);
        } else if (i3 == 2) {
            d2.b(bVar);
        } else if (i3 != 3) {
            d2.e(bVar);
        } else {
            d2.d(bVar);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            this.f7392a.a(i + i4, d2.e(i4));
        }
    }

    public byte[] b() {
        return this.f7392a.h();
    }
}
