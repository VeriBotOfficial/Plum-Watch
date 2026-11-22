package com.huawei.hms.hmsscankit;

import android.os.RemoteException;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;

/* compiled from: OnLightVisibleCallBackDelegata.java */
/* loaded from: classes14.dex */
class d extends IOnLightCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    private final OnLightVisibleCallBack f10443a;

    d(OnLightVisibleCallBack onLightVisibleCallBack) {
        this.f10443a = onLightVisibleCallBack;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnLightCallback
    public void onVisibleChanged(boolean z) throws RemoteException {
        this.f10443a.onVisibleChanged(z);
    }
}
