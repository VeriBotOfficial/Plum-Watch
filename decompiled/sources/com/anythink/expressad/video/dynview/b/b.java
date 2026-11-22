package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f5229a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f5229a == null) {
            synchronized (b.class) {
                if (f5229a == null) {
                    f5229a = new b();
                }
                bVar = f5229a;
            }
            return bVar;
        }
        return f5229a;
    }

    public static void a(View view, c cVar) {
        if (cVar == null) {
            return;
        }
        int h = cVar.h();
        if (h == 1) {
            new com.anythink.expressad.video.dynview.j.b().a(view);
            return;
        }
        if (h == 2) {
            new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
            return;
        }
        if (h == 3) {
            new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
        } else if (h == 4) {
            new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
        } else {
            if (h != 5) {
                return;
            }
            new com.anythink.expressad.video.dynview.j.b();
        }
    }

    private static void a(View view) {
        new com.anythink.expressad.video.dynview.j.b().a(view);
    }

    private static void c() {
        new com.anythink.expressad.video.dynview.j.b();
    }

    private static void b(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
    }

    private static void c(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
    }

    private static void d(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
    }

    public static void b() {
        if (f5229a != null) {
            f5229a = null;
        }
    }
}
