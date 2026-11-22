package com.bytedance.adsdk.kg.gff;

import com.bytedance.adsdk.kg.zu;

/* loaded from: classes13.dex */
public class rb {
    private static final rb fxn = new rb();
    private final zu<String, com.bytedance.adsdk.kg.sg> kg = new zu<>(20);

    public static rb fxn() {
        return fxn;
    }

    rb() {
    }

    public com.bytedance.adsdk.kg.sg fxn(String str) {
        if (str == null) {
            return null;
        }
        return this.kg.fxn((zu<String, com.bytedance.adsdk.kg.sg>) str);
    }

    public void fxn(String str, com.bytedance.adsdk.kg.sg sgVar) {
        if (str == null) {
            return;
        }
        this.kg.fxn(str, sgVar);
    }
}
