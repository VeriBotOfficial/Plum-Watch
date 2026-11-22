package com.wakeup.module.ai;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecordNotifyMgr.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/wakeup/module/ai/RecordNotifyMgr;", "", "<init>", "()V", "TAG", "", RemoteMessageConst.Notification.NOTIFY_ID, "", RemoteMessageConst.Notification.CHANNEL_ID, "channelName", "isShowWindow", "", "windowView", "Landroid/view/View;", "createNotify", "", "removeNotify", "showRecordingCompletedNotify", "showWindow", "createWindowLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "context", "Landroid/content/Context;", "closeWindow", "checkWindowPermission", "getClickPendingIntent", "Landroid/app/PendingIntent;", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RecordNotifyMgr {
    private static final String TAG = "RecordNotifyMgr";
    private static boolean isShowWindow;
    private static View windowView;
    public static final RecordNotifyMgr INSTANCE = new RecordNotifyMgr();
    private static final int notifyId = 8564;
    private static final String channelId = "RecordCallChannelId";
    private static final String channelName = "RecordCallChannelName";

    private RecordNotifyMgr() {
    }

    public final void createNotify() {
        LogUtils.i(TAG, "createNotify");
        Context context = BaseApplication.getContext();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        String str = channelId;
        NotificationChannel notificationChannel = new NotificationChannel(str, channelName, 2);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setLockscreenVisibility(1);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Notification.Builder ongoing = new Notification.Builder(context, str).setSmallIcon(com.wakeup.commonui.R.mipmap.ic_notify).setCustomContentView(new RemoteViews(context.getPackageName(), R.layout.layout_record_call_notify)).setOngoing(true);
        Intrinsics.checkNotNull(context);
        Notification build = ongoing.setContentIntent(getClickPendingIntent(context)).setPriority(1).build();
        Intrinsics.checkNotNull(build);
        if (notificationManager != null) {
            notificationManager.notify(notifyId, build);
        }
    }

    public final void removeNotify() {
        LogUtils.i(TAG, "removeNotify");
        ((NotificationManager) BaseApplication.getContext().getSystemService(NotificationManager.class)).cancel(notifyId);
    }

    public final void showRecordingCompletedNotify() {
        LogUtils.i(TAG, "showRecordingCompletedNotify");
        Context context = BaseApplication.getContext();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        String str = channelId;
        NotificationChannel notificationChannel = new NotificationChannel(str, channelName, 3);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setLockscreenVisibility(1);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Notification.Builder priority = new Notification.Builder(context, str).setSmallIcon(com.wakeup.commonui.R.mipmap.ic_notify).setContentTitle(context.getString(com.wakeup.commonui.R.string.call_record_notify)).setAutoCancel(true).setPriority(1);
        Intrinsics.checkNotNull(context);
        Notification build = priority.setContentIntent(getClickPendingIntent(context)).build();
        Intrinsics.checkNotNull(build);
        int currentTimeMillis = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
        if (notificationManager != null) {
            notificationManager.notify(currentTimeMillis, build);
        }
    }

    public final void showWindow() {
        LogUtils.i(TAG, "showWindows");
        if (isShowWindow) {
            LogUtils.i(TAG, "showWindows showing");
            return;
        }
        if (!checkWindowPermission()) {
            LogUtils.i(TAG, "showWindows not permission");
            return;
        }
        final Context context = BaseApplication.getContext();
        Intrinsics.checkNotNull(context);
        WindowManager.LayoutParams createWindowLayoutParams = createWindowLayoutParams(context);
        try {
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowManager windowManager = (WindowManager) systemService;
            View inflate = LayoutInflater.from(context).inflate(R.layout.view_window_record_call, (ViewGroup) null);
            windowView = inflate;
            if (inflate != null) {
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.ai.RecordNotifyMgr$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RecordNotifyMgr.showWindow$lambda$0(context, view);
                    }
                });
            }
            windowManager.addView(windowView, createWindowLayoutParams);
            isShowWindow = true;
        } catch (Exception e) {
            LogUtils.e(TAG, "showWindows error: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWindow$lambda$0(Context context, View view) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("wearfitpro://wearfit.com/def"));
            intent.addFlags(872415232);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final WindowManager.LayoutParams createWindowLayoutParams(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2038;
        layoutParams.format = 1;
        layoutParams.flags = 552;
        layoutParams.width = UIHelper.dp2px(216.0f);
        layoutParams.height = UIHelper.dp2px(38.0f);
        layoutParams.x = 0;
        layoutParams.y = -((UIHelper.getWindowHeight(context) / 2) - (UIHelper.dp2px(38.0f) / 2));
        return layoutParams;
    }

    public final void closeWindow() {
        LogUtils.i(TAG, "closeWindow");
        if (!isShowWindow) {
            LogUtils.i(TAG, "closeWindow no show");
            return;
        }
        Object systemService = BaseApplication.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        View view = windowView;
        if (view != null) {
            try {
                windowManager.removeView(view);
                windowView = null;
            } catch (Exception e) {
                LogUtils.e(TAG, "closeWindow remove view error: ", e);
                windowView = null;
            }
        }
        isShowWindow = false;
    }

    public final boolean checkWindowPermission() {
        return Settings.canDrawOverlays(BaseApplication.getContext());
    }

    private final PendingIntent getClickPendingIntent(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("wearfitpro://wearfit.com/def"));
        intent.addCategory("android.intent.category.DEFAULT");
        return PendingIntent.getActivity(context, 0, intent, 67108864);
    }
}
