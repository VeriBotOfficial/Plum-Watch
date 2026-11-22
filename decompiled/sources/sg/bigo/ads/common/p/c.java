package sg.bigo.ads.common.p;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.utils.p;

/* loaded from: classes9.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    static final AtomicInteger f19683a = new AtomicInteger(0);
    final LruCache<String, sg.bigo.ads.common.c> b;
    final LruCache<String, sg.bigo.ads.common.c> c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f19686a = new c(0);
    }

    private c() {
        AtomicInteger atomicInteger = f19683a;
        this.b = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.1
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(String str, sg.bigo.ads.common.c cVar) {
                return cVar.f19563a.getByteCount();
            }
        };
        this.c = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.2
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(String str, sg.bigo.ads.common.c cVar) {
                return cVar.f19563a.getByteCount();
            }
        };
    }

    /* synthetic */ c(byte b) {
        this();
    }

    static c a(Context context) {
        AtomicInteger atomicInteger = f19683a;
        if (atomicInteger.get() == 0) {
            atomicInteger.set(p.c(context));
            sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "Total cache size: " + atomicInteger.get());
        }
        return a.f19686a;
    }
}
