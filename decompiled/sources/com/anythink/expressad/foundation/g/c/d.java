package com.anythink.expressad.foundation.g.c;

import android.util.Log;
import com.anythink.expressad.foundation.h.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4840a = "AnythinkDirManager";
    private static d d;
    private f b;
    private ArrayList<a> c = new ArrayList<>();

    private d(f fVar) {
        this.b = fVar;
    }

    public static synchronized void a(f fVar) {
        synchronized (d.class) {
            if (d == null) {
                d = new d(fVar);
            }
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (d == null && com.anythink.expressad.foundation.b.a.c().e() != null) {
                t.a(com.anythink.expressad.foundation.b.a.c().e());
            }
            if (d == null) {
                Log.e(f4840a, "mDirectoryManager == null");
            }
            dVar = d;
        }
        return dVar;
    }

    public static File a(com.anythink.expressad.foundation.g.c.a aVar) {
        try {
            if (a() == null || a().c == null || a().c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f4841a.equals(aVar)) {
                    return next.b;
                }
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String b(com.anythink.expressad.foundation.g.c.a aVar) {
        File a2 = a(aVar);
        if (a2 != null) {
            return a2.getAbsolutePath();
        }
        return null;
    }

    public final boolean b() {
        return a(this.b.b());
    }

    private boolean a(e eVar) {
        String str;
        e c = eVar.c();
        if (c == null) {
            str = eVar.b();
        } else {
            File a2 = a(c.a());
            if (a2 == null) {
                return false;
            }
            str = a2.getAbsolutePath() + File.separator + eVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.c.add(new a(eVar.a(), file));
        List<e> d2 = eVar.d();
        if (d2 != null) {
            Iterator<e> it = d2.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public com.anythink.expressad.foundation.g.c.a f4841a;
        public File b;

        public a(com.anythink.expressad.foundation.g.c.a aVar, File file) {
            this.f4841a = aVar;
            this.b = file;
        }
    }
}
