package com.alipay.sdk.m.q0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f1442a = Pattern.compile("([\t\r\n])+");

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int r0 = 0;
        for (char c : str.toCharArray()) {
            r0 = (r0 * 31) + c;
        }
        return r0;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
