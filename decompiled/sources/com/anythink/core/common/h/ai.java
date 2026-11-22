package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ai extends ah {

    /* renamed from: a, reason: collision with root package name */
    private int f3843a;
    private long b;
    private int c;
    private String d;
    private Map<Integer, ak> e;
    private List<aj> f;
    private List<aj> g;

    private ai() {
    }

    public static ai a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        ai aiVar = new ai();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("e_cwf");
            if (optJSONObject != null) {
                aiVar.d = optJSONObject.optString("oe_ids");
                aiVar.f3843a = optJSONObject.optInt("ss_sw");
                aiVar.c = optJSONObject.optInt("sd_sw");
                aiVar.b = optJSONObject.optLong(com.qumeng.overseas.advlib.core.c.f13266a);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("oe");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        ak akVar = new ak();
                        String next = keys.next();
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                        if (optJSONObject3 != null) {
                            akVar.a(optJSONObject3.optLong(com.umeng.analytics.pro.ak.aH));
                            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("c");
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("c_m");
                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                HashMap hashMap = new HashMap();
                                int i = 0;
                                while (i < optJSONArray2.length()) {
                                    String optString = optJSONArray2.optString(i);
                                    copyOnWriteArrayList.add(optString);
                                    if (TextUtils.isEmpty(optString) || optJSONObject4 == null || (optJSONArray = optJSONObject4.optJSONArray(optString)) == null || optJSONArray.length() <= 0) {
                                        jSONObject3 = optJSONObject2;
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        int i2 = 0;
                                        while (i2 < optJSONArray.length()) {
                                            Object obj = optJSONArray.get(i2);
                                            JSONObject jSONObject4 = optJSONObject2;
                                            if ((obj instanceof String) && !TextUtils.isEmpty((CharSequence) obj)) {
                                                arrayList.add((String) obj);
                                            }
                                            i2++;
                                            optJSONObject2 = jSONObject4;
                                        }
                                        jSONObject3 = optJSONObject2;
                                        if (!arrayList.isEmpty()) {
                                            hashMap.put(optString, arrayList);
                                        }
                                    }
                                    i++;
                                    optJSONObject2 = jSONObject3;
                                }
                                jSONObject2 = optJSONObject2;
                                akVar.a(copyOnWriteArrayList);
                                if (!hashMap.isEmpty()) {
                                    akVar.a(hashMap);
                                }
                                int parseInt = Integer.parseInt(next);
                                akVar.a(parseInt);
                                concurrentHashMap.put(Integer.valueOf(parseInt), akVar);
                                optJSONObject2 = jSONObject2;
                            }
                        }
                        jSONObject2 = optJSONObject2;
                        int parseInt2 = Integer.parseInt(next);
                        akVar.a(parseInt2);
                        concurrentHashMap.put(Integer.valueOf(parseInt2), akVar);
                        optJSONObject2 = jSONObject2;
                    }
                }
                aiVar.e = concurrentHashMap;
            }
        } catch (Throwable unused) {
        }
        return aiVar;
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.d);
    }

    public final boolean b() {
        return this.f3843a == 1;
    }

    public final boolean a(long j) {
        return j > 0 && System.currentTimeMillis() - j < this.b;
    }

    public final boolean c() {
        return this.c == 1;
    }

    public final List<aj> d() {
        return this.f;
    }

    public final Map<Integer, ak> e() {
        return this.e;
    }

    public final void a(List<aj> list) {
        this.f = list;
    }

    public final void b(List<aj> list) {
        this.g = list;
    }

    public final List<aj> f() {
        return this.g;
    }

    public final String g() {
        return this.d;
    }
}
