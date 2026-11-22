package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RewardSetting.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f12658a;
    private Map<String, com.mbridge.msdk.videocommon.entity.c> b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private String j;
    private int i = 0;
    private String k = "";
    private String l = "";

    public String a() {
        return this.j;
    }

    public void b(String str) {
        this.j = str;
    }

    public void c(String str) {
        this.l = str;
    }

    public void d(String str) {
        this.k = str;
    }

    public void e(long j) {
        this.d = j;
    }

    public String f() {
        return this.l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.b;
    }

    public long h() {
        return this.d * 1000;
    }

    public long i() {
        return this.g;
    }

    public String j() {
        return this.k;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f12658a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f12658a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(com.anythink.expressad.videocommon.e.b.f5542a, jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.c);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.x, this.d);
            jSONObject.put("plct", this.e);
            jSONObject.put("dlct", this.f);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.A, this.g);
            jSONObject.put("current_time", this.h);
            jSONObject.put("vtag", this.k);
            jSONObject.put("isDefault", this.i);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }

    public void a(long j) {
        this.h = j;
    }

    public void b(long j) {
        this.f = j;
    }

    public void c(long j) {
        this.c = j;
    }

    public long d() {
        return this.c * 1000;
    }

    public long e() {
        return this.e * 1000;
    }

    public void f(long j) {
        this.g = j;
    }

    public void a(Map<String, Integer> map) {
        this.f12658a = map;
    }

    public long b() {
        return this.h;
    }

    public long c() {
        return this.f;
    }

    public void d(long j) {
        this.e = j;
    }

    public void a(int i) {
        this.i = i;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.b = map;
    }

    public static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e) {
                e = e;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(com.anythink.expressad.videocommon.e.b.f5542a);
                aVar.b(jSONObject.optString(com.anythink.expressad.f.a.b.dJ, ""));
                aVar.c(jSONObject.optString("rid", ""));
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int intValue = Integer.valueOf(optJSONObject.optInt(next, 1000)).intValue();
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && intValue == 0) {
                                hashMap.put(next, 1000);
                            } else {
                                hashMap.put(next, Integer.valueOf(intValue));
                            }
                        }
                    }
                    aVar.a(hashMap);
                }
                aVar.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                aVar.c(jSONObject.optLong("getpf", 43200L));
                aVar.e(jSONObject.optLong(com.anythink.expressad.videocommon.e.b.x, 5400L));
                aVar.d(jSONObject.optLong("plct", com.anythink.expressad.f.a.b.P));
                aVar.b(jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.P));
                aVar.f(jSONObject.optLong(com.anythink.expressad.videocommon.e.b.A, 5L));
                aVar.a(jSONObject.optLong("current_time"));
                aVar.d(jSONObject.optString("vtag", ""));
                return aVar;
            } catch (Exception e2) {
                e = e2;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
