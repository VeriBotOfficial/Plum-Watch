package com.baidu.ar;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class wb {

    /* renamed from: a, reason: collision with root package name */
    public String f7306a;
    public int b;
    public String c;

    public static wb a(String str) {
        wb wbVar;
        wb wbVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                wbVar = new wb();
            } catch (Exception e) {
                e = e;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("action")) {
                    wbVar.b(jSONObject.getString("action"));
                }
                if (jSONObject.has("code")) {
                    wbVar.a(jSONObject.getInt("code"));
                }
                if (jSONObject.has("message")) {
                    wbVar.d(jSONObject.getString("message"));
                }
                if (jSONObject.has(com.qumeng.overseas.advlib.trdparty.unionset.common.h.A)) {
                    wbVar.e(jSONObject.getString(com.qumeng.overseas.advlib.trdparty.unionset.common.h.A));
                }
                if (jSONObject.has("body")) {
                    wbVar.c(jSONObject.getString("body"));
                }
                return wbVar;
            } catch (Exception e2) {
                e = e2;
                wbVar2 = wbVar;
                e.printStackTrace();
                return wbVar2;
            }
        }
        return wbVar2;
    }

    public String a() {
        return this.f7306a;
    }

    public void a(int i) {
        this.b = i;
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
