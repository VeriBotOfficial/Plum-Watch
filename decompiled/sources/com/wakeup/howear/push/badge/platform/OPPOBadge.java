package com.wakeup.howear.push.badge.platform;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;
import java.util.List;

/* loaded from: classes3.dex */
public class OPPOBadge extends BadgeInterface {
    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        if (i == 0) {
            i = -1;
        }
        try {
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("pakeageName", context.getPackageName());
            intent.putExtra("number", i);
            intent.putExtra("upgradeNumber", i);
            if (canResolveBroadcast(context, intent)) {
                context.sendBroadcast(intent);
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean canResolveBroadcast(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }
}
