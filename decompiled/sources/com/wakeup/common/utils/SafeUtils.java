package com.wakeup.common.utils;

import com.blankj.utilcode.util.RegexUtils;

/* loaded from: classes2.dex */
public class SafeUtils {
    private SafeUtils() {
    }

    public static String mosaicPhone(String phone) {
        if (phone == null || !RegexUtils.isMobileSimple(phone)) {
            return "";
        }
        return phone.substring(0, 3) + "****" + phone.substring(phone.length() - 4, phone.length());
    }
}
