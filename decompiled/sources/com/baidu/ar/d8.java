package com.baidu.ar;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class d8 {

    /* renamed from: a, reason: collision with root package name */
    public x3 f6875a;
    public int b;
    public boolean c;
    public h6 d;

    public d8(x3 x3Var, int i, h6 h6Var, boolean z) {
        if (x3Var == null || h6Var == null) {
            throw null;
        }
        this.f6875a = x3Var;
        this.d = h6Var;
        this.b = i <= 0 ? 10 : i;
        this.c = z;
    }

    public List<List<t3>> a() {
        ArrayList arrayList;
        synchronized (this.f6875a) {
            arrayList = new ArrayList();
            if (!this.f6875a.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                int size = this.f6875a.size();
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < size; i++) {
                    t3 t3Var = this.f6875a.get(i);
                    String d = t3Var.d();
                    if (!hashMap.containsKey(d)) {
                        if (a(t3Var)) {
                            arrayList3.add(Integer.valueOf(i));
                        } else {
                            hashMap.put(d, 1);
                            arrayList2.add(t3Var);
                            if (arrayList2.size() == this.b) {
                                arrayList.add(arrayList2);
                                arrayList2 = new ArrayList();
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        arrayList4.add(this.f6875a.remove(((Integer) arrayList3.get(size2)).intValue()));
                    }
                    for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
                        this.f6875a.a((t3) arrayList4.get(size3));
                    }
                }
            }
        }
        return arrayList;
    }

    public void a(int i) {
        synchronized (this.f6875a) {
            this.f6875a.a(i);
        }
    }

    public void a(Context context, List<t3> list) {
        if (list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            this.d.a(context, list.get(0));
        } else {
            this.d.a(context, list);
        }
    }

    public final boolean a(t3 t3Var) {
        Object c = t3Var.c("_db_period");
        if (c != null && (c instanceof Number)) {
            if (System.currentTimeMillis() - t3Var.c() < ((Number) c).longValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return !this.f6875a.isEmpty();
    }

    public void c() {
        if (this.c) {
            synchronized (this.f6875a) {
                this.f6875a.b();
            }
        }
    }
}
