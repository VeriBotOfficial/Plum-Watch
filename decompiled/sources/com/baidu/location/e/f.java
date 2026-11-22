package com.baidu.location.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.location.Jni;
import com.baidu.location.b.x;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
final class f {
    private static final String d = String.format(Locale.US, "DELETE FROM LOG WHERE timestamp NOT IN (SELECT timestamp FROM LOG ORDER BY timestamp DESC LIMIT %d);", 3000);
    private static final String e = String.format(Locale.US, "SELECT * FROM LOG ORDER BY timestamp DESC LIMIT %d;", 3);
    private final SQLiteDatabase b;

    /* renamed from: a, reason: collision with root package name */
    private String f7640a = null;
    private final a c = new a(this);

    private class a extends com.baidu.location.h.g {
        private int b;
        private long c;
        private String d = null;
        private boolean e = false;
        private boolean f = false;
        private f g;

        a(f fVar) {
            this.g = fVar;
            this.el = new HashMap();
            this.b = 0;
            this.c = -1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.e) {
                return;
            }
            this.d = this.g.b();
            long j = this.c;
            if (j != -1 && j + 86400000 <= System.currentTimeMillis()) {
                this.b = 0;
                this.c = -1L;
            }
            if (this.d == null || this.b >= 2) {
                return;
            }
            this.e = true;
            ExecutorService c = x.a().c();
            if (c != null) {
                a(c, "https://ofloc.map.baidu.com/offline_loc");
            } else {
                e("https://ofloc.map.baidu.com/offline_loc");
            }
        }

        @Override // com.baidu.location.h.g
        public void a(boolean z) {
            this.f = false;
            if (z && this.ej != null) {
                try {
                    JSONObject jSONObject = new JSONObject(this.ej);
                    if (jSONObject.has("error") && jSONObject.getInt("error") == 161) {
                        this.f = true;
                    }
                } catch (Exception unused) {
                }
            }
            if (!this.f) {
                this.b++;
                this.c = System.currentTimeMillis();
            }
            this.g.a(this.f);
            this.e = false;
        }

        @Override // com.baidu.location.h.g
        public void b() {
            this.el.clear();
            this.el.put(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "ofbh");
            this.el.put(HiAnalyticsConstant.Direction.REQUEST, this.d);
            this.eh = d.f7633a;
        }
    }

    f(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS LOG(timestamp LONG PRIMARY KEY, log VARCHAR(4000))");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        String str;
        if (z && (str = this.f7640a) != null) {
            String format = String.format("DELETE FROM LOG WHERE timestamp in (%s);", str);
            try {
                if (this.f7640a.length() > 0) {
                    this.b.execSQL(format);
                }
            } catch (Exception unused) {
            }
        }
        this.f7640a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        Cursor cursor2 = null;
        try {
            Cursor rawQuery = this.b.rawQuery(e, null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        StringBuffer stringBuffer = new StringBuffer();
                        rawQuery.moveToFirst();
                        while (!rawQuery.isAfterLast()) {
                            jSONArray.put(rawQuery.getString(1));
                            if (stringBuffer.length() != 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(rawQuery.getLong(0));
                            rawQuery.moveToNext();
                        }
                        try {
                            jSONObject.put("ofloc", jSONArray);
                            str2 = jSONObject.toString();
                        } catch (JSONException unused) {
                        }
                        this.f7640a = stringBuffer.toString();
                    }
                } catch (Exception unused2) {
                    str = str2;
                    cursor2 = rawQuery;
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
            if (rawQuery == null) {
                return str2;
            }
            try {
                rawQuery.close();
                return str2;
            } catch (Exception unused5) {
                return str2;
            }
        } catch (Exception unused6) {
            str = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    void a() {
        this.c.a();
    }

    void a(String str) {
        try {
            this.b.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO LOG VALUES (%d,\"%s\");", Long.valueOf(System.currentTimeMillis()), Jni.encodeOfflineLocationUpdateRequest(str)));
            this.b.execSQL(d);
        } catch (Exception unused) {
        }
    }
}
