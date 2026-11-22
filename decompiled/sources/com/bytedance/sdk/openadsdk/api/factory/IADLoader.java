package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.bh;

/* loaded from: classes14.dex */
public interface IADLoader<R extends PAGRequest, L extends bh> {
    void loadAd(String str, R r, L l);
}
