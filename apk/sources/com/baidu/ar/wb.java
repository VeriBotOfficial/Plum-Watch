package com.baidu.ar;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7306a;
    public int b;
    public String c;

    public static wb a(String str) {
        wb wbVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            wb wbVar2 = new wb();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("action")) {
                    wbVar2.b(jSONObject.getString("action"));
                }
                if (jSONObject.has("code")) {
                    wbVar2.a(jSONObject.getInt("code"));
                }
                if (jSONObject.has("message")) {
                    wbVar2.d(jSONObject.getString("message"));
                }
                if (jSONObject.has(com.qumeng.overseas.advlib.trdparty.unionset.common.h.A)) {
                    wbVar2.e(jSONObject.getString(com.qumeng.overseas.advlib.trdparty.unionset.common.h.A));
                }
                if (jSONObject.has("body")) {
                    wbVar2.c(jSONObject.getString("body"));
                }
                return wbVar2;
            } catch (Exception e) {
                e = e;
                wbVar = wbVar2;
                e.printStackTrace();
                return wbVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public String a() {
        return this.f7306a;
    }

    public void a(int r1) {
        this.b = r1;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.f7306a = str;
    }

    public int c() {
        return this.b;
    }

    public void c(String str) {
        this.c = str;
    }

    public void d(String str) {
    }

    public boolean d() {
        return c() == 0;
    }

    public void e(String str) {
    }
}
