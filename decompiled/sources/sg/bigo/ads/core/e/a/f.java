package sg.bigo.ads.core.e.a;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.core.r;

/* loaded from: classes9.dex */
public final class f {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static f f20014a = new f(0);
    }

    private f() {
    }

    /* synthetic */ f(byte b) {
        this();
    }

    public static List<e> a(long j, r rVar) {
        sg.bigo.ads.common.g.c.c.b(System.currentTimeMillis() - 86400000);
        Cursor a2 = sg.bigo.ads.common.g.c.c.a(j);
        ArrayList arrayList = new ArrayList();
        if (a2 == null) {
            return arrayList;
        }
        while (a2.moveToNext()) {
            e eVar = new e(rVar, a2);
            arrayList.add(eVar);
            sg.bigo.ads.common.t.a.a(0, 3, "TrackerManager", "getList:" + eVar.toString());
        }
        a2.close();
        return arrayList;
    }

    public static void a(e eVar) {
        if (sg.bigo.ads.common.g.c.c.c(eVar)) {
            sg.bigo.ads.common.g.c.c.b(eVar);
        } else {
            eVar.f19619a = sg.bigo.ads.common.g.c.c.a(eVar);
        }
    }

    public static void b(e eVar) {
        if (eVar.g()) {
            c(eVar);
        } else {
            sg.bigo.ads.common.g.c.c.b(eVar);
        }
    }

    private static void c(e eVar) {
        sg.bigo.ads.common.g.c.c.a(String.valueOf(eVar.f19619a));
    }
}
