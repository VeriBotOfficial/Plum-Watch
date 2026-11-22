package com.baidu.ar.libloader;

import com.baidu.ar.libloader.ILibLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<ILibLoader.c>> f7072a = new HashMap();

    public void a() {
        this.f7072a.clear();
    }

    public void a(String str) {
        a(this.f7072a.get(str));
    }

    public void a(String str, ILibLoader.c cVar) {
        List<ILibLoader.c> list = this.f7072a.get(str);
        if (list != null) {
            list.add(cVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        this.f7072a.put(str, arrayList);
    }

    public final void a(List<ILibLoader.c> list) {
        if (list != null) {
            int size = list.size();
            ILibLoader.c[] cVarArr = new ILibLoader.c[size];
            list.toArray(cVarArr);
            for (int i = 0; i < size; i++) {
                cVarArr[i].onReady();
            }
        }
    }

    public void b() {
        Iterator<Map.Entry<String, List<ILibLoader.c>>> it = this.f7072a.entrySet().iterator();
        while (it.hasNext()) {
            a(it.next().getValue());
        }
    }

    public void b(String str) {
        if (this.f7072a.containsKey(str)) {
            this.f7072a.remove(str);
        }
    }
}
