package io.livekit.android.webrtc;

import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import livekit.org.webrtc.PeerConnectionFactory;

/* compiled from: PeerConnectionFactoryManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "", "peerConnectionFactory", "Llivekit/org/webrtc/PeerConnectionFactory;", "(Llivekit/org/webrtc/PeerConnectionFactory;)V", "<set-?>", "", "isDisposed", "()Z", "getPeerConnectionFactory", "()Llivekit/org/webrtc/PeerConnectionFactory;", "component1", "copy", "dispose", "", "equals", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PeerConnectionFactoryManager {
    private boolean isDisposed;
    private final PeerConnectionFactory peerConnectionFactory;

    public static /* synthetic */ PeerConnectionFactoryManager copy$default(PeerConnectionFactoryManager peerConnectionFactoryManager, PeerConnectionFactory peerConnectionFactory, int i, Object obj) {
        if ((i & 1) != 0) {
            peerConnectionFactory = peerConnectionFactoryManager.peerConnectionFactory;
        }
        return peerConnectionFactoryManager.copy(peerConnectionFactory);
    }

    /* renamed from: component1, reason: from getter */
    public final PeerConnectionFactory getPeerConnectionFactory() {
        return this.peerConnectionFactory;
    }

    public final PeerConnectionFactoryManager copy(PeerConnectionFactory peerConnectionFactory) {
        Intrinsics.checkNotNullParameter(peerConnectionFactory, "peerConnectionFactory");
        return new PeerConnectionFactoryManager(peerConnectionFactory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PeerConnectionFactoryManager) && Intrinsics.areEqual(this.peerConnectionFactory, ((PeerConnectionFactoryManager) other).peerConnectionFactory);
    }

    public int hashCode() {
        return this.peerConnectionFactory.hashCode();
    }

    public String toString() {
        return "PeerConnectionFactoryManager(peerConnectionFactory=" + this.peerConnectionFactory + ')';
    }

    public PeerConnectionFactoryManager(PeerConnectionFactory peerConnectionFactory) {
        Intrinsics.checkNotNullParameter(peerConnectionFactory, "peerConnectionFactory");
        this.peerConnectionFactory = peerConnectionFactory;
    }

    public final PeerConnectionFactory getPeerConnectionFactory() {
        return this.peerConnectionFactory;
    }

    /* renamed from: isDisposed, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final void dispose() {
        LKLog.Logger logger;
        if (this.isDisposed) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.WARN;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, null, "Calling dispose multiple times on PeerConnectionFactory?");
            return;
        }
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt.startsWith$default(name, RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false, 2, (Object) null)) {
            throw new IllegalStateException("PeerConnectionFactory must be disposed on the RTC thread!");
        }
        this.isDisposed = true;
        this.peerConnectionFactory.dispose();
    }
}
