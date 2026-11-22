package com.anythink.basead.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;

/* loaded from: classes11.dex */
public final class e {
    public static int a(Context context, w wVar) {
        int K = wVar.K();
        if (K == 1 || K == 4) {
            return q.a(context, "myoffer_cta_install_now", "string");
        }
        return q.a(context, "myoffer_cta_learn_more", "string");
    }

    public static int a(Context context, int i) {
        return (i == 1 || i == 4) ? q.a(context, "myoffer_shake_full_title_download_type", "string") : q.a(context, "myoffer_shake_full_title", "string");
    }

    public static boolean a(w wVar) {
        return (TextUtils.isEmpty(wVar.z()) && TextUtils.isEmpty(wVar.x()) && TextUtils.isEmpty(wVar.y())) ? false : true;
    }

    public static boolean a(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.j);
            valueOf.hashCode();
            switch (valueOf) {
                case "0":
                case "2":
                case "4":
                    if (!wVar.n() && wVar.L() && com.anythink.basead.b.c.d.a(wVar, xVar.o)) {
                        return true;
                    }
                    break;
                case "1":
                    return true;
                case "3":
                    return wVar.J() == 1 && wVar.L();
                default:
                    return false;
            }
        }
        return false;
    }

    private static boolean g(w wVar, x xVar) {
        if (xVar != null && wVar != null) {
            String valueOf = String.valueOf(xVar.j);
            valueOf.hashCode();
            if (!valueOf.equals("1")) {
                if (valueOf.equals("3")) {
                    return a(wVar, xVar);
                }
                return false;
            }
            if (!TextUtils.isEmpty(wVar.E())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(w wVar) {
        return wVar != null && wVar.n();
    }

    public static boolean b(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.j);
            valueOf.hashCode();
            if (valueOf.equals("4") && xVar.o.aB() > 0 && (!TextUtils.isEmpty(wVar.B()) || !TextUtils.isEmpty(wVar.z()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(x xVar) {
        return (xVar == null || xVar.o == null || t.b().c("sensor_deny") || !com.anythink.core.express.c.a.a().b() || xVar.o.U() != 1) ? false : true;
    }

    public static boolean c(w wVar, x xVar) {
        if (xVar != null && xVar.o != null) {
            String valueOf = String.valueOf(xVar.o.D());
            valueOf.hashCode();
            switch (valueOf) {
                case "0":
                case "2":
                case "4":
                    if (wVar != null && wVar.L()) {
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    public static int d(w wVar, x xVar) {
        if ((!(wVar instanceof r) || TextUtils.isEmpty(((r) wVar).d())) && wVar != null && xVar != null) {
            boolean L = wVar.L();
            boolean z = (TextUtils.isEmpty(wVar.B()) && TextUtils.isEmpty(wVar.d((w) wVar.r()))) ? false : true;
            int ao = wVar.ao();
            if (ao == 3) {
                return L ? 7 : 8;
            }
            if (ao == 2) {
                return L ? 6 : 5;
            }
            if (L && z) {
                return 3;
            }
            if (L) {
                return 2;
            }
            if (z) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean e(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.j);
            valueOf.hashCode();
            if (valueOf.equals("3") && !a(wVar, xVar)) {
                return true;
            }
        }
        return false;
    }

    public static int a(x xVar, Context context) {
        if (xVar == null) {
            return 1;
        }
        if (xVar.o != null && xVar.j == 4) {
            return xVar.o.A();
        }
        return m.f(context);
    }

    private static boolean h(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.j);
            valueOf.hashCode();
            if (valueOf.equals("4") && (wVar instanceof bj)) {
                boolean z = 1 == ((bj) wVar).aJ();
                if (xVar.o.A() == 1 && ((!z && xVar.o.bu() == 2) || (z && xVar.o.bv() == 2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(w wVar) {
        if (wVar == null) {
            return false;
        }
        if (wVar.t() != 42) {
            return (wVar instanceof bi) && ((bi) wVar).d() == 42;
        }
        return true;
    }

    public static int f(w wVar, x xVar) {
        boolean z = false;
        if (xVar == null || xVar.o == null || wVar == null) {
            return 0;
        }
        int i = xVar.j;
        int i2 = 4;
        if ((i == 3 || i == 4) && xVar.o.aE()) {
            return 0;
        }
        String H = wVar.H();
        if (xVar.o.bA() == 1) {
            boolean isEmpty = TextUtils.isEmpty(H);
            int i3 = isEmpty ? 2 : 1;
            boolean z2 = !isEmpty;
            if (!isEmpty && !H.startsWith("http")) {
                z2 = false;
                i3 = 3;
            }
            if (!z2 || wVar.K() == 2 || wVar.K() == 3) {
                i2 = i3;
                z = z2;
            }
            if (z && TextUtils.isEmpty(wVar.G())) {
                return 5;
            }
            return i2;
        }
        return 0;
    }
}
