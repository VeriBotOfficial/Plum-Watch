package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class a implements com.anythink.expressad.g.b, Serializable {
    private static String c = "a";

    /* renamed from: a, reason: collision with root package name */
    public int f4772a;
    public int b;

    private int b() {
        return this.f4772a;
    }

    private void a(int i) {
        this.f4772a = i;
    }

    private int c() {
        return this.b;
    }

    private void b(int i) {
        this.b = i;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            if (jSONObject.has("hlp")) {
                aVar.b = jSONObject.optInt("hlp");
            }
            if (jSONObject.has(com.anythink.expressad.foundation.g.g.a.b.aw)) {
                aVar.f4772a = jSONObject.optInt(com.anythink.expressad.foundation.g.g.a.b.aw);
            }
            return aVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.b);
            jSONObject.put(com.anythink.expressad.foundation.g.g.a.b.aw, this.f4772a);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
