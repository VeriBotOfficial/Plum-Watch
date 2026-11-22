package com.huawei.hms.hmsscankit;

import android.os.RemoteException;
import android.util.Log;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;

/* compiled from: OnErrorCallbackDelegate.java */
/* loaded from: classes14.dex */
class c extends IOnErrorCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    private final OnErrorCallback f10442a;

    c(OnErrorCallback onErrorCallback) {
        this.f10442a = onErrorCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
    public void onError(int i) throws RemoteException {
        if (this.f10442a != null) {
            Log.i("OnErrorCallbackDelegate", "onError: ErrorCode：" + i);
            this.f10442a.onError(i);
        }
    }
}
