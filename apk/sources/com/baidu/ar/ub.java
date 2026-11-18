package com.baidu.ar;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7243a;
    public String b;

    public String a() {
        return this.f7243a;
    }

    public void a(String str) {
        this.f7243a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", a());
            jSONObject.put(com.heytap.mcssdk.constant.b.z, b());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
