package io.livekit.android.room.network;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkCallbackManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/livekit/android/room/network/NetworkCallbackManagerImpl;", "Lio/livekit/android/room/network/NetworkCallbackManager;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectivityManager", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "(Landroid/net/ConnectivityManager$NetworkCallback;Lio/livekit/android/room/network/NetworkCallbackRegistry;)V", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "close", "", "registerCallback", "unregisterCallback", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkCallbackManagerImpl implements NetworkCallbackManager {
    private final NetworkCallbackRegistry connectivityManager;
    private final AtomicBoolean isClosed;
    private final AtomicBoolean isRegistered;
    private final ConnectivityManager.NetworkCallback networkCallback;

    public NetworkCallbackManagerImpl(ConnectivityManager.NetworkCallback networkCallback, NetworkCallbackRegistry connectivityManager) {
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.networkCallback = networkCallback;
        this.connectivityManager = connectivityManager;
        this.isRegistered = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
    }

    @Override // io.livekit.android.room.network.NetworkCallbackManager
    public synchronized void registerCallback() {
        LKLog.Logger logger;
        if (!this.isClosed.get() && this.isRegistered.compareAndSet(false, true)) {
            try {
                NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
                NetworkCallbackRegistry networkCallbackRegistry = this.connectivityManager;
                Intrinsics.checkNotNull(build);
                networkCallbackRegistry.registerNetworkCallback(build, this.networkCallback);
            } catch (Exception e) {
                LKLog.Companion companion = LKLog.INSTANCE;
                LoggingLevel loggingLevel = LoggingLevel.WARN;
                if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion.getLogger()) != null) {
                    logger.log(loggingLevel, e, "Exception when trying to register network callback, reconnection may be impaired.");
                }
            }
        }
    }

    @Override // io.livekit.android.room.network.NetworkCallbackManager
    public synchronized void unregisterCallback() {
        LKLog.Logger logger;
        if (!this.isClosed.get() && this.isRegistered.compareAndSet(true, false)) {
            try {
                this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
            } catch (IllegalArgumentException unused) {
                LKLog.Companion companion = LKLog.INSTANCE;
                LoggingLevel loggingLevel = LoggingLevel.WARN;
                if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion.getLogger()) != null) {
                    logger.log(loggingLevel, null, "NetworkCallback was unregistered multiple times?");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.isClosed.get()) {
            return;
        }
        if (this.isRegistered.get()) {
            unregisterCallback();
        }
        this.isClosed.set(true);
    }
}
