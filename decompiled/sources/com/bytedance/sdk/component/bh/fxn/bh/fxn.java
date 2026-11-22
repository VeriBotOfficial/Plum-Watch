package com.bytedance.sdk.component.bh.fxn.bh;

import com.bytedance.sdk.component.bh.fxn.tw;

/* loaded from: classes13.dex */
public class fxn {
    private static volatile kg fxn;

    public static kg fxn() {
        if (fxn == null) {
            synchronized (kg.class) {
                if (fxn == null) {
                    fxn = new gff(tw.sg().bh(), new bh(tw.sg().bh()));
                }
            }
        }
        return fxn;
    }
}
