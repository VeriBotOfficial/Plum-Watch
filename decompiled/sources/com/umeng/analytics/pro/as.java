package com.umeng.analytics.pro;

/* compiled from: TApplicationException.java */
/* loaded from: classes2.dex */
public class as extends az {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13794a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final bx j = new bx("TApplicationException");
    private static final bn k = new bn("message", (byte) 11, 1);
    private static final bn l = new bn("type", (byte) 8, 2);
    private static final long m = 1;
    protected int i;

    public as() {
        this.i = 0;
    }

    public as(int i) {
        this.i = i;
    }

    public as(int i, String str) {
        super(str);
        this.i = i;
    }

    public as(String str) {
        super(str);
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public static as a(bs bsVar) throws az {
        bsVar.j();
        String str = null;
        int i = 0;
        while (true) {
            bn l2 = bsVar.l();
            if (l2.b != 0) {
                short s = l2.c;
                if (s != 1) {
                    if (s == 2) {
                        if (l2.b == 8) {
                            i = bsVar.w();
                        } else {
                            bv.a(bsVar, l2.b);
                        }
                    } else {
                        bv.a(bsVar, l2.b);
                    }
                } else if (l2.b == 11) {
                    str = bsVar.z();
                } else {
                    bv.a(bsVar, l2.b);
                }
                bsVar.m();
            } else {
                bsVar.k();
                return new as(i, str);
            }
        }
    }

    public void b(bs bsVar) throws az {
        bsVar.a(j);
        if (getMessage() != null) {
            bsVar.a(k);
            bsVar.a(getMessage());
            bsVar.c();
        }
        bsVar.a(l);
        bsVar.a(this.i);
        bsVar.c();
        bsVar.d();
        bsVar.b();
    }
}
