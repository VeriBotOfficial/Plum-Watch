package com.huawei.hms.hmsscankit;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;

/* compiled from: OnResultCallbackDelegate.java */
/* loaded from: classes14.dex */
class e extends IOnResultCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    private final OnResultCallback f10444a;
    private String b;
    private boolean c;

    e(OnResultCallback onResultCallback, boolean z) {
        this.f10444a = onResultCallback;
        this.c = z;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
    public void onResult(HmsScan[] hmsScanArr) throws RemoteException {
        HmsScan hmsScan;
        com.huawei.hms.scankit.util.a.c("OnResultCallbackDelegat", "result callback sdk continueScan" + this.c);
        if (this.c) {
            this.f10444a.onResult(hmsScanArr);
            return;
        }
        if (hmsScanArr == null || hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.equals(this.b, hmsScan.getOriginalValue())) {
            return;
        }
        this.b = hmsScanArr[0].getOriginalValue();
        com.huawei.hms.scankit.util.a.c("OnResultCallbackDelegat", "result callback sdk continueScan" + this.c);
        this.f10444a.onResult(hmsScanArr);
    }
}
