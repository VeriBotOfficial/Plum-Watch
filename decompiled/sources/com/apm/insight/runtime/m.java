package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: NpthHandlerThread.java */
/* loaded from: classes12.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f6118a;
    private static volatile Handler b;

    private static HandlerThread b() {
        if (f6118a == null) {
            synchronized (m.class) {
                if (f6118a == null) {
                    p pVar = new p("default_npth_thread");
                    f6118a = pVar;
                    pVar.b();
                }
            }
        }
        return f6118a.c();
    }

    public static p a() {
        if (f6118a == null) {
            b();
        }
        return f6118a;
    }
}
