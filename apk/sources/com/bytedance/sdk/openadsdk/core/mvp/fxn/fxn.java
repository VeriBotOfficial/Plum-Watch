package com.bytedance.sdk.openadsdk.core.mvp.fxn;

/* JADX INFO: loaded from: classes11.dex */
public enum fxn {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int tw;

    fxn(int r3) {
        this.tw = r3;
    }

    public String fxn() {
        return String.valueOf(this.tw);
    }
}
