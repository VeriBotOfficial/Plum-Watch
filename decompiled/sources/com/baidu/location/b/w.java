package com.baidu.location.b;

import android.os.HandlerThread;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static HandlerThread f7592a;

    public static synchronized HandlerThread a() {
        HandlerThread handlerThread;
        synchronized (w.class) {
            if (f7592a == null) {
                try {
                    HandlerThread handlerThread2 = new HandlerThread("ServiceStartArguments", 10);
                    f7592a = handlerThread2;
                    handlerThread2.start();
                } catch (Throwable th) {
                    th.printStackTrace();
                    f7592a = null;
                }
            }
            handlerThread = f7592a;
        }
        return handlerThread;
    }
}
