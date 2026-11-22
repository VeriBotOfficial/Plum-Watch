package com.anythink.basead.h.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d.c;
import com.anythink.core.common.h.ay;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f2797a;
    private Context b;
    private ConcurrentHashMap<String, c> d = new ConcurrentHashMap<>();
    private SimpleDateFormat c = new SimpleDateFormat("yyyyMMdd");

    private b(Context context) {
        this.b = context.getApplicationContext();
    }

    public static b a(Context context) {
        if (f2797a == null) {
            f2797a = new b(context);
        }
        return f2797a;
    }

    public final void a(ay ayVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = this.c.format(new Date(currentTimeMillis));
        final c d = d(ayVar);
        if (d.f.equals(format)) {
            d.d++;
        } else {
            d.d = 1;
            d.f = format;
        }
        d.e = currentTimeMillis;
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.h.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.c.a.a(b.this.b).c(d.f);
                com.anythink.basead.c.a.a(b.this.b).a(d);
            }
        }, 2);
    }

    public final boolean b(ay ayVar) {
        return ayVar.c != -1 && d(ayVar).d >= ayVar.c;
    }

    public final boolean c(ay ayVar) {
        return System.currentTimeMillis() - d(ayVar).e <= ayVar.d;
    }

    public final String a() {
        List<c> b = com.anythink.basead.c.a.a(this.b).b(this.c.format(new Date(System.currentTimeMillis())));
        JSONArray jSONArray = new JSONArray();
        if (b != null) {
            Iterator<c> it = b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f2327a);
            }
        }
        return jSONArray.toString();
    }

    public final boolean a(String str) {
        List<ay> aa;
        l a2 = n.a(this.b).a(str);
        if (a2 == null || (aa = a2.aa()) == null || aa.size() <= 0) {
            return false;
        }
        Iterator<ay> it = aa.iterator();
        while (it.hasNext()) {
            if (!b(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final c d(ay ayVar) {
        String format = this.c.format(new Date(System.currentTimeMillis()));
        c cVar = this.d.get(ayVar.v());
        if (cVar == null) {
            cVar = com.anythink.basead.c.a.a(this.b).a(ayVar.v());
            if (cVar == null) {
                cVar = new c();
                cVar.f2327a = ayVar.v();
                cVar.b = ayVar.c;
                cVar.c = ayVar.d;
                cVar.e = 0L;
                cVar.d = 0;
                cVar.f = format;
            }
            this.d.put(ayVar.v(), cVar);
        }
        if (!TextUtils.equals(format, cVar.f)) {
            cVar.f = format;
            cVar.d = 0;
        }
        return cVar;
    }
}
