package com.anythink.core.c.a;

import android.text.TextUtils;
import com.anythink.core.d.f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    f f3588a;
    List<a> b;
    Map<Integer, List<a>> c = new ConcurrentHashMap(3);

    public final void a(int i, List<a> list) {
        if (i == -1) {
            this.b = list;
        } else {
            this.c.put(Integer.valueOf(i), list);
        }
    }

    public final List<a> a(int i) {
        if (i == -1) {
            return this.b;
        }
        return this.c.get(Integer.valueOf(i));
    }

    public final void a(f fVar) {
        this.f3588a = fVar;
    }

    private f a() {
        return this.f3588a;
    }

    public final boolean b(f fVar) {
        f fVar2 = this.f3588a;
        return fVar2 != null && fVar2.b() == fVar.b() && this.f3588a.a() == fVar.a() && this.f3588a.c() == fVar.c() && this.f3588a.d() == fVar.d();
    }

    public final void a(a aVar) {
        if (this.f3588a == null) {
            return;
        }
        List<a> list = this.b;
        if (list != null) {
            a(list, aVar);
        }
        List<a> list2 = this.c.get(Integer.valueOf(aVar.a()));
        if (list2 != null) {
            a(list2, aVar);
        }
    }

    private void a(List<a> list, a aVar) {
        Iterator<a> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().b(), aVar.b())) {
                    list.set(i, aVar);
                    break;
                }
                i++;
            } else {
                list.add(0, aVar);
                break;
            }
        }
        while (list.size() > this.f3588a.c()) {
            list.remove(list.size() - 1);
        }
    }

    public final d b(int i) {
        List<a> list;
        if (i == -1) {
            list = this.b;
        } else {
            list = this.c.get(Integer.valueOf(i));
        }
        if (list == null || list.size() < this.f3588a.d()) {
            return null;
        }
        double d = 0.0d;
        String str = "";
        for (a aVar : list) {
            double f = aVar.f();
            if (f > d) {
                str = aVar.d();
                d = f;
            }
        }
        return new d(d, str);
    }

    public final void c(int i) {
        List<a> a2 = a(i);
        if (this.f3588a == null || a2 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - ((this.f3588a.b() * 86400) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Iterator<a> it = a2.iterator();
        while (it.hasNext()) {
            if (it.next().g() < timeInMillis) {
                it.remove();
            }
        }
    }
}
