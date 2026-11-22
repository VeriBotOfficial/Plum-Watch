package com.huawei.hms.scankit.p;

/* compiled from: C40Encoder.java */
/* renamed from: com.huawei.hms.scankit.p.ac, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C2982ac implements InterfaceC2998ec {
    C2982ac() {
    }

    static void b(C3002fc c3002fc, StringBuilder sb) {
        c3002fc.a(a(sb, 0));
        sb.delete(0, 3);
    }

    public int a() {
        return 1;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC2998ec
    public void a(C3002fc c3002fc) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3002fc.h()) {
                break;
            }
            char c = c3002fc.c();
            c3002fc.f++;
            int a2 = a(c, sb);
            int a3 = c3002fc.a() + ((sb.length() / 3) * 2);
            c3002fc.c(a3);
            int a4 = c3002fc.g().a() - a3;
            if (!c3002fc.h()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a4 < 2 || a4 > 2)) {
                    a2 = a(c3002fc, sb, sb2, a2);
                }
                while (sb.length() % 3 == 1 && ((a2 <= 3 && a4 != 1) || a2 > 3)) {
                    a2 = a(c3002fc, sb, sb2, a2);
                }
            } else if (sb.length() % 3 == 0 && C3010hc.a(c3002fc.d(), c3002fc.f, a()) != a()) {
                c3002fc.b(0);
                break;
            }
        }
        a(c3002fc, sb);
    }

    private int a(C3002fc c3002fc, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        c3002fc.f--;
        int a2 = a(c3002fc.c(), sb2);
        c3002fc.j();
        return a2;
    }

    void a(C3002fc c3002fc, StringBuilder sb) {
        int length = (sb.length() / 3) * 2;
        int length2 = sb.length() % 3;
        int a2 = c3002fc.a() + length;
        c3002fc.c(a2);
        int a3 = c3002fc.g().a() - a2;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                b(c3002fc, sb);
            }
            if (c3002fc.h()) {
                c3002fc.a((char) 254);
            }
        } else if (a3 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                b(c3002fc, sb);
            }
            if (c3002fc.h()) {
                c3002fc.a((char) 254);
            }
            c3002fc.f--;
        } else if (length2 == 0) {
            while (sb.length() >= 3) {
                b(c3002fc, sb);
            }
            if (a3 > 0 || c3002fc.h()) {
                c3002fc.a((char) 254);
            }
        } else {
            try {
                throw new IllegalStateException("Unexpected case. Please report!");
            } catch (Exception unused) {
                com.huawei.hms.scankit.util.a.b("exception", "Exception");
            }
        }
        c3002fc.b(0);
    }

    int a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        sb.append("\u0001\u001e");
        return a((char) (c - 128), sb) + 2;
    }

    private static String a(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }
}
