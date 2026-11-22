package com.bytedance.sdk.openadsdk.multipro.aidl.kg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class gff extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.fxn.gff.kg fxn;

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    public gff(com.bytedance.sdk.openadsdk.fxn.gff.kg kgVar) {
        this.fxn = kgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn() {
        this.fxn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.gff.1
            @Override // java.lang.Runnable
            public void run() {
                if (gff.this.fxn != null) {
                    gff.this.fxn.fxn();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.gff.2
            @Override // java.lang.Runnable
            public void run() {
                if (gff.this.fxn != null) {
                    gff.this.fxn.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.kg.gff.3
            @Override // java.lang.Runnable
            public void run() {
                if (gff.this.fxn != null) {
                    gff.this.fxn.kg();
                }
                gff.this.fxn();
            }
        });
    }
}
