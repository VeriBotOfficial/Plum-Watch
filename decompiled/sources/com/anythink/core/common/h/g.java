package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f3913a;
    public long b;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3913a = jSONObject.optInt("number");
            this.b = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.f3913a);
            jSONObject.put("loadTime", this.b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
