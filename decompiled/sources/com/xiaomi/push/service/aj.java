package com.xiaomi.push.service;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class aj {

    /* renamed from: a, reason: collision with root package name */
    private static long f14745a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static String f1004a = "";

    public static String a() {
        if (TextUtils.isEmpty(f1004a)) {
            f1004a = com.xiaomi.push.bc.a(4);
        }
        StringBuilder append = new StringBuilder().append(f1004a);
        long j = f14745a;
        f14745a = 1 + j;
        return append.append(j).toString();
    }

    public static String b() {
        return com.xiaomi.push.bc.a(32);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }
}
