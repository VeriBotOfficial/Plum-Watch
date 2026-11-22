package com.wakeup.howear.push.badge.platform.base;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* loaded from: classes3.dex */
public abstract class BadgeInterface {
    public abstract void setBadgeNumber(int i, Context context);

    public String getLauncherClassName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        intent.addCategory("android.intent.category.LAUNCHER");
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveActivity == null) {
            resolveActivity = packageManager.resolveActivity(intent, 0);
        }
        return resolveActivity.activityInfo.name;
    }
}
