package com.facebook.react.bridge;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.facebook.common.logging.FLog;
import com.iflytek.cloud.SpeechConstant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReactSoftExceptionLogger.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger;", "", "<init>", "()V", "listeners", "", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "addListener", "", "listener", "removeListener", "clearListeners", "logSoftExceptionVerbose", SpeechConstant.ISE_CATEGORY, "", ParameterNames.CAUSE, "", "logSoftException", "logNoThrowSoftExceptionWithMessage", "message", "ReactSoftExceptionListener", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReactSoftExceptionLogger {
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    /* compiled from: ReactSoftExceptionLogger.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "", "logSoftException", "", SpeechConstant.ISE_CATEGORY, "", ParameterNames.CAUSE, "", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ReactSoftExceptionListener {
        void logSoftException(String category, Throwable cause);
    }

    private ReactSoftExceptionLogger() {
    }

    @JvmStatic
    public static final void addListener(ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @JvmStatic
    public static final void removeListener(ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    @JvmStatic
    public static final void clearListeners() {
        listeners.clear();
    }

    @JvmStatic
    public static final void logSoftExceptionVerbose(String category, Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        logSoftException(category + "|" + cause.getClass().getSimpleName() + ":" + cause.getMessage(), cause);
    }

    @JvmStatic
    public static final void logSoftException(String category, Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        List<ReactSoftExceptionListener> list = listeners;
        if (!list.isEmpty()) {
            Iterator<ReactSoftExceptionListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().logSoftException(category, cause);
            }
            return;
        }
        FLog.e(category, "Unhandled SoftException", cause);
    }

    @JvmStatic
    private static final void logNoThrowSoftExceptionWithMessage(String category, String message) {
        logSoftException(category, new ReactNoCrashSoftException(message));
    }
}
