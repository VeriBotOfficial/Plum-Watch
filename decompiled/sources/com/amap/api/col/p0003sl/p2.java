package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OfflineDBOperation.java */
/* loaded from: classes11.dex */
public class p2 {
    private static volatile p2 b;
    private static sa c;

    /* renamed from: a, reason: collision with root package name */
    private Context f1825a;

    private p2(Context context) {
        this.f1825a = context;
        c = a(context);
    }

    private sa a(Context context) {
        try {
            return new sa(context, o2.a());
        } catch (Throwable th) {
            ja.a(th, "OfflineDB", "getDB");
            th.printStackTrace();
            return null;
        }
    }

    public static p2 b(Context context) {
        if (b == null) {
            synchronized (p2.class) {
                if (b == null) {
                    b = new p2(context);
                }
            }
        }
        return b;
    }

    public synchronized k2 c(String str) {
        if (!a()) {
            return null;
        }
        ArrayList arrayList = (ArrayList) c.b(n2.a(str), k2.class);
        if (arrayList.size() <= 0) {
            return null;
        }
        return (k2) arrayList.get(0);
    }

    public synchronized String d(String str) {
        if (!a()) {
            return null;
        }
        ArrayList arrayList = (ArrayList) c.b(n2.a(str), n2.class);
        return arrayList.size() > 0 ? ((n2) arrayList.get(0)).e : null;
    }

    private boolean a() {
        sa saVar;
        if (c == null) {
            try {
                saVar = new sa(this.f1825a, o2.a());
            } catch (Throwable th) {
                ja.a(th, "OfflineDB", "getDB");
                th.printStackTrace();
                saVar = null;
            }
            c = saVar;
        }
        return c != null;
    }

    public ArrayList<k2> b() {
        ArrayList<k2> arrayList = new ArrayList<>();
        if (a()) {
            Iterator it = ((ArrayList) c.b("", k2.class)).iterator();
            while (it.hasNext()) {
                arrayList.add((k2) it.next());
            }
        }
        return arrayList;
    }

    public synchronized void a(String str) {
        if (a()) {
            c.a(n2.a(str), n2.class);
            c.a(m2.a(str), m2.class);
            c.a(l2.a(str), l2.class);
        }
    }

    public synchronized void b(k2 k2Var) {
        if (a()) {
            c.a(k2Var, n2.a(k2Var.c));
            String f = k2Var.f();
            String str = k2Var.c;
            if (f != null && f.length() > 0) {
                String a2 = m2.a(str);
                if (((ArrayList) c.b(a2, m2.class)).size() > 0) {
                    c.a(a2, m2.class);
                }
                String[] split = f.split(";");
                ArrayList arrayList = new ArrayList();
                for (String str2 : split) {
                    arrayList.add(new m2(str, str2));
                }
                c.a((List) arrayList);
            }
        }
    }

    public synchronized void a(k2 k2Var) {
        if (a()) {
            c.a(n2.a(k2Var.c), n2.class);
            c.a(m2.a(k2Var.c), m2.class);
            c.a(l2.a(k2Var.c), l2.class);
        }
    }

    public void a(String str, int i, long j, long j2, long j3) {
        if (a()) {
            long[] jArr = {j2, 0, 0, 0, 0};
            long[] jArr2 = {j3, 0, 0, 0, 0};
            synchronized (this) {
                if (a()) {
                    c.a(new l2(str, j, i, jArr[0], jArr2[0]), l2.a(str));
                }
            }
        }
    }

    public synchronized List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!a()) {
            return arrayList;
        }
        List b2 = c.b(m2.a(str), m2.class);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) b2;
        if (arrayList3.size() > 0) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((m2) it.next()).a());
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
