package com.wakeup.howear.push.badge.platform;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;

/* loaded from: classes3.dex */
public class HonorBadge extends BadgeInterface {
    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        try {
            Uri parse = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
            if (TextUtils.isEmpty(context.getContentResolver().getType(parse))) {
                parse = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                if (TextUtils.isEmpty(context.getContentResolver().getType(parse))) {
                    parse = null;
                }
            }
            if (i < 0) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
            bundle.putInt("badgenumber", i);
            if (parse != null) {
                context.getContentResolver().call(parse, "change_badge", (String) null, bundle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
