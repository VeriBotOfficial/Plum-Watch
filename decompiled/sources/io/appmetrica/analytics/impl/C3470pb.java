package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3470pb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f18450a;
    public final String b;
    public final int c;
    public final HashMap d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final CounterConfigurationReporterType i;
    public final String j;

    public C3470pb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f18450a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.b = jSONObject2.getString("name");
        this.c = jSONObject2.getInt("bytes_truncated");
        this.j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.d = new HashMap();
        if (optString != null) {
            try {
                HashMap c = AbstractC3395mb.c(optString);
                if (c != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        this.d.put(EnumC3164d4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.e = jSONObject3.getString("package_name");
        this.f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.g = jSONObject3.getString(com.anythink.core.common.d.g.c);
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.h = jSONObject4.getString("api_key");
        this.i = a(jSONObject4);
    }

    public final String a() {
        return this.h;
    }

    public final int b() {
        return this.c;
    }

    public final byte[] c() {
        return this.f18450a;
    }

    public final String d() {
        return this.j;
    }

    public final String e() {
        return this.b;
    }

    public final String f() {
        return this.e;
    }

    public final Integer g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final CounterConfigurationReporterType i() {
        return this.i;
    }

    public final HashMap<EnumC3164d4, Integer> j() {
        return this.d;
    }

    public final String k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            hashMap.put(((EnumC3164d4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f).put(com.anythink.core.common.d.g.c, this.g).put("package_name", this.e)).put("reporter_configuration", new JSONObject().put("api_key", this.h).put("reporter_type", this.i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f18450a, 0)).put("name", this.b).put("bytes_truncated", this.c).put("trimmed_fields", AbstractC3395mb.b(hashMap)).putOpt("environment", this.j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C3470pb(C3091a6 c3091a6, C3114b4 c3114b4, HashMap<EnumC3164d4, Integer> hashMap) {
        this.f18450a = c3091a6.getValueBytes();
        this.b = c3091a6.getName();
        this.c = c3091a6.getBytesTruncated();
        if (hashMap != null) {
            this.d = hashMap;
        } else {
            this.d = new HashMap();
        }
        C3474pf a2 = c3114b4.a();
        this.e = a2.f();
        this.f = a2.g();
        this.g = a2.h();
        CounterConfiguration b = c3114b4.b();
        this.h = b.getApiKey();
        this.i = b.getReporterType();
        this.j = c3091a6.f();
    }
}
