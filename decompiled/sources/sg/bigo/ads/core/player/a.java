package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    c f20120a;
    Map<String, b> b = new HashMap();
    Map<String, RunnableC1113a> c = new HashMap();

    /* renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    class RunnableC1113a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<sg.bigo.ads.common.h.a> f20121a;

        public RunnableC1113a(sg.bigo.ads.common.h.a aVar) {
            this.f20121a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (RunnableC1113a.this.f20121a == null || RunnableC1113a.this.f20121a.get() == null) {
                        return;
                    }
                    a.this.c.remove(RunnableC1113a.this.f20121a.get().f19620a);
                    a.this.f20120a.c(RunnableC1113a.this.f20121a.get());
                }
            });
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        sg.bigo.ads.common.h.a f20124a;

        public b(sg.bigo.ads.common.h.a aVar) {
            this.f20124a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    if (b.this.f20124a != null) {
                        a.this.b.remove(b.this.f20124a.f19620a);
                        a.this.f20120a.b(b.this.f20124a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface c {
        void b(sg.bigo.ads.common.h.a aVar);

        void c(sg.bigo.ads.common.h.a aVar);
    }

    public a(c cVar) {
        this.f20120a = cVar;
    }

    public final void a(sg.bigo.ads.common.h.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.c.containsKey(aVar.f19620a)) {
                    sg.bigo.ads.common.n.d.a(this.c.remove(aVar.f19620a));
                }
                RunnableC1113a runnableC1113a = new RunnableC1113a(aVar);
                this.c.put(aVar.f19620a, runnableC1113a);
                sg.bigo.ads.common.n.d.a(3, runnableC1113a, aVar.f() * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.common.h.a aVar) {
        if (this.c.containsKey(aVar.f19620a)) {
            sg.bigo.ads.common.n.d.a(this.c.get(aVar.f19620a));
            this.c.remove(aVar.f19620a);
        }
    }

    public final void c(sg.bigo.ads.common.h.a aVar) {
        if (this.b.containsKey(aVar.f19620a)) {
            sg.bigo.ads.common.n.d.a(this.b.remove(aVar.f19620a));
            sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "fillTimeRunnableList.containsKey: " + aVar.f19620a);
        }
        b bVar = new b(aVar);
        this.b.put(aVar.f19620a, bVar);
        sg.bigo.ads.common.n.d.a(3, bVar, aVar.e() * 1000);
        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + aVar.e());
    }
}
