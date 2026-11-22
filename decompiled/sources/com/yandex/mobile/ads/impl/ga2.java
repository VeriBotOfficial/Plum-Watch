package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ga2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15571a;
    private final Float b;
    private final boolean c = true;
    private final oj1 d;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f15571a);
            if (this.f15571a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put(NativeAdvancedJsUtils.k, this.c);
            jSONObject.put("position", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    private ga2(boolean z, Float f, oj1 oj1Var) {
        this.f15571a = z;
        this.b = f;
        this.d = oj1Var;
    }

    public static ga2 a(oj1 oj1Var) {
        return new ga2(false, null, oj1Var);
    }

    public static ga2 a(float f, oj1 oj1Var) {
        return new ga2(true, Float.valueOf(f), oj1Var);
    }
}
