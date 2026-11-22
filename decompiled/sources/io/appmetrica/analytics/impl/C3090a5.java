package io.appmetrica.analytics.impl;

import android.database.Cursor;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3090a5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f18178a = com.umeng.analytics.pro.d.n;
    public final int b = 200;
    public final String c = "id";
    public final String d = "start_time";
    public final String e = "report_request_parameters";
    public final String f = "server_time_offset";
    public final String g = "type";
    public final String h = "obtained_before_first_sync";
    public final B7 i = new B7(null, 1, 0 == true ? 1 : 0);

    public final A7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.g));
            EnumC3728zk enumC3728zk = EnumC3728zk.FOREGROUND;
            boolean z = true;
            if (i != 0) {
                enumC3728zk = EnumC3728zk.BACKGROUND;
                if (i != 1) {
                    enumC3728zk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.h)) != 1) {
                z = false;
            }
            return new A7(valueOf, enumC3728zk, string, new C3715z7(valueOf2, valueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        if (r12 != null) goto L30;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void runScript(android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f18178a     // Catch: java.lang.Throwable -> L5a
            int r2 = r11.b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b
        L19:
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5e
            io.appmetrica.analytics.impl.A7 r3 = r11.a(r12)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f17763a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.zk r4 = r3.b     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.c     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.z7 r4 = r3.d     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r4 = r4.f18606a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.B7 r4 = r11.i     // Catch: java.lang.Throwable -> L5c
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5c
            r0.add(r3)     // Catch: java.lang.Throwable -> L5c
            goto L19
        L5a:
            r2 = r12
        L5b:
            r12 = r1
        L5c:
            if (r12 == 0) goto L61
        L5e:
            r12.close()
        L61:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r12.<init>(r3)
            java.lang.String r3 = r11.f18178a
            java.lang.StringBuilder r12 = r12.append(r3)
            java.lang.String r12 = r12.toString()
            r2.execSQL(r12)
            java.lang.String r12 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r2.execSQL(r12)
            java.util.Iterator r12 = r0.iterator()
        L7e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r12.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r3 = "sessions"
            r2.insertOrThrow(r3, r1, r0)     // Catch: java.lang.Throwable -> L7e
            goto L7e
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C3090a5.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}
