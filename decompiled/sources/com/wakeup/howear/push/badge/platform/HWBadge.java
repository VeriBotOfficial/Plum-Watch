package com.wakeup.howear.push.badge.platform;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;

/* loaded from: classes3.dex */
public class HWBadge extends BadgeInterface {
    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        if (i < 0) {
            i = 0;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
