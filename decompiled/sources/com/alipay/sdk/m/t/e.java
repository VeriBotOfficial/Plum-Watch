package com.alipay.sdk.m.t;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.s.b;
import com.alipay.sdk.m.y.f;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.p;
import com.alipay.sdk.m.y.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class e {
    public static final String c = "msp-gzip";
    public static final String d = "Msp-Param";
    public static final String e = "Operation-Type";
    public static final String f = "content-type";
    public static final String g = "Version";
    public static final String h = "AppId";
    public static final String i = "des-mode";
    public static final String j = "namespace";
    public static final String k = "api_name";
    public static final String l = "api_version";
    public static final String m = "data";
    public static final String n = "params";
    public static final String o = "public_key";
    public static final String p = "device";

    /* renamed from: q, reason: collision with root package name */
    public static final String f1459q = "action";
    public static final String r = "type";
    public static final String s = "method";

    /* renamed from: a, reason: collision with root package name */
    public boolean f1460a = true;
    public boolean b = true;

    public Map<String, String> a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(c, String.valueOf(z));
        hashMap.put(e, "alipay.msp.cashier.dispatch.bytes");
        hashMap.put(f, "application/octet-stream");
        hashMap.put(g, "2.0");
        hashMap.put(h, "TAOBAO");
        hashMap.put(d, a.a(str));
        hashMap.put(i, "CBC");
        return hashMap;
    }

    public abstract JSONObject a() throws JSONException;

    public String b() {
        return "4.9.0";
    }

    public abstract boolean c();

    public String a(com.alipay.sdk.m.w.a aVar) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put(l, b());
        return a(aVar, hashMap, new HashMap<>());
    }

    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String a(com.alipay.sdk.m.w.a aVar, String str, JSONObject jSONObject) {
        com.alipay.sdk.m.w.b c2 = com.alipay.sdk.m.w.b.c();
        com.alipay.sdk.m.x.a a2 = com.alipay.sdk.m.x.a.a(c2.b());
        JSONObject a3 = f.a(new JSONObject(), jSONObject);
        try {
            a3.put(com.alipay.sdk.m.n.b.d, str);
            a3.put("tid", a2.f());
            a3.put(com.alipay.sdk.m.n.b.b, c2.a().a(aVar, a2, c()));
            a3.put(com.alipay.sdk.m.n.b.e, q.a(aVar, c2.b(), com.alipay.sdk.m.l.a.d, false));
            a3.put(com.alipay.sdk.m.n.b.f, q.h(c2.b()));
            a3.put("app_key", com.alipay.sdk.m.n.a.h);
            a3.put(com.alipay.sdk.m.n.b.g, c2.d());
            a3.put(com.alipay.sdk.m.n.b.j, a2.e());
            a3.put(com.alipay.sdk.m.n.b.k, com.alipay.sdk.m.o.c.b(c2.b()));
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.l, "BodyErr", th);
            g.a(th);
        }
        return a3.toString();
    }

    public static boolean a(b.C0099b c0099b) {
        return Boolean.valueOf(a(c0099b, c)).booleanValue();
    }

    public static String a(b.C0099b c0099b, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (c0099b == null || str == null || (map = c0099b.f1452a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public String a(com.alipay.sdk.m.w.a aVar, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public static boolean a(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str).getJSONObject("data");
        } catch (JSONException e2) {
            g.a(e2);
        }
        if (!jSONObject.has("params")) {
            return false;
        }
        String optString = jSONObject.getJSONObject("params").optString(o, null);
        if (!TextUtils.isEmpty(optString)) {
            com.alipay.sdk.m.o.c.a(optString);
            return true;
        }
        return false;
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context) throws Throwable {
        return a(aVar, context, "");
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context, String str) throws Throwable {
        return a(aVar, context, str, p.b(context));
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) throws Throwable {
        return a(aVar, context, str, str2, true);
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2, boolean z) throws Throwable {
        g.b(com.alipay.sdk.m.n.a.B, "Packet: " + str2);
        c cVar = new c(this.b);
        b bVar = new b(a(aVar), a(aVar, str, a()));
        Map<String, String> a2 = a(false, str);
        d a3 = cVar.a(bVar, this.f1460a, a2.get("iSr"));
        b.C0099b a4 = com.alipay.sdk.m.s.b.a(context, new b.a(str2, a(a3.b(), str), a3.a()));
        if (a4 != null) {
            b a5 = cVar.a(new d(a(a4), a4.c), a2.get("iSr"));
            return (a5 != null && a(a5.b()) && z) ? a(aVar, context, str, str2, false) : a5;
        }
        throw new RuntimeException("Response is null.");
    }
}
