package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.j7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: RequestCacheWorker.java */
/* loaded from: classes11.dex */
class k7 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1725a = true;
    private long b = 86400;
    private int c = 10;
    private long d = 0;
    private final LinkedHashMap<j7.b, Object> e = new LinkedHashMap<>();
    private final Object f = new Object();
    private final LinkedHashMap<j7.b, Object> g = new LinkedHashMap<>();
    private final Object h = new Object();
    private ArrayList<String> i = new ArrayList<>();

    public k7(String... strArr) {
        a(strArr);
    }

    private void a(String... strArr) {
        this.d = System.currentTimeMillis();
        this.e.clear();
        this.i.clear();
        for (String str : strArr) {
            if (str != null) {
                this.i.add(str);
            }
        }
    }

    protected Object b(LinkedHashMap<j7.b, Object> linkedHashMap, j7.b bVar) {
        if (linkedHashMap != null) {
            return linkedHashMap.get(bVar);
        }
        return null;
    }

    protected Object c(LinkedHashMap<j7.b, Object> linkedHashMap, j7.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.remove(bVar);
    }

    public boolean b(j7.b bVar) {
        if (bVar.f1702a == null) {
            return false;
        }
        Iterator<String> it = this.i.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && bVar.f1702a.contains(next)) {
                return true;
            }
        }
        return false;
    }

    protected boolean a(LinkedHashMap<j7.b, Object> linkedHashMap, j7.b bVar) {
        if (linkedHashMap != null) {
            return linkedHashMap.containsKey(bVar);
        }
        return false;
    }

    public j7.c a(j7.b bVar) {
        if (!this.f1725a || !b(bVar)) {
            return null;
        }
        a();
        synchronized (this.f) {
            if (a(this.e, bVar)) {
                return new j7.c(b(this.e, bVar), true);
            }
            synchronized (this.h) {
                if (a(this.g, bVar)) {
                    while (!a(this.e, bVar) && a(this.g, bVar)) {
                        try {
                            this.h.wait(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    this.g.put(bVar, null);
                }
            }
            return new j7.c(b(this.e, bVar), false);
        }
    }

    public void a(j7.b bVar, Object obj) {
        j7.b bVar2;
        if (this.f1725a && bVar != null && b(bVar)) {
            synchronized (this.f) {
                int size = this.e.size();
                if (size > 0 && size >= this.c) {
                    Iterator<j7.b> it = this.e.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            bVar2 = null;
                            break;
                        } else {
                            bVar2 = it.next();
                            if (bVar2 != null) {
                                break;
                            }
                        }
                    }
                    c(this.e, bVar2);
                }
                a();
                this.e.put(bVar, obj);
            }
            synchronized (this.h) {
                c(this.g, bVar);
                this.h.notify();
            }
        }
    }

    private void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if ((currentTimeMillis - this.d) / 1000 > this.b) {
            this.e.clear();
            this.d = currentTimeMillis;
        }
    }

    public void a(j7.a aVar) {
        if (aVar != null) {
            this.f1725a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.b();
        }
    }
}
