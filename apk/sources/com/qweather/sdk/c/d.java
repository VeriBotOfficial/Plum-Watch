package com.qweather.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: SPUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        SharedPreferences.Editor editorEdit = a(context).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static long b(Context context, String str) {
        try {
            return a(context).getLong(str, 0L);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void a(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }
}
