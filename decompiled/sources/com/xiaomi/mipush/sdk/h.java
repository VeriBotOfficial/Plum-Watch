package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ax;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f14393a = -1;

    public static q a(Context context) {
        if (m11836a(context)) {
            return q.HUAWEI;
        }
        if (c(context)) {
            return q.OPPO;
        }
        if (d(context)) {
            return q.VIVO;
        }
        return q.OTHER;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m11836a(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null) {
                if (a()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean a() {
        try {
            String str = (String) ax.a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    public static boolean b(Context context) {
        Object a2 = ax.a(ax.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a3 = ax.a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a3 != null && (a3 instanceof Integer)) {
            int intValue = ((Integer) Integer.class.cast(a3)).intValue();
            if (a2 != null) {
                if (a2 instanceof Integer) {
                    f14393a = ((Integer) Integer.class.cast(a2)).intValue() == intValue ? 1 : 0;
                } else {
                    f14393a = 0;
                    com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
                }
            }
            com.xiaomi.channel.commonutils.logger.b.c("is google service can be used" + (f14393a > 0));
            return f14393a > 0;
        }
        com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
        f14393a = 0;
        return false;
    }

    public static boolean c(Context context) {
        Object a2 = ax.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        boolean booleanValue = (a2 == null || !(a2 instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(a2)).booleanValue();
        com.xiaomi.channel.commonutils.logger.b.c("color os push  is avaliable ? :" + booleanValue);
        return booleanValue;
    }

    public static boolean d(Context context) {
        Object a2 = ax.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        boolean booleanValue = (a2 == null || !(a2 instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(a2)).booleanValue();
        com.xiaomi.channel.commonutils.logger.b.c("fun touch os push  is avaliable ? :" + booleanValue);
        return booleanValue;
    }
}
