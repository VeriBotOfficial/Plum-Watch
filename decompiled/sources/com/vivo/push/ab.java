package com.vivo.push;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: Worker.java */
/* loaded from: classes2.dex */
public abstract class ab {

    /* renamed from: a, reason: collision with root package name */
    protected Context f14039a;
    protected Handler b;
    private final Object c = new Object();

    public abstract void b(Message message);

    public ab() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.b = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.f14039a = context;
    }

    public final void a(Message message) {
        synchronized (this.c) {
            Handler handler = this.b;
            if (handler == null) {
                com.vivo.push.util.t.e(getClass().getSimpleName(), ("Dead worker dropping a message: " + message.what) + " (Thread " + Thread.currentThread().getId() + Separators.RPAREN);
            } else {
                handler.sendMessage(message);
            }
        }
    }

    /* compiled from: Worker.java */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ab.this.b(message);
        }
    }
}
