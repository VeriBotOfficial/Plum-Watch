package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes14.dex */
public class PAGErrorModel {
    private final int fxn;
    private final String kg;

    public PAGErrorModel(int i, String str) {
        this.fxn = i;
        this.kg = str;
    }

    public int getErrorCode() {
        return this.fxn;
    }

    public String getErrorMessage() {
        return this.kg;
    }
}
