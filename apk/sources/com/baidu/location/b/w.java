package com.baidu.location.b;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes15.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HandlerThread f7592a;

    public static synchronized HandlerThread a() {
        if (f7592a == null) {
            try {
                HandlerThread handlerThread = new HandlerThread("ServiceStartArguments", 10);
                f7592a = handlerThread;
                handlerThread.start();
            } catch (Throwable th) {
                th.printStackTrace();
                f7592a = null;
            }
        }
        return f7592a;
    }
}
