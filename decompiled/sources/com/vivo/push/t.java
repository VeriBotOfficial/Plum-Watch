package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: PushClientThread.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f14139a = new Handler(Looper.getMainLooper());
    private static final HandlerThread b;
    private static final Handler c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        b = handlerThread;
        handlerThread.start();
        c = new u(handlerThread.getLooper());
    }

    public static void a(s sVar, long j) {
        if (sVar == null) {
            com.vivo.push.util.t.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a2 = sVar.a();
        if (j > 0) {
            c.removeMessages(a2);
        }
        Message message = new Message();
        message.what = a2;
        message.obj = sVar;
        c.sendMessageDelayed(message, j);
    }

    public static void a(RunnableC3082r runnableC3082r) {
        Handler handler = c;
        handler.removeCallbacks(runnableC3082r);
        handler.postDelayed(runnableC3082r, 15000L);
    }

    public static void a(Runnable runnable) {
        f14139a.post(runnable);
    }

    public static void b(Runnable runnable) {
        Handler handler = c;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
