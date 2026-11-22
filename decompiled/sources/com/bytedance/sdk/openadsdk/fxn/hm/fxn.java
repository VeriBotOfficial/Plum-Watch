package com.bytedance.sdk.openadsdk.fxn.hm;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class fxn implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener fxn;

    public fxn(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.fxn = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
    public void onError(final int i, final String str) {
        if (this.fxn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fxn.hm.fxn.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.fxn == null) {
            return;
        }
        yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fxn.hm.fxn.2
            @Override // java.lang.Runnable
            public void run() {
                if (fxn.this.fxn != null) {
                    fxn.this.fxn.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
