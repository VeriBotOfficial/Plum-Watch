package com.bytedance.sdk.component.kg.fxn;

/* loaded from: classes13.dex */
public final class bh {
    private final String[] fxn;

    public bh(String[] strArr) {
        this.fxn = strArr;
    }

    public int fxn() {
        return this.fxn.length / 2;
    }

    public String fxn(int i) {
        return this.fxn[i * 2];
    }

    public String kg(int i) {
        return this.fxn[(i * 2) + 1];
    }
}
