package com.bytedance.sdk.openadsdk.fxn.rb;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class kg implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener fxn;

    public kg(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.fxn = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
    public void onError(final int i, final String str) {
        if (this.fxn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fxn.rb.kg.1
            @Override // java.lang.Runnable
            public void run() {
                if (kg.this.fxn != null) {
                    kg.this.fxn.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fxn.rb.kg.2
            @Override // java.lang.Runnable
            public void run() {
                if (kg.this.fxn != null) {
                    kg.this.fxn.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
