package com.anythink.core.d;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4513a = 1;
    public static final int b = 3;
    public static final int c = 3;
    public static final int e = 5;
    public static final long f = 604800000;
    private int g;
    private a h;
    private JSONObject i;
    private long j;
    private long k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4514a;
        public int b;
        public int c;
    }

    private long d() {
        return this.k;
    }

    private void a(long j) {
        this.k = j;
    }

    public final int a() {
        return this.g;
    }

    private void a(int i) {
        this.g = i;
    }

    public final a b() {
        return this.h;
    }

    private void a(a aVar) {
        this.h = aVar;
    }

    private JSONObject e() {
        return this.i;
    }

    private void e(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    private long f() {
        return this.j;
    }

    private void b(long j) {
        this.j = j;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static String f4515a = "adap_c";
        public static String b = "updateTime";
        private static String c = "rule";
        private static String d = "group_st";
        private static String e = "num";
        private static String f = "value_times";
        private static String g = "cold_times";
        private static String h = "st_timeout";
    }

    public static h a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        h hVar = new h();
        try {
            hVar.b(jSONObject);
            hVar.c(jSONObject);
            hVar.d(jSONObject);
            hVar.g = jSONObject.optInt(b.c, 1);
            String optString = jSONObject.optString(b.d);
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    a aVar = new a();
                    aVar.f4514a = jSONObject2.optInt(b.e, 3);
                    aVar.b = jSONObject2.optInt(b.f, 3);
                    aVar.c = jSONObject2.optInt(b.g, 5);
                    hVar.h = aVar;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            hVar.i = jSONObject.optJSONObject(b.f4515a);
            hVar.k = jSONObject.optLong(b.b, 0L);
            hVar.j = jSONObject.optLong(b.h, 604800000L);
        } catch (Throwable unused) {
        }
        return hVar;
    }

    public final boolean c() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.k > this.j;
    }
}
