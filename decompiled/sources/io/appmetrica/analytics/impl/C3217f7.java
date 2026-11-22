package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3217f7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f18268a;
    public final PublicLogger b;
    public final Hm c;

    public C3217f7(Context context, String str, Hm hm, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, J5.b);
        this.c = hm;
        this.f18268a = str;
        this.b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f18268a);
            Fj fj = AbstractC3204ej.f18258a;
            fj.getClass();
            fj.a(new C3229fj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f18268a);
            Fj fj = AbstractC3204ej.f18258a;
            fj.getClass();
            fj.a(new C3229fj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.f17893a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Hm hm = this.c;
        if (i <= i2) {
            hm.getClass();
            return;
        }
        try {
            hm.b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            hm.f17893a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        Hm hm = this.c;
        hm.getClass();
        try {
            Im im = hm.d;
            if (im == null || im.a(sQLiteDatabase)) {
                return;
            }
            try {
                hm.b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            hm.f17893a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            io.appmetrica.analytics.impl.Hm r0 = r4.c
            r0.getClass()
            r1 = 1
            if (r7 <= r6) goto L34
            int r6 = r6 + r1
        L9:
            if (r6 > r7) goto L32
            io.appmetrica.analytics.impl.wa r2 = r0.c     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L34
            java.util.HashMap r2 = r2.f18565a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L34
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L2f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L34
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L34
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r3 = (io.appmetrica.analytics.coreapi.internal.db.DatabaseScript) r3     // Catch: java.lang.Throwable -> L34
            r3.runScript(r5)     // Catch: java.lang.Throwable -> L34
            goto L1f
        L2f:
            int r6 = r6 + 1
            goto L9
        L32:
            r6 = 0
            goto L35
        L34:
            r6 = r1
        L35:
            io.appmetrica.analytics.impl.Im r7 = r0.d
            boolean r7 = r7.a(r5)
            r7 = r7 ^ r1
            r6 = r6 | r7
            if (r6 == 0) goto L49
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r6 = r0.b
            r6.runScript(r5)     // Catch: java.lang.Throwable -> L44
        L44:
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r6 = r0.f17893a
            r6.runScript(r5)     // Catch: java.lang.Throwable -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C3217f7.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
