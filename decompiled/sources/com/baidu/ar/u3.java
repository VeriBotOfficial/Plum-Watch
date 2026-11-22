package com.baidu.ar;

import android.content.Context;
import android.util.Pair;
import com.baidu.ar.z9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes12.dex */
public class u3 implements z9.a {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f7239a;
    public x3 c;
    public String d;
    public String e;
    public String[][] f;
    public Map<String, String> g;
    public z9 j;
    public Map<String, t3> b = new HashMap();
    public long h = 0;
    public long i = 0;

    public u3(Context context, x3 x3Var, String[][] strArr, Map<String, String> map, z9 z9Var) {
        this.f7239a = new WeakReference<>(context);
        this.c = x3Var;
        this.f = strArr;
        this.g = map == null ? new HashMap<>() : map;
        this.j = z9Var;
        z9Var.a(this);
    }

    public final Pair<Long, Long> a(long j, long j2) {
        long j3;
        long j4;
        long j5 = this.h;
        if (j5 <= 0 || j > j5) {
            j3 = j2 - j;
            j4 = 0;
        } else {
            long j6 = this.i;
            if (j6 <= 0 || j2 < j6) {
                j3 = j5 - j;
                j4 = j2 - j5;
            } else {
                j3 = (j5 - j) + (j6 - j2);
                j4 = j6 - j5;
            }
        }
        if (j3 < 0) {
            j3 = 0;
        }
        return new Pair<>(Long.valueOf(j3), Long.valueOf(j4 >= 0 ? j4 : 0L));
    }

    public final ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[][] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            for (String[] strArr2 : strArr) {
                if (strArr2 != null && strArr2.length >= 2 && str.equals(strArr2[0])) {
                    for (int i = 1; i < strArr2.length; i++) {
                        arrayList.add(strArr2[i]);
                    }
                }
            }
        }
        return arrayList;
    }

    public void a() {
        this.j.a();
    }

    @Override // com.baidu.ar.z9.a
    public void a(int i) {
        if (i > 0) {
            synchronized (this.c) {
                this.c.notifyAll();
            }
        }
    }

    public void a(long j) {
        c(j);
        synchronized (this.c) {
            this.c.b();
        }
        a();
    }

    public void a(t3 t3Var) {
        g(t3Var);
        a(t3Var);
    }

    public void a(List<String> list) {
        this.j.a(list);
    }

    public final void a(t3... t3VarArr) {
        synchronized (this.c) {
            this.c.a();
            for (t3 t3Var : t3VarArr) {
                this.c.a(t3Var);
            }
            this.c.notifyAll();
        }
    }

    public final String b() {
        if (this.d == null) {
            Context context = this.f7239a.get();
            if (context == null) {
                return "";
            }
            UUID a2 = new h3(context).a();
            this.d = a2 != null ? a2.toString() : "";
        }
        return this.d;
    }

    public final String b(String str) {
        String[][] strArr = this.f;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2 != null && strArr2.length >= 2) {
                for (int i = 1; i < strArr2.length; i++) {
                    if (str.equals(strArr2[i])) {
                        return strArr2[0];
                    }
                }
            }
        }
        return null;
    }

    public void b(long j) {
        d(j);
    }

    public void b(t3 t3Var) {
        g(t3Var);
        synchronized (this.c) {
            this.c.a();
            String b = t3Var.b();
            long longValue = ((Number) t3Var.c("_db_period")).longValue();
            ArrayList arrayList = new ArrayList();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                t3 t3Var2 = this.c.get(i);
                if (b.equals(t3Var2.b()) && longValue == t3Var2.d("_db_period") && t3Var.c() - t3Var2.c() < longValue) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (!arrayList.isEmpty()) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    int intValue = ((Integer) arrayList.get(size2)).intValue();
                    t3 t3Var3 = this.c.get(intValue);
                    this.c.remove(intValue);
                    t3.a(t3Var3);
                }
            }
            this.c.a(t3Var);
            this.c.notifyAll();
        }
    }

    public void c() {
        if (this.f7239a.get() == null) {
            return;
        }
        this.e = k8.a(b() + String.valueOf(System.currentTimeMillis()));
    }

    public final void c(long j) {
        this.h = j;
    }

    public void c(t3 t3Var) {
        String str;
        t3 t3Var2;
        String b = t3Var.b();
        String b2 = b(b);
        if (b2 == null || b2.isEmpty() || (t3Var2 = this.b.get((str = b2 + ":" + b))) == null) {
            return;
        }
        Pair<Long, Long> a2 = a(t3Var2.c(), t3Var.c());
        t3Var.a("st", String.valueOf(t3Var2.c()));
        t3Var.a("duration", String.valueOf(((Long) a2.first).longValue()));
        t3Var.a("_pausedt", String.valueOf(((Long) a2.second).longValue()));
        a(t3Var);
        this.b.remove(str);
        t3.a(t3Var2);
    }

    public final void d(long j) {
        long j2 = this.h;
        if (j < j2) {
            j = j2;
        }
        this.i = j;
    }

    public void d(t3 t3Var) {
        String b = t3Var.b();
        ArrayList<String> a2 = a(b);
        if (a2.isEmpty()) {
            return;
        }
        a(t3Var.clone());
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            this.b.put(b + ":" + it.next(), t3Var);
        }
    }

    public void e(t3 t3Var) {
        String b = t3Var.b();
        t3 t3Var2 = this.b.get(b);
        boolean equals = "1".equals(t3Var.c("__stt"));
        if (t3Var2 == null) {
            if (equals) {
                this.b.put(b, t3Var);
                t3 clone = t3Var.clone();
                clone.h(b);
                clone.g("__stt");
                clone.g("__falseev");
                a(clone);
                return;
            }
            return;
        }
        if (equals) {
            return;
        }
        String e = t3Var.e("__falseev");
        if (e != null && !e.isEmpty()) {
            t3 clone2 = t3Var.clone();
            clone2.h(e);
            clone2.g("__stt");
            clone2.g("__falseev");
            a(clone2);
        }
        this.b.remove(b);
        t3.a(t3Var2);
    }

    public void f(t3 t3Var) {
        boolean b;
        h(t3Var);
        synchronized (this.j) {
            b = this.j.b(t3Var);
        }
        if (b) {
            return;
        }
        t3.a(t3Var);
    }

    public final void g(t3 t3Var) {
        h(t3Var);
        if (t3Var.a("event_label") || !this.g.containsKey(t3Var.b())) {
            return;
        }
        t3Var.a("event_label", this.g.get(t3Var.b()));
    }

    public final void h(t3 t3Var) {
        t3Var.a("request_id", this.e);
    }
}
