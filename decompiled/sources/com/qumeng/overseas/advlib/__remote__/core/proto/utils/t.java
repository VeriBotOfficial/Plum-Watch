package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

/* loaded from: classes17.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static long f12863a;

    public static boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - f12863a) <= 500) {
            f12863a = currentTimeMillis;
            return true;
        }
        f12863a = currentTimeMillis;
        return false;
    }
}
