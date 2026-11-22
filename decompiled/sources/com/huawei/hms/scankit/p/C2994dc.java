package com.huawei.hms.scankit.p;

/* compiled from: EdifactEncoder.java */
/* renamed from: com.huawei.hms.scankit.p.dc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C2994dc implements InterfaceC2998ec {
    C2994dc() {
    }

    public int a() {
        return 4;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC2998ec
    public void a(C3002fc c3002fc) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3002fc.h()) {
                break;
            }
            a(c3002fc.c(), sb);
            c3002fc.f++;
            if (sb.length() >= 4) {
                c3002fc.a(a(sb, 0));
                sb.delete(0, 4);
                if (C3010hc.a(c3002fc.d(), c3002fc.f, a()) != a()) {
                    c3002fc.b(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        a(c3002fc, sb);
    }

    private static void a(C3002fc c3002fc, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c3002fc.k();
                int a2 = c3002fc.g().a() - c3002fc.a();
                int f = c3002fc.f();
                if (f > a2) {
                    c3002fc.c(c3002fc.a() + 1);
                    a2 = c3002fc.g().a() - c3002fc.a();
                }
                if (f <= a2 && a2 <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String a3 = a(charSequence, 0);
                if (c3002fc.h() || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    c3002fc.c(c3002fc.a() + i);
                    if (c3002fc.g().a() - c3002fc.a() >= 3) {
                        c3002fc.c(c3002fc.a() + a3.length());
                        z = false;
                    }
                }
                if (z) {
                    c3002fc.j();
                    c3002fc.f -= i;
                } else {
                    c3002fc.a(a3);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c3002fc.b(0);
        }
    }

    private static void a(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - '@'));
        } else {
            C3010hc.a(c);
            throw null;
        }
    }

    private static String a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            int charAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
            char c = (char) ((charAt >> 16) & 255);
            char c2 = (char) ((charAt >> 8) & 255);
            char c3 = (char) (charAt & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c);
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
