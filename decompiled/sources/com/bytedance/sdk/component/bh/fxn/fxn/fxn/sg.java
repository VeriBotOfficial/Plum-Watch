package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import com.bytedance.sdk.component.bh.fxn.tw;
import io.agora.utils2.internal.CommonUtility;

/* loaded from: classes13.dex */
public class sg {
    public static String fxn = "com.bytedance.openadsdk";
    public static String kg = CommonUtility.PREFIX_URI + fxn + ".TTMultiProvider";

    static {
        fxn();
    }

    public static void fxn() {
        if (tw.sg().bh() != null) {
            fxn = tw.sg().bh().getPackageName();
            kg = CommonUtility.PREFIX_URI + fxn + ".TTMultiProvider";
        }
    }
}
