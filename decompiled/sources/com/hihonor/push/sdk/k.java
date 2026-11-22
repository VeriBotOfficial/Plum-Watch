package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes11.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b1 f10140a;
    public static final k b = new k();

    public final void a(Context context) {
        if (f10140a == null) {
            f10140a = new b1(context, "push");
        }
    }

    public synchronized void a(Context context, String str) {
        String str2;
        a(context);
        if (TextUtils.isEmpty(str)) {
            f10140a.a("key_push_token");
        } else {
            String a2 = f.a(context, context.getPackageName());
            byte[] a3 = f.a("EA23F5B8C7577CDC744ABD1C6D7E143D5123F8F282BF4E7853C1EC86BD2EDD22");
            String encodeToString = Base64.encodeToString(i.a(i.a(i.a(i.a(a3, -4), f.a(a2)), 6), f.a(32)), 0);
            boolean a4 = f10140a.a("key_aes_gcm", encodeToString);
            try {
                str2 = f.b(str, Base64.decode(encodeToString, 0));
            } catch (Exception e) {
                Log.e("AesGcmUtil", "encrypt error:" + e);
                str2 = null;
            }
            if (a4 && !TextUtils.isEmpty(str2)) {
                f10140a.a("key_push_token", str2);
            }
        }
    }

    public synchronized String b(Context context) {
        String str;
        b1 b1Var;
        String str2;
        String str3;
        a(context);
        str = "";
        SharedPreferences sharedPreferences = f10140a.f10130a;
        if (sharedPreferences != null && sharedPreferences.contains("key_push_token")) {
            SharedPreferences sharedPreferences2 = f10140a.f10130a;
            if (sharedPreferences2 == null || !sharedPreferences2.contains("key_aes_gcm")) {
                b1Var = f10140a;
                str2 = "key_push_token";
            } else {
                SharedPreferences sharedPreferences3 = f10140a.f10130a;
                String string = sharedPreferences3 != null ? sharedPreferences3.getString("key_push_token", "") : "";
                SharedPreferences sharedPreferences4 = f10140a.f10130a;
                try {
                    str3 = f.a(string, Base64.decode(sharedPreferences4 != null ? sharedPreferences4.getString("key_aes_gcm", "") : "", 0));
                } catch (Exception e) {
                    Log.e("AesGcmUtil", "encrypt error:" + e);
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    f10140a.a("key_aes_gcm");
                    b1Var = f10140a;
                    str2 = "key_push_token";
                } else {
                    str = str3;
                }
            }
            b1Var.a(str2);
        }
        return str;
    }
}
