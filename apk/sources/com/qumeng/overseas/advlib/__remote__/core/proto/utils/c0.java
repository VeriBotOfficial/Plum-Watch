package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f12853a = Arrays.asList("com.android.chrome", "com.google.android.webview", "com.android.webview");
    private static String b;

    private static String a(Context context, String str) {
        return "";
    }

    private static String b(Context context) {
        return String.format("Mozilla/5.0 (Linux; U; Android %s; %s; %s Build/%s) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30", Build.VERSION.RELEASE, String.valueOf(Locale.getDefault()).replace('_', '-').toLowerCase(), Build.MODEL, Build.ID);
    }

    private static String c(Context context) {
        if (TextUtils.isEmpty(b)) {
            Iterator<String> it = f12853a.iterator();
            String strA = null;
            while (it.hasNext()) {
                strA = a(context, it.next());
                if (!TextUtils.isEmpty(strA)) {
                    break;
                }
            }
            b = TextUtils.isEmpty(strA) ? "" : String.format("Mozilla/5.0 (Linux; Android %s; %s Build/%s; %s) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/%s Mobile Safari/537.36", Build.VERSION.RELEASE, Build.MODEL, Build.ID, "wv", strA);
        }
        return b;
    }

    public static String a(Context context) {
        String strC = c(context);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        try {
            return WebSettings.getDefaultUserAgent(context);
        } catch (Exception e) {
            e.printStackTrace();
            return strC;
        }
    }
}
