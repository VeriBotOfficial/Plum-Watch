package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes11.dex */
public class PAGRewardItem {
    private final int fxn;
    private final String kg;

    public PAGRewardItem(int r1, String str) {
        this.fxn = r1;
        this.kg = str;
    }

    public int getRewardAmount() {
        return this.fxn;
    }

    public String getRewardName() {
        return this.kg;
    }
}
