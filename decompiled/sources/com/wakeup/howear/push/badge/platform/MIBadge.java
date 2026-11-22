package com.wakeup.howear.push.badge.platform;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;

/* loaded from: classes3.dex */
public class MIBadge extends BadgeInterface {
    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        try {
            if (getSystemProperties() >= 12) {
                return;
            }
            Notification build = new NotificationCompat.Builder(context, "default").build();
            Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
            obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getSystemProperties() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return Integer.parseInt(String.valueOf(cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.ui.version.code")));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
