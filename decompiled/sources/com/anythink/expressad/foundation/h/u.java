package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import java.io.File;
import java.util.List;

/* loaded from: classes12.dex */
public final class u extends f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4937a = false;
    public static char[] b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};
    public static LinearLayout c = null;
    private static final String d = "SDKUtil";

    public static void a() {
    }

    public static void b() {
    }

    private static void d() {
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4938a = "com.android.vending";
        public static final String b = "market";
        public static final String c = "play.google.com";
        public static final String d = "market.android.com";
        public static final String e = "google.com";
        public static final String f = "market://";
        public static final String g = "details?id=";
        public static final String h = "market://details?id=com.package.name";

        private static Intent a() {
            return new Intent("android.intent.action.VIEW", Uri.parse(h));
        }

        private static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(h)), 0);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private static boolean b(Context context) {
            List<ResolveInfo> a2 = a(context);
            return a2 != null && a2.size() > 0;
        }

        public static boolean a(String str) {
            return b(str) || c(str);
        }

        private static boolean b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                Log.getStackTraceString(th);
                return false;
            }
        }

        private static boolean c(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    if (parse.getHost().equals("play.google.com")) {
                        return true;
                    }
                    return parse.getHost().equals("market.android.com");
                }
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
            return false;
        }

        private static String d(String str) {
            if (b(str)) {
                return str;
            }
            if (c(str)) {
                return "market://".concat(String.valueOf(str.substring(str.indexOf(g))));
            }
            return null;
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") != -1) {
            return new StringBuilder().append(str.hashCode() + str.substring(str.lastIndexOf("/") + 1).hashCode()).toString();
        }
        return new StringBuilder().append(str.hashCode()).toString();
    }

    public static String a(String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File a2 = com.anythink.expressad.foundation.g.c.d.a(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_IMG);
        if (TextUtils.isEmpty(str)) {
            sb = "";
        } else if (str.lastIndexOf("/") != -1) {
            sb = new StringBuilder().append(str.hashCode() + str.substring(str.lastIndexOf("/") + 1).hashCode()).toString();
        } else {
            sb = new StringBuilder().append(str.hashCode()).toString();
        }
        return new File(a2, sb).getAbsolutePath();
    }

    private static String c() {
        return com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.AD_ANYTHINK_700);
    }
}
