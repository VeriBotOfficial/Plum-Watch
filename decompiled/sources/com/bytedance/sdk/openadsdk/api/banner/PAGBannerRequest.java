package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes14.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize fxn;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.fxn = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.fxn;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.fxn = pAGBannerSize;
    }
}
