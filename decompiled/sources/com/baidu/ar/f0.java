package com.baidu.ar;

import com.baidu.ar.databasic.AlgoHandleAdapter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public abstract class f0 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<e3> f6915a = new CopyOnWriteArrayList<>();
    public e3 b;
    public e3 c;
    public kb d;

    public class a implements e3 {
        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (f0.this.f6915a != null && f0.this.f6915a.size() > 0) {
                Iterator it = f0.this.f6915a.iterator();
                while (it.hasNext()) {
                    e3 e3Var = (e3) it.next();
                    if (b3Var.b() > 0) {
                        AlgoHandleAdapter.increaseHandleReference(b3Var.b());
                    }
                    e3Var.a(b3Var);
                }
            }
            if (f0.this.c != null) {
                f0.this.c.a(b3Var);
            }
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            f0.this.d = kbVar;
            if (f0.this.c != null) {
                f0.this.c.a(kbVar);
            }
            if (f0.this.f6915a == null || f0.this.f6915a.size() <= 0) {
                return;
            }
            Iterator it = f0.this.f6915a.iterator();
            while (it.hasNext()) {
                ((e3) it.next()).a(kbVar);
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            if (f0.this.c != null) {
                f0.this.c.b(kbVar);
            }
            if (f0.this.f6915a == null || f0.this.f6915a.size() <= 0) {
                return;
            }
            Iterator it = f0.this.f6915a.iterator();
            while (it.hasNext()) {
                ((e3) it.next()).b(kbVar);
            }
        }
    }

    @Override // com.baidu.ar.t5
    public void a(e3 e3Var) {
        this.c = e3Var;
        this.b = new a();
    }

    public boolean a() {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f6915a;
        return copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0;
    }

    public void b(e3 e3Var) {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f6915a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(e3Var);
            kb kbVar = this.d;
            if (kbVar != null) {
                e3Var.a(kbVar);
            }
        }
    }

    public void c(e3 e3Var) {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f6915a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(e3Var);
        }
    }

    public void d(e3 e3Var) {
        this.c = e3Var;
    }

    @Override // com.baidu.ar.t5
    public void release() {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f6915a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f6915a = null;
        }
    }
}
