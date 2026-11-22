package com.baidu.ar;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public x3 f7362a;
    public ArrayList<t3> b;
    public int c;
    public int d;
    public boolean e;
    public List<String> f;
    public a g;

    public interface a {
        void a(int i);
    }

    public z9(x3 x3Var, int i, int i2) {
        this.f7362a = x3Var;
        i = i <= 0 ? 20 : i;
        this.c = i;
        this.d = i2 < i ? i : i2;
        this.b = new ArrayList<>(this.c);
        this.e = false;
        this.f = null;
        this.g = null;
    }

    public int a() {
        int size = this.b.size();
        if (size > 0) {
            synchronized (this.f7362a) {
                this.f7362a.addAll(this.b);
            }
            this.b.clear();
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(size);
                return size;
            }
        }
        return size;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(List<String> list) {
        ArrayList<t3> arrayList;
        this.f = list;
        this.e = true;
        if (this.b.isEmpty()) {
            return;
        }
        List<String> list2 = this.f;
        if (list2 == null || list2.isEmpty()) {
            this.b.clear();
            return;
        }
        int size = this.b.size() - 1;
        while (true) {
            arrayList = this.b;
            if (size < 0) {
                break;
            }
            if (!this.f.contains(arrayList.get(size).b())) {
                this.f.remove(size);
            }
            size--;
        }
        if (arrayList.size() >= this.c) {
            a();
        }
    }

    public final boolean a(t3 t3Var) {
        return a(t3Var.b());
    }

    public boolean a(String str) {
        List<String> list = this.f;
        return list != null && list.contains(str);
    }

    public boolean b(t3 t3Var) {
        if (!this.e) {
            if (this.b.size() >= this.d) {
                return false;
            }
            this.b.add(t3Var);
            return true;
        }
        if (!a(t3Var)) {
            return false;
        }
        this.b.add(t3Var);
        if (this.b.size() >= this.c) {
            a();
        }
        return true;
    }

    public boolean b(String str) {
        return !this.e || a(str);
    }
}
