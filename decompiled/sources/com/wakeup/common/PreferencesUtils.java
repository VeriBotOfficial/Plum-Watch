package com.wakeup.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.wakeup.common.base.BaseApplication;

/* loaded from: classes2.dex */
public class PreferencesUtils {
    public static String PREFERENCE_NAME = "shangyizhijia_bangshou_pref";

    public static void putString(Context context, String key, String value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        edit.putString(key, value);
        edit.apply();
    }

    public static void putString(String key, String value) {
        if (getContext() == null) {
            return;
        }
        putString(getContext(), key, value);
    }

    public static String getString(String key) {
        return getString(getContext(), key, "");
    }

    public static String getString(Context context, String key) {
        return getString(context, key, null);
    }

    public static String getString(Context context, String key, String defaultValue) {
        if (context == null) {
            return "";
        }
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getString(key, defaultValue);
    }

    public static void putInt(Context context, String key, int value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public static void putInt(String key, int value) {
        if (getContext() == null) {
            return;
        }
        putInt(getContext(), key, value);
    }

    public static int getInt(String key) {
        if (getContext() == null) {
            return -1;
        }
        return getInt(getContext(), key, -1);
    }

    public static int getInt(Context context, String key) {
        return getInt(context, key, -1);
    }

    public static int getInt(Context context, String key, int defaultValue) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getInt(key, defaultValue);
    }

    public static void putLong(Context context, String key, long value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        edit.putLong(key, value);
        edit.apply();
    }

    public static long getLong(Context context, String key) {
        return getLong(context, key, -1L);
    }

    public static long getLong(Context context, String key, long defaultValue) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getLong(key, defaultValue);
    }

    public static void putFloat(Context context, String key, float value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        edit.putFloat(key, value);
        edit.apply();
    }

    public static float getFloat(Context context, String key) {
        return getFloat(context, key, -1.0f);
    }

    public static float getFloat(Context context, String key, float defaultValue) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getFloat(key, defaultValue);
    }

    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    public static void putBoolean(String key, boolean value) {
        if (getContext() == null) {
            return;
        }
        putBoolean(getContext(), key, value);
    }

    public static boolean getBoolean(Context context, String key) {
        return getBoolean(context, key, false);
    }

    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getBoolean(key, defaultValue);
    }

    public static void remove(String key) {
        if (getContext() == null) {
            return;
        }
        remove(getContext(), key);
    }

    public static void remove(Context context, String key) {
        context.getSharedPreferences(PREFERENCE_NAME, 0).edit().remove(key);
    }

    public static boolean contains(String key) {
        if (getContext() == null) {
            return false;
        }
        return contains(getContext(), key);
    }

    public static boolean contains(Context context, String key) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).contains(key);
    }

    private static Context getContext() {
        return BaseApplication.getContext();
    }
}
