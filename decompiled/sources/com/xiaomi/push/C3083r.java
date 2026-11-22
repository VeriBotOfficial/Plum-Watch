package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.vivo.push.PushClientConstants;

/* renamed from: com.xiaomi.push.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3083r {

    /* renamed from: a, reason: collision with root package name */
    private static int f14691a;

    /* renamed from: a, reason: collision with other field name */
    private static long f936a;

    public static int a(Context context) {
        if (context != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f936a) > 86400000) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(PushClientConstants.COM_ANDROID_SYSTEMUI, 128);
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        f14691a = applicationInfo.metaData.getInt("SupportForPushVersionCode");
                        f936a = currentTimeMillis;
                    }
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.d("exception occurred in getting systemui support version, exception: " + th);
                }
            }
        }
        return f14691a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12369a(Context context) {
        return a(context) >= 2;
    }

    public static boolean b(Context context) {
        return a(context) >= 3;
    }
}
