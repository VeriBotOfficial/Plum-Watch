package com.baidu.ar;

import android.gov.nist.javax.sip.header.ParameterNames;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7259a;
    public String b;
    public String c;
    public String d;

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.c = str;
    }

    public String d() {
        return this.f7259a;
    }

    public void d(String str) {
        this.f7259a = str;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.qumeng.overseas.advlib.trdparty.unionset.common.h.A, d());
            jSONObject.put("action", a());
            jSONObject.put(ParameterNames.RENDER, c());
            jSONObject.put("body", b());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
