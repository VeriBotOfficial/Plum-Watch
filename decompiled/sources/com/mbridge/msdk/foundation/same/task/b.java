package com.mbridge.msdk.foundation.same.task;

import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: CommonTaskLoader.java */
/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f11633a;
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> b;
    WeakReference<Context> c;

    /* compiled from: CommonTaskLoader.java */
    class a implements a.InterfaceC0685a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f11634a;
        final /* synthetic */ a.InterfaceC0685a b;

        a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0685a interfaceC0685a) {
            this.f11634a = aVar;
            this.b = interfaceC0685a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0685a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL) {
                b.this.b.remove(Long.valueOf(this.f11634a.getId()));
            } else if (bVar == a.b.FINISH) {
                b.this.b.remove(Long.valueOf(this.f11634a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.c.get() == null) {
                b.this.a();
            }
            a.InterfaceC0685a interfaceC0685a = this.b;
            if (interfaceC0685a != null) {
                interfaceC0685a.a(bVar);
            }
        }
    }

    public b(Context context, int i) {
        if (q0.a().a("c_t_l_t_p", true)) {
            this.f11633a = c.b();
        } else {
            if (i == 0) {
                this.f11633a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f11633a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f11633a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f11633a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0685a interfaceC0685a) {
        a(aVar, interfaceC0685a);
        this.f11633a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0685a interfaceC0685a) {
        this.b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0685a));
    }

    public b(Context context) {
        if (q0.a().a("c_t_l_t_p", true)) {
            this.f11633a = c.b();
        } else {
            if (q0.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f11633a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f11633a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f11633a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.b.clear();
        } catch (Exception unused) {
        }
    }
}
