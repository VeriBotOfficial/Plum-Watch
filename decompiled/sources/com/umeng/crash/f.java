package com.umeng.crash;

import android.app.Application;
import android.content.Context;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: UCrash */
/* loaded from: classes2.dex */
final class f {

    /* compiled from: UCrash */
    interface a {
        void a(String str, OutputStream outputStream) throws IOException;

        void a(String str, String str2);
    }

    static synchronized int a(Context context, b bVar) {
        int a2;
        synchronized (f.class) {
            if (context == null) {
                return -1;
            }
            com.umeng.crash.a.a().f13991a = bVar;
            if ((bVar.b || bVar.g || bVar.l) && (context instanceof Application)) {
                ((Application) context).registerActivityLifecycleCallbacks(e.a());
            }
            if (bVar.b) {
                d a3 = d.a();
                a3.f13997a = bVar;
                a3.b = Thread.getDefaultUncaughtExceptionHandler();
                try {
                    Thread.setDefaultUncaughtExceptionHandler(a3);
                } catch (Throwable th) {
                    UCrash.a().a("UCrash.Java", "setDefaultUncaughtExceptionHandler failed", th);
                }
            }
            if (!bVar.g && !bVar.l) {
                a2 = 0;
                return a2;
            }
            a2 = i.a().a(bVar);
            return a2;
        }
    }

    /* compiled from: UCrash */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        a f13999a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean g;
        boolean h;
        boolean j;
        boolean l;
        boolean m;

        /* renamed from: q, reason: collision with root package name */
        boolean f14000q;
        boolean f = true;
        boolean i = true;
        boolean k = true;
        boolean n = true;
        boolean o = true;
        boolean p = true;

        b() {
        }
    }
}
