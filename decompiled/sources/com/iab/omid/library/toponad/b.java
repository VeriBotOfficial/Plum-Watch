package com.iab.omid.library.toponad;

import android.content.Context;
import com.iab.omid.library.toponad.internal.i;
import com.iab.omid.library.toponad.internal.j;
import com.iab.omid.library.toponad.utils.e;
import com.iab.omid.library.toponad.utils.g;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11001a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.2-Toponad";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.toponad.internal.b.g().a(context);
        com.iab.omid.library.toponad.utils.a.a(context);
        com.iab.omid.library.toponad.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.toponad.internal.g.b().a(context);
        com.iab.omid.library.toponad.internal.a.a().a(context);
        j.b().a(context);
    }

    void a(boolean z) {
        this.f11001a = z;
    }

    boolean b() {
        return this.f11001a;
    }

    void c() {
        g.a();
        com.iab.omid.library.toponad.internal.a.a().d();
    }
}
