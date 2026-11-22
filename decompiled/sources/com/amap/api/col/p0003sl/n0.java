package com.amap.api.col.p0003sl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AmapDelegateListenerManager.java */
/* loaded from: classes11.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, a> f1782a = new ConcurrentHashMap<>();

    /* compiled from: AmapDelegateListenerManager.java */
    private class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public List<T> f1783a = Collections.synchronizedList(new ArrayList());
        public T b = null;

        public a(n0 n0Var) {
        }
    }

    public <T> void a(Integer num, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap;
        if (t == null || (concurrentHashMap = this.f1782a) == null) {
            return;
        }
        try {
            a aVar = concurrentHashMap.get(num);
            if (aVar == null) {
                aVar = new a(this);
                this.f1782a.putIfAbsent(num, aVar);
            }
            List<T> list = aVar.f1783a;
            if (list == null || list.contains(t)) {
                return;
            }
            aVar.f1783a.add(t);
        } catch (Throwable unused) {
        }
    }

    public <T> void b(Integer num, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap;
        a aVar;
        List<T> list;
        if (t == null || (concurrentHashMap = this.f1782a) == null) {
            return;
        }
        try {
            if (!concurrentHashMap.containsKey(num) || (aVar = this.f1782a.get(num)) == null || (list = aVar.f1783a) == null || !list.contains(t)) {
                return;
            }
            aVar.f1783a.remove(t);
        } catch (Throwable unused) {
        }
    }

    public <T> void a(Integer num) {
        a aVar;
        List<T> list;
        try {
            if (!this.f1782a.containsKey(num) || (aVar = this.f1782a.get(num)) == null || (list = aVar.f1783a) == null) {
                return;
            }
            list.clear();
        } catch (Throwable unused) {
        }
    }

    public <T> List<T> a(int i) {
        try {
            a aVar = this.f1782a.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar.f1783a;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public <T> void a(int i, T t) {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f1782a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            a aVar = concurrentHashMap.get(Integer.valueOf(i));
            if (aVar == null) {
                aVar = new a(this);
                this.f1782a.putIfAbsent(Integer.valueOf(i), aVar);
            }
            if (aVar.b == t) {
                return;
            }
            b(Integer.valueOf(i), aVar.b);
            aVar.b = t;
            a(Integer.valueOf(i), (Integer) t);
        } catch (Throwable unused) {
        }
    }

    public <T> void a() {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f1782a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            Iterator<Map.Entry<Integer, a>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                value.f1783a.clear();
                value.b = null;
            }
            this.f1782a.clear();
        } catch (Throwable unused) {
        }
    }
}
