package com.qumeng.overseas.advlib.__remote__.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13232a = "IABTCF_gdprApplies";
    private static final String b = "IABTCF_TCString";
    private static final String c = "IABTCF_PurposeConsents";
    private static final Object d = new Object();
    private static boolean e;
    private static String f;

    private g() {
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(f13232a)) {
            int r1 = defaultSharedPreferences.getInt(f13232a, -1);
            if (r1 == 0) {
                return 3;
            }
            if (r1 == 1) {
                return a(defaultSharedPreferences);
            }
        }
        if (defaultSharedPreferences.contains("IABTCF_TCString")) {
            return a(defaultSharedPreferences);
        }
        return 0;
    }

    public static String b(Context context) {
        String str;
        Object obj = d;
        synchronized (obj) {
            if (e) {
                return f;
            }
            if (context == null) {
                return null;
            }
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
            synchronized (obj) {
                if (!e) {
                    f = string;
                    e = true;
                }
                str = f;
            }
            return str;
        }
    }

    public static void a(String str) {
        synchronized (d) {
            f = str;
            e = true;
        }
    }

    public static void a() {
        synchronized (d) {
            e = false;
            f = null;
        }
    }

    private static int a(SharedPreferences sharedPreferences) {
        String string;
        if ((sharedPreferences.contains("IABTCF_TCString") || sharedPreferences.contains(c)) && (string = sharedPreferences.getString(c, null)) != null && !string.isEmpty()) {
            char cCharAt = string.charAt(0);
            if (cCharAt == '1') {
                return 2;
            }
            if (cCharAt == '0') {
                return 1;
            }
        }
        return 0;
    }
}
