package com.wakeup.howear.push.badge.platform;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.wakeup.common.log.LogUtils;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;
import java.util.Locale;

/* loaded from: classes3.dex */
public class SamSungBadge extends BadgeInterface {
    int notifcationId = 1;

    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        if (i < 0) {
            i = 0;
        }
        if (i == 0) {
            try {
                clearAllNotifications(context);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        setSamSungBadgeNum(i, context);
    }

    public void setSamSungBadgeNum(int i, Context context) {
        int i2 = this.notifcationId;
        this.notifcationId = i2 + 1;
        executeBadge(context, i2, i);
    }

    private void clearAllNotifications(Context context) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancelAll();
            }
        } catch (Throwable th) {
            LogUtils.e("SamSungBadge", "cancelAll failed: " + th.getMessage());
        }
    }

    public void executeBadge(Context context, int i, int i2) {
        String launcherClassName = getLauncherClassName(context);
        if (launcherClassName == null) {
            return;
        }
        try {
            try {
                Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                intent.putExtra("badge_count", i2);
                intent.putExtra("badge_count_package_name", context.getPackageName());
                intent.putExtra("badge_count_class_name", launcherClassName);
                intent.putExtra("badge_vip_count", i2);
                context.sendBroadcast(intent);
            } catch (Exception e) {
                LogUtils.e("BadgeRemover", "三星特定的Intent方法移除未读红点失败: " + e.getMessage());
            }
        } catch (Exception unused) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("package", context.getPackageName());
            contentValues.put("class", getLauncherClassName(context));
            contentValues.put("badgecount", Integer.valueOf(i2));
            context.getContentResolver().update(Uri.parse("content://com.sec.badge/apps"), contentValues, "package=? AND class=?", new String[]{context.getPackageName(), getLauncherClassName(context)});
        }
    }

    public static boolean isSamsungDevice() {
        String lowerCase = Build.MODEL.toLowerCase(Locale.ROOT);
        return ("samsung".equals(Build.BRAND.toLowerCase(Locale.ROOT)) || "samsung".equals(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) || (lowerCase.startsWith("sm-") || lowerCase.startsWith("gt-") || lowerCase.startsWith("sch-"));
    }
}
