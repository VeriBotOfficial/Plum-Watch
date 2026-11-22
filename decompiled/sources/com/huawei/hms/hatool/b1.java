package com.huawei.hms.hatool;

import android.text.TextUtils;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes14.dex */
public class b1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    private String f10395a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f10395a);
        jSONObject.put("eventtime", this.d);
        jSONObject.put("event", this.b);
        jSONObject.put("event_session_name", this.e);
        jSONObject.put("first_session_event", this.f);
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        jSONObject.put(DOMConstants.TAG_PROPERTIES, new JSONObject(this.c));
        return jSONObject;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optString("event");
        this.c = jSONObject.optString(DOMConstants.TAG_PROPERTIES);
        this.c = n.a(this.c, o0.d().a());
        this.f10395a = jSONObject.optString("type");
        this.d = jSONObject.optString("eventtime");
        this.e = jSONObject.optString("event_session_name");
        this.f = jSONObject.optString("first_session_event");
    }

    public String b() {
        return this.d;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.f10395a;
    }

    public void c(String str) {
        this.d = str;
    }

    public JSONObject d() {
        JSONObject a2 = a();
        a2.put(DOMConstants.TAG_PROPERTIES, n.b(this.c, o0.d().a()));
        return a2;
    }

    public void d(String str) {
        this.f10395a = str;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(String str) {
        this.e = str;
    }
}
