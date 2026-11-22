package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.autonavi.aps.amapapi.config.Const;

/* loaded from: classes12.dex */
public class SPUtil {
    public static void endEdit(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        editor.apply();
    }

    public static boolean getPrefsBoolean(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "getPrefsBoolean");
            return z;
        }
    }

    public static int getPrefsInt(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "getPrefsInt");
            return i;
        }
    }

    public static long getPrefsLong(Context context, String str, String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "getPrefsLong");
            return j;
        }
    }

    public static String getPrefsStr(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "getPrefsInt");
            return str3;
        }
    }

    public static String getSmac(Context context) {
        return context == null ? "00:00:00:00:00:00" : getPrefsStr(context, Const.STR_PREF, Const.STR_PREF_KEY_SMAC, "00:00:00:00:00:00");
    }

    public static void removeKeyData(SharedPreferences.Editor editor, String str) {
        try {
            editor.remove(str);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void setPrefsBoolean(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "updatePrefsBoolean");
        }
    }

    public static void setPrefsInt(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "setPrefsInt");
        }
    }

    public static void setPrefsLong(SharedPreferences.Editor editor, String str, long j) {
        try {
            editor.putLong(str, j);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void setPrefsStr(SharedPreferences.Editor editor, String str, String str2) {
        try {
            editor.putString(str, str2);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SpUtil", "setPrefsStr");
        }
    }

    public static SharedPreferences.Editor startEdit(Context context, String str) {
        return context.getSharedPreferences(str, 0).edit();
    }
}
