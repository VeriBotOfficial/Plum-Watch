package com.wakeup.common.media;

import android.app.NotificationManager;
import android.content.Context;
import com.wakeup.common.base.BaseApplication;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: SharedMediaPlayback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/wakeup/common/media/SharedMediaPlayback;", "", "<init>", "()V", "NOTIFICATION_ID", "", "cancelSharedNotification", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SharedMediaPlayback {
    public static final SharedMediaPlayback INSTANCE = new SharedMediaPlayback();
    public static final int NOTIFICATION_ID = 20260709;

    private SharedMediaPlayback() {
    }

    public final void cancelSharedNotification() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedMediaPlayback sharedMediaPlayback = this;
            notificationManager.cancel(NOTIFICATION_ID);
            Result.m14057constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
    }
}
