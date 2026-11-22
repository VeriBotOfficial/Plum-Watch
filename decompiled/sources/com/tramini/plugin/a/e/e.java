package com.tramini.plugin.a.e;

import android.content.Context;
import com.tramini.plugin.a.h.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e extends a {
    public static final int p = 10001;

    /* renamed from: q, reason: collision with root package name */
    private Context f13720q;
    private String r;
    private JSONObject s;
    private JSONObject t;

    @Override // com.tramini.plugin.a.e.a
    protected final int a() {
        return 1;
    }

    @Override // com.tramini.plugin.a.e.a
    public final boolean g() {
        return false;
    }

    public e(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f13720q = context;
        this.r = str;
        this.s = jSONObject;
        this.t = jSONObject2;
    }

    @Override // com.tramini.plugin.a.e.a
    protected final String b() {
        com.tramini.plugin.a.d.c cVar = com.tramini.plugin.b.c.a(this.f13720q).b().f().get(this.r);
        com.tramini.plugin.a.a.a();
        return cVar != null ? cVar.f13717a : com.tramini.plugin.a.a.c();
    }

    @Override // com.tramini.plugin.a.e.a
    protected final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.tramini.plugin.a.e.a
    protected final byte[] d() {
        return b(f());
    }

    @Override // com.tramini.plugin.a.e.a
    protected final JSONObject e() {
        JSONObject jSONObject = this.s;
        return jSONObject == null ? super.e() : jSONObject;
    }

    @Override // com.tramini.plugin.a.e.a
    protected final String f() {
        JSONObject jSONObject = new JSONObject();
        String b = com.tramini.plugin.a.h.c.b(e().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.t);
        String b2 = com.tramini.plugin.a.h.c.b(jSONArray.toString());
        String a2 = f.a("d_version=1.0&dt=" + b2 + "&cm=" + b);
        try {
            jSONObject.put("cm", b);
            jSONObject.put(com.qumeng.overseas.advlib.core.c.f13266a, b2);
            jSONObject.put("d_version", "1.0");
            jSONObject.put("d_sign", a2);
            jSONObject.put("pl_c", "5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.tramini.plugin.a.e.a
    protected final Object a(String str) {
        return str.trim();
    }
}
