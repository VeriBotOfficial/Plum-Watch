package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UMDBManager.java */
/* loaded from: classes2.dex */
class g {
    private static SQLiteOpenHelper b;
    private static Context d;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f13848a;
    private SQLiteDatabase c;

    private g() {
        this.f13848a = new AtomicInteger();
    }

    /* compiled from: UMDBManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f13849a = new g();

        private a() {
        }
    }

    public static g a(Context context) {
        if (d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            d = applicationContext;
            b = f.a(applicationContext);
        }
        return a.f13849a;
    }

    public synchronized SQLiteDatabase a() {
        if (this.f13848a.incrementAndGet() == 1) {
            this.c = b.getWritableDatabase();
        }
        return this.c;
    }

    public synchronized void b() {
        try {
            if (this.f13848a.decrementAndGet() == 0) {
                this.c.close();
            }
        } catch (Throwable unused) {
        }
    }
}
