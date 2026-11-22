package com.bytedance.sdk.openadsdk.rmu.hm;

/* loaded from: classes14.dex */
public class fxn {
    public static long fxn() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - (currentTimeMillis % 86400000);
    }

    public static boolean fxn(long j) {
        return j - (j % 86400000) == fxn();
    }
}
