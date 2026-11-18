package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f12863a;

    public static boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - f12863a) <= 500) {
            f12863a = jCurrentTimeMillis;
            return true;
        }
        f12863a = jCurrentTimeMillis;
        return false;
    }
}
