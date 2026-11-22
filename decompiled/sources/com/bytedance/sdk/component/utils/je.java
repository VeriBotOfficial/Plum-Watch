package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;

/* loaded from: classes13.dex */
public class je {
    public static boolean fxn(Context context) {
        return gff(context) != 0;
    }

    public static int kg(Context context) {
        int gff = gff(context);
        if (gff == 1) {
            return 0;
        }
        if (gff == 4) {
            return 1;
        }
        if (gff == 5) {
            return 4;
        }
        if (gff != 6) {
            return gff;
        }
        return 6;
    }

    public static int gff(Context context) {
        return ke.fxn(context, 60000L);
    }

    public static boolean hm(Context context) {
        return gff(context) == 4;
    }

    public static boolean rb(Context context) {
        return gff(context) == 5;
    }

    public static boolean bh(Context context) {
        return gff(context) == 6;
    }

    public static String sg(Context context) {
        int gff = gff(context);
        if (gff == 2) {
            return NetworkUtil.NETWORK_CLASS_2G;
        }
        if (gff == 3) {
            return NetworkUtil.NETWORK_CLASS_3G;
        }
        if (gff == 4) {
            return "wifi";
        }
        if (gff == 5) {
            return NetworkUtil.NETWORK_CLASS_4G;
        }
        if (gff == 6) {
            return NetworkUtil.NETWORK_CLASS_5G;
        }
        return "mobile";
    }

    public static boolean fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean tw(Context context) {
        if (context == null) {
            return false;
        }
        int gff = gff(context);
        return gff == 2 || gff == 3 || gff == 4 || gff == 5 || gff == 6;
    }
}
