package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ao;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f3942a;

    private static String a(String str) {
        return str;
    }

    private i() {
    }

    public static i a() {
        if (f3942a == null) {
            synchronized (i.class) {
                if (f3942a == null) {
                    f3942a = new i();
                }
            }
        }
        return f3942a;
    }

    public static String b() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.x : j.e.f);
    }

    public static String c() {
        String str = l() ? j.e.y : j.e.g;
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (b != null && !TextUtils.isEmpty(b.aH())) {
            return b.aH();
        }
        return com.anythink.core.common.g.c.a().a(str);
    }

    private static String r() {
        return l() ? j.e.C : j.e.k;
    }

    private static String s() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.I : j.e.r);
    }

    public static String a(com.anythink.core.d.l lVar, boolean z) {
        if (z) {
            String R = lVar.R();
            lVar.aH();
            if (!TextUtils.isEmpty(R)) {
                return R;
            }
        }
        ao D = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).D();
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.D : j.e.l, "bid");
        return D != null ? a(D.c(), a2) : a2;
    }

    public static String a(com.anythink.core.d.l lVar) {
        String N = lVar.N();
        return TextUtils.isEmpty(N) ? "" : N;
    }

    public static String b(com.anythink.core.d.l lVar) {
        return lVar.M();
    }

    public static String d() {
        ao D = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).D();
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.E : j.e.m, "bid");
        return D != null ? a(D.b(), a2) : a2;
    }

    public static String e() {
        ao D = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).D();
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.F : j.e.n, com.anythink.core.common.m.b.g.g);
        return D != null ? a(D.d(), a2) : a2;
    }

    public static String f() {
        ao D = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).D();
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.G : j.e.o, "bid");
        return D != null ? a(D.a(), a2) : a2;
    }

    public static String g() {
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.H : j.e.f3682q, com.anythink.core.common.m.b.g.g);
        return b != null ? a(b.A(), a2) : a2;
    }

    public static String h() {
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.B : j.e.j, com.anythink.core.common.m.b.g.g);
        return b != null ? a(b.am(), a2) : a2;
    }

    public static String i() {
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.A : j.e.i, com.anythink.core.common.m.b.g.h);
        return b != null ? a(b.ar(), a2) : a2;
    }

    public static String j() {
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (b != null) {
            return a(b.aj(), "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html");
        }
        com.anythink.core.common.d.s c = com.anythink.core.common.d.t.b().c();
        String gdprUrl = c != null ? c.getGdprUrl() : "";
        return !TextUtils.isEmpty(gdprUrl) ? gdprUrl : "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";
    }

    public static String k() {
        return j.e.t;
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static boolean l() {
        return com.anythink.core.common.d.t.b().L() && com.anythink.core.common.d.t.b().K();
    }

    private static String t() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.J : j.e.v);
    }

    public static String m() {
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        String a2 = com.anythink.core.common.g.c.a().a(l() ? j.e.z : j.e.h, com.anythink.core.common.m.b.g.k);
        return b != null ? a(b.aG(), a2) : a2;
    }

    public static String n() {
        com.anythink.core.common.d.s c = com.anythink.core.common.d.t.b().c();
        String cdnUrl = c != null ? c.getCdnUrl() : "";
        if (TextUtils.isEmpty(cdnUrl)) {
            cdnUrl = "https://se.zxcvbnmpo.com/v2/open/ns";
        }
        com.anythink.core.d.b a2 = com.anythink.core.d.d.a();
        if (a2 == null) {
            return cdnUrl;
        }
        String ab = a2.ab();
        if (TextUtils.isEmpty(ab)) {
            return cdnUrl;
        }
        if (ab.startsWith("http")) {
            return ab + "/v2/open/ns";
        }
        return com.anythink.core.common.v.q.a(cdnUrl, ab);
    }

    public static String o() {
        com.anythink.core.d.b a2 = com.anythink.core.d.d.a();
        com.anythink.core.common.d.s c = com.anythink.core.common.d.t.b().c();
        String cdnTcpDm = (c == null || c.getOsDmEntity() == null) ? "" : c.getOsDmEntity().getCdnTcpDm();
        if (TextUtils.isEmpty(cdnTcpDm)) {
            cdnTcpDm = j.g.b.c;
        }
        if (a2 != null) {
            String aN = a2.aN();
            if (!TextUtils.isEmpty(aN)) {
                return aN;
            }
        }
        return cdnTcpDm;
    }

    public static int p() {
        int aO;
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        return (b == null || (aO = b.aO()) <= 0) ? j.g.b.f3686a : aO;
    }

    public static String q() {
        String str = l() ? j.e.K : j.e.w;
        com.anythink.core.d.b b = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (b != null && !TextUtils.isEmpty(b.aP())) {
            return b.aP();
        }
        return com.anythink.core.common.g.c.a().a(str);
    }
}
