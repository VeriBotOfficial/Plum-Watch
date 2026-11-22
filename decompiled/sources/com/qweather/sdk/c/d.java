package com.qweather.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SPUtil.java */
/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f13535a = "qweather_sp";

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences(f13535a, 0);
    }

    public static String a(Context context, String str) {
        try {
            return a(context).getString(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static long b(Context context, String str) {
        try {
            return a(context).getLong(str, 0L);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void a(Context context, String str, long j) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(str, j);
        edit.apply();
    }
}
