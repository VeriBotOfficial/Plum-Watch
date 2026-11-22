package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zj2 {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final ag1 f17531a = new ag1();
    private final StringBuilder b = new StringBuilder();

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0310, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00ab, code lost:
    
        if (android.gov.nist.core.Separators.RPAREN.equals(b(r3, r4)) == false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(com.yandex.mobile.ads.impl.ag1 r18) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zj2.a(com.yandex.mobile.ads.impl.ag1):java.util.ArrayList");
    }

    static String b(ag1 ag1Var, StringBuilder sb) {
        b(ag1Var);
        if (ag1Var.a() == 0) {
            return null;
        }
        String a2 = a(ag1Var, sb);
        return !"".equals(a2) ? a2 : "" + ((char) ag1Var.t());
    }

    static void b(ag1 ag1Var) {
        while (true) {
            for (boolean z = true; ag1Var.a() > 0 && z; z = false) {
                char c2 = (char) ag1Var.c()[ag1Var.d()];
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int d2 = ag1Var.d();
                    int e = ag1Var.e();
                    byte[] c3 = ag1Var.c();
                    int i = d2 + 2;
                    if (i <= e) {
                        int i2 = d2 + 1;
                        if (c3[d2] == 47 && c3[i2] == 42) {
                            while (true) {
                                int i3 = i + 1;
                                if (i3 >= e) {
                                    break;
                                }
                                if (((char) c3[i]) == '*' && ((char) c3[i3]) == '/') {
                                    i += 2;
                                    e = i;
                                } else {
                                    i = i3;
                                }
                            }
                            ag1Var.f(e - ag1Var.d());
                        }
                    }
                } else {
                    ag1Var.f(1);
                }
            }
            return;
        }
    }

    private static String a(ag1 ag1Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int d2 = ag1Var.d();
        int e = ag1Var.e();
        while (d2 < e && !z) {
            char c2 = (char) ag1Var.c()[d2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                d2++;
                sb.append(c2);
            }
        }
        ag1Var.f(d2 - ag1Var.d());
        return sb.toString();
    }
}
