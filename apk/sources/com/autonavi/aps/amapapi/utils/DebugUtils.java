package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class DebugUtils {
    public static Context sAppContext;

    public static void attachContext(Context context) {
        sAppContext = context;
    }

    public static String getAbsolutePath() {
        Context context = sAppContext;
        return context == null ? "" : context.getExternalFilesDir("").getAbsolutePath();
    }

    public static String getWPath() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbAppend = sb.append(getAbsolutePath());
        String str = File.separator;
        sbAppend.append(str);
        sb.append(Const.STR_DEBUG_TAG).append(str);
        return sb.toString();
    }

    public static void printE(Throwable th) {
    }

    public static void writeCat(String str, boolean z) {
    }

    public static void writeCat(String str, boolean z, String str2) {
    }

    public static void writeCat(Object... objArr) {
    }

    public static void writeCatTag(String str, String str2) {
    }

    public static void writeCatTag(String str, String str2, String str3, boolean z) {
    }
}
