package sg.bigo.ads.common.h.b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, a> f19636a = new HashMap();

    protected static void a() {
        f19636a.clear();
    }

    public static void a(String str) {
        a c = c(str);
        if (c == null) {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        if (c.e == h.d || c.e == h.f) {
            sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(c)));
            return;
        }
        c.e = h.b;
        f.a().a(c.f19629a);
        g.f19634a.execute(c.c);
    }

    protected static void a(a aVar) {
        aVar.f = "It's remove !!!";
        if (aVar.e != h.f) {
            aVar.e = h.g;
            f.a().a(aVar.f19629a);
        }
        f.a().b(aVar.f19629a);
        g.a(aVar.c);
    }

    protected static Collection<a> b() {
        return f19636a.values();
    }

    protected static void b(String str) {
        a c = c(str);
        if (c != null) {
            a(c);
        } else {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f19636a.containsKey(str)) {
            f19636a.remove(str);
        }
    }

    public static void b(a aVar) {
        if (f19636a.containsKey(aVar.f19629a)) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", " " + f19636a.keySet().size());
        f19636a.put(aVar.f19629a, aVar);
    }

    public static a c(String str) {
        if (f19636a.containsKey(str)) {
            return f19636a.get(str);
        }
        return null;
    }
}
