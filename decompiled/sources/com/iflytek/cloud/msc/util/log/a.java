package com.iflytek.cloud.msc.util.log;

import android.text.TextUtils;
import java.util.LinkedHashMap;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static LinkedHashMap<String, String> f11196a = new LinkedHashMap<>();
    private static String b = "=";
    private static String c = ":";
    private static String d = ";";
    private static String e = "=========================================================\r\n";
    private static boolean f = false;

    public static synchronized void a(String str, String str2) {
        synchronized (a.class) {
            if (f) {
                DebugLog.LogS("appendInfo:" + str + "," + str2);
                f11196a.put(str, (!TextUtils.isEmpty(str2) ? str2 + c : "") + System.currentTimeMillis());
            }
        }
    }
}
