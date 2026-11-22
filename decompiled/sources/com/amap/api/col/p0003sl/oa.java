package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: SPConfig.java */
/* loaded from: classes11.dex */
public class oa {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f1811a = new HashMap<>();

    public static void a(Context context, l9 l9Var, String str, String str2) {
        if (l9Var == null || TextUtils.isEmpty(l9Var.d())) {
            return;
        }
        String str3 = str + l9Var.d();
        f1811a.put(l9Var.d() + str, str2);
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty("d7afbc6a38848a6801f6e449f3ec8e53") || TextUtils.isEmpty(str2)) {
            return;
        }
        String b = m9.b(x8.b(m9.e(str2)));
        SharedPreferences.Editor edit = context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).edit();
        edit.putString(str3, b);
        edit.commit();
    }

    public static String a(Context context, l9 l9Var, String str) {
        if (l9Var == null || TextUtils.isEmpty(l9Var.d())) {
            return null;
        }
        String str2 = f1811a.get(l9Var.d() + str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = str + l9Var.d();
        return (context == null || TextUtils.isEmpty(str3)) ? "" : m9.c(x8.a(m9.c(context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).getString(str3, ""))));
    }
}
