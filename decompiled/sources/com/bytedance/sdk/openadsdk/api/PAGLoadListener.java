package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.bh;

/* loaded from: classes14.dex */
public interface PAGLoadListener<Ad> extends bh {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.bh
    void onError(int i, String str);
}
