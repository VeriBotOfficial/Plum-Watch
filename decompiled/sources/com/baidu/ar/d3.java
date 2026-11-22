package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public Looper f6872a;
    public Handler b;
    public List<t5> g;
    public e3 h;
    public ArrayList<c3> d = new ArrayList<>();
    public HashMap<String, Boolean> e = new HashMap<>();
    public HashMap<String, Boolean> f = new HashMap<>();
    public long i = 0;
    public int c = 180;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    d3.this.b((kb) message.obj);
                    break;
                case 1002:
                    d3.this.c((b3) message.obj);
                    break;
                case 1003:
                    d3.this.a((kb) message.obj);
                    break;
                case 1004:
                    d3.this.b();
                    break;
            }
        }
    }

    public d3(Looper looper) {
        this.f6872a = looper;
    }

    public final c3 a(b3 b3Var) {
        Iterator<c3> it = this.d.iterator();
        while (it.hasNext()) {
            c3 next = it.next();
            if (next.c() == b3Var.c()) {
                next.a(b3Var);
                return next;
            }
        }
        return null;
    }

    public final void a() {
        List<t5> list = this.g;
        if (list != null) {
            list.clear();
        }
        ArrayList<c3> arrayList = this.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        HashMap<String, Boolean> hashMap = this.e;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, Boolean> hashMap2 = this.f;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
    }

    public final void a(c3 c3Var) {
        ArrayList<c3> arrayList;
        List<t5> list;
        if (c3Var == null || (arrayList = this.d) == null || arrayList.size() == 0 || (list = this.g) == null || list.size() == 0 || this.h == null) {
            return;
        }
        Iterator<t5> it = this.g.iterator();
        while (it.hasNext()) {
            if (!c3Var.b(it.next().getName())) {
                return;
            }
        }
        if (c3Var.c() != this.i) {
            this.h.a(c3Var);
            this.i = c3Var.c();
            ArrayList<c3> arrayList2 = this.d;
            arrayList2.subList(0, arrayList2.indexOf(c3Var)).clear();
        }
    }

    public final void a(kb kbVar) {
        this.f.put(kbVar.a(), Boolean.valueOf(kbVar.b()));
        Iterator<t5> it = this.g.iterator();
        boolean z = true;
        boolean z2 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t5 next = it.next();
            if (this.f.get(next.getName()) == null) {
                z = false;
                break;
            } else if (!this.f.get(next.getName()).booleanValue()) {
                z2 = false;
            }
        }
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.b(kbVar);
            if (z) {
                this.h.b(new kb("DetectorGroup", z2));
                a();
            }
        }
    }

    public void a(List<t5> list, e3 e3Var) {
        this.g = list;
        this.h = e3Var;
        if (this.b != null || this.f6872a == null) {
            return;
        }
        this.b = new a(this.f6872a);
    }

    public final c3 b(b3 b3Var) {
        if (this.d.size() >= this.c) {
            h.b("DetectResultSync", "add2NewDetectResultGroup detectResult list for sync is fulllll!!!");
            return null;
        }
        c3 c3Var = new c3();
        c3Var.a(b3Var.c());
        c3Var.a(b3Var);
        this.d.add(c3Var);
        return c3Var;
    }

    public final void b() {
        a();
        this.b.removeCallbacksAndMessages(null);
        this.b = null;
    }

    public final void b(kb kbVar) {
        this.e.put(kbVar.a(), Boolean.valueOf(kbVar.b()));
        Iterator<t5> it = this.g.iterator();
        boolean z = true;
        boolean z2 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t5 next = it.next();
            if (this.e.get(next.getName()) == null) {
                z = false;
                break;
            } else if (!this.e.get(next.getName()).booleanValue()) {
                z2 = false;
            }
        }
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a(kbVar);
            if (z) {
                this.h.a(new kb("DetectorGroup", z2));
            }
        }
    }

    public void c() {
        Handler handler = this.b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1004));
        }
    }

    public final void c(b3 b3Var) {
        HashMap<String, Boolean> hashMap;
        if (this.d == null || (hashMap = this.e) == null || hashMap.isEmpty()) {
            return;
        }
        c3 a2 = a(b3Var);
        if (a2 == null) {
            a2 = b(b3Var);
        }
        a(a2);
    }

    public synchronized void c(kb kbVar) {
        h.a("DetectResultSync", "DetectorGroup onDetectorRelease result = " + kbVar.a());
        Handler handler = this.b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1003, kbVar));
        }
    }

    public synchronized void d(kb kbVar) {
        h.a("DetectResultSync", "DetectorGroup onDetectorSetup result = " + kbVar.a());
        Handler handler = this.b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1001, kbVar));
        }
    }

    public synchronized boolean d(b3 b3Var) {
        if (this.d.size() != 0) {
            if (this.d.get(0).c() < b3Var.c()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void e(b3 b3Var) {
        Handler handler = this.b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002, b3Var));
        }
    }
}
