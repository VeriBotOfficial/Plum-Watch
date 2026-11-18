package com.baidu.mapauto.auth.base;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8246a;
    public final JSONObject b;

    public b(String str) {
        JSONObject jSONObject;
        this.f8246a = str;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        this.b = jSONObject;
    }
}
