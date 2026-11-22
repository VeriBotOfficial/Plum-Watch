package com.huawei.hms.scankit.p;

/* compiled from: X12Encoder.java */
/* renamed from: com.huawei.hms.scankit.p.lc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3026lc extends C2982ac {
    C3026lc() {
    }

    @Override // com.huawei.hms.scankit.p.C2982ac
    public int a() {
        return 3;
    }

    @Override // com.huawei.hms.scankit.p.C2982ac, com.huawei.hms.scankit.p.InterfaceC2998ec
    public void a(C3002fc c3002fc) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3002fc.h()) {
                break;
            }
            char c = c3002fc.c();
            c3002fc.f++;
            a(c, sb);
            if (sb.length() % 3 == 0) {
                C2982ac.b(c3002fc, sb);
                if (C3010hc.a(c3002fc.d(), c3002fc.f, a()) != a()) {
                    c3002fc.b(0);
                    break;
                }
            }
        }
        a(c3002fc, sb);
    }

    @Override // com.huawei.hms.scankit.p.C2982ac
    int a(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
        } else {
            C3010hc.a(c);
            throw null;
        }
        return 1;
    }

    @Override // com.huawei.hms.scankit.p.C2982ac
    void a(C3002fc c3002fc, StringBuilder sb) {
        c3002fc.k();
        int a2 = c3002fc.g().a() - c3002fc.a();
        c3002fc.f -= sb.length();
        if (c3002fc.f() > 1 || a2 > 1 || c3002fc.f() != a2) {
            c3002fc.a((char) 254);
        }
        if (c3002fc.e() < 0) {
            c3002fc.b(0);
        }
    }
}
