package com.huawei.hms.opendevice;

import android.text.TextUtils;

/* compiled from: StringUtils.java */
/* loaded from: classes14.dex */
public class p {
    public static boolean a(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
