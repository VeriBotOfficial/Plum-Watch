package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.os.Build;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.qumeng.overseas.advlib.core.ADEvent;

/* loaded from: classes17.dex */
public class r {
    public static boolean a() {
        return a(Const.BRAND_HUAWEI) || a(Const.BRAND_HONOR);
    }

    public static boolean b() {
        return a("meizu");
    }

    public static boolean c() {
        return a(ADEvent.OPPO);
    }

    public static boolean d() {
        return a("samsung");
    }

    public static boolean e() {
        return a("vivo");
    }

    public static boolean f() {
        return a("xiaomi");
    }

    public static boolean a(String str) {
        String str2 = Build.MANUFACTURER;
        String str3 = Build.FINGERPRINT;
        String str4 = Build.BRAND;
        if (!TextUtils.isEmpty(str4) && str4.toLowerCase().contains(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2) || !str2.toLowerCase().contains(str)) {
            return !TextUtils.isEmpty(str3) && str3.toLowerCase().contains(str);
        }
        return true;
    }
}
