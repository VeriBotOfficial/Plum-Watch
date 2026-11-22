package com.anythink.core.common.w.a.a;

import android.text.TextUtils;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.aj;
import com.anythink.core.common.h.ak;
import com.anythink.core.common.h.al;
import com.anythink.core.common.w.a.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4465a = "c";
    private static final long b = 3600000;
    private static final long c = 30000;
    private volatile List<aj> d;

    public final void a(al alVar, ak akVar, ai aiVar) {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new CopyOnWriteArrayList();
                }
            }
        }
        String a2 = alVar.a();
        int d = alVar.d();
        aj a3 = a(a2, this.d);
        new Object[]{a3, Integer.valueOf(d), a2};
        if (d != a.b.b) {
            if (d == a.b.c) {
                String a4 = com.anythink.core.common.w.a.d.a.a(alVar.e(), akVar);
                alVar.a(a4);
                if (!TextUtils.isEmpty(a4)) {
                    List<aj> list = this.d;
                    if (a3 != null) {
                        long b2 = a3.b();
                        long j = b2 > 0 ? b2 * 2 : 30000L;
                        if (j >= 3600000) {
                            j = 3600000;
                        }
                        a3.a(j);
                    } else {
                        aj a5 = aj.a(a2, a.C0219a.b);
                        a5.a(30000L);
                        if (list != null) {
                            list.add(a5);
                        }
                    }
                }
            }
            aiVar.b(this.d);
        }
        List<aj> list2 = this.d;
        if (a3 != null && list2 != null) {
            list2.remove(a3);
        }
        aiVar.b(this.d);
    }

    public final void a() {
        if (this.d != null) {
            this.d.clear();
        }
    }

    private static aj a(String str, List<aj> list) {
        if (list != null && !list.isEmpty()) {
            for (aj ajVar : list) {
                if (ajVar.c().equals(str)) {
                    return ajVar;
                }
            }
        }
        return null;
    }

    private static void a(String str, aj ajVar, List<aj> list) {
        if (ajVar != null) {
            long b2 = ajVar.b();
            long j = b2 > 0 ? 2 * b2 : 30000L;
            if (j >= 3600000) {
                j = 3600000;
            }
            ajVar.a(j);
            return;
        }
        aj a2 = aj.a(str, a.C0219a.b);
        a2.a(30000L);
        if (list != null) {
            list.add(a2);
        }
    }

    private static void a(aj ajVar, List<aj> list) {
        if (ajVar == null || list == null) {
            return;
        }
        list.remove(ajVar);
    }
}
