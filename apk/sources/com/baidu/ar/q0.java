package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes16.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7123a;
    public HandlerThread b;
    public a c;

    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void a(Runnable runnable) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = runnable;
            sendMessage(messageObtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public q0(String str) {
        this.f7123a = str;
    }

    public void a() {
        HandlerThread handlerThread = new HandlerThread(this.f7123a);
        this.b = handlerThread;
        handlerThread.start();
        this.c = new a(this.b.getLooper());
    }

    public void a(Runnable runnable) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }
}
