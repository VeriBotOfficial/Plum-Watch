package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.audio.AudioParams;
import com.baidu.ar.audio.VolumeListener;

/* loaded from: classes12.dex */
public class u0 {
    public static final String d = "u0";
    public static volatile u0 e;

    /* renamed from: a, reason: collision with root package name */
    public v0 f7235a;
    public HandlerThread b;
    public Handler c;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    u0.this.a((AudioParams) message.obj);
                    break;
                case 1002:
                    u0.this.e();
                    break;
                case 1003:
                    u0.this.f();
                    break;
                case 1004:
                    u0.this.d();
                    break;
                case 1005:
                    u0.this.c();
                    break;
            }
        }
    }

    public static u0 b() {
        if (e == null) {
            synchronized (u0.class) {
                if (e == null) {
                    e = new u0();
                }
            }
        }
        return e;
    }

    public static void i() {
        e = null;
    }

    public AudioParams a() {
        v0 v0Var = this.f7235a;
        if (v0Var != null) {
            return v0Var.a();
        }
        return null;
    }

    public final void a(AudioParams audioParams) {
        v0 v0Var = this.f7235a;
        if (v0Var != null) {
            v0Var.a(audioParams);
        }
    }

    public void a(VolumeListener volumeListener) {
        if (volumeListener != null) {
            if (this.f7235a == null) {
                this.f7235a = new v0();
            }
            this.f7235a.a(volumeListener);
        }
    }

    public boolean a(AudioParams audioParams, s0 s0Var) {
        if (g()) {
            h.b(d, "setupAudio error! As last audio thread is alive!");
            return false;
        }
        if (this.f7235a == null) {
            this.f7235a = new v0();
        }
        this.f7235a.a(s0Var);
        k();
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1001, audioParams));
        return true;
    }

    public final void c() {
        i();
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.c = null;
        }
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.b = null;
        }
    }

    public final void d() {
        v0 v0Var = this.f7235a;
        if (v0Var != null) {
            v0Var.c();
        }
        this.f7235a = null;
    }

    public final void e() {
        v0 v0Var = this.f7235a;
        if (v0Var != null) {
            v0Var.d();
        }
    }

    public final void f() {
        v0 v0Var = this.f7235a;
        if (v0Var != null) {
            v0Var.f();
        }
    }

    public boolean g() {
        HandlerThread handlerThread = this.b;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void h() {
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.c;
            handler2.sendMessage(handler2.obtainMessage(1004));
            Handler handler3 = this.c;
            handler3.sendMessage(handler3.obtainMessage(1005));
        }
    }

    public void j() {
        Handler handler = this.c;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002));
        }
    }

    public final void k() {
        HandlerThread handlerThread = new HandlerThread("AudioHandlerThread");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new a(this.b.getLooper());
    }

    public void l() {
        f();
    }
}
