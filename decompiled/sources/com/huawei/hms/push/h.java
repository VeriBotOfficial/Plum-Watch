package com.huawei.hms.push;

import android.app.Notification;
import android.text.TextUtils;

/* compiled from: NotificationUtils.java */
/* loaded from: classes14.dex */
public class h {
    public static i a(m mVar) {
        return (mVar.w() < 0 || mVar.w() >= i.values().length) ? i.STYLE_DEFAULT : i.values()[mVar.w()];
    }

    public static void a(Notification.Builder builder, String str, m mVar) {
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        if (!TextUtils.isEmpty(mVar.h())) {
            bigTextStyle.setBigContentTitle(mVar.h());
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bigTextStyle.bigText(str);
        }
        builder.setStyle(bigTextStyle);
    }
}
