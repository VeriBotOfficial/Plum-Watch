package com.qumeng.overseas.advlib.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13261a = "IABTCF_gdprApplies";
    private static final String b = "IABTCF_TCString";
    private static final String c = "IABTCF_PurposeConsents";

    public static boolean a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        if (defaultSharedPreferences.contains(f13261a)) {
            int i = defaultSharedPreferences.getInt(f13261a, -1);
            if (i == 0) {
                return true;
            }
            if (i == 1) {
                return a(defaultSharedPreferences);
            }
        }
        if (defaultSharedPreferences.contains("IABTCF_TCString")) {
            return a(defaultSharedPreferences);
        }
        return true;
    }

    private static boolean a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(c, null);
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return (string != null ? string.charAt(0) : (char) 0) == '1';
    }
}
