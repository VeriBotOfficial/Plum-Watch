package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.mobile.ads.impl.a40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes5.dex */
public final class pz implements al2 {
    private static final String e;
    private static final String[] f;
    private final zv b;
    private boolean d;

    /* renamed from: a, reason: collision with root package name */
    private final String f16608a = "ExoPlayerDownloads";
    private final Object c = new Object();

    public pz(k22 k22Var, int i) {
        this.b = k22Var;
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i = f92.f15466a;
            for (String str2 : str.split(",", -1)) {
                String[] split = str2.split("\\.", -1);
                if (split.length != 3) {
                    throw new IllegalStateException();
                }
                arrayList.add(new w22(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        e = sb.toString();
        f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", DownloadService.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public final w30 b(String str) throws yv {
        a();
        try {
            Cursor a2 = a("id = ?", new String[]{str});
            try {
                if (a2.getCount() == 0) {
                    a2.close();
                    return null;
                }
                a2.moveToNext();
                w30 a3 = a(a2);
                a2.close();
                return a3;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new yv(e2);
        }
    }

    public final void c(String str) throws yv {
        a();
        try {
            this.b.getWritableDatabase().delete(this.f16608a, "id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    private void a() throws yv {
        ArrayList arrayList;
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            try {
                int a2 = jb2.a(this.b.getReadableDatabase(), 0, "");
                if (a2 != 3) {
                    SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        jb2.a(writableDatabase, 0, "", 3);
                        if (a2 == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f16608a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f16608a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a((w30) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (Throwable th2) {
                throw new yv(th2);
            }
        }
    }

    public final void c() throws yv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.getWritableDatabase().update(this.f16608a, contentValues, null, null);
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements x30 {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f16609a;

        private a(Cursor cursor) {
            this.f16609a = cursor;
        }

        public final w30 a() {
            return pz.a(this.f16609a);
        }

        public final int b() {
            return this.f16609a.getPosition();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f16609a.close();
        }

        public final boolean a(int i) {
            return this.f16609a.moveToPosition(i);
        }
    }

    private static w30 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        a40.b bVar = new a40.b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if (DOMConstants.VAL_LINE_DASH.equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if (com.anythink.expressad.foundation.g.a.ag.equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        a40 a2 = bVar.b(str).a(a(cursor.getString(3))).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        z30 z30Var = new z30();
        z30Var.f17480a = cursor.getLong(13);
        z30Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new w30(a2, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, z30Var);
    }

    private Cursor a(String str, String[] strArr) throws yv {
        try {
            return this.b.getReadableDatabase().query(this.f16608a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    public final void b() throws yv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.getWritableDatabase().update(this.f16608a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w30 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        a40.b a2 = new a40.b(Uri.parse(string2), string).b(cursor.getString(1)).a(a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        a40 a3 = a2.b(blob).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        z30 z30Var = new z30();
        z30Var.f17480a = cursor.getLong(13);
        z30Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new w30(a3, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, z30Var);
    }

    public final x30 a(int... iArr) throws yv {
        String sb;
        a();
        if (iArr.length == 0) {
            sb = "1";
        } else {
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i = 0; i < iArr.length; i++) {
                if (i > 0) {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                }
                sb2.append(iArr[i]);
            }
            sb2.append(')');
            sb = sb2.toString();
        }
        return new a(a(sb, (String[]) null));
    }

    private ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!f92.a(sQLiteDatabase, this.f16608a)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.f16608a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", DownloadService.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(b(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void a(w30 w30Var) throws yv {
        a();
        try {
            a(w30Var, this.b.getWritableDatabase());
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    private void a(w30 w30Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = w30Var.f17215a.f;
        if (bArr == null) {
            bArr = f92.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", w30Var.f17215a.b);
        contentValues.put("mime_type", w30Var.f17215a.d);
        contentValues.put("uri", w30Var.f17215a.c.toString());
        List<w22> list = w30Var.f17215a.e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            w22 w22Var = list.get(i);
            sb.append(w22Var.b).append('.').append(w22Var.c).append('.').append(w22Var.d).append(AbstractJsonLexerKt.COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", w30Var.f17215a.g);
        contentValues.put("data", w30Var.f17215a.h);
        contentValues.put("state", Integer.valueOf(w30Var.b));
        contentValues.put("start_time_ms", Long.valueOf(w30Var.c));
        contentValues.put("update_time_ms", Long.valueOf(w30Var.d));
        contentValues.put("content_length", Long.valueOf(w30Var.e));
        contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(w30Var.f));
        contentValues.put("failure_reason", Integer.valueOf(w30Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(w30Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(w30Var.h.f17480a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f16608a, null, contentValues);
    }

    public final void a(int i) throws yv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(i));
            this.b.getWritableDatabase().update(this.f16608a, contentValues, e, null);
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    public final void a(int i, String str) throws yv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(i));
            this.b.getWritableDatabase().update(this.f16608a, contentValues, e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new yv(th);
        }
    }
}
