package com.baidu.ar;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7332a;
    public boolean b;
    public String c;

    public static xb a(JSONObject jSONObject) {
        xb xbVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            xb xbVar2 = new xb();
            try {
                if (jSONObject.has("content")) {
                    xbVar2.a(jSONObject.getString("content"));
                }
                if (jSONObject.has("completed")) {
                    xbVar2.a(jSONObject.getBoolean("completed"));
                }
                if (jSONObject.has("type")) {
                    xbVar2.b(jSONObject.getString("type"));
                }
                return xbVar2;
            } catch (Exception e) {
                e = e;
                xbVar = xbVar2;
                e.printStackTrace();
                return xbVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public String a() {
        return this.f7332a;
    }

    public void a(String str) {
        this.f7332a = str;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public boolean c() {
        return this.b;
    }
}
