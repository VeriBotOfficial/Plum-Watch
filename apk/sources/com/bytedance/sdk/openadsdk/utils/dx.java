package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes11.dex */
public class dx {
    public static int fxn() {
        try {
            int r1 = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (r1 <= 2) {
                return 2;
            }
            if (r1 >= 5) {
                return 5;
            }
            return r1;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
