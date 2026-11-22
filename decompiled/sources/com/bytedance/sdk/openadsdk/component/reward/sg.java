package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class sg implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener fxn;

    public sg(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.fxn = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
    public void onError(final int i, final String str) {
        if (this.fxn != null) {
            yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.sg.1
                @Override // java.lang.Runnable
                public void run() {
                    if (sg.this.fxn != null) {
                        sg.this.fxn.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.fxn != null) {
            yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.sg.2
                @Override // java.lang.Runnable
                public void run() {
                    if (sg.this.fxn != null) {
                        sg.this.fxn.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
