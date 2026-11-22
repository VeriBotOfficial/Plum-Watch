package com.qumeng.overseas.advlib.trdparty.unionset.network;

import android.os.Handler;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.trdparty.unionset.network.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class l {
    private static final String t = "ObserverMan";

    /* renamed from: a, reason: collision with root package name */
    protected int f13440a;
    protected int b;
    protected int c;
    protected Handler h;
    protected AdRequestParam i;
    protected String j;
    private final String k;
    protected boolean l;
    private boolean n;
    protected Queue<com.qumeng.overseas.advlib.trdparty.unionset.network.a> o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    private com.qumeng.overseas.advlib.core.h f13441q;
    private volatile boolean e = false;
    protected final char[] f = new char[0];
    protected volatile int m = -1;
    private final Map<String, com.qumeng.overseas.advlib.core.b> r = new ConcurrentHashMap();
    protected Runnable s = new a();
    protected volatile com.qumeng.overseas.advlib.trdparty.unionset.network.a d = new com.qumeng.overseas.advlib.trdparty.unionset.network.a();
    protected volatile List<j.q> g = new ArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.a();
        }
    }

    public l(AdRequestParam adRequestParam, String str) {
        this.i = adRequestParam;
        this.j = str;
        this.k = str;
    }

    public void a(j.q qVar, j.q qVar2) {
    }

    protected void b(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        a(aVar);
    }

    public Set<String> c() {
        return null;
    }

    public String d() {
        return this.p;
    }

    public com.qumeng.overseas.advlib.core.h e() {
        return this.f13441q;
    }

    public String f() {
        return this.k;
    }

    public AdRequestParam g() {
        return this.i;
    }

    public String h() {
        return this.j;
    }

    public boolean i() {
        return this.n;
    }

    public int j() {
        return 0;
    }

    public j.q k() {
        return null;
    }

    public void a(Handler handler) {
        this.h = handler;
    }

    public void b(String str) {
        this.j = str;
    }

    public void c(int i) {
        this.c = i;
    }

    public void a(j.q qVar) {
        this.g.add(qVar);
    }

    public void b(int i) {
        com.qumeng.overseas.advlib.__remote__.utils.n.a(t, "Setting currentPhaseIndex from " + this.m + " to " + i, new Object[0]);
        this.m = i;
    }

    public void a(long j) {
        if (this.e) {
            return;
        }
        synchronized (this.f) {
            if (!this.e) {
                this.e = true;
                Handler handler = this.h;
                if (handler != null) {
                    handler.postDelayed(this.s, j);
                } else {
                    System.err.println("ObserverMan post handler is null");
                }
            }
        }
    }

    public Map<String, com.qumeng.overseas.advlib.core.b> b() {
        return this.r;
    }

    public void a() {
        if (this.g != null) {
            synchronized (this.f) {
                if (this.g != null) {
                    this.l = true;
                    if (this.d != null) {
                        this.d.g(this.b);
                    }
                    Iterator<j.q> it = this.g.iterator();
                    while (it.hasNext()) {
                        it.next().callback(this.d);
                    }
                    this.g = null;
                    this.o = null;
                }
            }
        }
    }

    public void a(List<com.qumeng.overseas.advlib.trdparty.unionset.network.a> list, int i) {
        if (this.g != null) {
            synchronized (this.f) {
                if (this.g != null) {
                    if (!this.l && this.f13440a < this.c) {
                        if (this.m == i) {
                            this.f13440a++;
                        }
                        if (list != null && !list.isEmpty()) {
                            for (com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar : list) {
                                if (this.l) {
                                    break;
                                } else {
                                    b(aVar);
                                }
                            }
                        }
                        if (this.l || this.f13440a == this.c) {
                            com.qumeng.overseas.advlib.__remote__.utils.n.c(t, "提前返回结果", new Object[0]);
                            Handler handler = this.h;
                            if (handler != null) {
                                handler.removeCallbacks(this.s);
                                this.h.post(this.s);
                            } else {
                                System.err.println("ObserverMan alterResult handler is null");
                            }
                        }
                    }
                }
            }
        }
    }

    protected void a(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        if (aVar == null || aVar.c() == null) {
            return;
        }
        this.b++;
        if (aVar.B()) {
            this.d = aVar;
            this.l = true;
        } else {
            this.d = a(this.d, aVar);
        }
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.network.a a(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar2) {
        return (aVar.c() != null && aVar2.n() <= aVar.n()) ? aVar : aVar2;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void a(String str) {
        this.p = str;
    }

    public void a(com.qumeng.overseas.advlib.core.h hVar) {
        this.f13441q = hVar;
    }

    public void a(String str, com.qumeng.overseas.advlib.core.b bVar) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(bVar)) {
            com.qumeng.overseas.advlib.__remote__.utils.n.b(t, "adExtra is null!", new Object[0]);
        } else {
            this.r.put(str, bVar);
        }
    }

    public void a(int i) {
        synchronized (this.f) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a(t, "Resetting ObserverMan for the next phase. New request count: " + i, new Object[0]);
            this.f13440a = 0;
            this.l = false;
            this.c = i;
            Handler handler = this.h;
            if (handler != null) {
                handler.removeCallbacks(this.s);
            }
            this.e = false;
            Queue<com.qumeng.overseas.advlib.trdparty.unionset.network.a> queue = this.o;
            if (queue != null) {
                queue.clear();
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.b = 0;
        }
    }
}
