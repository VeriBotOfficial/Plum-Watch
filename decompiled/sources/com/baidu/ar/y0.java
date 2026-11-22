package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.record.EncoderParams;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class y0 {
    public static final String f = "y0";

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f7338a;
    public Handler b;
    public t0 c;
    public z8 d;
    public volatile boolean e = false;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public ByteBuffer f7339a;
        public int b;
        public long c;

        public a(y0 y0Var, ByteBuffer byteBuffer, int i, long j) {
            this.f7339a = byteBuffer;
            this.b = i;
            this.c = j;
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    y0.this.a((EncoderParams) message.obj);
                    break;
                case 1002:
                    y0.this.c();
                    break;
                case 1003:
                    a aVar = (a) message.obj;
                    y0.this.b(aVar.f7339a, aVar.b, aVar.c);
                    break;
                case 1004:
                    y0.this.d();
                    break;
                case 1005:
                    y0.this.b();
                    break;
                case 1006:
                    y0.this.a();
                    break;
            }
        }
    }

    public final void a() {
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.b = null;
        }
        HandlerThread handlerThread = this.f7338a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f7338a = null;
        }
    }

    public final void a(EncoderParams encoderParams) {
        this.c.a(encoderParams, this.d);
    }

    public final void a(z8 z8Var, p3 p3Var) {
        HandlerThread handlerThread = new HandlerThread("AudioRecorderThread");
        this.f7338a = handlerThread;
        handlerThread.start();
        this.b = new b(this.f7338a.getLooper());
        t0 t0Var = new t0();
        this.c = t0Var;
        this.d = z8Var;
        t0Var.a(p3Var);
    }

    public void a(ByteBuffer byteBuffer, int i, long j) {
        if (byteBuffer == null || i <= 0) {
            return;
        }
        a aVar = new a(this, byteBuffer, i, j);
        if (this.b == null || !this.e) {
            return;
        }
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1003, aVar));
    }

    public boolean a(EncoderParams encoderParams, z8 z8Var, p3 p3Var) {
        if (e()) {
            h.b(f, "setupRecorder error! As last audio recorder thread is alive!");
            return false;
        }
        a(z8Var, p3Var);
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1001, encoderParams));
        this.e = true;
        return true;
    }

    public final void b() {
        this.c.c();
        this.c.a();
        this.c = null;
        this.d = null;
    }

    public final void b(ByteBuffer byteBuffer, int i, long j) {
        this.c.a(false, byteBuffer, i, j);
    }

    public final void c() {
        this.c.b();
    }

    public final void d() {
        this.c.a(true, (ByteBuffer) null, 0, 0L);
    }

    public boolean e() {
        HandlerThread handlerThread = this.f7338a;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void f() {
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.b;
            handler2.sendMessage(handler2.obtainMessage(1005));
            Handler handler3 = this.b;
            handler3.sendMessage(handler3.obtainMessage(1006));
        }
    }

    public void g() {
        Handler handler = this.b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002));
        }
    }

    public void h() {
        if (this.b == null || !this.e) {
            return;
        }
        this.e = false;
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1004));
    }
}
