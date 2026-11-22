package com.hispark.clouddiag.callback;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;

/* compiled from: ConnectionCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/callback/ConnectionCallback;", "", "onConnected", "", "onDisconnected", ParameterNames.CAUSE, "", "onConnectionFailed", "error", "onReconnecting", "retryCount", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ConnectionCallback {
    void onConnected();

    void onConnectionFailed(Throwable error);

    void onDisconnected(Throwable cause);

    void onReconnecting(int retryCount);

    /* compiled from: ConnectionCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onReconnecting(ConnectionCallback connectionCallback, int i) {
        }

        public static /* synthetic */ void onDisconnected$default(ConnectionCallback connectionCallback, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDisconnected");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            connectionCallback.onDisconnected(th);
        }
    }
}
