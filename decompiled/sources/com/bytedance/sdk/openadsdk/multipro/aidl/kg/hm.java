package com.bytedance.sdk.openadsdk.multipro.aidl.kg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class hm extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.fxn.rb.fxn fxn;

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    public hm(com.bytedance.sdk.openadsdk.fxn.rb.fxn fxnVar) {
        this.fxn = fxnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn() {
        this.fxn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.hm.1
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.fxn != null) {
                    hm.this.fxn.fxn();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.hm.2
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.fxn != null) {
                    hm.this.fxn.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.hm.3
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.fxn != null) {
                    hm.this.fxn.kg();
                }
                hm.this.fxn();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z, final int i, final String str, final int i2, final String str2) throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.hm.4
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.fxn != null) {
                    hm.this.fxn.fxn(z, i, str, i2, str2);
                }
            }
        });
    }
}
