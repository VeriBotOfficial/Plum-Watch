package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.rmu;
import io.agora.utils2.internal.CommonUtility;

/* loaded from: classes14.dex */
public class hm {
    public static String fxn = "com.bytedance.openadsdk";
    public static String kg = CommonUtility.PREFIX_URI + fxn + ".TTMultiProvider";

    static {
        fxn();
    }

    public static void fxn() {
        if (rmu.fxn() != null) {
            fxn = rmu.fxn().getPackageName();
            kg = CommonUtility.PREFIX_URI + fxn + ".TTMultiProvider";
        }
    }
}
