package com.bytedance.sdk.openadsdk.component.gff;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class kg implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener fxn;

    public kg(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.fxn = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
    public void onError(final int i, final String str) {
        if (this.fxn != null) {
            yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.gff.kg.1
                @Override // java.lang.Runnable
                public void run() {
                    if (kg.this.fxn != null) {
                        kg.this.fxn.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.fxn != null) {
            yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.gff.kg.2
                @Override // java.lang.Runnable
                public void run() {
                    if (kg.this.fxn != null) {
                        kg.this.fxn.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
