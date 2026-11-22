package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes13.dex */
public class jq {
    private static volatile Handler fxn;

    public static Handler fxn() {
        return com.bytedance.sdk.component.tw.fxn.fxn.fxn().kg();
    }

    public static Handler kg() {
        if (fxn == null) {
            synchronized (jq.class) {
                if (fxn == null) {
                    fxn = new Handler(Looper.getMainLooper());
                }
            }
        }
        return fxn;
    }
}
