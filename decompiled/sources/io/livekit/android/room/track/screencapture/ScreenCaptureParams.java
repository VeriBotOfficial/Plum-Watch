package io.livekit.android.room.track.screencapture;

import android.app.Notification;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenCaptureParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureParams;", "", "mediaProjectionPermissionResultData", "Landroid/content/Intent;", "notificationId", "", "notification", "Landroid/app/Notification;", "onStop", "Lkotlin/Function0;", "", "(Landroid/content/Intent;Ljava/lang/Integer;Landroid/app/Notification;Lkotlin/jvm/functions/Function0;)V", "getMediaProjectionPermissionResultData", "()Landroid/content/Intent;", "getNotification", "()Landroid/app/Notification;", "getNotificationId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnStop", "()Lkotlin/jvm/functions/Function0;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenCaptureParams {
    private final Intent mediaProjectionPermissionResultData;
    private final Notification notification;
    private final Integer notificationId;
    private final Function0<Unit> onStop;

    public ScreenCaptureParams(Intent mediaProjectionPermissionResultData, Integer num, Notification notification, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(mediaProjectionPermissionResultData, "mediaProjectionPermissionResultData");
        this.mediaProjectionPermissionResultData = mediaProjectionPermissionResultData;
        this.notificationId = num;
        this.notification = notification;
        this.onStop = function0;
    }

    public /* synthetic */ ScreenCaptureParams(Intent intent, Integer num, Notification notification, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(intent, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : notification, (i & 8) != 0 ? null : function0);
    }

    public final Intent getMediaProjectionPermissionResultData() {
        return this.mediaProjectionPermissionResultData;
    }

    public final Integer getNotificationId() {
        return this.notificationId;
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public final Function0<Unit> getOnStop() {
        return this.onStop;
    }
}
