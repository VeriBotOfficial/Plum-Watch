package com.bytedance.sdk.openadsdk.ckl;

import com.bytedance.sdk.component.tw.tw;
import com.bytedance.sdk.openadsdk.core.uhw;
import com.bytedance.sdk.openadsdk.hm.fxn.bh;
import com.bytedance.sdk.openadsdk.utils.yws;

/* loaded from: classes14.dex */
public class fxn {
    public static void fxn() {
        if (yws.bh()) {
            yws.fxn(new tw("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.ckl.fxn.1
                @Override // java.lang.Runnable
                public void run() {
                    fxn.gff();
                }
            });
        } else {
            gff();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gff() {
        com.bytedance.sdk.openadsdk.hm.fxn.fxn.kg();
        bh.fxn();
        uhw.fxn();
    }
}
