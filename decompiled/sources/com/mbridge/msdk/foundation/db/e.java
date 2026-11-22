package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.e.g;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.AabEntity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: CampaignDao.java */
/* loaded from: classes17.dex */
public class e extends com.mbridge.msdk.foundation.db.a<Campaign> {
    private static e r;

    /* renamed from: a, reason: collision with root package name */
    private final String f11508a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;

    /* renamed from: q, reason: collision with root package name */
    private final String f11509q;

    /* compiled from: CampaignDao.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f11510a;
        final /* synthetic */ String b;

        a(List list, String str) {
            this.f11510a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11510a.iterator();
            while (it.hasNext()) {
                e.this.a((CampaignEx) it.next(), this.b, 0);
            }
        }
    }

    protected e(f fVar) {
        super(fVar);
        this.f11508a = "rid";
        this.b = "lrid";
        this.c = "cid";
        this.d = "plct";
        this.e = "plctb";
        this.f = "timestamp";
        this.g = "ridCount";
        this.h = " WHERE ";
        this.i = " AND ";
        this.j = "SELECT ";
        this.k = "*";
        this.l = " FROM ";
        this.m = " AND readyState = '0'";
        this.n = " AND is_bid_campaign = 1";
        this.o = " order by ts ASC";
        this.p = " group by request_id";
        this.f11509q = " group by bid_token";
    }

    public static synchronized e a(f fVar) {
        e eVar;
        synchronized (e.class) {
            if (r == null) {
                r = new e(fVar);
            }
            eVar = r;
        }
        return eVar;
    }

    public synchronized void b(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 0);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void d(String str, String str2) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        String[] strArr = {str, str2};
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, "id = ? AND request_id = ? ", strArr);
    }

    public synchronized void e(String str, String str2) {
        String[] strArr;
        try {
            strArr = new String[]{str, str2};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "id = ? AND unitid = ? ", strArr);
    }

    public int f(String str, String str2) {
        String[] strArr;
        String str3;
        if (TextUtils.isEmpty(str)) {
            strArr = new String[]{str2};
            str3 = "unitid = ?  AND is_bid_campaign = 1";
        } else {
            strArr = new String[]{str2, str};
            str3 = "unitid = ?  AND request_id = ?  AND is_bid_campaign = 1";
        }
        String concat = str3.concat(" AND readyState = '0'");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            return getWritableDatabase().update("campaign", contentValues, concat, strArr);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
            return 0;
        }
    }

    public synchronized List<CampaignEx> c(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE unitid = ? AND readyState = 2", new String[]{str});
            if (rawQuery == null || rawQuery.getCount() <= 0) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(a(rawQuery));
            }
            rawQuery.close();
            return arrayList;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
            return null;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", th.getLocalizedMessage());
            }
            return null;
        }
    }

    public synchronized void a(String str, int i, int i2) {
        String[] strArr;
        try {
            strArr = new String[]{str, String.valueOf(i), String.valueOf(i2)};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? AND level = ? AND adSource = ? ", strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        if (0 == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> e(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto Lc
            goto L65
        Lc:
            r1 = 0
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            android.database.sqlite.SQLiteDatabase r3 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "SELECT local_request_id as lrid FROM campaign WHERE unitid = ? AND readyState = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L51
            r7 = 0
            r6[r7] = r9     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L51
            r5 = 1
            r6[r5] = r9     // Catch: java.lang.Throwable -> L51
            android.database.Cursor r1 = r3.rawQuery(r4, r6)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L4e
            int r9 = r1.getCount()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r9 <= 0) goto L4e
        L33:
            boolean r9 = r1.moveToNext()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r9 == 0) goto L4e
            java.lang.String r9 = "lrid"
            int r9 = r1.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.String r9 = r1.getString(r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r2 == 0) goto L4a
            goto L33
        L4a:
            r0.add(r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            goto L33
        L4e:
            if (r1 == 0) goto L65
            goto L62
        L51:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
        L54:
            r9 = move-exception
            goto L66
        L56:
            r9 = move-exception
            java.lang.String r2 = "CampaignDao"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch: java.lang.Throwable -> L54
            com.mbridge.msdk.foundation.tools.o0.b(r2, r9)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L65
        L62:
            r1.close()
        L65:
            return r0
        L66:
            if (r1 == 0) goto L6b
            r1.close()
        L6b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r11 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        if (0 != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.mbridge.msdk.foundation.entity.c> d(java.lang.String r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Ld
            goto Le4
        Ld:
            java.lang.String r1 = " WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1 AND readyState = '0' group by request_id"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " order by ts ASC"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT request_id as rid ,count(*) as ridCount ,vcn,token_r,bid_token,local_request_id,ts as timestamp FROM campaign"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r11
            r11 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r3.<init>()     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            android.database.sqlite.SQLiteDatabase r4 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> Lcc
            android.database.Cursor r11 = r4.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcc
            if (r11 == 0) goto Lc9
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            if (r1 <= 0) goto Lc9
        L4f:
            boolean r1 = r11.moveToNext()     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            if (r1 == 0) goto Lc9
            com.mbridge.msdk.foundation.entity.c r1 = new com.mbridge.msdk.foundation.entity.c     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.<init>()     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r2 = "rid"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            if (r3 == 0) goto L6b
            goto L4f
        L6b:
            java.lang.String r3 = "local_request_id"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r4 = "bid_token"
            int r4 = r11.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r5 = "ridCount"
            int r5 = r11.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            int r5 = r11.getInt(r5)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r6 = "token_r"
            int r6 = r11.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            int r6 = r11.getInt(r6)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r7 = "timestamp"
            int r7 = r11.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            long r7 = r11.getLong(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            java.lang.String r9 = "vcn"
            int r9 = r11.getColumnIndex(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            int r9 = r11.getInt(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.a(r5)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.c(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.b(r6)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.c(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            r1.c(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            if (r2 != 0) goto Lc5
            r1.b(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
        Lc5:
            r0.add(r1)     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
            goto L4f
        Lc9:
            if (r11 == 0) goto Le4
            goto Le1
        Lcc:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcc
            throw r1     // Catch: java.lang.Throwable -> Lcf java.lang.Exception -> Ld1
        Lcf:
            r0 = move-exception
            goto Le5
        Ld1:
            r1 = move-exception
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> Lcf
            if (r2 == 0) goto Ldf
            java.lang.String r2 = "CampaignDao"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> Lcf
            com.mbridge.msdk.foundation.tools.o0.b(r2, r1)     // Catch: java.lang.Throwable -> Lcf
        Ldf:
            if (r11 == 0) goto Le4
        Le1:
            r11.close()
        Le4:
            return r0
        Le5:
            if (r11 == 0) goto Lea
            r11.close()
        Lea:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.d(java.lang.String):java.util.List");
    }

    public synchronized void a(String str, int i, int i2, boolean z) {
        String[] strArr;
        try {
            strArr = new String[]{str, String.valueOf(i), String.valueOf(i2), String.valueOf(z ? 1 : 0)};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = ? ", strArr);
    }

    public synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArr = {str};
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("campaign", "unitid = ? AND readyState = 2", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (0 != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.entity.c> f(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r11
            java.lang.String r11 = "SELECT request_id as rid, id as cid, plct as plct, plctb as plctb, ts as timestamp FROM campaign WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1 AND readyState = '0'"
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r2 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r3.<init>()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            android.database.sqlite.SQLiteDatabase r4 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> La9
            android.database.Cursor r2 = r4.rawQuery(r11, r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            if (r2 == 0) goto La6
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            if (r11 <= 0) goto La6
        L25:
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            if (r11 == 0) goto La6
            java.lang.String r11 = "rid"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.lang.String r11 = r2.getString(r11)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.lang.String r0 = "cid"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.lang.String r3 = "plct"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.lang.String r5 = "plctb"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            long r5 = r2.getLong(r5)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.lang.String r7 = "timestamp"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            boolean r9 = r1.containsKey(r11)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            if (r9 == 0) goto L86
            java.lang.Object r9 = r1.get(r11)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            com.mbridge.msdk.foundation.entity.c r9 = (com.mbridge.msdk.foundation.entity.c) r9     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            if (r9 == 0) goto L25
            r9.a(r11)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.a(r3)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.b(r5)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.c(r7)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.util.List r11 = r9.c()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            if (r11 == 0) goto L25
            java.util.List r11 = r9.c()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r11.add(r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            goto L25
        L86:
            com.mbridge.msdk.foundation.entity.c r9 = new com.mbridge.msdk.foundation.entity.c     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.<init>()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.a(r11)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.a(r3)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.b(r5)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.c(r7)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r3.<init>()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r3.add(r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r9.a(r3)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            r1.put(r11, r9)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
            goto L25
        La6:
            if (r2 == 0) goto Lc1
            goto Lbe
        La9:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            throw r11     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Lae
        Lac:
            r11 = move-exception
            goto Lc2
        Lae:
            r11 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "CampaignDao"
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch: java.lang.Throwable -> Lac
            com.mbridge.msdk.foundation.tools.o0.b(r0, r11)     // Catch: java.lang.Throwable -> Lac
        Lbc:
            if (r2 == 0) goto Lc1
        Lbe:
            r2.close()
        Lc1:
            return r1
        Lc2:
            if (r2 == 0) goto Lc7
            r2.close()
        Lc7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.f(java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }

    public synchronized void a(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    String str2 = "id = ? AND unitid = ? AND request_id = ?  AND is_bid_campaign = ? ";
                    String[] strArr = new String[4];
                    strArr[0] = campaignEx.getId();
                    strArr[1] = str;
                    strArr[2] = campaignEx.getRequestId();
                    strArr[3] = campaignEx.isBidCampaign() ? "1" : "0";
                    try {
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, str2, strArr);
                        }
                    } catch (SQLException e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void b(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unitid").append(" = ? AND ").append("id").append(" = ? AND ").append("request_id").append(" = ? ");
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, sb.toString(), strArr);
                        }
                    } catch (SQLException e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void c(String str, String str2) {
        try {
        } catch (Exception e) {
            o0.b("CampaignDao", e.getLocalizedMessage());
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = "";
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            str3 = "unitid = ? AND ";
            arrayList.add(str);
        }
        String concat = str3.concat("n_local_request_id = ? AND bid_token IS NOT NULL AND n_local_request_id IS NOT NULL");
        arrayList.add(str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, concat, (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized void a(String str, CampaignEx campaignEx, boolean z, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            if (campaignEx == null && !TextUtils.isEmpty(str2)) {
                sb.append("unitid").append(" = ? AND ").append("request_id").append(" = ?");
            } else if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                sb.append("unitid").append(" = ? AND ").append("id").append(" = ? AND ").append("request_id").append(" = ?");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                arrayList.add(String.valueOf(campaignEx.getId()));
                arrayList.add(campaignEx.getRequestId());
            } else {
                arrayList.add(str2);
            }
            if (!TextUtils.isEmpty(sb)) {
                if (q0.a().a("c_n_c_s", true)) {
                    sb.append(" AND readyState").append(" != 0");
                }
                if (z) {
                    sb.append(" AND is_bid_campaign = 1");
                } else {
                    sb.append(" AND is_bid_campaign = 0");
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("readyState", (Integer) 2);
                SQLiteDatabase writableDatabase = getWritableDatabase();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (writableDatabase != null) {
                    writableDatabase.update("campaign", contentValues, sb.toString(), strArr);
                }
            }
        } catch (SQLException e) {
            o0.b("CampaignDao", e.getLocalizedMessage());
        }
    }

    public synchronized void b(long j, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = "(plctb>0 and (plctb* 1000+ts)< " + currentTimeMillis + " ) or (plctb<=0 and ts< " + (currentTimeMillis - j) + " ) and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", str2, strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized List<CampaignEx> b(String str, int i, int i2, int i3) {
        ArrayList arrayList;
        String str2;
        arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        str2 = "";
        if (i > 0) {
            str2 = " LIMIT ?";
            arrayList.add(String.valueOf(i));
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?".concat(str2), (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized void a(String str, List<CampaignEx> list, boolean z) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    a(str, campaignEx, z, campaignEx.getRequestId());
                }
            }
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, String str2, int i) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str2, Integer.valueOf(i));
                        writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
        }
    }

    public synchronized void b(String str, String str2) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str3 = "unitid = ?";
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            str3 = "unitid = ? AND bid_token != ?";
            arrayList.add(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, (str3 + " AND is_bid_campaign = 1") + " AND bid_token IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z) {
        if (getWritableDatabase() == null) {
            return;
        }
        try {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        for (CampaignEx campaignEx : list) {
                            try {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("readyState", (Integer) 0);
                                getWritableDatabase().update("campaign", contentValues, z ? "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 1" : "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 0", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                            } catch (Exception e) {
                                if (MBridgeConstans.DEBUG) {
                                    o0.b("CampaignDao", e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("CampaignDao", e2.getLocalizedMessage());
                    }
                }
            }
            if (list2 != null && list2.size() > 0) {
                for (CampaignEx campaignEx2 : list2) {
                    try {
                        if (campaignEx2.getLoadTimeoutState() == 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unitid").append(" = ? AND ").append("id").append(" = ? AND ").append("request_id").append(" = ? ");
                            String[] strArr = {str, campaignEx2.getId(), campaignEx2.getRequestId()};
                            if (z) {
                                sb.append(" AND is_bid_campaign = 1");
                            } else {
                                sb.append(" AND is_bid_campaign = 0");
                            }
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("readyState", (Integer) 2);
                            getWritableDatabase().update("campaign", contentValues2, sb.toString(), strArr);
                        }
                    } catch (SQLException e3) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("CampaignDao", e3.getLocalizedMessage());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> b(java.lang.String r7, int r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = "SELECT * FROM campaign WHERE "
            r1 = 0
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L15
            java.lang.String r9 = "placement_id = ? AND ad_type = ? "
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r4[r1] = r7     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r4[r2] = r7     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            goto L1f
        L15:
            java.lang.String r9 = "ad_type = ? "
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r4[r1] = r7     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
        L1f:
            java.lang.String r7 = r0.concat(r9)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            android.database.sqlite.SQLiteDatabase r8 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            android.database.Cursor r7 = r8.rawQuery(r7, r4)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            if (r7 == 0) goto L54
            int r8 = r7.getCount()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            if (r8 <= 0) goto L54
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            r8.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
        L38:
            boolean r9 = r7.moveToNext()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L4b
            if (r9 == 0) goto L46
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r6.a(r7)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L4b
            r8.add(r9)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L4b
            goto L38
        L46:
            r3 = r8
            goto L54
        L48:
            r9 = move-exception
            r3 = r7
            goto L60
        L4b:
            r8 = move-exception
            r3 = r7
            r7 = r8
            goto L72
        L4f:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L5c
        L54:
            if (r7 == 0) goto L57
            goto L6d
        L57:
            return r3
        L58:
            r7 = move-exception
            goto L72
        L5a:
            r7 = move-exception
            r8 = r3
        L5c:
            r9 = r3
            r3 = r8
            r8 = r9
            r9 = r7
        L60:
            java.lang.String r7 = "CampaignDao"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch: java.lang.Throwable -> L58
            com.mbridge.msdk.foundation.tools.o0.b(r7, r9)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L71
            r7 = r3
            r3 = r8
        L6d:
            r7.close()
            r8 = r3
        L71:
            return r8
        L72:
            if (r3 == 0) goto L77
            r3.close()
        L77:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.b(java.lang.String, int, boolean):java.util.List");
    }

    public synchronized void a(String str, List<CampaignEx> list, String str2) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_request_id", str2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void a(String str, String str2, boolean z, String str3) {
        String[] strArr;
        try {
            strArr = new String[4];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = z ? "1" : "0";
            strArr[3] = str3;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, "id = ? AND unitid = ? AND is_bid_campaign = ? AND request_id = ? ", strArr);
    }

    public synchronized void a(String str, String str2, String str3) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? AND (local_request_id = ?  OR local_request_id = ? )", new String[]{str, str2, str3});
    }

    public synchronized void a(String str, String str2, int i, int i2, boolean z) {
        String[] strArr;
        String str3;
        try {
            strArr = new String[]{str, str2, String.valueOf(i), String.valueOf(i2)};
            if (z) {
                str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 1";
            } else {
                str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 0";
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str3, strArr);
    }

    public synchronized void a(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? ", strArr);
    }

    public synchronized void a(String str, int i, boolean z) {
        String str2;
        String[] strArr;
        try {
            if (z) {
                str2 = "placement_id = ? AND ad_type = ? ";
                strArr = new String[]{str, String.valueOf(i)};
            } else {
                str2 = "ad_type = " + i;
                strArr = new String[]{String.valueOf(i)};
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str2, strArr);
    }

    public synchronized void a() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 3600000)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", "ts< ? AND ts>0", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(long j, String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - j), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", "ts< ? and unitid= ? ", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(List<CampaignEx> list, String str, String str2, int i) {
        if (list != null) {
            if (list.size() != 0) {
                if (getWritableDatabase() == null) {
                    return;
                }
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next(), str, str2, i);
                }
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str, String str2, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = campaignEx.getPv_urls().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                contentValues.put("pv_urls", jSONArray.toString());
            }
            contentValues.put("id", campaignEx.getId());
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            contentValues.put("placement_id", str);
            contentValues.put("unitid", str2);
            contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
            contentValues.put("package_name", campaignEx.getPackageName());
            contentValues.put("app_name", campaignEx.getAppName());
            contentValues.put(g.a.N, campaignEx.getAppDesc());
            contentValues.put("app_size", campaignEx.getSize());
            contentValues.put("image_size", campaignEx.getImageSize());
            contentValues.put("icon_url", campaignEx.getIconUrl());
            contentValues.put("image_url", campaignEx.getImageUrl());
            contentValues.put("impression_url", campaignEx.getImpressionURL());
            contentValues.put("notice_url", campaignEx.getNoticeUrl());
            contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
            contentValues.put("wtick", Integer.valueOf(campaignEx.getWtick()));
            contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
            contentValues.put("user_activation", Boolean.toString(campaignEx.getUserActivation()));
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
            contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, campaignEx.getNetAddress());
            contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
            contentValues.put("ac", campaignEx.getAc());
            contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
            contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
            contentValues.put("click_mode", campaignEx.getClick_mode());
            contentValues.put("landing_type", campaignEx.getLandingType());
            contentValues.put("link_type", Integer.valueOf(campaignEx.getLinkType()));
            contentValues.put("star", Double.valueOf(campaignEx.getRating()));
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
            contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
            contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
            contentValues.put("ad_call", campaignEx.getAdCall());
            contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
            contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
            contentValues.put("ad_url_list", campaignEx.getAd_url_list());
            contentValues.put("video_url", campaignEx.getVideoUrlEncode());
            contentValues.put("video_size", Integer.valueOf(campaignEx.getVideoSize()));
            contentValues.put("video_length", Integer.valueOf(campaignEx.getVideoLength()));
            contentValues.put("video_resolution", campaignEx.getVideoResolution());
            contentValues.put("endcard_click_result", Integer.valueOf(campaignEx.getEndcard_click_result()));
            contentValues.put("watch_mile", Integer.valueOf(campaignEx.getWatchMile()));
            contentValues.put("advImp", campaignEx.getAdvImp());
            contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
            contentValues.put("t_imp", Integer.valueOf(campaignEx.getTImp()));
            contentValues.put("guidelines", campaignEx.getGuidelines());
            contentValues.put("offer_type", Integer.valueOf(campaignEx.getOfferType()));
            contentValues.put("html_url", campaignEx.getHtmlUrl());
            contentValues.put("end_screen_url", campaignEx.getEndScreenUrl());
            contentValues.put("reward_amount", Integer.valueOf(campaignEx.getRewardAmount()));
            contentValues.put("reward_name", campaignEx.getRewardName());
            contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
            contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
            contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
            contentValues.put("playable_ads_without_video", Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
            contentValues.put("endcard_url", campaignEx.getendcard_url());
            contentValues.put("video_end_type", Integer.valueOf(campaignEx.getVideo_end_type()));
            contentValues.put("md5_file", campaignEx.getVideoMD5Value());
            contentValues.put("nv_t2", Integer.valueOf(campaignEx.getNvT2()));
            contentValues.put("gif_url", campaignEx.getGifUrl());
            if (campaignEx.getRewardTemplateMode() != null) {
                contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().d());
            }
            contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
            contentValues.put("c_ua", Integer.valueOf(campaignEx.getcUA()));
            contentValues.put("imp_ua", Integer.valueOf(campaignEx.getImpUA()));
            contentValues.put("jm_pd", Integer.valueOf(campaignEx.getJmPd()));
            contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
            contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
            contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
            contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
            contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
            contentValues.put("ia_url", campaignEx.getKeyIaUrl());
            contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
            contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
            contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
            contentValues.put("ia_ext1", campaignEx.getIa_ext1());
            contentValues.put("ia_ext2", campaignEx.getIa_ext2());
            contentValues.put("is_download_zip", Integer.valueOf(campaignEx.getIsDownLoadZip()));
            contentValues.put("ia_cache", campaignEx.getInteractiveCache());
            contentValues.put("oc_time", Integer.valueOf(campaignEx.getOc_time()));
            contentValues.put("oc_type", Integer.valueOf(campaignEx.getOc_type()));
            contentValues.put("t_list", campaignEx.getT_list());
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                contentValues.put("adchoice", adchoice.a());
                contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.e()));
                contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.f()));
            }
            contentValues.put("plct", Long.valueOf(campaignEx.getPlct()));
            contentValues.put("plctb", Long.valueOf(campaignEx.getPlctb()));
            contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
            contentValues.put("ad_html", campaignEx.getAdHtml());
            contentValues.put("ad_zip", campaignEx.getAdZip());
            contentValues.put("banner_url", campaignEx.getBannerUrl());
            contentValues.put("banner_html", campaignEx.getBannerHtml());
            contentValues.put("creative_id", Long.valueOf(campaignEx.getCreativeId()));
            contentValues.put("vid_crtv_id", Long.valueOf(campaignEx.getVidCrtvId()));
            contentValues.put("ec_crtv_id", Long.valueOf(campaignEx.getEcCrtvId()));
            contentValues.put("ec_temp_id", Long.valueOf(campaignEx.getEcTemplateId()));
            contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
            contentValues.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BID_TOKEN, campaignEx.getBidToken());
            contentValues.put("mraid", campaignEx.getMraid());
            contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
            contentValues.put("omid", campaignEx.getOmid());
            contentValues.put("mof_tplid", Integer.valueOf(campaignEx.getMof_tplid()));
            contentValues.put("ready_rate", Integer.valueOf(campaignEx.getReady_rate()));
            contentValues.put("ext_data", campaignEx.getExt_data());
            contentValues.put("nscpt", Integer.valueOf(campaignEx.getNscpt()));
            contentValues.put("mof_template_url", campaignEx.getMof_template_url());
            contentValues.put("req_ext_data", campaignEx.getReq_ext_data());
            contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
            contentValues.put("request_id", campaignEx.getRequestId());
            contentValues.put("n_request_id", campaignEx.getNRid());
            contentValues.put("local_request_id", campaignEx.getLocalRequestId());
            contentValues.put("n_local_request_id", campaignEx.getNLRid());
            contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
            contentValues.put("err_reason_default_ad", campaignEx.getReasond());
            contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
            contentValues.put("maitve", Integer.valueOf(campaignEx.getMaitve()));
            contentValues.put("maitve_src", campaignEx.getMaitve_src());
            contentValues.put("flb", Integer.valueOf(campaignEx.getFlb()));
            contentValues.put("flb_skiptime", Integer.valueOf(campaignEx.getFlbSkipTime()));
            contentValues.put("adspace_t", Integer.valueOf(campaignEx.getAdSpaceT()));
            contentValues.put("cbd", Integer.valueOf(campaignEx.getCbd()));
            contentValues.put("vst", Integer.valueOf(campaignEx.getVst()));
            contentValues.put("use_skip_time", Integer.valueOf(campaignEx.getUseSkipTime()));
            contentValues.put("prog_bar", Integer.valueOf(campaignEx.getProgressBarShow()));
            contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
            contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
            contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
            contentValues.put("vck_t", Integer.valueOf(campaignEx.getVideoCheckType()));
            contentValues.put("vctn_t", Integer.valueOf(campaignEx.getVideoCtnType()));
            contentValues.put("rs_ignc_r", campaignEx.getRsIgnoreCheckRuleString());
            contentValues.put("view_com_time", Integer.valueOf(campaignEx.getVideoCompleteTime()));
            contentValues.put("tp_offer", Integer.valueOf(campaignEx.getTpOffer()));
            contentValues.put("fac", Integer.valueOf(campaignEx.getFac()));
            if (campaignEx.getAabEntity() != null) {
                contentValues.put("aab", campaignEx.getAabEntity().toJson().toString());
            }
            contentValues.put("privacy_url", campaignEx.getPrivacyUrl());
            contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
            contentValues.put("imp_report_type", Integer.valueOf(campaignEx.getImpReportType()));
            contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
            contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
            contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
            contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
            contentValues.put(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
            contentValues.put("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
            contentValues.put("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
            return getWritableDatabase().insert("campaign", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0721 A[Catch: all -> 0x072c, TRY_LEAVE, TryCatch #4 {all -> 0x072c, blocks: (B:38:0x06d5, B:40:0x06db, B:42:0x06e3, B:43:0x06fa, B:47:0x06eb, B:48:0x0707, B:26:0x071d, B:28:0x0721, B:33:0x072e), top: B:7:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized long a(com.mbridge.msdk.foundation.entity.CampaignEx r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, int):long");
    }

    public synchronized void a(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() != 0) {
                new Thread(new a(list, str)).start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #2 {all -> 0x0078, blocks: (B:9:0x0035, B:11:0x003b, B:14:0x0042, B:15:0x0046, B:17:0x004c, B:32:0x0069, B:34:0x006d, B:45:0x007a), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int a(java.lang.String r11, long r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r1 = 0
            com.mbridge.msdk.setting.h r0 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            com.mbridge.msdk.setting.g r0 = r0.d(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            if (r0 != 0) goto L25
            com.mbridge.msdk.setting.h r0 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L21
            com.mbridge.msdk.setting.g r0 = r0.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L21
            goto L25
        L1d:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7a
        L21:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L69
        L25:
            long r2 = r0.a0()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r10.b(r2, r11)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L66
            r8 = 1
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            java.util.List r11 = r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            if (r11 == 0) goto L5d
            boolean r0 = r11.isEmpty()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            if (r0 == 0) goto L42
            goto L5d
        L42:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
        L46:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            boolean r0 = r0.isSpareOffer(r12, r2)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            if (r0 != 0) goto L46
            monitor-exit(r10)
            return r1
        L5a:
            monitor-exit(r10)
            r11 = 1
            return r11
        L5d:
            monitor-exit(r10)
            r11 = -1
            return r11
        L60:
            r0 = move-exception
            goto L68
        L62:
            r0 = move-exception
            r4 = r10
        L64:
            r11 = r0
            goto L7a
        L66:
            r0 = move-exception
            r4 = r10
        L68:
            r11 = r0
        L69:
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L78
            if (r12 == 0) goto L76
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = "CampaignDao"
            com.mbridge.msdk.foundation.tools.o0.b(r12, r11)     // Catch: java.lang.Throwable -> L78
        L76:
            monitor-exit(r10)
            return r1
        L78:
            r0 = move-exception
            goto L64
        L7a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a(java.lang.String, long):int");
    }

    public synchronized boolean a(String str, int i, String str2, int i2, int i3, boolean z) {
        String str3;
        String[] strArr;
        if (z) {
            str3 = "SELECT id FROM campaign WHERE unitid = ? AND is_bid_campaign = 1";
            strArr = new String[]{str2};
        } else {
            String[] strArr2 = {str, String.valueOf(i), str2, String.valueOf(i2), String.valueOf(i3)};
            str3 = "SELECT id FROM campaign WHERE id= ? AND tab= ? AND unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            strArr = strArr2;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.close();
            return true;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }

    public List<CampaignEx> a(String str, int i, int i2, int i3) {
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (i <= 0) {
            str2 = "";
        } else {
            arrayList.add(String.valueOf(i));
            str2 = " LIMIT ?";
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?".concat(str2), (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized List<CampaignEx> a(String str, int i, int i2, int i3, boolean z) {
        ArrayList arrayList;
        String str2;
        String str3;
        arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (z) {
            str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 1";
        } else {
            str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
        }
        str3 = "";
        if (i > 0) {
            str3 = " LIMIT ?";
            arrayList.add(String.valueOf(i));
        }
        return a("SELECT * FROM campaign" + str2 + str3, (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized List<CampaignEx> a(String str, int i, int i2, int i3, String str2) {
        String str3;
        ArrayList arrayList;
        String str4;
        str3 = " WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1 AND readyState = '0'";
        arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (!TextUtils.isEmpty(str2)) {
            str3 = " WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1 AND readyState = '0' AND request_id = ? ";
            arrayList.add(str2);
        }
        str4 = "";
        if (i > 0) {
            str4 = " LIMIT ?";
            arrayList.add(String.valueOf(i));
        }
        return a("SELECT * FROM campaign" + (str3 + " order by ts ASC") + str4, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x075e, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x075c, code lost:
    
        if (r8 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0748, code lost:
    
        if (r8 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0762, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0767 A[Catch: all -> 0x076b, TRY_ENTER, TryCatch #3 {, blocks: (B:40:0x0741, B:11:0x075e, B:53:0x0767, B:54:0x076a), top: B:3:0x0002 }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> a(java.lang.String r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    private CampaignEx a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        try {
            String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                campaignEx.setPv_urls(arrayList);
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
        campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
        campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex("package_name")));
        campaignEx.setAppName(cursor.getString(cursor.getColumnIndex("app_name")));
        campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex(g.a.N)));
        campaignEx.setSize(cursor.getString(cursor.getColumnIndex("app_size")));
        campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex("image_size")));
        campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex("icon_url")));
        campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex("image_url")));
        campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex("impression_url")));
        campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex("notice_url")));
        campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
        campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex("wtick")));
        campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
        campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex("user_activation"))));
        campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
        campaignEx.setNetAddress(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)));
        campaignEx.setAc(cursor.getString(cursor.getColumnIndex("ac")));
        campaignEx.setAc_s(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH)));
        campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
        campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex("landing_type")));
        campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex("link_type")));
        campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex("click_mode")));
        campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
        campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex("number_rating")));
        campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
        campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex("ts")));
        campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex("level")));
        campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
        campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
        campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex("ad_url_list")));
        campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex("video_length")));
        campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex("video_size")));
        campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex("video_resolution")));
        campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex("endcard_click_result")));
        campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex("video_url")));
        campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex("watch_mile")));
        campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex("t_imp")));
        campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
        campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
        campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
        campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
        campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
        campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
        campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex("guidelines")));
        campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex("offer_type")));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex("html_url")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex("guidelines")));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex("html_url")));
        campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex("end_screen_url")));
        campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex("reward_name")));
        campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex("reward_amount")));
        campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
        campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
        campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
        campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
        campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
        campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex("video_end_type")));
        campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex("endcard_url")));
        campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex("playable_ads_without_video")));
        campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex("mof_template_url")));
        campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex("mof_tplid")));
        campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
        campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex("md5_file")));
        campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex("gif_url")));
        campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex("nv_t2")));
        campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
        campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex("c_ua")));
        campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex("imp_ua")));
        campaignEx.setJmPd(cursor.getInt(cursor.getColumnIndex("jm_pd")));
        campaignEx.setIsDeleted(cursor.getInt(cursor.getColumnIndex("is_deleted")));
        campaignEx.setIsClick(cursor.getInt(cursor.getColumnIndex("is_click")));
        campaignEx.setIsAddSuccesful(cursor.getInt(cursor.getColumnIndex("is_add_sucesful")));
        campaignEx.setIsDownLoadZip(cursor.getInt(cursor.getColumnIndex("is_download_zip")));
        campaignEx.setInteractiveCache(cursor.getString(cursor.getColumnIndex("ia_cache")));
        campaignEx.setKeyIaOri(cursor.getInt(cursor.getColumnIndex("ia_ori")));
        campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
        campaignEx.setFac(cursor.getInt(cursor.getColumnIndex("fac")));
        campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex("tp_offer")));
        campaignEx.setIa_ext1(cursor.getString(cursor.getColumnIndex("ia_ext1")));
        campaignEx.setIa_ext2(cursor.getString(cursor.getColumnIndex("ia_ext2")));
        campaignEx.setKeyIaRst(cursor.getInt(cursor.getColumnIndex("ia_rst")));
        campaignEx.setKeyIaUrl(cursor.getString(cursor.getColumnIndex("ia_url")));
        campaignEx.setKeyIaIcon(cursor.getString(cursor.getColumnIndex("ia_icon")));
        campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex("oc_time")));
        campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex("oc_type")));
        campaignEx.setT_list(cursor.getString(cursor.getColumnIndex("t_list")));
        campaignEx.setGhId(cursor.getString(cursor.getColumnIndex("gh_id")));
        campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex("gh_path")));
        campaignEx.setBindId(cursor.getString(cursor.getColumnIndex("bind_id")));
        String string2 = cursor.getString(cursor.getColumnIndex("adchoice"));
        if (!TextUtils.isEmpty(string2)) {
            campaignEx.setAdchoice(CampaignEx.a.c(string2));
        }
        campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
        campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
        campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex("plct")));
        campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex("plctb")));
        campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
        campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
        campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex("ad_html")));
        campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex("banner_url")));
        campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex("banner_html")));
        campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex("creative_id")));
        campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex("vid_crtv_id")));
        campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex("ec_crtv_id")));
        campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex("ec_temp_id")));
        campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
        campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BID_TOKEN)));
        campaignEx.setMraid(cursor.getString(cursor.getColumnIndex("mraid")));
        campaignEx.setIsMraid(cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1);
        campaignEx.setOmid(cursor.getString(cursor.getColumnIndex("omid")));
        campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex("ready_rate")));
        campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex("ext_data")));
        campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex("nscpt")));
        campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex("req_ext_data")));
        campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
        campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
        campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex("placement_id")));
        campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex("maitve")));
        campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex("maitve_src")));
        campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex("flb")));
        campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex("flb_skiptime")));
        campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex("cbd")));
        campaignEx.setVst(cursor.getInt(cursor.getColumnIndex("vst")));
        campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex("use_skip_time")));
        campaignEx.setProgressBarShow(cursor.getColumnIndex("prog_bar"));
        campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex("adspace_t")));
        campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
        campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
        campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
        campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex("vck_t")));
        campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex("vctn_t")));
        campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex("rs_ignc_r")));
        campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex("view_com_time")));
        campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex("aab"))));
        campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex("privacy_url")));
        campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
        campaignEx.setImpReportType(cursor.getColumnIndex("imp_report_type"));
        campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
        campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
        campaignEx.setFilterAdsVideoCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE)));
        campaignEx.setSecondRequestIndex(cursor.getInt(cursor.getColumnIndex("r_index")));
        campaignEx.setSecondShowIndex(cursor.getInt(cursor.getColumnIndex("s_show_index")));
        campaignEx.setFilterCallBackState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE)));
        campaignEx.setFilterAdsShowCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE)));
        return campaignEx;
    }

    public synchronized void a(String str, String str2) {
        try {
        } catch (Exception e) {
            o0.b("CampaignDao", e.getLocalizedMessage());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] strArr = {str, str2};
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, "unitid = ? AND bid_token = ? AND bid_token IS NOT NULL", strArr);
        }
    }
}
