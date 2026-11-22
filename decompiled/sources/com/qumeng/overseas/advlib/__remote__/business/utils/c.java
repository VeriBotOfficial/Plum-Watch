package com.qumeng.overseas.advlib.__remote__.business.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f12793a = new HashSet(Arrays.asList("com.android.vending", "com.sec.android.app.samsungapps", "com.amazon.venezia", "com.huawei.appmarket", "com.oppo.market", "com.heytap.market", "com.vivo.appstore"));
    private static final Set<String> b = new HashSet(Arrays.asList("market", "samsungapps", "appgallery"));
    private static final Set<String> c = new HashSet(Arrays.asList("play.google.com", "apps.samsung.com", "galaxystore.samsung.com", "www.amazon.com", "appgallery.huawei.com", "store.oppo.com", "appstore.vivo.com", "www.aptoide.com"));

    private c() {
    }

    public static boolean a(Context context, String str) {
        return b(str) || c(context, str);
    }

    public static boolean b(String str) {
        String path;
        if (str != null && !str.trim().isEmpty()) {
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (scheme != null && b.contains(scheme.toLowerCase())) {
                    return true;
                }
                String host = parse.getHost();
                if (host != null) {
                    String lowerCase = host.toLowerCase();
                    Iterator<String> it = c.iterator();
                    while (it.hasNext()) {
                        if (lowerCase.endsWith(it.next())) {
                            return true;
                        }
                    }
                    if (lowerCase.endsWith("play.google.com") && (path = parse.getPath()) != null && path.contains("/store/apps/details")) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean c(Context context, String str) {
        ActivityInfo activityInfo;
        if (context != null && str != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
                        if (f12793a.contains(activityInfo.packageName)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static Intent a(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)).addFlags(268435456);
    }

    public static boolean b(Context context, String str) {
        Intent intent;
        ActivityInfo activityInfo;
        if (context == null || str == null || !a(context, str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        intent2.addFlags(268435456);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    intent = null;
                    break;
                }
                ResolveInfo next = it.next();
                if (next != null && (activityInfo = next.activityInfo) != null) {
                    String str2 = activityInfo.packageName;
                    if (f12793a.contains(str2)) {
                        intent = new Intent("android.intent.action.VIEW", parse);
                        intent.setPackage(str2);
                        intent.addFlags(268435456);
                        break;
                    }
                }
            }
            if (intent != null) {
                intent2 = intent;
            }
            try {
                context.startActivity(intent2);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
