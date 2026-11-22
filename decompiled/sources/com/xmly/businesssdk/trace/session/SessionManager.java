package com.xmly.businesssdk.trace.session;

import com.xmly.businesssdk.trace.time.TimeProvider;
import com.xmly.businesssdk.utils.Logger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SessionManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\r\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/trace/session/SessionManager;", "", "()V", "currentSession", "Ljava/util/concurrent/atomic/AtomicReference;", "", "endSession", "", "generateSessionId", "getCurrentSessionId", "hasActiveSession", "", "refreshSession", "startSession", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "SessionManager";
    private final AtomicReference<String> currentSession = new AtomicReference<>();

    /* compiled from: SessionManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/xmly/businesssdk/trace/session/SessionManager$Companion;", "", "()V", "TAG", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String generateSessionId() {
        return String.valueOf(TimeProvider.INSTANCE.currentTimeMillis());
    }

    public final void endSession() {
        Logger.d(TAG, "会话结束: " + this.currentSession.getAndSet(null));
    }

    public final String getCurrentSessionId() {
        return this.currentSession.get();
    }

    public final boolean hasActiveSession() {
        return this.currentSession.get() != null;
    }

    public final String refreshSession() {
        String str = this.currentSession.get();
        if (str == null) {
            return startSession();
        }
        Logger.d(TAG, "会话刷新: " + str);
        return str;
    }

    public final String startSession() {
        String generateSessionId = generateSessionId();
        this.currentSession.set(generateSessionId);
        Logger.d(TAG, "新会话开始: " + generateSessionId);
        return generateSessionId;
    }
}
