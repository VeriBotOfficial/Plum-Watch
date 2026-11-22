package oqmf;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.DownloadEntity;
import com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c;
import com.qumeng.overseas.advlib.__remote__.utils.l;

/* loaded from: classes8.dex */
public class b {
    public static final String b = "table_download";
    private static volatile b n;

    /* renamed from: a, reason: collision with root package name */
    private a f18750a;
    public static String f = "time_millis";
    public static final String g = "alter table table_download add column " + f + " integer";
    public static String h = "content_length";
    public static final String i = "alter table table_download add column " + h + " integer";
    public static String j = "key";
    public static final String k = "alter table table_download add column " + j + " text";
    public static String l = "object";
    public static String c = "package_name";
    public static String d = "downnload_url";
    public static String e = "status";
    public static final String m = "create table table_download(" + c + " text," + d + " text," + e + " integer," + f + " integer," + h + " integer," + j + " text," + l + " text)";

    private b(Context context) {
        this.f18750a = a.a(context);
    }

    public static b a(Context context) {
        if (n == null) {
            synchronized (b.class) {
                if (n == null) {
                    n = new b(context.getApplicationContext());
                }
            }
        }
        return n;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.f12915a;
        }
        Cursor cursor = null;
        try {
            cursor = this.f18750a.b().rawQuery(String.format("select %s from %s where %s = ? ", e, b, j), new String[]{str});
        } catch (Exception e2) {
            e2.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_getStatus", e2);
        } finally {
            a(cursor);
        }
        return (cursor == null || !cursor.moveToFirst()) ? c.f12915a : cursor.getInt(cursor.getColumnIndex(e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, oqmf.b] */
    public DownloadEntity c(String str) {
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = this.f18750a.b().rawQuery(String.format("select * from %s where %s = ? or %s = ?", b, c, d), new String[]{str, str});
                try {
                    DownloadEntity b2 = cursor.moveToFirst() ? b(cursor) : null;
                    a(cursor);
                    return b2;
                } catch (Exception e2) {
                    e = e2;
                    com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Object) this, "exp_DownloadDao_queryByDownloadUrl", e.getMessage(), e);
                    e.printStackTrace();
                    a(cursor);
                    return null;
                }
            } catch (Throwable th) {
                r0 = str;
                th = th;
                a(r0);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            a(r0);
            throw th;
        }
    }

    public boolean a(String str) {
        try {
            try {
                this.f18750a.b().delete(b, j + "=?", new String[]{str});
                a aVar = this.f18750a;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            } catch (Exception e2) {
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_DownloadDao_deleteItem", e2.getMessage(), e2);
                e2.printStackTrace();
                a aVar2 = this.f18750a;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return false;
            }
        } catch (Throwable th) {
            a aVar3 = this.f18750a;
            if (aVar3 != null) {
                aVar3.a();
            }
            throw th;
        }
    }

    private DownloadEntity b(Cursor cursor) {
        DownloadEntity downloadEntity = new DownloadEntity();
        downloadEntity.downloadUrl = cursor.getString(cursor.getColumnIndex(d));
        downloadEntity.status = cursor.getInt(cursor.getColumnIndex(e));
        downloadEntity.packageName = cursor.getString(cursor.getColumnIndex(c));
        downloadEntity.lastTimeMillis = cursor.getLong(cursor.getColumnIndex(f));
        downloadEntity.contentLength = cursor.getLong(cursor.getColumnIndex(h));
        downloadEntity.downloadKey = cursor.getString(cursor.getColumnIndex(j));
        String string = cursor.getString(cursor.getColumnIndex(l));
        if (!TextUtils.isEmpty(string)) {
            DownloadEntity downloadEntity2 = (DownloadEntity) l.a(string, DownloadEntity.class);
            downloadEntity.md5 = downloadEntity2.md5;
            downloadEntity.fileName = downloadEntity2.fileName;
            downloadEntity.storagePath = downloadEntity2.storagePath;
            downloadEntity.appName = downloadEntity2.appName;
            downloadEntity.logoUrl = downloadEntity2.logoUrl;
            downloadEntity.customMap = downloadEntity2.customMap;
        }
        return downloadEntity;
    }

    public int a(DownloadEntity downloadEntity) {
        Exception exc;
        Throwable th;
        SQLiteDatabase b2;
        ContentValues b3;
        Cursor query;
        if (downloadEntity == null || TextUtils.isEmpty(downloadEntity.downloadUrl)) {
            return -1;
        }
        Cursor cursor = null;
        try {
            try {
                b2 = this.f18750a.b();
                b3 = b(downloadEntity);
                query = b2.query(b, new String[]{j}, j + "= ? ", new String[]{downloadEntity.downloadUrl}, null, null, null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            exc = e2;
        }
        try {
            if (query.getCount() > 0) {
                b2.update(b, b3, j + " =? ", new String[]{downloadEntity.downloadKey});
                a(query);
                return 1;
            }
            b2.insert(b, null, b3);
            a(query);
            return 2;
        } catch (Exception e3) {
            exc = e3;
            cursor = query;
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_DownloadDao_insertOrReplace", exc.getMessage(), exc);
            exc.printStackTrace();
            a(cursor);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            a(cursor);
            throw th;
        }
    }

    public ContentValues b(DownloadEntity downloadEntity) {
        if (downloadEntity == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        if (!TextUtils.isEmpty(downloadEntity.packageName)) {
            contentValues.put(c, downloadEntity.packageName);
        }
        if (!TextUtils.isEmpty(downloadEntity.downloadUrl)) {
            contentValues.put(d, downloadEntity.downloadUrl);
        }
        contentValues.put(e, Integer.valueOf(downloadEntity.status));
        contentValues.put(f, Long.valueOf(downloadEntity.lastTimeMillis));
        contentValues.put(h, Long.valueOf(downloadEntity.contentLength));
        contentValues.put(j, downloadEntity.downloadKey);
        contentValues.put(l, l.b(downloadEntity));
        return contentValues;
    }

    public void a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase b2 = this.f18750a.b();
                ContentValues contentValues = new ContentValues();
                contentValues.put(e, Integer.valueOf(i2));
                cursor = b2.query(b, new String[]{j}, j + "= ? ", new String[]{str}, null, null, null);
                if (cursor.getCount() > 0) {
                    b2.update(b, contentValues, j + " =? ", new String[]{str});
                }
                a(cursor);
            } catch (Exception e2) {
                e2.printStackTrace();
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_DownloadDao_updateStatus", e2.getMessage(), e2);
                a(cursor);
            }
        } catch (Throwable th) {
            a(cursor);
            throw th;
        }
    }

    public void a(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase b2 = this.f18750a.b();
                ContentValues contentValues = new ContentValues();
                contentValues.put(h, Long.valueOf(j2));
                cursor = b2.query(b, new String[]{j}, j + "= ? ", new String[]{str}, null, null, null);
                if (cursor.getCount() > 0) {
                    b2.update(b, contentValues, j + " =? ", new String[]{str});
                }
                a(cursor);
            } catch (Exception e2) {
                e2.printStackTrace();
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_updateContentLength", e2);
                a(cursor);
            }
        } catch (Throwable th) {
            a(cursor);
            throw th;
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase b2 = this.f18750a.b();
                ContentValues contentValues = new ContentValues();
                contentValues.put(c, str2);
                cursor = b2.query(b, new String[]{j}, j + "= ? ", new String[]{str}, null, null, null);
                if (cursor.getCount() > 0) {
                    b2.update(b, contentValues, j + " =? ", new String[]{str});
                }
                a(cursor);
            } catch (Exception e2) {
                e2.printStackTrace();
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_updatePackageName", e2);
                a(cursor);
            }
        } catch (Throwable th) {
            a(cursor);
            throw th;
        }
    }

    private void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
        a aVar = this.f18750a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
