package com.baidu.bbalbscesium;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class f {
    private static final String e = "CuidV266Info";
    private static final boolean f = false;
    public static final String g = "libcuid.so";
    private static final String h = "ZGV2aWNlaWQ=";
    private static final String i = "aW1laQ==";
    private static final String j = "dmVy";
    private static final int k = 2;
    public static final String l = "0";
    public static final String m = "O";
    private static final int n = 14;

    /* renamed from: a, reason: collision with root package name */
    public String f7380a;
    public String b;
    public int c = 2;
    private int d = 0;

    public static f a(String str) {
        return b(c(str));
    }

    public static f a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        fVar.f7380a = str;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        fVar.d = length;
        if (length < 14) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            fVar.b = str2;
        }
        return fVar;
    }

    public static boolean a(int i2) {
        return i2 >= 14;
    }

    private static f b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            String str2 = "0";
            String str3 = "0";
            while (keys.hasNext()) {
                String next = keys.next();
                if (!e(h).equals(next) && !e(j).equals(next)) {
                    str3 = jSONObject.optString(next, "0");
                }
            }
            String string = jSONObject.getString(e(h));
            int i2 = jSONObject.getInt(e(j));
            int length = TextUtils.isEmpty(str3) ? 0 : str3.length();
            if (!TextUtils.isEmpty(string)) {
                f fVar = new f();
                fVar.f7380a = string;
                fVar.c = i2;
                fVar.d = length;
                if (length < 14) {
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    fVar.b = str2;
                }
                fVar.a();
                return fVar;
            }
        } catch (JSONException e2) {
            com.baidu.bbalbscesium.o.c.a(e2);
        }
        return null;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] a2 = com.baidu.bbalbscesium.k.a.g.a();
            return new String(com.baidu.bbalbscesium.k.a.c.a(a2, a2, com.baidu.bbalbscesium.m.b.a(str.getBytes())));
        } catch (Exception e2) {
            com.baidu.bbalbscesium.o.c.a(e2);
            return "";
        }
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] a2 = com.baidu.bbalbscesium.k.a.g.a();
            return com.baidu.bbalbscesium.m.b.a(com.baidu.bbalbscesium.k.a.c.b(a2, a2, str.getBytes()), "utf-8");
        } catch (UnsupportedEncodingException | Exception e2) {
            com.baidu.bbalbscesium.o.c.a(e2);
            return "";
        }
    }

    private static String e(String str) {
        return new String(com.baidu.bbalbscesium.m.b.a(str.getBytes()));
    }

    private String f() {
        try {
            return new JSONObject().put(e(h), this.f7380a).put(e(i), this.b).put(e(j), this.c).toString();
        } catch (JSONException e2) {
            com.baidu.bbalbscesium.o.c.a(e2);
            return null;
        }
    }

    public static boolean f(String str) {
        return TextUtils.isEmpty(str);
    }

    boolean a() {
        String str;
        if (c()) {
            str = "O";
        } else {
            if (!d()) {
                return false;
            }
            str = "0";
        }
        this.b = str;
        return true;
    }

    public String b() {
        String str = this.b;
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.f7380a + "|" + str;
    }

    boolean c() {
        return a(this.d);
    }

    boolean d() {
        return f(this.b);
    }

    public String e() {
        return d(f());
    }
}
