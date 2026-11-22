package com.huawei.hms.scankit.p;

/* compiled from: ASCIIEncoder.java */
/* loaded from: classes14.dex */
final class Zb implements InterfaceC2998ec {
    Zb() {
    }

    public int a() {
        return 0;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC2998ec
    public void a(C3002fc c3002fc) {
        if (C3010hc.a(c3002fc.d(), c3002fc.f) >= 2) {
            c3002fc.a(a(c3002fc.d().charAt(c3002fc.f), c3002fc.d().charAt(c3002fc.f + 1)));
            c3002fc.f += 2;
            return;
        }
        char c = c3002fc.c();
        int a2 = C3010hc.a(c3002fc.d(), c3002fc.f, a());
        if (a2 == a()) {
            if (!C3010hc.c(c)) {
                c3002fc.a((char) (c + 1));
                c3002fc.f++;
                return;
            } else {
                c3002fc.a((char) 235);
                c3002fc.a((char) (c - 127));
                c3002fc.f++;
                return;
            }
        }
        if (a2 == 1) {
            c3002fc.a((char) 230);
            c3002fc.b(1);
            return;
        }
        if (a2 == 2) {
            c3002fc.a((char) 239);
            c3002fc.b(2);
            return;
        }
        if (a2 == 3) {
            c3002fc.a((char) 238);
            c3002fc.b(3);
        } else if (a2 == 4) {
            c3002fc.a((char) 240);
            c3002fc.b(4);
        } else {
            if (a2 != 5) {
                throw new IllegalStateException("Illegal mode: " + a2);
            }
            c3002fc.a((char) 231);
            c3002fc.b(5);
        }
    }

    private static char a(char c, char c2) {
        if (C3010hc.b(c) && C3010hc.b(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }
}
