package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SafeStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10842a = "SafeStringBuilder";
    private static final String b = "";

    public static String substring(StringBuilder sb, int r4) {
        if (!TextUtils.isEmpty(sb) && sb.length() >= r4 && r4 >= 0) {
            try {
                return sb.substring(r4);
            } catch (Exception e) {
                Log.e(f10842a, "substring exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static String substring(StringBuilder sb, int r3, int r4) {
        if (!TextUtils.isEmpty(sb) && r3 >= 0 && r4 <= sb.length() && r4 >= r3) {
            try {
                return sb.substring(r3, r4);
            } catch (Exception e) {
                Log.e(f10842a, "substring: " + e.getMessage());
            }
        }
        return "";
    }
}
