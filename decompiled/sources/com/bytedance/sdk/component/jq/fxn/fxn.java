package com.bytedance.sdk.component.jq.fxn;

/* loaded from: classes13.dex */
public class fxn {
    private static volatile fxn kg;
    private volatile kg fxn;

    private fxn() {
    }

    public static fxn fxn() {
        if (kg == null) {
            synchronized (fxn.class) {
                if (kg == null) {
                    kg = new fxn();
                }
            }
        }
        return kg;
    }

    public void fxn(kg kgVar) {
        this.fxn = kgVar;
    }

    public kg kg() {
        return this.fxn;
    }
}
