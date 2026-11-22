package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Y8 {

    /* renamed from: a, reason: collision with root package name */
    public final Un f18150a;

    public Y8(Un un) {
        this.f18150a = un;
    }

    public final void a(int i, long j) {
        JSONObject optJSONObject;
        Un un = this.f18150a;
        synchronized (un) {
            optJSONObject = un.f18102a.a().optJSONObject("numbers_of_type");
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put(String.valueOf(i), j);
        this.f18150a.a(optJSONObject);
    }
}
