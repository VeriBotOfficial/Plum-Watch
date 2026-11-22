package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: UMDBUtils.java */
/* loaded from: classes2.dex */
public class h {
    public static boolean a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("sqlite_master", new String[]{"count(*)"}, "type=? and name=?", new String[]{"table", str.trim()}, null, null, null, null);
            if (cursor.moveToNext()) {
                if (cursor.getInt(0) > 0) {
                    z = true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return z;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
                throw th;
            }
            throw th;
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(e.b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            f.a(context).a();
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        return context.getDatabasePath(e.b).getParent() + File.separator;
    }

    public static String c(Context context) {
        return b(context) + "subprocess/";
    }

    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query(str, null, null, null, null, null, "LIMIT 0");
            if (cursor != null) {
                if (cursor.getColumnIndex(str2) != -1) {
                    z = true;
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return z;
        } catch (Exception unused) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                if (!cursor.isClosed()) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
            throw th;
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }
}
