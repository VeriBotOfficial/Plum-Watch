package com.bytedance.sdk.openadsdk.multipro.aidl.kg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class fxn extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.fxn.hm.kg fxn;

    public fxn(com.bytedance.sdk.openadsdk.fxn.hm.kg kgVar) {
        this.fxn = kgVar;
    }

    private void fxn() {
        this.fxn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        fxn();
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.fxn();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.fxn.2
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.fxn.3
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.kg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.fxn.4
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.gff();
                }
            }
        });
    }
}
