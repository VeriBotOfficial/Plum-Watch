package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f14382a;

    /* renamed from: a, reason: collision with other field name */
    private Context f125a;

    /* renamed from: a, reason: collision with other field name */
    private a f126a;

    /* renamed from: a, reason: collision with other field name */
    String f127a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, a> f128a;

    /* renamed from: a, reason: collision with other method in class */
    public static b m11808a(Context context) {
        if (f14382a == null) {
            synchronized (b.class) {
                if (f14382a == null) {
                    f14382a = new b(context);
                }
            }
        }
        return f14382a;
    }

    private b(Context context) {
        this.f125a = context;
        c();
    }

    private void c() {
        this.f126a = new a(this.f125a);
        this.f128a = new HashMap();
        SharedPreferences a2 = a(this.f125a);
        this.f126a.f130a = a2.getString("appId", null);
        this.f126a.b = a2.getString("appToken", null);
        this.f126a.c = a2.getString("regId", null);
        this.f126a.d = a2.getString("regSec", null);
        this.f126a.e = a2.getString("vName", null);
        this.f126a.f131a = a2.getBoolean("valid", true);
        this.f126a.f132b = a2.getBoolean("paused", false);
        this.f126a.f14383a = a2.getInt("envType", 1);
        this.f126a.f = a2.getString("regResource", null);
        this.f126a.g = a2.getString("appRegion", null);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11812a() {
        Context context = this.f125a;
        return !TextUtils.equals(com.xiaomi.push.g.m12179a(context, context.getPackageName()), this.f126a.e);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11811a(String str) {
        SharedPreferences.Editor edit = a(this.f125a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f126a.e = str;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m11815b() {
        if (this.f126a.m11822a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.m11781a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11809a() {
        return this.f126a.f130a;
    }

    public String b() {
        return this.f126a.b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m11816c() {
        return this.f126a.c;
    }

    public String d() {
        return this.f126a.d;
    }

    public String e() {
        return this.f126a.f;
    }

    public boolean a(String str, String str2) {
        return this.f126a.m11823a(str, str2);
    }

    public String f() {
        return this.f126a.g;
    }

    public void a(String str, String str2, String str3) {
        this.f126a.a(str, str2, str3);
    }

    public void b(String str, String str2, String str3) {
        this.f126a.b(str, str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11810a() {
        this.f126a.m11821a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m11817c() {
        return this.f126a.m11822a();
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m11818d() {
        return (TextUtils.isEmpty(this.f126a.f130a) || TextUtils.isEmpty(this.f126a.b) || TextUtils.isEmpty(this.f126a.c) || TextUtils.isEmpty(this.f126a.d)) ? false : true;
    }

    public a a(String str) {
        if (this.f128a.containsKey(str)) {
            return this.f128a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a2 = a(this.f125a);
        if (!a2.contains(str2)) {
            return null;
        }
        a a3 = a.a(this.f125a, a2.getString(str2, ""));
        this.f128a.put(str2, a3);
        return a3;
    }

    public void a(String str, a aVar) {
        this.f128a.put(str, aVar);
        a(this.f125a).edit().putString("hybrid_app_info_" + str, a.a(aVar)).commit();
    }

    public void b(String str) {
        this.f128a.remove(str);
        a(this.f125a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11813a(String str, String str2, String str3) {
        a a2 = a(str3);
        return a2 != null && TextUtils.equals(str, a2.f130a) && TextUtils.equals(str2, a2.b);
    }

    public static class a {

        /* renamed from: a, reason: collision with other field name */
        private Context f129a;

        /* renamed from: a, reason: collision with other field name */
        public String f130a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        /* renamed from: a, reason: collision with other field name */
        public boolean f131a = true;

        /* renamed from: b, reason: collision with other field name */
        public boolean f132b = false;

        /* renamed from: a, reason: collision with root package name */
        public int f14383a = 1;

        public a(Context context) {
            this.f129a = context;
        }

        public void a(String str, String str2, String str3) {
            this.f130a = str;
            this.b = str2;
            this.f = str3;
            SharedPreferences.Editor edit = b.a(this.f129a).edit();
            edit.putString("appId", this.f130a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public void b(String str, String str2, String str3) {
            this.c = str;
            this.d = str2;
            this.e = a();
            this.f131a = true;
            this.g = str3;
            SharedPreferences.Editor edit = b.a(this.f129a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("vName", a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        public void c(String str, String str2, String str3) {
            this.f130a = str;
            this.b = str2;
            this.f = str3;
        }

        public void a(String str, String str2) {
            this.c = str;
            this.d = str2;
            this.e = a();
            this.f131a = true;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m11823a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f130a, str);
            boolean equals2 = TextUtils.equals(this.b, str2);
            boolean isEmpty = TextUtils.isEmpty(this.c);
            boolean z = !isEmpty;
            boolean isEmpty2 = TextUtils.isEmpty(this.d);
            boolean z2 = !isEmpty2;
            boolean z3 = equals && equals2 && !isEmpty && !isEmpty2;
            if (!z3) {
                com.xiaomi.channel.commonutils.logger.b.e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s", Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(z), Boolean.valueOf(z2)));
            }
            return z3;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m11822a() {
            return m11823a(this.f130a, this.b);
        }

        private String a() {
            Context context = this.f129a;
            return com.xiaomi.push.g.m12179a(context, context.getPackageName());
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m11821a() {
            b.a(this.f129a).edit().clear().commit();
            this.f130a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f131a = false;
            this.f132b = false;
            this.g = null;
            this.f14383a = 1;
        }

        public void a(boolean z) {
            this.f132b = z;
        }

        public void a(int i) {
            this.f14383a = i;
        }

        public void b() {
            this.f131a = false;
            b.a(this.f129a).edit().putBoolean("valid", this.f131a).commit();
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f130a = jSONObject.getString("appId");
                aVar.b = jSONObject.getString("appToken");
                aVar.c = jSONObject.getString("regId");
                aVar.d = jSONObject.getString("regSec");
                aVar.e = jSONObject.getString("vName");
                aVar.f131a = jSONObject.getBoolean("valid");
                aVar.f132b = jSONObject.getBoolean("paused");
                aVar.f14383a = jSONObject.getInt("envType");
                aVar.f = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f130a);
                jSONObject.put("appToken", aVar.b);
                jSONObject.put("regId", aVar.c);
                jSONObject.put("regSec", aVar.d);
                jSONObject.put("vName", aVar.e);
                jSONObject.put("valid", aVar.f131a);
                jSONObject.put("paused", aVar.f132b);
                jSONObject.put("envType", aVar.f14383a);
                jSONObject.put("regResource", aVar.f);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11814b() {
        this.f126a.b();
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m11819e() {
        return this.f126a.f132b;
    }

    public int a() {
        return this.f126a.f14383a;
    }

    public void a(boolean z) {
        this.f126a.a(z);
        a(this.f125a).edit().putBoolean("paused", z).commit();
    }

    public void a(int i) {
        this.f126a.a(i);
        a(this.f125a).edit().putInt("envType", i).commit();
    }

    /* renamed from: f, reason: collision with other method in class */
    public boolean m11820f() {
        return !this.f126a.f131a;
    }
}
