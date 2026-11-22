package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* compiled from: DuplicateLogDAO.java */
/* loaded from: classes12.dex */
public final class b extends a<com.apm.insight.d.a> {
    @Override // com.apm.insight.e.a.a
    protected final /* synthetic */ ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar2.f6011a);
        contentValues.put("insert_time", Long.valueOf(aVar2.b));
        return contentValues;
    }

    public b() {
        super("duplicatelog");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13) {
        /*
            r11 = this;
            r1 = 0
            if (r12 == 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto La
            goto L30
        La:
            r2 = 1
            java.lang.String r4 = r11.f6016a     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = "path=?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L27
            r7[r1] = r13     // Catch: java.lang.Throwable -> L27
            r9 = 0
            r10 = 0
            r5 = 0
            r8 = 0
            r3 = r12
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L27
            int r13 = r12.getCount()     // Catch: java.lang.Throwable -> L27
            r12.close()     // Catch: java.lang.Throwable -> L24
            goto L2d
        L24:
            r0 = move-exception
            r12 = r0
            goto L2a
        L27:
            r0 = move-exception
            r12 = r0
            r13 = r1
        L2a:
            com.apm.insight.a.b(r12)
        L2d:
            if (r13 <= 0) goto L30
            return r2
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.e.a.b.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    @Override // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.f6011a)) {
            return;
        }
        super.a(sQLiteDatabase, (SQLiteDatabase) aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f6016a + " where _id in (select _id from " + this.f6016a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            com.apm.insight.a.b((Throwable) e);
        }
    }

    @Override // com.apm.insight.e.a.a
    protected final HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put("ext1", "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }
}
