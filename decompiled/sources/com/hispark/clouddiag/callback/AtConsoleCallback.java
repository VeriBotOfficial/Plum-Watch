package com.hispark.clouddiag.callback;

import kotlin.Metadata;

/* compiled from: AtConsoleCallback.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¨\u0006\u000e"}, d2 = {"Lcom/hispark/clouddiag/callback/AtConsoleCallback;", "", "onAtConsoleEvent", "", "event", "Lcom/hispark/clouddiag/callback/AtConsoleEvent;", "onAtCommandSendResult", "deviceId", "", "payload", "", "success", "", "errorMessage", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AtConsoleCallback {
    void onAtCommandSendResult(String deviceId, byte[] payload, boolean success, String errorMessage);

    void onAtConsoleEvent(AtConsoleEvent event);
}
