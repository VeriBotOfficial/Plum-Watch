package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.zu;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* loaded from: classes14.dex */
public class kg {
    public static Boolean fxn;

    public static void fxn() {
        fxn = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("sp_multi_info", "is_support_multi_process", Boolean.TRUE);
    }

    public static void kg() {
        fxn = Boolean.FALSE;
        BinderPoolService.fxn = true;
    }

    public static boolean gff() {
        Boolean bool = fxn;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!zu.rb()) {
            return false;
        }
        if (fxn == null) {
            fxn = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("sp_multi_info", "is_support_multi_process", false));
        }
        return fxn.booleanValue();
    }
}
