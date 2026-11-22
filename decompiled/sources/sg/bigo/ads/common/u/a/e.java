package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.l;

/* loaded from: classes9.dex */
public class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, sg.bigo.ads.common.n.e> f19702a = new HashMap();
    private static l b;
    private final Executor c;
    private final sg.bigo.ads.common.u.b.c d;
    private final sg.bigo.ads.common.u.b e;

    public e(Executor executor, sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
        this.c = executor == null ? a() : executor;
        this.d = cVar;
        this.e = bVar;
    }

    public static sg.bigo.ads.common.n.e a() {
        l lVar = b;
        return a("DefaultNet", 5, lVar != null ? lVar.p() : false);
    }

    private static synchronized sg.bigo.ads.common.n.e a(String str, int i, boolean z) {
        sg.bigo.ads.common.n.e eVar;
        synchronized (e.class) {
            if (TextUtils.isEmpty(str)) {
                str = "DefaultNet";
            }
            Map<String, sg.bigo.ads.common.n.e> map = f19702a;
            eVar = map.get(str);
            if (eVar == null) {
                eVar = new sg.bigo.ads.common.n.e(str, i, z);
                map.put(str, eVar);
            }
        }
        return eVar;
    }

    public static void a(l lVar) {
        b = lVar;
    }

    public static sg.bigo.ads.common.n.e b() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.a();
            z = lVar.b();
        } else {
            i = 3;
            z = false;
        }
        return a("ConfigNet", i, z);
    }

    public static sg.bigo.ads.common.n.e c() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.c();
            z = lVar.d();
        } else {
            i = 2;
            z = false;
        }
        return a("ReportNet", i, z);
    }

    public static sg.bigo.ads.common.n.e d() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.e();
            z = lVar.f();
        } else {
            i = 12;
            z = false;
        }
        return a("AdNet", i, z);
    }

    public static sg.bigo.ads.common.n.e e() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.g();
            z = lVar.h();
        } else {
            i = 3;
            z = false;
        }
        return a("CallbackNet", i, z);
    }

    public static sg.bigo.ads.common.n.e f() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.i();
            z = lVar.j();
        } else {
            i = 3;
            z = false;
        }
        return a("VastNet", i, z);
    }

    public static sg.bigo.ads.common.n.e g() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.k();
            z = lVar.l();
        } else {
            i = 10;
            z = false;
        }
        return a("TrackerNet", i, z);
    }

    public static sg.bigo.ads.common.n.e h() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            i = lVar.m();
            z = lVar.n();
        } else {
            i = 5;
            z = false;
        }
        return a("CreativeNet", i, z);
    }

    public static sg.bigo.ads.common.n.e i() {
        int i;
        boolean z;
        l lVar = b;
        if (lVar != null) {
            z = lVar.o();
            i = 40;
        } else {
            i = 5;
            z = false;
        }
        return a("IconCreativeNet", i, z);
    }

    public static sg.bigo.ads.common.n.e j() {
        return a("BannerIconCreativeNet", b != null ? 40 : 5, true);
    }

    public static void k() {
    }

    protected void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
    }

    public final void l() {
        this.c.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.common.u.b bVar = this.e;
        if (bVar != null) {
            bVar.a((sg.bigo.ads.common.u.b) this.d);
        }
        a(this.d, this.e);
    }
}
