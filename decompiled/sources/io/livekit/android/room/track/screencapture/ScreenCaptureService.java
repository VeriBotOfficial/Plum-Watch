package io.livekit.android.room.track.screencapture;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenCaptureService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0003J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001f\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "Landroid/app/Service;", "()V", "bindCount", "", "binder", "Landroid/os/IBinder;", "createNotificationChannel", "", "onBind", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "onUnbind", "", "start", "notificationId", "notification", "Landroid/app/Notification;", "(Ljava/lang/Integer;Landroid/app/Notification;)V", "Companion", "ScreenCaptureBinder", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ScreenCaptureService extends Service {
    public static final String DEFAULT_CHANNEL_ID = "livekit_screen_capture";
    public static final int DEFAULT_NOTIFICATION_ID = 2345;
    private int bindCount;
    private IBinder binder = new ScreenCaptureBinder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.bindCount++;
        return this.binder;
    }

    public final void start(Integer notificationId, Notification notification) {
        if (notification == null) {
            createNotificationChannel();
            notification = new NotificationCompat.Builder(this, DEFAULT_CHANNEL_ID).setPriority(0).build();
            Intrinsics.checkNotNull(notification);
        }
        startForeground(notificationId != null ? notificationId.intValue() : DEFAULT_NOTIFICATION_ID, notification);
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, "Screen Capture", 2);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        int i = this.bindCount - 1;
        this.bindCount = i;
        if (i != 0) {
            return false;
        }
        stopSelf();
        return false;
    }

    /* compiled from: ScreenCaptureService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureService$ScreenCaptureBinder;", "Landroid/os/Binder;", "(Lio/livekit/android/room/track/screencapture/ScreenCaptureService;)V", "service", "Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "getService", "()Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ScreenCaptureBinder extends Binder {
        public ScreenCaptureBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final ScreenCaptureService getThis$0() {
            return ScreenCaptureService.this;
        }
    }
}
