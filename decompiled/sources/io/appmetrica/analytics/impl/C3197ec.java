package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3197ec implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18253a;
    public final String b;
    public final Hm c;
    public final C3220fa d;
    public C3217f7 e;

    public C3197ec(Context context, String str, Hm hm) {
        this(context, str, new C3220fa(str), hm);
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized SQLiteDatabase a() {
        C3217f7 c3217f7;
        try {
            this.d.a();
            c3217f7 = new C3217f7(this.f18253a, this.b, this.c, PublicLogger.getAnonymousInstance());
            this.e = c3217f7;
        } catch (Throwable unused) {
            return null;
        }
        return c3217f7.getWritableDatabase();
    }

    public C3197ec(Context context, String str, C3220fa c3220fa, Hm hm) {
        this.f18253a = context;
        this.b = str;
        this.d = c3220fa;
        this.c = hm;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        In.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}
