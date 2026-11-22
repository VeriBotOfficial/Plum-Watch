package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* loaded from: classes14.dex */
public class PAGBiddingRequest {
    private PAGBannerSize fxn = null;
    private String kg = null;
    private String gff = null;

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.fxn = pAGBannerSize;
    }

    public PAGBannerSize getBannerSize() {
        return this.fxn;
    }

    public void setSlotId(String str) {
        this.kg = str;
    }

    public String getSlotId() {
        return this.kg;
    }

    public String getAdxId() {
        return this.gff;
    }

    public void setAdxId(String str) {
        this.gff = str;
    }
}
