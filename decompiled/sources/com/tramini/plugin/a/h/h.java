package com.tramini.plugin.a.h;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class h {
    private static boolean b(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            return b(context);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
