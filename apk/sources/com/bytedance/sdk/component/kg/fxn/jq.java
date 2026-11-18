package com.bytedance.sdk.component.kg.fxn;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes15.dex */
public final class jq {
    private String fxn;
    private String kg;

    private jq(String str) {
        this.fxn = str;
    }

    public static jq fxn(String str) {
        return new jq(str);
    }

    public String fxn() {
        return this.fxn;
    }

    public Charset fxn(Charset charset) {
        try {
            String str = this.kg;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
