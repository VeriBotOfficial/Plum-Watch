package com.baidu.location.e;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.location.Jni;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes13.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f7629a;
    private final SQLiteDatabase b;
    private boolean u = true;
    private long v = 8000;
    private long w = 5000;
    private long x = 5000;
    private long y = 5000;
    private long z = 5000;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean j = false;
    private boolean k = false;
    private int l = 6;
    private int m = 30;
    private int n = 30;
    private double o = 0.0d;
    private double p = 0.0d;

    /* renamed from: q, reason: collision with root package name */
    private double f7630q = 0.0d;
    private double r = 0.0d;
    private double s = 0.0d;
    private int t = 8;
    private String[] i = new String[0];
    private final a c = new a();

    private final class a extends com.baidu.location.h.g {
        private int b;
        private long c;
        private long d;
        private boolean e;
        private final String f;

        private a() {
            this.b = 0;
            this.e = false;
            this.c = -1L;
            this.d = -1L;
            this.el = new HashMap();
            this.f = Jni.encodeOfflineLocationUpdateRequest(String.format(Locale.US, "&ver=%s&cuid=%s&prod=%s:%s&sdk=%.2f&mb=%s&os=A%s", "1", com.baidu.location.h.b.a().c, com.baidu.location.h.b.f, com.baidu.location.h.b.e, Float.valueOf(9.671f), Build.MODEL, Build.VERSION.SDK));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 519
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.e.c.a.a():void");
        }

        private boolean c() {
            if (this.b < 2) {
                return true;
            }
            if (this.c + 86400000 >= System.currentTimeMillis()) {
                return false;
            }
            this.b = 0;
            this.c = -1L;
            return true;
        }

        @Override // com.baidu.location.h.g
        public void a(boolean z) {
            String str;
            String str2;
            String str3;
            String str4;
            if (z && this.ej != null) {
                try {
                    JSONObject jSONObject = new JSONObject(this.ej);
                    long j = jSONObject.has(com.anythink.core.common.m.e.T) ? jSONObject.getLong(com.anythink.core.common.m.e.T) : 0L;
                    String string = jSONObject.has("ver") ? jSONObject.getString("ver") : "1";
                    if ((j & 1) == 1) {
                        c.this.d = true;
                    }
                    if ((j & 2) == 2) {
                        c.this.e = true;
                    }
                    if ((j & 4) == 4) {
                        c.this.f = true;
                    }
                    if ((j & 8) == 8) {
                        c.this.g = true;
                    }
                    if ((j & 16) == 16) {
                        c.this.h = true;
                    }
                    if ((j & 32) == 32) {
                        c.this.j = true;
                    }
                    if ((j & 64) == 64) {
                        c.this.k = true;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (jSONObject.has("cplist")) {
                        c.this.i = jSONObject.getString("cplist").split(";");
                        jSONObject2.put("cplist", jSONObject.getString("cplist"));
                    }
                    if (jSONObject.has("bklist")) {
                        c.this.a(jSONObject.getString("bklist").split(";"));
                    }
                    if (jSONObject.has("para")) {
                        str = string;
                        try {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("para");
                            if (jSONObject3.has("rgcgp")) {
                                str2 = "ver";
                                c.this.l = jSONObject3.getInt("rgcgp");
                            } else {
                                str2 = "ver";
                            }
                            if (jSONObject3.has("addrup")) {
                                c.this.n = jSONObject3.getInt("addrup");
                            }
                            if (jSONObject3.has("poiup")) {
                                c.this.m = jSONObject3.getInt("poiup");
                            }
                            if (jSONObject3.has("oflp")) {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("oflp");
                                if (jSONObject4.has("0")) {
                                    str3 = "poiup";
                                    str4 = "addrup";
                                    c.this.o = jSONObject4.getDouble("0");
                                } else {
                                    str3 = "poiup";
                                    str4 = "addrup";
                                }
                                if (jSONObject4.has("1")) {
                                    c.this.p = jSONObject4.getDouble("1");
                                }
                                if (jSONObject4.has("2")) {
                                    c.this.f7630q = jSONObject4.getDouble("2");
                                }
                                if (jSONObject4.has("3")) {
                                    c.this.r = jSONObject4.getDouble("3");
                                }
                                if (jSONObject4.has("4")) {
                                    c.this.s = jSONObject4.getDouble("4");
                                }
                            } else {
                                str3 = "poiup";
                                str4 = "addrup";
                            }
                            if (jSONObject3.has("onlt")) {
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("onlt");
                                if (jSONObject5.has("0")) {
                                    c.this.z = jSONObject5.getLong("0");
                                }
                                if (jSONObject5.has("1")) {
                                    c.this.y = jSONObject5.getLong("1");
                                }
                                if (jSONObject5.has("2")) {
                                    c.this.v = jSONObject5.getLong("2");
                                }
                                if (jSONObject5.has("3")) {
                                    c.this.w = jSONObject5.getLong("3");
                                }
                                if (jSONObject5.has("4")) {
                                    c.this.x = jSONObject5.getLong("4");
                                }
                            }
                            if (jSONObject3.has("minapn")) {
                                c.this.t = jSONObject3.getInt("minapn");
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        str = string;
                        str2 = "ver";
                        str3 = "poiup";
                        str4 = "addrup";
                    }
                    jSONObject2.put(Const.SP_KEY_ONCE_LOCATION, c.this.d);
                    jSONObject2.put("olv2", c.this.k);
                    jSONObject2.put("fl", c.this.e);
                    jSONObject2.put("on", c.this.f);
                    jSONObject2.put(BidResponsed.KEY_WN, c.this.g);
                    jSONObject2.put("oc", c.this.h);
                    long currentTimeMillis = System.currentTimeMillis();
                    this.d = currentTimeMillis;
                    jSONObject2.put(ak.aH, currentTimeMillis);
                    jSONObject2.put(str2, str);
                    jSONObject2.put("rgcon", c.this.j);
                    jSONObject2.put("rgcgp", c.this.l);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("0", c.this.o);
                    jSONObject6.put("1", c.this.p);
                    jSONObject6.put("2", c.this.f7630q);
                    jSONObject6.put("3", c.this.r);
                    jSONObject6.put("4", c.this.s);
                    jSONObject2.put("oflp", jSONObject6);
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("0", c.this.z);
                    jSONObject7.put("1", c.this.y);
                    jSONObject7.put("2", c.this.v);
                    jSONObject7.put("3", c.this.w);
                    jSONObject7.put("4", c.this.x);
                    jSONObject2.put("onlt", jSONObject7);
                    jSONObject2.put(str4, c.this.n);
                    jSONObject2.put(str3, c.this.m);
                    jSONObject2.put("minapn", c.this.t);
                    File file = new File(c.this.f7629a.c(), "ofl.config");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(jSONObject2.toString());
                    fileWriter.close();
                } catch (Exception unused2) {
                }
                this.e = false;
            }
            this.b++;
            this.c = System.currentTimeMillis();
            this.e = false;
        }

        @Override // com.baidu.location.h.g
        public void b() {
            this.el.clear();
            this.el.put(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "conf");
            this.el.put(HiAnalyticsConstant.Direction.REQUEST, this.f);
            this.eh = d.f7633a;
        }
    }

    c(d dVar, SQLiteDatabase sQLiteDatabase) {
        this.f7629a = dVar;
        this.b = sQLiteDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS BLACK (name VARCHAR(100) PRIMARY KEY);");
            } catch (Exception unused) {
            }
        }
        g();
    }

    int a() {
        return this.t;
    }

    long a(String str) {
        if (str.equals("2G")) {
            return this.v;
        }
        if (str.equals("3G")) {
            return this.w;
        }
        if (str.equals("4G")) {
            return this.x;
        }
        if (str.equals("WIFI")) {
            return this.y;
        }
        if (str.equals("unknown")) {
            return this.z;
        }
        return 5000L;
    }

    void a(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("(\"");
            stringBuffer.append(strArr[i]);
            stringBuffer.append("\")");
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || stringBuffer.length() <= 0) {
            return;
        }
        try {
            this.b.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO BLACK VALUES %s;", stringBuffer.toString()));
        } catch (Exception unused) {
        }
    }

    double b() {
        return this.o;
    }

    double c() {
        return this.p;
    }

    double d() {
        return this.f7630q;
    }

    double e() {
        return this.r;
    }

    double f() {
        return this.s;
    }

    void g() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    boolean h() {
        return this.d;
    }

    boolean i() {
        return this.f;
    }

    boolean j() {
        return this.g;
    }

    boolean k() {
        return this.e;
    }

    boolean l() {
        return this.j;
    }

    boolean m() {
        return this.u;
    }

    int n() {
        return this.l;
    }

    String[] o() {
        return this.i;
    }

    int p() {
        return this.n;
    }

    int q() {
        return this.m;
    }
}
