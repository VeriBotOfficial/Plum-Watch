package com.alipay.sdk.m.w;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alipay.sdk.app.AlipayApi;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.m;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class a {
    public static final String A = "extInfo";
    public static final String B = "ap_link_token";
    public static final String C = "act_info";
    public static final String D = "UTF-8";
    public static final String E = "preheatUserToken";
    public static final String F = "preheatToken";
    public static final String G = "preheatTime";
    public static final String H = "sp_preheatUserToken";
    public static final String I = "new_external_info==";
    public static final String o = "\"&";
    public static final String p = "&";

    /* renamed from: q, reason: collision with root package name */
    public static final String f1471q = "bizcontext=\"";
    public static final String r = "bizcontext=";
    public static final String s = "\"";
    public static final String t = "appkey";
    public static final String u = "ty";
    public static final String v = "sv";
    public static final String w = "an";
    public static final String x = "setting";
    public static final String y = "av";
    public static final String z = "sdk_start_time";

    /* renamed from: a, reason: collision with root package name */
    public String f1472a;
    public String b;
    public Context c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public String h;
    public String i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public final ActivityInfo m;
    public final com.alipay.sdk.m.m.b n;

    public a(Context context, String str, String str2) {
        this.f1472a = "";
        this.b = "";
        this.c = null;
        this.h = null;
        this.i = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.n = new com.alipay.sdk.m.m.b(context, isEmpty);
        String b = b(str, this.b);
        this.d = b;
        this.e = SystemClock.elapsedRealtime();
        this.f = q.g();
        ActivityInfo a2 = q.a(context);
        this.m = a2;
        this.g = str2;
        if (!isEmpty) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "eptyp", str2 + "|" + b);
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "actInfo", a2 != null ? a2.name + "|" + a2.launchMode : AbstractJsonLexerKt.NULL);
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, NotificationCompat.CATEGORY_SYSTEM, q.a(this));
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "sdkv", "7a055d1-dirty");
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "registerApp", AlipayApi.f + "");
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f1472a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e) {
            g.a(e);
        }
        if (!isEmpty) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, ak.aG + q.g());
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, com.alipay.sdk.m.m.b.Q, "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.m.m.a.a(context, this, str, this.d);
        }
        if (!isEmpty && com.alipay.sdk.m.o.b.i().u()) {
            com.alipay.sdk.m.o.b.i().a(this, this.c, true, 2);
        }
        if (com.alipay.sdk.m.o.b.i().a((a) null)) {
            return;
        }
        this.h = m.a(this, b(), H, "");
        this.i = c(str, this.b);
    }

    public static a f() {
        return null;
    }

    public String a(String str) {
        return TextUtils.isEmpty(str) ? str : str.startsWith(I) ? d(str) : f(str) ? c(str) : e(str);
    }

    public Context b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f1472a;
    }

    public final String e(String str) {
        try {
            String a2 = a(str, o, f1471q);
            if (TextUtils.isEmpty(a2)) {
                return str + "&" + a(f1471q, "\"");
            }
            if (!a2.endsWith("\"")) {
                a2 = a2 + "\"";
            }
            int indexOf = str.indexOf(a2);
            return str.substring(0, indexOf) + b(a2, f1471q, "\"") + str.substring(indexOf + a2.length());
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "fmt2", th, str);
            return str;
        }
    }

    public final boolean f(String str) {
        return !str.contains(o);
    }

    public String g() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public boolean i() {
        return this.j;
    }

    public boolean j() {
        return this.l;
    }

    public final String b(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z2 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith("\"") && substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z2 = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        String a2 = a(jSONObject);
        if (z2) {
            a2 = "\"" + a2 + "\"";
        }
        return str2 + a2 + str3;
    }

    public final String c(String str) {
        try {
            String a2 = a(str, "&", r);
            if (TextUtils.isEmpty(a2)) {
                return str + "&" + a(r, "");
            }
            int indexOf = str.indexOf(a2);
            return str.substring(0, indexOf) + b(a2, r, "") + str.substring(indexOf + a2.length());
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "fmt1", th, str);
            return str;
        }
    }

    public final String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", b(jSONObject.optString("bizcontext")));
            return I + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: com.alipay.sdk.m.w.a$a, reason: collision with other inner class name */
    public static final class C0102a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f1473a = new HashMap<>();
        public static final HashMap<String, a> b = new HashMap<>();
        public static final String c = "i_uuid_b_c";

        public static void a(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID randomUUID = UUID.randomUUID();
            f1473a.put(randomUUID, aVar);
            intent.putExtra(c, randomUUID);
        }

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(c);
            if (serializableExtra instanceof UUID) {
                return f1473a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void a(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            b.put(str, aVar);
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return b.remove(str);
        }
    }

    public static String c(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return q.g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
        } catch (Throwable th) {
            g.c(com.alipay.sdk.m.n.a.B, "generatePreheatTokenError");
            g.a(th);
            return "";
        }
    }

    public final String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(B, this.d);
            if (a() && com.alipay.sdk.m.o.b.i().j(null)) {
                jSONObject.put(E, this.h);
                jSONObject.put(F, this.i);
                jSONObject.put(G, System.currentTimeMillis() + "");
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String a(String str, String str2) {
        return str + a(new JSONObject()) + str2;
    }

    public String a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", com.alipay.sdk.m.n.a.h);
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has("sv")) {
                jSONObject.put("sv", "h.a.3.8.42");
            }
            if (!jSONObject.has(w)) {
                jSONObject.put(w, this.b);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f1472a);
            }
            if (!jSONObject.has(z)) {
                jSONObject.put(z, System.currentTimeMillis());
            }
            if (!jSONObject.has(A)) {
                jSONObject.put(A, e());
            }
            if (!jSONObject.has(C)) {
                jSONObject.put(C, this.m != null ? this.m.name + "|" + this.m.launchMode : AbstractJsonLexerKt.NULL);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.l, "fmt3", th, String.valueOf(jSONObject));
            g.a(th);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public final String b(String str) throws JSONException {
        return a(new JSONObject(str));
    }

    public static String b(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return String.format("EP%s%s_%s", "1", q.g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    public void c(boolean z2) {
        this.l = z2;
    }

    public static HashMap<String, String> a(a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar != null) {
            hashMap.put("sdk_ver", "15.8.42");
            hashMap.put("app_name", aVar.b);
            hashMap.put("token", aVar.d);
            hashMap.put("call_type", aVar.g);
            hashMap.put("ts_api_invoke", String.valueOf(aVar.e));
            com.alipay.sdk.m.y.a.a(aVar, hashMap);
        }
        return hashMap;
    }

    public void a(boolean z2) {
        this.k = z2;
    }

    public void b(boolean z2) {
        this.j = z2;
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.h);
    }
}
