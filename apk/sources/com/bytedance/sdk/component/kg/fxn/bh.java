package com.bytedance.sdk.component.kg.fxn;

/* JADX INFO: loaded from: classes15.dex */
public final class bh {
    private final String[] fxn;

    public bh(String[] strArr) {
        this.fxn = strArr;
    }

    public int fxn() {
        return this.fxn.length / 2;
    }

    public String fxn(int r2) {
        return this.fxn[r2 * 2];
    }

    public String kg(int r2) {
        return this.fxn[(r2 * 2) + 1];
    }
}
