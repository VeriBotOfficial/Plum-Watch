package com.efs.sdk.base.core.util.concurrent;

import com.efs.sdk.base.core.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class d<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private List<b<T>> f9650a = new ArrayList(5);
    private c<T> b;

    public d(c<T> cVar) {
        this.b = cVar;
    }

    public final void a(List<b<T>> list) {
        this.f9650a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public final T a() {
        T t = null;
        try {
            Iterator<b<T>> it = this.f9650a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            t = this.b.a();
            Iterator<b<T>> it2 = this.f9650a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.b, t);
            }
            Iterator<b<T>> it3 = this.f9650a.iterator();
            while (it3.hasNext()) {
                it3.next().result(t);
            }
            return t;
        } catch (Throwable th) {
            Log.w("efs.util.concurrent", th);
            Iterator<b<T>> it4 = this.f9650a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            return t;
        }
    }
}
