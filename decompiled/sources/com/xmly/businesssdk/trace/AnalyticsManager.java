package com.xmly.businesssdk.trace;

import com.xmly.businesssdk.utils.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J,\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/trace/AnalyticsManager;", "", "()V", "TAG", "", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xmly/businesssdk/trace/AnalyticsListener;", "addAnalyticsListener", "", "listener", "notifyPlayRecordUploadSuccess", "albumId", "trackId", "playSeconds", "", "startAt", "removeAnalyticsListener", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AnalyticsManager {
    private static final String TAG = "AnalyticsManager";
    public static final AnalyticsManager INSTANCE = new AnalyticsManager();
    private static final CopyOnWriteArrayList<AnalyticsListener> listeners = new CopyOnWriteArrayList<>();

    private AnalyticsManager() {
    }

    @JvmStatic
    public static final void addAnalyticsListener(AnalyticsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArrayList<AnalyticsListener> copyOnWriteArrayList = listeners;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
        Logger.d(TAG, "Added analytics listener: " + listener);
    }

    @JvmStatic
    public static final void notifyPlayRecordUploadSuccess(String albumId, String trackId, long playSeconds, long startAt) {
        PlayRecordEvent playRecordEvent = new PlayRecordEvent(albumId, trackId, playSeconds, startAt);
        Logger.i(TAG, "通知外部播放回传: " + playRecordEvent);
        Iterator<AnalyticsListener> it = listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPlayRecord(playRecordEvent);
            } catch (Exception e) {
                Logger.e(TAG, "回调外部监听器失败", e);
            }
        }
    }

    @JvmStatic
    public static final void removeAnalyticsListener(AnalyticsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listeners.remove(listener)) {
            Logger.d(TAG, "Removed analytics listener: " + listener);
        }
    }
}
