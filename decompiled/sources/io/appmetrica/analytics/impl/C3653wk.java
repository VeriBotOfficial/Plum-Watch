package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3653wk {

    /* renamed from: a, reason: collision with root package name */
    public final String f18568a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public C3653wk(JSONObject jSONObject) {
        this.f18568a = jSONObject.optString("analyticsSdkVersionName", "");
        this.b = jSONObject.optString("kitBuildNumber", "");
        this.c = jSONObject.optString("appVer", "");
        this.d = jSONObject.optString("appBuild", "");
        this.e = jSONObject.optString("osVer", "");
        this.f = jSONObject.optInt("osApiLev", -1);
        this.g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f18568a + "', kitBuildNumber='" + this.b + "', appVersion='" + this.c + "', appBuild='" + this.d + "', osVersion='" + this.e + "', apiLevel=" + this.f + ", attributionId=" + this.g + ')';
    }
}
