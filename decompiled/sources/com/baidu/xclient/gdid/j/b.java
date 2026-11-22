package com.baidu.xclient.gdid.j;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes13.dex */
public class b extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public static b f9063a;
    public static Handler b;

    public b() {
        super("BackgroundThread", 10);
    }

    public static b a() {
        b bVar;
        synchronized (b.class) {
            c();
            bVar = f9063a;
        }
        return bVar;
    }

    public static Handler b() {
        Handler handler;
        synchronized (b.class) {
            c();
            handler = b;
        }
        return handler;
    }

    public static void c() {
        if (f9063a == null) {
            b bVar = new b();
            f9063a = bVar;
            bVar.start();
            b = new Handler(f9063a.getLooper());
        }
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            b().post(runnable);
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
