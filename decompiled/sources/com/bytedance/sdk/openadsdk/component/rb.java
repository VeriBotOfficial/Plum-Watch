package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class rb implements com.bytedance.sdk.openadsdk.fxn.hm.kg {
    private final PAGAppOpenAdInteractionListener fxn;
    private final AtomicBoolean kg = new AtomicBoolean(false);

    public rb(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.fxn = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.hm.kg
    public void fxn() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.fxn;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.fxn;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.hm.kg
    public void kg() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.kg.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.fxn) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.hm.kg
    public void gff() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.kg.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.fxn) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
