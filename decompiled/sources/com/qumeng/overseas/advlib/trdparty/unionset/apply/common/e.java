package com.qumeng.overseas.advlib.trdparty.unionset.apply.common;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.core.app.NotificationCompat;

/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13352a = "com.qumeng.overseas.advlib";

    public static String a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(f13352a, f13352a, 4);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        notificationManager.createNotificationChannel(notificationChannel);
        return notificationChannel.getId();
    }

    public static NotificationCompat.Builder b(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), a(context));
        builder.setContentTitle("手机优化中");
        builder.setContentText("正在优化您的手机");
        builder.setSmallIcon(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getApplicationInfo().icon);
        builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getApplicationInfo().icon));
        builder.setAutoCancel(true);
        builder.setDefaults(4);
        builder.setPriority(-1);
        return builder;
    }
}
