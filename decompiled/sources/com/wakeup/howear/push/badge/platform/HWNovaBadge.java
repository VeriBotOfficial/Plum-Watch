package com.wakeup.howear.push.badge.platform;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.howear.push.badge.platform.base.BadgeInterface;

/* loaded from: classes3.dex */
public class HWNovaBadge extends BadgeInterface {
    @Override // com.wakeup.howear.push.badge.platform.base.BadgeInterface
    public void setBadgeNumber(int i, Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", context.getPackageName() + "/" + getLauncherClassName(context));
        contentValues.put(Const.SP_KEY_CALL_LOC_COUNT, Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
