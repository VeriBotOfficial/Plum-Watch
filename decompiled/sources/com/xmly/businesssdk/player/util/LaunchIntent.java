package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.utils.Logger;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import java.util.List;

/* loaded from: classes3.dex */
public class LaunchIntent {
    private static final String TAG = "LaunchIntent";

    public static Intent get(Context context) {
        Class<?> notificationClickActivity = PlayerSetting.getNotificationClickActivity();
        if (notificationClickActivity != null) {
            Intent intent = new Intent(context, notificationClickActivity);
            intent.setFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
            Logger.d(TAG, c.a("使用配置的自定义Activity: ").append(notificationClickActivity.getName()).toString());
            return intent;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                String str = activityInfo.packageName;
                String str2 = activityInfo.name;
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.addCategory("android.intent.category.LAUNCHER");
                intent3.setFlags(268435456);
                intent3.setClassName(str, str2);
                Logger.d(TAG, "使用备用方法获取启动Activity: " + str2);
                return intent3;
            }
        } catch (Exception e) {
            Logger.e(TAG, "备用方法获取启动Activity失败", e);
        }
        Intent intent4 = new Intent("android.intent.action.MAIN");
        intent4.addCategory("android.intent.category.LAUNCHER");
        intent4.setPackage(context.getPackageName());
        intent4.setFlags(268435456);
        Logger.d(TAG, "使用通用启动Intent，不指定具体Activity");
        return intent4;
    }
}
