package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.net.URI;
import java.util.Locale;

/* loaded from: classes12.dex */
public class se implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public volatile q f7193a;
    public h7 b;
    public HandlerThread c;
    public Handler d;
    public Runnable e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            se.this.e();
            se.this.d.postDelayed(se.this.e, 5000L);
        }
    }

    public class b implements h7 {
        public b() {
        }

        @Override // com.baidu.ar.h7
        public void a(int i, String str, boolean z) {
            if (se.this.b != null) {
                se.this.b.a(i, str, z);
            }
        }

        @Override // com.baidu.ar.h7
        public void a(String str) {
            h.a("WebSocket", "resp: " + str);
            if (se.this.b != null) {
                se.this.b.a(str);
            }
        }

        @Override // com.baidu.ar.h7
        public void onError(int i, String str) {
            if (se.this.b != null) {
                se.this.b.onError(i, str);
            }
        }

        @Override // com.baidu.ar.h7
        public void onOpen() {
            if (se.this.b != null) {
                se.this.b.onOpen();
            }
            se.this.f();
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        
            if (r3.f7196a.b != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
        
            if (r3.f7196a.b != null) goto L36;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                com.baidu.ar.se r0 = com.baidu.ar.se.this
                com.baidu.ar.q r0 = com.baidu.ar.se.f(r0)
                r1 = 1
                if (r0 != 0) goto La
                return r1
            La:
                int r0 = r4.what
                if (r0 == r1) goto Lab
                r2 = 2
                if (r0 == r2) goto L99
                r2 = 3
                if (r0 == r2) goto L63
                r2 = 4
                if (r0 == r2) goto L3a
                r4 = 5
                if (r0 == r4) goto L1c
                goto Lb9
            L1c:
                com.baidu.ar.se r4 = com.baidu.ar.se.this     // Catch: java.lang.Exception -> Lb5
                com.baidu.ar.q r4 = com.baidu.ar.se.f(r4)     // Catch: java.lang.Exception -> Lb5
                boolean r4 = r4.m()     // Catch: java.lang.Exception -> Lb5
                if (r4 == 0) goto L33
                com.baidu.ar.se r4 = com.baidu.ar.se.this     // Catch: java.lang.Exception -> Lb5
                com.baidu.ar.q r4 = com.baidu.ar.se.f(r4)     // Catch: java.lang.Exception -> Lb5
                r4.p()     // Catch: java.lang.Exception -> Lb5
                goto Lb9
            L33:
                com.baidu.ar.se r4 = com.baidu.ar.se.this     // Catch: java.lang.Exception -> Lb5
                com.baidu.ar.se.g(r4)     // Catch: java.lang.Exception -> Lb5
                goto Lb9
            L3a:
                java.lang.Object r0 = r4.obj
                boolean r0 = r0 instanceof byte[]
                if (r0 == 0) goto Lb9
                com.baidu.ar.se r0 = com.baidu.ar.se.this
                com.baidu.ar.q r0 = com.baidu.ar.se.f(r0)
                boolean r0 = r0.o()
                if (r0 == 0) goto L5a
                com.baidu.ar.se r0 = com.baidu.ar.se.this
                com.baidu.ar.q r0 = com.baidu.ar.se.f(r0)
                java.lang.Object r4 = r4.obj
                byte[] r4 = (byte[]) r4
                r0.a(r4)
                goto Lb9
            L5a:
                com.baidu.ar.se r4 = com.baidu.ar.se.this
                com.baidu.ar.h7 r4 = com.baidu.ar.se.d(r4)
                if (r4 == 0) goto Lb9
                goto L8b
            L63:
                java.lang.Object r0 = r4.obj
                boolean r0 = r0 instanceof java.lang.String
                if (r0 == 0) goto Lb9
                com.baidu.ar.se r0 = com.baidu.ar.se.this
                com.baidu.ar.q r0 = com.baidu.ar.se.f(r0)
                boolean r0 = r0.o()
                if (r0 == 0) goto L83
                com.baidu.ar.se r0 = com.baidu.ar.se.this
                com.baidu.ar.q r0 = com.baidu.ar.se.f(r0)
                java.lang.Object r4 = r4.obj
                java.lang.String r4 = (java.lang.String) r4
                r0.b(r4)
                goto Lb9
            L83:
                com.baidu.ar.se r4 = com.baidu.ar.se.this
                com.baidu.ar.h7 r4 = com.baidu.ar.se.d(r4)
                if (r4 == 0) goto Lb9
            L8b:
                com.baidu.ar.se r4 = com.baidu.ar.se.this
                com.baidu.ar.h7 r4 = com.baidu.ar.se.d(r4)
                r0 = 1002(0x3ea, float:1.404E-42)
                java.lang.String r2 = "websocket not open"
                r4.onError(r0, r2)
                goto Lb9
            L99:
                com.baidu.ar.se r4 = com.baidu.ar.se.this
                com.baidu.ar.q r4 = com.baidu.ar.se.f(r4)
                if (r4 == 0) goto Lb9
                com.baidu.ar.se r4 = com.baidu.ar.se.this
                com.baidu.ar.q r4 = com.baidu.ar.se.f(r4)
                r4.i()
                goto Lb9
            Lab:
                com.baidu.ar.se r4 = com.baidu.ar.se.this     // Catch: java.lang.Exception -> Lb5
                com.baidu.ar.q r4 = com.baidu.ar.se.f(r4)     // Catch: java.lang.Exception -> Lb5
                r4.k()     // Catch: java.lang.Exception -> Lb5
                goto Lb9
            Lb5:
                r4 = move-exception
                r4.printStackTrace()
            Lb9:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.se.c.handleMessage(android.os.Message):boolean");
        }
    }

    @Override // com.baidu.ar.g7
    public void a() {
        f();
    }

    @Override // com.baidu.ar.g7
    public void a(h7 h7Var) {
        this.b = h7Var;
    }

    @Override // com.baidu.ar.g7
    public void a(String str) {
        h.a("WebSocket", "req: " + str);
        Message.obtain(this.d, 3, str).sendToTarget();
    }

    @Override // com.baidu.ar.g7
    public void a(byte[] bArr) {
        if (bArr != null) {
            h.a("WebSocket", "req: byte " + bArr.length);
            Message.obtain(this.d, 4, bArr).sendToTarget();
        }
    }

    @Override // com.baidu.ar.g7
    public void b() {
        this.d.removeCallbacks(this.e);
    }

    @Override // com.baidu.ar.g7
    public void b(String str) {
        this.f7193a = new q(URI.create(str));
        this.f7193a.a(new b());
        HandlerThread handlerThread = new HandlerThread("WebSocketManager");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper(), new c());
    }

    @Override // com.baidu.ar.g7
    public void c() {
        Message.obtain(this.d, 1).sendToTarget();
    }

    public void d() {
        Message.obtain(this.d, 2).sendToTarget();
    }

    public final void e() {
        Message.obtain(this.d, 5).sendToTarget();
    }

    public final void f() {
        HandlerThread handlerThread = this.c;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.d.removeCallbacks(this.e);
        this.d.post(this.e);
    }

    public final void g() {
        a(String.format(Locale.CHINA, "{\"requestId\":\"heart%d\",\"action\":\"HEART_BEAT\"}", Long.valueOf(System.currentTimeMillis())));
    }

    @Override // com.baidu.ar.g7
    public void release() {
        d();
        this.c.quit();
        if (this.f7193a != null) {
            this.f7193a.s();
            this.f7193a = null;
        }
    }
}
