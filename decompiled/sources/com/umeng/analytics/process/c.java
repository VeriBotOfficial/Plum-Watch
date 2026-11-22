package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UMProcessDBManager.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f13890a;
    private ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    private Context c;

    private c() {
    }

    static c a(Context context) {
        if (f13890a == null) {
            synchronized (c.class) {
                if (f13890a == null) {
                    f13890a = new c();
                }
            }
        }
        c cVar = f13890a;
        cVar.c = context;
        return cVar;
    }

    synchronized SQLiteDatabase a(String str) {
        return c(str).a();
    }

    synchronized void b(String str) {
        c(str).b();
    }

    private a c(String str) {
        if (this.b.get(str) == null) {
            a a2 = a.a(this.c, str);
            this.b.put(str, a2);
            return a2;
        }
        return this.b.get(str);
    }

    /* compiled from: UMProcessDBManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private AtomicInteger f13891a = new AtomicInteger();
        private SQLiteOpenHelper b;
        private SQLiteDatabase c;

        private a() {
        }

        static a a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.b = b.a(appContext, str);
            return aVar;
        }

        synchronized SQLiteDatabase a() {
            if (this.f13891a.incrementAndGet() == 1) {
                this.c = this.b.getWritableDatabase();
            }
            return this.c;
        }

        synchronized void b() {
            try {
                if (this.f13891a.decrementAndGet() == 0) {
                    this.c.close();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
