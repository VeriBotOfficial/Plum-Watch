package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bm;

/* compiled from: TProtocolUtil.java */
/* loaded from: classes2.dex */
public class bv {

    /* renamed from: a, reason: collision with root package name */
    private static int f13822a = Integer.MAX_VALUE;

    public static void a(int i) {
        f13822a = i;
    }

    public static void a(bs bsVar, byte b) throws az {
        a(bsVar, b, f13822a);
    }

    public static void a(bs bsVar, byte b, int i) throws az {
        if (i <= 0) {
            throw new az("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                bsVar.t();
                return;
            case 3:
                bsVar.u();
                return;
            case 4:
                bsVar.y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                bsVar.v();
                return;
            case 8:
                bsVar.w();
                return;
            case 10:
                bsVar.x();
                return;
            case 11:
                bsVar.A();
                return;
            case 12:
                bsVar.j();
                while (true) {
                    bn l = bsVar.l();
                    if (l.b != 0) {
                        a(bsVar, l.b, i - 1);
                        bsVar.m();
                    } else {
                        bsVar.k();
                        return;
                    }
                }
            case 13:
                bp n = bsVar.n();
                while (i2 < n.c) {
                    int i3 = i - 1;
                    a(bsVar, n.f13818a, i3);
                    a(bsVar, n.b, i3);
                    i2++;
                }
                bsVar.o();
                return;
            case 14:
                bw r = bsVar.r();
                while (i2 < r.b) {
                    a(bsVar, r.f13823a, i - 1);
                    i2++;
                }
                bsVar.s();
                return;
            case 15:
                bo p = bsVar.p();
                while (i2 < p.b) {
                    a(bsVar, p.f13817a, i - 1);
                    i2++;
                }
                bsVar.q();
                return;
        }
    }

    public static bu a(byte[] bArr, bu buVar) {
        if (bArr[0] > 16) {
            return new bm.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? buVar : new bm.a();
    }
}
