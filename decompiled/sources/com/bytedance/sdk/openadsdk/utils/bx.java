package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.efs.sdk.base.core.util.NetworkUtil;

/* loaded from: classes14.dex */
public class bx {
    public static String fxn(Context context) {
        int fxn = com.bytedance.sdk.component.utils.ke.fxn(context, 0L);
        if (fxn == 2) {
            return NetworkUtil.NETWORK_CLASS_2G;
        }
        if (fxn == 3) {
            return NetworkUtil.NETWORK_CLASS_3G;
        }
        if (fxn == 4) {
            return "wifi";
        }
        if (fxn == 5) {
            return NetworkUtil.NETWORK_CLASS_4G;
        }
        if (fxn == 6) {
            return NetworkUtil.NETWORK_CLASS_5G;
        }
        return "mobile";
    }
}
