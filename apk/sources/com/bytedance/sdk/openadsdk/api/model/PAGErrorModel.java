package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes11.dex */
public class PAGErrorModel {
    private final int fxn;
    private final String kg;

    public PAGErrorModel(int r1, String str) {
        this.fxn = r1;
        this.kg = str;
    }

    public int getErrorCode() {
        return this.fxn;
    }

    public String getErrorMessage() {
        return this.kg;
    }
}
