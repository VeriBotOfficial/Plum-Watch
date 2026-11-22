package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5541a = 1000;
    public static final int b = 1000;
    private Map<String, Integer> c;
    private Map<String, com.anythink.expressad.videocommon.c.c> d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;

    private long k() {
        return this.e * 1000;
    }

    public final void a() {
        this.e = 43200L;
    }

    private long l() {
        return this.f * 1000;
    }

    public final void b() {
        this.f = 5400L;
    }

    public final long c() {
        return this.g * 1000;
    }

    public final void d() {
        this.g = com.anythink.expressad.f.a.b.P;
    }

    public final long e() {
        return this.h;
    }

    public final void f() {
        this.h = com.anythink.expressad.f.a.b.P;
    }

    public final long g() {
        return this.i;
    }

    public final void h() {
        this.i = 5L;
    }

    private long m() {
        return this.j;
    }

    private void a(long j) {
        this.j = j;
    }

    private Map<String, Integer> n() {
        if (this.c == null) {
            HashMap hashMap = new HashMap();
            this.c = hashMap;
            hashMap.put("1", 1000);
            this.c.put("9", 1000);
            this.c.put("8", 1000);
        }
        return this.c;
    }

    public final void a(Map<String, Integer> map) {
        this.c = map;
    }

    public final Map<String, com.anythink.expressad.videocommon.c.c> i() {
        return this.d;
    }

    public final void b(Map<String, com.anythink.expressad.videocommon.c.c> map) {
        this.d = map;
    }

    private static a a(String str) {
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
                JSONObject optJSONObject = jSONObject.optJSONObject(b.f5542a);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int optInt = optJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && optInt == 0) {
                                hashMap.put(next, 1000);
                            } else {
                                hashMap.put(next, Integer.valueOf(optInt));
                            }
                        }
                    }
                    aVar.c = hashMap;
                }
                aVar.d = com.anythink.expressad.videocommon.c.c.a(jSONObject.optJSONArray("reward"));
                aVar.e = jSONObject.optLong("getpf", 43200L);
                aVar.f = jSONObject.optLong(b.x, 5400L);
                aVar.g = jSONObject.optLong("plct", com.anythink.expressad.f.a.b.P);
                aVar.h = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.P);
                aVar.i = jSONObject.optLong(b.A, 5L);
                aVar.j = jSONObject.optLong("current_time");
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

    private static a o() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.c = hashMap;
        aVar.d = hashMap2;
        aVar.e = 43200L;
        aVar.f = 5400L;
        aVar.g = com.anythink.expressad.f.a.b.P;
        aVar.h = com.anythink.expressad.f.a.b.P;
        aVar.i = 5L;
        return aVar;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.c;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(b.f5542a, jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, com.anythink.expressad.videocommon.c.c> map2 = this.d;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.anythink.expressad.videocommon.c.c> entry2 : this.d.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.anythink.expressad.videocommon.c.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.a());
                            jSONObject3.put("amount", value.b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.e);
            jSONObject.put(b.x, this.f);
            jSONObject.put("plct", this.g);
            jSONObject.put("dlct", this.h);
            jSONObject.put(b.A, this.i);
            jSONObject.put("current_time", this.j);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
