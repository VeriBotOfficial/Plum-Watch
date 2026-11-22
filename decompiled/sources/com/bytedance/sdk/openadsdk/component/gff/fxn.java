package com.bytedance.sdk.openadsdk.component.gff;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class fxn implements com.bytedance.sdk.openadsdk.fxn.gff.kg {
    private final PAGInterstitialAdInteractionListener fxn;
    private final AtomicBoolean kg = new AtomicBoolean(false);
    private final AtomicBoolean gff = new AtomicBoolean(false);

    public fxn(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.fxn = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.gff.kg
    public void fxn() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener;
        if (this.kg.compareAndSet(false, true) && (pAGInterstitialAdInteractionListener = this.fxn) != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.gff.kg
    public void kg() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener;
        if (this.gff.compareAndSet(false, true) && (pAGInterstitialAdInteractionListener = this.fxn) != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.fxn;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
