package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes14.dex */
public class PAGRewardItem {
    private final int fxn;
    private final String kg;

    public PAGRewardItem(int i, String str) {
        this.fxn = i;
        this.kg = str;
    }

    public int getRewardAmount() {
        return this.fxn;
    }

    public String getRewardName() {
        return this.kg;
    }
}
