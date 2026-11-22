package com.baidu.lbsapi.auth;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes13.dex */
class p extends Thread {

    /* renamed from: a, reason: collision with root package name */
    Handler f7501a;
    private Object b;
    private boolean c;

    p() {
        this.f7501a = null;
        this.b = new Object();
        this.c = false;
    }

    p(String str) {
        super(str);
        this.f7501a = null;
        this.b = new Object();
        this.c = false;
    }

    public void a() {
        if (b.f7488a) {
            b.a("Looper thread quit()");
        }
        Handler handler = this.f7501a;
        if (handler == null || handler.getLooper() == null) {
            return;
        }
        this.f7501a.getLooper().quit();
    }

    public void b() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    this.b.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        synchronized (this.b) {
            this.c = true;
            this.b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f7501a = new Handler();
        if (b.f7488a) {
            b.a("new Handler() finish!!");
        }
        Looper.loop();
        if (b.f7488a) {
            b.a("LooperThread run() thread id:" + String.valueOf(Thread.currentThread().getId()));
        }
    }
}
