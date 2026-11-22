package com.baidu.ar;

import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class f3 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public List<t5> f6918a = new CopyOnWriteArrayList();
    public List<t5> b = new CopyOnWriteArrayList();
    public d3 c;
    public e3 d;

    public class a implements e3 {
        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (f3.this.d != null) {
                f3.this.d.a(b3Var);
            }
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            if (f3.this.d != null) {
                f3.this.d.a(kbVar);
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            if (f3.this.d != null) {
                f3.this.d.b(kbVar);
            }
        }
    }

    public class b implements e3 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e3 f6920a;
        public final /* synthetic */ boolean b;

        public b(e3 e3Var, boolean z) {
            this.f6920a = e3Var;
            this.b = z;
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (b3Var == null) {
                h.b("DetectorGroup", "onDetected detectResult is NULLLLLL!!!");
                return;
            }
            if (f3.this.b != null && f3.this.b.size() > 0) {
                t5 t5Var = null;
                for (t5 t5Var2 : f3.this.b) {
                    if (f3.this.a(b3Var, t5Var2) && f3.this.a(b3Var)) {
                        t5Var = t5Var2;
                    }
                }
                if (t5Var != null && f3.this.f6918a != null) {
                    f3.this.f6918a.add(t5Var);
                    f3.this.b.remove(t5Var);
                    h.a("DetectorGroup", "onDetected detector2Add = " + t5Var.getName());
                }
            }
            if (f3.this.c != null) {
                f3.this.c.e(b3Var);
            }
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            h.a("DetectorGroup", "setupDetctor result = " + kbVar.a() + " * " + kbVar.b());
            if (f3.this.b != null && f3.this.b.size() > 0 && !kbVar.b()) {
                t5 t5Var = null;
                for (t5 t5Var2 : f3.this.b) {
                    if (kbVar.a() != null && kbVar.a().equals(t5Var2.getName())) {
                        t5Var = t5Var2;
                    }
                }
                if (t5Var != null) {
                    f3.this.b.remove(t5Var);
                    h.a("DetectorGroup", "onSetup detector2Remove = " + t5Var.getName());
                }
            }
            if (f3.this.c != null) {
                f3.this.c.d(kbVar);
            }
            e3 e3Var = this.f6920a;
            if (e3Var == null || !this.b) {
                return;
            }
            e3Var.a(kbVar);
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            if (f3.this.c != null) {
                f3.this.c.c(kbVar);
            }
            e3 e3Var = this.f6920a;
            if (e3Var != null) {
                e3Var.b(kbVar);
            }
        }
    }

    public f3(Looper looper) {
        this.c = new d3(looper);
    }

    @Override // com.baidu.ar.t5
    public void a(e3 e3Var) {
        this.d = e3Var;
        this.c.a(this.f6918a, new a());
    }

    public void a(t5 t5Var, e3 e3Var) {
        if (t5Var != null) {
            this.b.add(t5Var);
            h.a("DetectorGroup", "addDetector detector = " + t5Var.getName());
            a(t5Var, e3Var, false);
        }
    }

    public final void a(t5 t5Var, e3 e3Var, boolean z) {
        h.a("DetectorGroup", "setupDetctor detector.getName() = " + t5Var.getName());
        b bVar = new b(e3Var, z);
        if (!z) {
            t5Var.a(bVar);
        } else if (t5Var instanceof o4) {
            ((o4) t5Var).d(bVar);
            bVar.a(new kb(t5Var.getName(), true));
        }
    }

    public boolean a() {
        boolean z;
        List<t5> list = this.f6918a;
        if (list != null && list.size() > 0) {
            for (t5 t5Var : this.f6918a) {
                if (t5Var == null || !(t5Var instanceof o4) || !((o4) t5Var).c()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        o4.b(z);
        return z;
    }

    public final boolean a(b3 b3Var) {
        d3 d3Var = this.c;
        return d3Var != null && d3Var.d(b3Var);
    }

    public final boolean a(b3 b3Var, t5 t5Var) {
        return b3Var.a() != null && b3Var.a().equals(t5Var.getName());
    }

    public boolean a(t5 t5Var) {
        if (t5Var == null) {
            return false;
        }
        List<t5> list = this.f6918a;
        if (list != null && list.contains(t5Var)) {
            return true;
        }
        List<t5> list2 = this.b;
        return list2 != null && list2.contains(t5Var);
    }

    public void b(t5 t5Var) {
        List<t5> list = this.b;
        if (list == null || !list.contains(t5Var)) {
            List<t5> list2 = this.f6918a;
            if (list2 == null || !list2.contains(t5Var)) {
                return;
            } else {
                this.f6918a.remove(t5Var);
            }
        } else {
            this.b.remove(t5Var);
            h.a("DetectorGroup", "removeDetector detector = " + t5Var.getName());
        }
        t5Var.release();
    }

    public void b(t5 t5Var, e3 e3Var) {
        if (t5Var != null) {
            this.b.add(t5Var);
            a(t5Var, e3Var, true);
        }
    }

    public boolean b() {
        List<t5> list = this.f6918a;
        if (list != null && list.size() > 0) {
            return false;
        }
        List<t5> list2 = this.b;
        return list2 == null || list2.size() <= 0;
    }

    public void c(t5 t5Var) {
        if (t5Var != null) {
            List<t5> list = this.b;
            if (list != null) {
                list.remove(t5Var);
            }
            List<t5> list2 = this.f6918a;
            if (list2 != null) {
                list2.remove(t5Var);
            }
            d3 d3Var = this.c;
            if (d3Var != null) {
                d3Var.c(new kb(t5Var.getName(), true));
            }
        }
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "DetectorGroup";
    }

    @Override // com.baidu.ar.t5
    public synchronized void release() {
        List<t5> list = this.f6918a;
        if (list != null) {
            Iterator<t5> it = list.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.f6918a.clear();
            this.f6918a = null;
        }
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.c();
        }
    }
}
