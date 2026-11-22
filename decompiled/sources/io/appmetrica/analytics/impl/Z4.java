package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.connect.common.Constants;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* loaded from: classes6.dex */
public final class Z4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f18164a = 2000;
    public final String b = "number";
    public final String c = "global_number";
    public final String d = "number_of_type";
    public final String e = "name";
    public final String f = "value";
    public final String g = "type";
    public final String h = "time";
    public final String i = "session_id";
    public final String j = "error_environment";
    public final String k = "session_type";
    public final String l = "app_environment";
    public final String m = "app_environment_revision";
    public final String n = "truncated";
    public final String o = "custom_type";
    public final String p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f18165q = "profile_id";
    public final String r = "first_occurrence_status";
    public final String s = "source";
    public final String t = "attribution_id_changed";
    public final String u = Constants.JumpUrlConstants.URL_KEY_OPENID;
    public final String v = "extras";
    public final String w = "reports";
    public final C3416n7 x = new C3416n7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C3391m7 c3391m7) {
        Long l;
        EnumC3271hb enumC3271hb;
        Long l2;
        Long l3;
        Long l4 = c3391m7.f18394a;
        if (l4 == null || l4.longValue() < 10000000000L || c3391m7.b == null || (l = c3391m7.c) == null || l.longValue() < 0 || (enumC3271hb = c3391m7.d) == null || enumC3271hb == EnumC3271hb.EVENT_TYPE_UNDEFINED || (l2 = c3391m7.e) == null || l2.longValue() < 0 || (l3 = c3391m7.f) == null || l3.longValue() < 0) {
            return false;
        }
        Long l5 = c3391m7.g.d;
        if (l5 != null && l5.longValue() < 0) {
            return false;
        }
        Integer num = c3391m7.g.i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.w, null, null, null, null, null, null, String.valueOf(this.f18164a));
                while (cursor.moveToNext()) {
                    try {
                        C3391m7 a2 = a(cursor);
                        if (a2 != null && a(a2)) {
                            try {
                                sQLiteDatabase2.insertOrThrow(com.umeng.analytics.pro.d.ar, null, this.x.fromModel(a2));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:2|3|(1:88)(1:5)|6|(5:(26:86|87|10|(1:82)(1:12)|13|(19:81|78|20|21|22|(10:73|30|31|32|(4:65|61|39|40)|35|(1:37)(1:59)|38|39|40)|25|(10:70|30|31|32|(1:34)(5:63|65|61|39|40)|35|(0)(0)|38|39|40)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|16|(19:77|78|20|21|22|(1:24)(11:71|73|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|25|(1:27)(11:68|70|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|19|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|(1:15)(20:79|81|78|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|(1:18)(20:75|77|78|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|39|40)|9|10|(0)(0)|13|16|19|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|(3:(0)|(9:42|43|44|45|46|(1:48)(1:54)|49|50|51)|(5:46|(0)(0)|49|50|51))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0179, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        if (r2.intValue() == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC3542s9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013d, code lost:
    
        r2 = io.appmetrica.analytics.impl.EnumC3344ka.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00eb, code lost:
    
        if (r3.intValue() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x002a, code lost:
    
        if (r3.intValue() != 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:3:0x0004, B:6:0x002e, B:10:0x003b, B:13:0x00f0, B:16:0x00fc, B:20:0x010a, B:43:0x017d, B:46:0x018d, B:49:0x01a2, B:54:0x019c, B:66:0x016b, B:74:0x013d, B:75:0x0101, B:79:0x00f5, B:82:0x00e7, B:84:0x0033, B:88:0x0026, B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155, B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:2:0x0004, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #1 {all -> 0x016b, blocks: (B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155), top: B:31:0x0142, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155 A[Catch: all -> 0x016b, TryCatch #1 {all -> 0x016b, blocks: (B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155), top: B:31:0x0142, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133 A[Catch: all -> 0x013d, TryCatch #4 {all -> 0x013d, blocks: (B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:21:0x0114, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127 A[Catch: all -> 0x013d, TryCatch #4 {all -> 0x013d, blocks: (B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:21:0x0114, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:3:0x0004, B:6:0x002e, B:10:0x003b, B:13:0x00f0, B:16:0x00fc, B:20:0x010a, B:43:0x017d, B:46:0x018d, B:49:0x01a2, B:54:0x019c, B:66:0x016b, B:74:0x013d, B:75:0x0101, B:79:0x00f5, B:82:0x00e7, B:84:0x0033, B:88:0x0026, B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155, B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:2:0x0004, inners: #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C3391m7 a(android.database.Cursor r32) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Z4.a(android.database.Cursor):io.appmetrica.analytics.impl.m7");
    }
}
