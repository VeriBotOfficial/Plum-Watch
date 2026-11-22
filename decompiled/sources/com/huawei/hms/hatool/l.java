package com.huawei.hms.hatool;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class l extends t {
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    protected String f = "";
    private String g;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f10431a);
        jSONObject.put("oaid", this.g);
        jSONObject.put(CommonUrlParts.UUID, this.f);
        jSONObject.put("upid", this.e);
        jSONObject.put(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o, this.b);
        jSONObject.put("sn", this.c);
        jSONObject.put("udid", this.d);
        return jSONObject;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.g = str;
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void g(String str) {
        this.f = str;
    }
}
