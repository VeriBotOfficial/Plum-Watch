package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.f.e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes12.dex */
public class a {
    private static volatile a b;

    /* renamed from: a, reason: collision with root package name */
    public com.anythink.expressad.video.dynview.e.a f5228a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
                aVar = b;
            }
            return aVar;
        }
        return b;
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int h = cVar.h();
        if (h == 1) {
            com.anythink.expressad.video.dynview.j.a aVar = new com.anythink.expressad.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.f5228a = aVar.b;
        } else {
            if (h == 2) {
                new com.anythink.expressad.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (h == 4) {
                new com.anythink.expressad.video.dynview.j.a().a(cVar, view, eVar);
            } else if (h != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.anythink.expressad.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.anythink.expressad.video.dynview.j.a aVar = new com.anythink.expressad.video.dynview.j.a();
        aVar.a(cVar, view, map, eVar);
        this.f5228a = aVar.b;
    }

    private static void b(c cVar, View view, Map map, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().b(cVar, view, map, eVar);
    }

    private static void a(c cVar, View view, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().a(cVar, view, eVar);
    }

    private static void c(c cVar, View view, Map map, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().c(cVar, view, map, eVar);
    }

    private void d() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f5228a;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void e() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f5228a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void b() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f5228a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public static void c() {
        if (b != null) {
            b = null;
        }
    }
}
