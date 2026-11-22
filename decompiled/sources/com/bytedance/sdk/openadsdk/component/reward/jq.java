package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class jq implements com.bytedance.sdk.openadsdk.fxn.rb.fxn {
    private final PAGRewardedAdInteractionListener fxn;
    private final AtomicBoolean gff;
    private final AtomicBoolean hm;
    private final PAGRewardedAdInteractionCallback kg;
    private final AtomicBoolean rb;

    public jq(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.gff = new AtomicBoolean(false);
        this.hm = new AtomicBoolean(false);
        this.rb = new AtomicBoolean(false);
        this.fxn = pAGRewardedAdInteractionListener;
        this.kg = null;
    }

    public jq(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.gff = new AtomicBoolean(false);
        this.hm = new AtomicBoolean(false);
        this.rb = new AtomicBoolean(false);
        this.kg = pAGRewardedAdInteractionCallback;
        this.fxn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.rb.fxn
    public void fxn() {
        if (this.gff.compareAndSet(false, true)) {
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.fxn;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.kg;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.fxn;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.kg;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.rb.fxn
    public void kg() {
        if (this.hm.compareAndSet(false, true)) {
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.fxn;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.kg;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fxn.rb.fxn
    public void fxn(boolean z, int i, String str, int i2, String str2) {
        if (this.rb.compareAndSet(false, true)) {
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.fxn;
            if (pAGRewardedAdInteractionListener != null) {
                if (z) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.kg;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
                }
            }
        }
    }
}
