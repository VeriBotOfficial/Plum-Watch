package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* loaded from: classes13.dex */
public class tw {
    private static HandlerThread fxn;

    public static void fxn(HandlerThread handlerThread) {
        fxn = handlerThread;
    }

    public static HandlerThread fxn(String str) {
        return fxn(str, 0);
    }

    public static HandlerThread fxn(String str, int i) {
        if (com.bytedance.sdk.component.tw.jq.sCrashHappened) {
            return fxn;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.tw.1
                boolean fxn = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.fxn) {
                        return;
                    }
                    this.fxn = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            dx.fxn("HandlerThreadUtils", "new handlerThread error", th);
            return fxn;
        }
    }
}
