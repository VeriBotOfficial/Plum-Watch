package com.qumeng.overseas.advlib.trdparty.unionset.apply.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.phancy.mini.utils.MimeExtKt;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.r;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13347a = "ActUtils";
    private static int b = 10000;

    public static NotificationCompat.Builder a(Context context) {
        return e.b(context);
    }

    public static void b(Context context, Intent intent) {
        try {
            if (r.c()) {
                c(context, intent);
                return;
            }
            intent.addFlags(268435456);
            NotificationCompat.Builder a2 = a(context);
            a2.setFullScreenIntent(PendingIntent.getActivity(context, 0, intent, 134217728), true);
            NotificationManagerCompat from = NotificationManagerCompat.from(context);
            from.cancel(99);
            c(context, intent);
            from.notify(99, a2.build());
            new Handler(Looper.getMainLooper()).postDelayed(new d(from), 1000L);
        } catch (Throwable th) {
            c(context, intent);
            n.b(f13347a, "fullScreenIntent hookJumpActivity: ", th.getMessage());
        }
    }

    public static boolean c(Context context, Intent intent) {
        return a(context, intent, true);
    }

    public static boolean d(Context context, Intent intent) {
        if (!com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.d()) {
            try {
                context.startActivities(new Intent[]{intent, intent});
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(Context context, Intent intent, boolean z) {
        if (context instanceof Activity) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        intent.addFlags(268435456);
        if (z) {
            int i = b + 1;
            b = i;
            try {
                PendingIntent.getActivity(context, i, intent, 1073741824).send();
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            n.b(f13347a, " err: empty url for browser download", new Object[0]);
            return false;
        }
        if (context == null) {
            n.b(f13347a, " err: context == null", new Object[0]);
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (a(context, intent)) {
                intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            }
            if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.b.a(context, intent) == null) {
                n.a(f13347a, "default browser deep not reach", new Object[0]);
                Intent a2 = a(context, str);
                if (a2 != null) {
                    intent = a2;
                }
            }
            n.a(f13347a, "browser intent = " + intent, new Object[0]);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(a.class, "system_browser_error", th);
            return false;
        }
    }

    public static void a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            b(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), intent);
        } catch (Throwable th) {
            n.a(f13347a, th.getMessage(), new Object[0]);
        }
    }

    public static Intent a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            PackageManager packageManager = context.getPackageManager();
            Uri parse = Uri.parse(str);
            intent.setDataAndType(parse, MimeExtKt.MIME_TYPE_HTML);
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(resolveInfo.activityInfo.packageName);
                if (launchIntentForPackage != null) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    launchIntentForPackage.setAction("android.intent.action.VIEW");
                    launchIntentForPackage.addCategory("android.intent.category.BROWSABLE");
                    launchIntentForPackage.setComponent(componentName);
                    launchIntentForPackage.setData(parse);
                    return launchIntentForPackage;
                }
            }
            return null;
        } catch (Throwable th) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(a.class, "system_browser_error", th);
            return null;
        }
    }

    public static boolean a(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        return (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !"android".equals(activityInfo.packageName)) ? false : true;
    }
}
