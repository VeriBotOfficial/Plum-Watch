package com.tramini.plugin.b;

import android.text.TextUtils;
import com.tramini.plugin.b.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f13751a;
    private Map<String, String> b;
    private Map<String, String> c;
    private Map<String, String> d;

    public final void a(JSONObject jSONObject) {
        String optString = jSONObject.optString(b.a.f13754a);
        Map<String, String> a2 = a();
        if (TextUtils.isEmpty(optString) || this.f13751a == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(optString);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString2 = jSONObject2.optString(next);
                String str = a2.get(next);
                jSONObject.put(next, this.f13751a.opt(next));
                if (!TextUtils.equals(optString2, str)) {
                    com.tramini.plugin.a.a.a.a(next, optString2, str);
                    jSONObject2.put(next, str);
                }
            }
            jSONObject.put(b.a.f13754a, jSONObject2.toString());
        } catch (Throwable unused) {
        }
    }

    private JSONObject b() {
        return this.f13751a;
    }

    public final void b(JSONObject jSONObject) {
        this.f13751a = jSONObject;
    }

    private Map<String, String> c() {
        return this.b;
    }

    public final void c(JSONObject jSONObject) {
        String optString = jSONObject.optString(b.a.f13754a);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(optString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.b = hashMap;
    }

    private Map<String, String> d() {
        return this.c;
    }

    public final void d(JSONObject jSONObject) {
        String optString = jSONObject.optString(b.a.b);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(optString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.c = hashMap;
    }

    public final synchronized Map<String, String> a() {
        if (this.d == null) {
            HashMap hashMap = new HashMap();
            this.d = hashMap;
            Map<String, String> map = this.b;
            if (map != null) {
                hashMap.putAll(map);
            }
            Map<String, String> map2 = this.c;
            if (map2 != null) {
                this.d.putAll(map2);
            }
        }
        return this.d;
    }
}
