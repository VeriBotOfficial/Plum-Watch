package com.xiaomi.push;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static a f14609a;

    public interface a {
        Map<String, String> a(Context context, String str);

        /* renamed from: a, reason: collision with other method in class */
        boolean m12184a(Context context, String str);

        boolean b(Context context, String str);
    }

    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* renamed from: a, reason: collision with other field name */
        private final int f560a;

        b(int i) {
            this.f560a = i;
        }

        public int a() {
            return this.f560a;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m12179a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static b a(Context context, String str, boolean z) {
        ApplicationInfo applicationInfo;
        b a2;
        if (context == null || TextUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            if (str.equals(context.getPackageName())) {
                applicationInfo = context.getApplicationInfo();
            } else {
                applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            }
            a2 = a(context, applicationInfo);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("get app op error " + th);
        }
        if (a2 != b.UNKNOWN) {
            return a2;
        }
        Integer num = (Integer) ax.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
        if (num == null) {
            return b.UNKNOWN;
        }
        Integer num2 = (Integer) ax.a(context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
        int i = (Integer) ax.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
        int i2 = (Integer) ax.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
        com.xiaomi.channel.commonutils.logger.b.b(String.format("get app mode %s|%s|%s", num2, i, i2));
        if (i == null) {
            i = 0;
        }
        if (i2 == null) {
            i2 = 1;
        }
        if (num2 != null) {
            return z ? !num2.equals(i2) ? b.ALLOWED : b.NOT_ALLOWED : num2.equals(i) ? b.ALLOWED : b.NOT_ALLOWED;
        }
        return b.UNKNOWN;
    }

    private static b a(Context context, ApplicationInfo applicationInfo) {
        Object systemService;
        Boolean bool;
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null) {
            return b.UNKNOWN;
        }
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                bool = Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
            } else {
                if (i >= 29) {
                    systemService = ax.a(context.getSystemService("notification"), "getService", new Object[0]);
                } else {
                    systemService = context.getSystemService("security");
                }
                bool = systemService != null ? (Boolean) ax.b(systemService, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid)) : null;
            }
            if (bool != null) {
                return bool.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }

    public static void a(Context context, ApplicationInfo applicationInfo, boolean z) {
        Object systemService;
        int i = Build.VERSION.SDK_INT;
        if (b.ALLOWED != a(context, applicationInfo)) {
            try {
                if (i >= 29) {
                    systemService = ax.a(context.getSystemService("notification"), "getService", new Object[0]);
                } else {
                    systemService = context.getSystemService("security");
                }
                if (systemService != null) {
                    ax.b(systemService, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z));
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("set notifications enabled error " + e);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12181a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (!j.m12357a()) {
                return context.getPackageName().equals(str);
            }
            a aVar = f14609a;
            if (aVar != null && aVar.m12184a(context, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m12183b(Context context, String str) {
        a aVar = f14609a;
        return aVar != null && aVar.b(context, str);
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean a(Context context) {
        String a2 = a();
        if (TextUtils.isEmpty(a2) || context == null) {
            return false;
        }
        return a2.equals(context.getPackageName());
    }

    public static String a() {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            str = (String) ax.a("android.app.ActivityThread", "currentProcessName", new Object[0]);
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m12182b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                return packageManager.getApplicationLabel(applicationInfo).toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return str;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static ApplicationInfo m12177a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("not found app info " + str);
            return null;
        }
    }

    public static int b(Context context, String str) {
        ApplicationInfo m12177a = m12177a(context, str);
        if (m12177a == null) {
            return 0;
        }
        int i = m12177a.icon;
        return i == 0 ? m12177a.logo : i;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Drawable m12178a(Context context, String str) {
        ApplicationInfo m12177a = m12177a(context, str);
        Drawable drawable = null;
        if (m12177a != null) {
            try {
                drawable = m12177a.loadIcon(context.getPackageManager());
                if (drawable == null) {
                    drawable = m12177a.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("get app icon drawable failed, " + e);
            }
        }
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    public static boolean d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Map<String, String> m12180a(Context context, String str) {
        a aVar = f14609a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(context, str);
    }
}
