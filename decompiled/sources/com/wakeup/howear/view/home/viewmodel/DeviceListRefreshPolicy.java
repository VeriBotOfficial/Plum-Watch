package com.wakeup.howear.view.home.viewmodel;

import kotlin.Metadata;

/* compiled from: FunctionComponentRefreshPolicy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/view/home/viewmodel/DeviceListRefreshPolicy;", "", "<init>", "()V", "onFailure", "Lcom/wakeup/howear/view/home/viewmodel/DeviceListRefreshFailureAction;", "featureEnabled", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceListRefreshPolicy {
    public static final DeviceListRefreshPolicy INSTANCE = new DeviceListRefreshPolicy();

    private DeviceListRefreshPolicy() {
    }

    public final DeviceListRefreshFailureAction onFailure(boolean featureEnabled) {
        if (featureEnabled) {
            return DeviceListRefreshFailureAction.RETAIN_LOCAL;
        }
        return DeviceListRefreshFailureAction.RENDER_EMPTY;
    }
}
