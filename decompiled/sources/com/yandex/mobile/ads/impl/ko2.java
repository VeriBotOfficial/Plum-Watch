package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lo2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ko2 implements lo2.b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f16043a;
    private final po2 b;

    public ko2(po2 po2Var) {
        this.b = po2Var;
    }

    public final void a() {
        this.b.a(new to2(this));
    }

    public final JSONObject b() {
        return this.f16043a;
    }

    public final void a(JSONObject jSONObject) {
        this.f16043a = jSONObject;
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.a(new yo2(this, hashSet, jSONObject, j));
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.a(new bp2(this, hashSet, jSONObject, j));
    }
}
