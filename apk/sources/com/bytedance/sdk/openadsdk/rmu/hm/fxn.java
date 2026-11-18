package com.bytedance.sdk.openadsdk.rmu.hm;

/* JADX INFO: loaded from: classes11.dex */
public class fxn {
    public static long fxn() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % 86400000);
    }

    public static boolean fxn(long j) {
        return j - (j % 86400000) == fxn();
    }
}
