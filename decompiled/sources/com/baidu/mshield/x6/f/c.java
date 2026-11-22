package com.baidu.mshield.x6.f;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: BackgroundThread.java */
/* loaded from: classes13.dex */
public class c extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f8483a;
    public static Handler b;

    public c() {
        super("BackgroundThread", 10);
    }

    public static void a() {
        if (f8483a == null) {
            f8483a = new c();
            f8483a.start();
            b = new Handler(f8483a.getLooper());
        }
    }

    public static Handler b() {
        Handler handler;
        try {
            synchronized (c.class) {
                a();
                handler = b;
            }
            return handler;
        } catch (Throwable th) {
            f.b(th);
            return b;
        }
    }
}
