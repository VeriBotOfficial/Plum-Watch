package com.tramini.plugin.b;

import android.text.TextUtils;
import com.anythink.core.common.m.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends com.tramini.plugin.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13752a = "b";
    private String b;
    private long c;
    private List d;
    private ConcurrentHashMap<String, com.tramini.plugin.a.d.c> e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private int n;
    private int o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    private String f13753q;
    private String r;
    private String s;

    public final int b() {
        return this.o;
    }

    private void a(int i) {
        this.o = i;
    }

    public final String c() {
        return this.b;
    }

    private void b(String str) {
        this.b = str;
    }

    public final long d() {
        return this.c;
    }

    private void a(long j) {
        this.c = j;
    }

    public final List<String> e() {
        return this.d;
    }

    private void a(List list) {
        this.d = list;
    }

    public final ConcurrentHashMap<String, com.tramini.plugin.a.d.c> f() {
        return this.e;
    }

    private void a(ConcurrentHashMap<String, com.tramini.plugin.a.d.c> concurrentHashMap) {
        this.e = concurrentHashMap;
    }

    public final String g() {
        return this.f;
    }

    private void c(String str) {
        this.f = str;
    }

    public final String h() {
        return this.g;
    }

    private void d(String str) {
        this.g = str;
    }

    public final String i() {
        return this.h;
    }

    private void e(String str) {
        this.h = str;
    }

    public final String j() {
        return this.i;
    }

    private void f(String str) {
        this.i = str;
    }

    private void g(String str) {
        this.j = str;
    }

    public final String k() {
        return this.j;
    }

    private String q() {
        return this.k;
    }

    private void h(String str) {
        this.k = str;
    }

    public final String l() {
        return this.l;
    }

    private void i(String str) {
        this.l = str;
    }

    public final String m() {
        return this.m;
    }

    private void j(String str) {
        this.m = str;
    }

    public final int n() {
        return this.n;
    }

    private void b(int i) {
        this.n = i;
    }

    public final String o() {
        return this.p;
    }

    private void k(String str) {
        this.p = str;
    }

    public final String p() {
        return this.f13753q;
    }

    private void l(String str) {
        this.f13753q = str;
    }

    private String r() {
        return this.r;
    }

    private void m(String str) {
        this.r = str;
    }

    private String s() {
        return this.s;
    }

    private void n(String str) {
        this.s = str;
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static String f13754a = "cached";
        public static String b = "n_cache";
        private static String c = "si";
        private static String d = "scto";
        private static String e = "tf";
        private static String f = "nl";
        private static String g = "t_sw";
        private static String h = "att_sw";
        private static String i = "plst_addr";
        private static String j = "pltk_addr";
        private static String k = "cn_plst_addr";
        private static String l = "cn_pltk_addr";

        a() {
        }
    }

    public static b a(String str) {
        JSONArray jSONArray;
        int length;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.b(jSONObject);
            bVar.c(jSONObject);
            bVar.d(jSONObject);
            if (jSONObject.isNull(a.c)) {
                bVar.b = "";
            } else {
                bVar.b = jSONObject.optString(a.c);
            }
            if (jSONObject.isNull(a.d)) {
                bVar.c = 3600000L;
            } else {
                bVar.c = jSONObject.optInt(a.d);
            }
            if (jSONObject.isNull(a.h)) {
                bVar.o = 0;
            } else {
                bVar.o = jSONObject.optInt(a.h);
            }
            if (!jSONObject.isNull(a.i)) {
                bVar.p = jSONObject.optString(a.i);
            }
            if (!jSONObject.isNull(a.j)) {
                bVar.f13753q = jSONObject.optString(a.j);
            }
            if (!jSONObject.isNull(a.k)) {
                bVar.r = jSONObject.optString(a.k);
            }
            if (!jSONObject.isNull(a.l)) {
                bVar.s = jSONObject.optString(a.l);
            }
            if (!jSONObject.isNull(a.e)) {
                ConcurrentHashMap<String, com.tramini.plugin.a.d.c> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(a.e));
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            com.tramini.plugin.a.d.c cVar = new com.tramini.plugin.a.d.c();
                            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                            cVar.d = optJSONObject.optString("pml");
                            cVar.f13717a = optJSONObject.optString("uu");
                            cVar.b = optJSONObject.optInt("dmin");
                            cVar.c = optJSONObject.optInt("dmax");
                            if (optJSONObject.has("p_s") && !TextUtils.isEmpty(optJSONObject.optString("p_s"))) {
                                cVar.e = new JSONArray(optJSONObject.optString("p_s"));
                            }
                            concurrentHashMap.put(next, cVar);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                bVar.e = concurrentHashMap;
            }
            if (!jSONObject.isNull(a.f)) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString(a.f));
                bVar.f = jSONObject3.optString("p1");
                bVar.g = jSONObject3.optString(e.W);
                bVar.h = jSONObject3.optString("p3");
                bVar.i = jSONObject3.optString("p4");
                bVar.j = jSONObject3.optString("p5");
                bVar.k = jSONObject3.optString("p6");
                bVar.l = jSONObject3.optString("p7");
                bVar.m = jSONObject3.optString("p8");
                if (!jSONObject3.isNull("notifications") && (length = (jSONArray = new JSONArray(jSONObject3.optString("notifications"))).length()) > 0) {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    bVar.d = arrayList;
                }
            }
            if (jSONObject.isNull(a.g)) {
                bVar.n = 0;
            } else {
                bVar.n = jSONObject.optInt(a.g);
            }
            return bVar;
        } catch (JSONException unused3) {
            return null;
        }
    }
}
