package com.baidu.ar;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public class xb {

    /* renamed from: a, reason: collision with root package name */
    public String f7332a;
    public boolean b;
    public String c;

    public static xb a(JSONObject jSONObject) {
        xb xbVar;
        xb xbVar2 = null;
        if (jSONObject != null) {
            try {
                xbVar = new xb();
            } catch (Exception e) {
                e = e;
            }
            try {
                if (jSONObject.has("content")) {
                    xbVar.a(jSONObject.getString("content"));
                }
                if (jSONObject.has("completed")) {
                    xbVar.a(jSONObject.getBoolean("completed"));
                }
                if (jSONObject.has("type")) {
                    xbVar.b(jSONObject.getString("type"));
                }
                return xbVar;
            } catch (Exception e2) {
                e = e2;
                xbVar2 = xbVar;
                e.printStackTrace();
                return xbVar2;
            }
        }
        return xbVar2;
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
