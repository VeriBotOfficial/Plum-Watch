package com.huawei.hms.base.ui;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class LogUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f10274a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    private static String a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void e(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, z));
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int r2 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int r4 = 0; r4 < length; r4++) {
            char cCharAt = str.charAt(r4);
            if (f10274a.matcher(String.valueOf(cCharAt)).matches()) {
                if (r2 % 2 == 0) {
                    cCharAt = '*';
                }
                r2++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
