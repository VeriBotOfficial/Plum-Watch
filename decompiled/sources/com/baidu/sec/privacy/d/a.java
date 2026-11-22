package com.baidu.sec.privacy.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.baidu.sec.privacy.f.c;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PolicyConfigHolder.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static JSONObject f9021a = null;
    public static boolean b = true;
    public static SharedPreferences c = null;
    public static SharedPreferences.Editor d = null;
    public static String e = "sofire";
    public static HashSet<Integer> f = new HashSet<>();
    public static HashSet<Integer> g = new HashSet<>();
    public static boolean h = true;
    public static SharedPreferences.OnSharedPreferenceChangeListener i = new SharedPreferencesOnSharedPreferenceChangeListenerC0436a();

    /* compiled from: PolicyConfigHolder.java */
    /* renamed from: com.baidu.sec.privacy.d.a$a, reason: collision with other inner class name */
    public class SharedPreferencesOnSharedPreferenceChangeListenerC0436a implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* compiled from: PolicyConfigHolder.java */
        /* renamed from: com.baidu.sec.privacy.d.a$a$a, reason: collision with other inner class name */
        public class RunnableC0437a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SharedPreferences f9022a;
            public final /* synthetic */ String b;

            public RunnableC0437a(SharedPreferencesOnSharedPreferenceChangeListenerC0436a sharedPreferencesOnSharedPreferenceChangeListenerC0436a, SharedPreferences sharedPreferences, String str) {
                this.f9022a = sharedPreferences;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.c(this.f9022a.getString(this.b, ""));
            }
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (b.b.equals(str)) {
                new Thread(new RunnableC0437a(this, sharedPreferences, str)).start();
            }
        }
    }

    public static boolean a() {
        return b;
    }

    public static void b(String str) {
        try {
            SharedPreferences sharedPreferences = com.baidu.sec.privacy.b.b.a().getSharedPreferences("prv_config", 0);
            c = sharedPreferences;
            d = sharedPreferences.edit();
            e = str;
            c(b.a(str, i));
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static void c(String str) {
        try {
            f9021a = null;
            f.clear();
            g.clear();
            h = true;
            try {
                f9021a = new JSONObject(str);
            } catch (Throwable unused) {
                f9021a = new JSONObject();
            }
            c();
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static boolean a(int i2) {
        try {
            return g.contains(Integer.valueOf(i2));
        } catch (Throwable th) {
            c.a(th);
            return false;
        }
    }

    public static boolean b(int i2) {
        try {
            if (b.b(e)) {
                return !f.contains(Integer.valueOf(i2));
            }
            return false;
        } catch (Throwable th) {
            c.a(th);
            return false;
        }
    }

    public static void c() {
        if (f9021a.optInt("0", 1) == 1) {
            b = true;
        } else {
            b = false;
        }
        JSONArray optJSONArray = f9021a.optJSONArray("1");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    f.add(Integer.valueOf(optJSONArray.getInt(i2)));
                } catch (JSONException unused) {
                }
            }
        }
        JSONArray optJSONArray2 = f9021a.optJSONArray("3");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                try {
                    g.add(Integer.valueOf(optJSONArray2.getInt(i3)));
                } catch (JSONException unused2) {
                }
            }
        }
        if (f9021a.optInt("4", 1) == 1) {
            h = true;
        } else {
            h = false;
        }
    }

    public static String a(String str, String str2) {
        try {
            String string = c.getString(str, str2);
            if (!TextUtils.isEmpty(string)) {
                try {
                    return com.baidu.sec.privacy.f.a.a(string);
                } catch (Exception unused) {
                }
            }
            return str2;
        } catch (Throwable th) {
            c.a(th);
            return str2;
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            d.putString(str, com.baidu.sec.privacy.f.a.a(str2.getBytes()));
            d.putLong(str + "la_in", System.currentTimeMillis());
            d.commit();
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static boolean a(String str) {
        return c.contains(str);
    }

    public static long a(String str, long j) {
        return c.getLong(str, j);
    }

    public static int a(String str, int i2) {
        return c.getInt(str, i2);
    }

    public static void b(String str, int i2) {
        try {
            d.putInt(str, i2);
            d.putLong(str + "la_in", System.currentTimeMillis());
            d.commit();
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static boolean b() {
        return h;
    }
}
