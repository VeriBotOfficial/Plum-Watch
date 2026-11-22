package com.wakeup.howear.view.home.viewmodel;

import kotlin.Metadata;

/* compiled from: FunctionComponentRefreshPolicy.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/wakeup/howear/view/home/viewmodel/FunctionComponentRefreshPolicy;", "", "<init>", "()V", "resolve", "Lcom/wakeup/howear/view/home/viewmodel/FunctionComponentRefreshAction;", "featureEnabled", "", "hasCache", "remoteSucceeded", "remoteChanged", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FunctionComponentRefreshPolicy {
    public static final FunctionComponentRefreshPolicy INSTANCE = new FunctionComponentRefreshPolicy();

    private FunctionComponentRefreshPolicy() {
    }

    public final FunctionComponentRefreshAction resolve(boolean featureEnabled, boolean hasCache, boolean remoteSucceeded, boolean remoteChanged) {
        if (!featureEnabled && !remoteSucceeded) {
            return FunctionComponentRefreshAction.RETAIN_CACHE;
        }
        if (!featureEnabled && (!hasCache || remoteChanged)) {
            return FunctionComponentRefreshAction.RENDER_REMOTE;
        }
        if (!featureEnabled) {
            return FunctionComponentRefreshAction.RETAIN_CACHE;
        }
        if (!remoteSucceeded && hasCache) {
            return FunctionComponentRefreshAction.RETAIN_CACHE;
        }
        if (!remoteSucceeded) {
            return FunctionComponentRefreshAction.RENDER_EMPTY_FALLBACK;
        }
        if (!hasCache || remoteChanged) {
            return FunctionComponentRefreshAction.RENDER_REMOTE;
        }
        return FunctionComponentRefreshAction.MARK_REMOTE;
    }
}
