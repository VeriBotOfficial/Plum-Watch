package com.anythink.core.common.h;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3835a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public int d = 1;
    public int e = 1;
    public int f = 1;
    public int g = 1;
    public int h = 1;

    private aa() {
    }

    public static aa a() {
        aa aaVar = new aa();
        aaVar.d = 3;
        aaVar.e = 3;
        aaVar.f = 3;
        aaVar.g = 3;
        aaVar.h = 1;
        return aaVar;
    }

    public static aa a(String str) {
        aa aaVar = new aa();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aaVar.d = jSONObject.optInt("b_e", 1);
            aaVar.e = jSONObject.optInt("r_s", 1);
            aaVar.f = jSONObject.optInt("r_f", 1);
            aaVar.g = jSONObject.optInt("g_ad", 1);
            aaVar.h = jSONObject.optInt("ip_af", 1);
        } catch (Throwable unused) {
        }
        return aaVar;
    }

    public final String toString() {
        return super.toString();
    }
}
