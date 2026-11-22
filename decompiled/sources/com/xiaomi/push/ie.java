package com.xiaomi.push;

/* loaded from: classes4.dex */
public class ie {

    /* renamed from: a, reason: collision with root package name */
    private static int f14676a = Integer.MAX_VALUE;

    public static void a(ib ibVar, byte b) {
        a(ibVar, b, f14676a);
    }

    public static void a(ib ibVar, byte b, int i) {
        if (i <= 0) {
            throw new hv("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                ibVar.mo12345a();
                return;
            case 3:
                ibVar.a();
                return;
            case 4:
                ibVar.mo12332a();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                ibVar.mo12342a();
                return;
            case 8:
                ibVar.mo12333a();
                return;
            case 10:
                ibVar.mo12334a();
                return;
            case 11:
                ibVar.mo12341a();
                return;
            case 12:
                ibVar.mo12339a();
                while (true) {
                    hy mo12335a = ibVar.mo12335a();
                    if (mo12335a.f14670a != 0) {
                        a(ibVar, mo12335a.f14670a, i - 1);
                        ibVar.g();
                    } else {
                        ibVar.f();
                        return;
                    }
                }
            case 13:
                ia mo12337a = ibVar.mo12337a();
                while (i2 < mo12337a.f919a) {
                    int i3 = i - 1;
                    a(ibVar, mo12337a.f14673a, i3);
                    a(ibVar, mo12337a.b, i3);
                    i2++;
                }
                ibVar.h();
                return;
            case 14:
                Cif mo12338a = ibVar.mo12338a();
                while (i2 < mo12338a.f920a) {
                    a(ibVar, mo12338a.f14677a, i - 1);
                    i2++;
                }
                ibVar.j();
                return;
            case 15:
                hz mo12336a = ibVar.mo12336a();
                while (i2 < mo12336a.f916a) {
                    a(ibVar, mo12336a.f14671a, i - 1);
                    i2++;
                }
                ibVar.i();
                return;
        }
    }
}
