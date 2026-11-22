package com.phancy.mini.core;

import kotlin.Metadata;

/* compiled from: IApiBridge.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J$\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\r"}, d2 = {"Lcom/phancy/mini/core/IApiBridge;", "", "callback", "", "callbackId", "", "result", "invoke", "event", "params", "onInvokeSyncEvent", "shouldInterceptSyncEvent", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IApiBridge {
    void callback(String callbackId, String result);

    void invoke(String event, String params, String callbackId);

    String onInvokeSyncEvent(String event, String params, String callbackId);

    boolean shouldInterceptSyncEvent(String event, String params);
}
