package com.anythink.expressad.foundation.g.h;

import android.content.Context;
import com.anythink.expressad.foundation.g.h.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f4910a;
    HashMap<Long, a> b;
    WeakReference<Context> c;

    public c(Context context, int i) {
        if (i == 0) {
            this.f4910a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f4910a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f4910a.allowCoreThreadTimeOut(true);
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f4910a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    private c(Context context, byte b) {
        int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f4910a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    private synchronized void b(a aVar) {
        if (aVar != null) {
            if (this.b.containsKey(Long.valueOf(a.e()))) {
                a aVar2 = this.b.get(Long.valueOf(a.e()));
                if (aVar2 != null) {
                    aVar2.f();
                }
                this.b.remove(Long.valueOf(a.e()));
            }
        }
    }

    private synchronized void b(final a aVar, final a.InterfaceC0240a interfaceC0240a) {
        this.b.put(Long.valueOf(a.e()), aVar);
        aVar.f = new a.InterfaceC0240a() { // from class: com.anythink.expressad.foundation.g.h.c.1
            @Override // com.anythink.expressad.foundation.g.h.a.InterfaceC0240a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL) {
                    c.this.b.remove(Long.valueOf(a.e()));
                } else if (bVar == a.b.FINISH) {
                    c.this.b.remove(Long.valueOf(a.e()));
                } else if (bVar == a.b.RUNNING && c.this.c.get() == null) {
                    c.this.a();
                }
                a.InterfaceC0240a interfaceC0240a2 = interfaceC0240a;
                if (interfaceC0240a2 != null) {
                    interfaceC0240a2.a(bVar);
                }
            }
        };
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().f();
            }
            this.b.clear();
        } catch (Exception unused) {
        }
    }

    private void b() {
        Iterator<Map.Entry<Long, a>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (value.e == a.b.PAUSE) {
                value.g();
            } else if (value.e == a.b.READY) {
                this.f4910a.execute(value);
            }
        }
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f4910a.execute(aVar);
    }

    public final void a(a aVar, a.InterfaceC0240a interfaceC0240a) {
        b(aVar, interfaceC0240a);
        this.f4910a.execute(aVar);
    }
}
