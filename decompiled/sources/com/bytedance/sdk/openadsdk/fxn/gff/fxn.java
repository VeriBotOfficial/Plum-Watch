package com.bytedance.sdk.openadsdk.fxn.gff;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class fxn implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener fxn;

    public fxn(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.fxn = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
    public void onError(final int i, final String str) {
        if (this.fxn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fxn.gff.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fxn.gff.fxn.2
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
