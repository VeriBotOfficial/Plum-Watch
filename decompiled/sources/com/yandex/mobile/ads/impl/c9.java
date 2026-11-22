package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    private final vf1 f15169a;
    private final vf1 b;
    private final boolean c;
    private final cv d;
    private final xk0 e;

    private c9() {
        cv cvVar = cv.c;
        xk0 xk0Var = xk0.c;
        vf1 vf1Var = vf1.c;
        this.d = cvVar;
        this.e = xk0Var;
        this.f15169a = vf1Var;
        this.b = vf1Var;
        this.c = false;
    }

    public static c9 a() {
        return new c9();
    }

    public final boolean b() {
        return vf1.c == this.f15169a;
    }

    public final boolean c() {
        return vf1.c == this.b;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        io2.a(jSONObject, "impressionOwner", this.f15169a);
        io2.a(jSONObject, "mediaEventsOwner", this.b);
        io2.a(jSONObject, "creativeType", this.d);
        io2.a(jSONObject, "impressionType", this.e);
        io2.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject;
    }
}
