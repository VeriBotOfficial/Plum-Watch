package com.wakeup.howear.push.badge.platform;

import android.content.Context;
import android.content.Intent;
import com.vivo.push.PushClientConstants;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;

/* loaded from: classes3.dex */
public class VIVOBadge extends BadgeInterface {
    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        if (i < 0) {
            i = 0;
        }
        try {
            Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.setAction("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra(PushClientConstants.TAG_CLASS_NAME, getLauncherClassName(context));
            intent.addFlags(16777216);
            intent.putExtra("notificationNum", i);
            context.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
