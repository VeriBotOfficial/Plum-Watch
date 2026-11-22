package com.anythink.basead.b;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.core.common.h.w;
import com.anythink.core.common.l;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class h {
    private static volatile h b;

    /* renamed from: a, reason: collision with root package name */
    g f2308a;
    private Context c;
    private ConcurrentHashMap<String, w> d = new ConcurrentHashMap<>();

    private h(Context context) {
        this.c = context;
    }

    public static h a(Context context) {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h(context);
                }
            }
        }
        return b;
    }

    public final void a() {
        if (this.c != null && this.f2308a == null) {
            this.f2308a = new g();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("at_offer_action_1");
            intentFilter.addAction("at_offer_action_2");
            intentFilter.addAction("at_offer_action_3");
            intentFilter.addAction("at_offer_action_4");
            l.a(this.c).a(this.f2308a, intentFilter);
        }
    }

    private void b() {
        if (this.f2308a != null) {
            l.a(this.c).a(this.f2308a);
            this.f2308a = null;
        }
    }

    public final void a(String str, w wVar) {
        this.d.put(str, wVar);
    }

    public final void a(String str, String str2) {
        w wVar = this.d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            jVar.k = new com.anythink.basead.d.b();
            jVar.k.f2326a = str2;
            b.a(18, wVar, jVar);
        }
    }

    public final void b(String str, String str2) {
        w wVar = this.d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            jVar.k = new com.anythink.basead.d.b();
            jVar.k.f2326a = str2;
            b.a(19, wVar, jVar);
        }
    }

    public final void c(String str, String str2) {
        w wVar = this.d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            jVar.k = new com.anythink.basead.d.b();
            jVar.k.f2326a = str2;
            b.a(20, wVar, jVar);
        }
    }

    public final void d(String str, String str2) {
        w remove = this.d.remove(str);
        if (remove != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            jVar.k = new com.anythink.basead.d.b();
            jVar.k.f2326a = str2;
            b.a(21, remove, jVar);
        }
        if (this.d.size() != 0 || this.f2308a == null) {
            return;
        }
        l.a(this.c).a(this.f2308a);
        this.f2308a = null;
    }
}
