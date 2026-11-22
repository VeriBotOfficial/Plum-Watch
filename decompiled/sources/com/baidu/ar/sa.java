package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.recg.RecognitionResult;

/* loaded from: classes12.dex */
public class sa {
    public static final String e = "sa";
    public static volatile sa f;

    /* renamed from: a, reason: collision with root package name */
    public j7 f7189a = j7.a();
    public ra b;
    public HandlerThread c;
    public Handler d;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    sa.this.a((xa) message.obj);
                    break;
                case 1002:
                    sa.this.a((ua) message.obj);
                    break;
                case 1003:
                    sa.this.b();
                    break;
            }
            super.handleMessage(message);
        }
    }

    public static synchronized sa a() {
        sa saVar;
        synchronized (sa.class) {
            if (f == null) {
                f = new sa();
            }
            saVar = f;
        }
        return saVar;
    }

    public static void d() {
        f = null;
    }

    public final void a(ua uaVar) {
        wa waVar;
        j7 j7Var = this.f7189a;
        if (j7Var == null || uaVar == null) {
            waVar = null;
        } else {
            RecognitionResult a2 = j7Var.a(uaVar.a(), uaVar.d(), uaVar.b());
            waVar = new wa(uaVar.c());
            waVar.a(a2.fileName);
            waVar.b(a2.errCode == 1);
            waVar.a(a2.errCode == 1);
            waVar.a(a2.time);
            waVar.b(uaVar.c());
        }
        ra raVar = this.b;
        if (raVar == null || waVar == null) {
            return;
        }
        raVar.a(waVar);
    }

    public final void a(xa xaVar) {
        boolean a2 = this.f7189a.a(xaVar.a());
        h.a(e, "handleSetup result = " + a2);
        ra raVar = this.b;
        if (raVar != null) {
            raVar.onSetup(a2);
        }
    }

    public void a(xa xaVar, ra raVar) {
        if (xaVar == null) {
            h.b(e, "setup RecgParams is NULLLL!!!");
            return;
        }
        this.b = raVar;
        e();
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(1001, xaVar));
    }

    public final void b() {
        j7 j7Var = this.f7189a;
        boolean b = j7Var != null ? j7Var.b() : false;
        h.a(e, "handleRelease result = " + b);
        ra raVar = this.b;
        if (raVar != null) {
            raVar.onRelease(b);
            this.b = null;
        }
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
        }
        this.d = null;
        d();
    }

    public void b(ua uaVar) {
        Handler handler = this.d;
        if (handler == null) {
            h.b(e, "track mRecgHandler is NULLLL!!!");
            return;
        }
        handler.removeMessages(1002);
        Handler handler2 = this.d;
        handler2.sendMessage(handler2.obtainMessage(1002, uaVar));
    }

    public void c() {
        Handler handler = this.d;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1003));
        } else {
            h.b(e, "track mRecgHandler is NULLLL!!!");
        }
    }

    public final void e() {
        HandlerThread handlerThread = new HandlerThread(e);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new a(this.c.getLooper());
    }
}
