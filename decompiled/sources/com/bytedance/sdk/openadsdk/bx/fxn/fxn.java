package com.bytedance.sdk.openadsdk.bx.fxn;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.tw;

/* loaded from: classes14.dex */
public class fxn {
    private static Handler fxn;
    private static HandlerThread kg;

    public static Handler fxn() {
        HandlerThread handlerThread;
        try {
            handlerThread = kg;
        } catch (Throwable unused) {
        }
        if (handlerThread != null && handlerThread.isAlive()) {
            if (fxn == null) {
                synchronized (fxn.class) {
                    if (fxn == null) {
                        fxn = new Handler(kg.getLooper());
                    }
                }
            }
            return fxn;
        }
        synchronized (fxn.class) {
            HandlerThread handlerThread2 = kg;
            if (handlerThread2 == null || !handlerThread2.isAlive()) {
                kg = tw.fxn("csj_ev");
                fxn = new Handler(kg.getLooper());
            }
        }
        return fxn;
    }
}
