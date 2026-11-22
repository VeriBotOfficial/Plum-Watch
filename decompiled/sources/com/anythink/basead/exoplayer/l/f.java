package com.anythink.basead.exoplayer.l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final long f2710a = 500;
    private static final long b = 20000000;
    private static final long c = 80;
    private static final int d = 6;
    private final WindowManager e;
    private final b f;
    private final a g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private boolean m;
    private long n;
    private long o;
    private long p;

    public f() {
        this(null);
    }

    public f(Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.e = (WindowManager) context.getSystemService("window");
        } else {
            this.e = null;
        }
        if (this.e != null) {
            if (af.f2668a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                aVar = new a(displayManager);
            }
            this.g = aVar;
            this.f = b.a();
        } else {
            this.g = null;
            this.f = null;
        }
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a() {
        this.m = false;
        if (this.e != null) {
            this.f.b();
            a aVar = this.g;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    public final void b() {
        if (this.e != null) {
            a aVar = this.g;
            if (aVar != null) {
                aVar.b();
            }
            this.f.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.m
            if (r2 == 0) goto L41
            long r2 = r10.j
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L18
            long r2 = r10.p
            r4 = 1
            long r2 = r2 + r4
            r10.p = r2
            long r2 = r10.l
            r10.k = r2
        L18:
            long r2 = r10.p
            r4 = 6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L39
            long r6 = r10.o
            long r6 = r0 - r6
            long r6 = r6 / r2
            long r2 = r10.k
            long r2 = r2 + r6
            boolean r4 = r10.b(r2, r13)
            if (r4 == 0) goto L32
            r10.m = r5
            goto L41
        L32:
            long r4 = r10.n
            long r4 = r4 + r2
            long r6 = r10.o
            long r4 = r4 - r6
            goto L43
        L39:
            boolean r2 = r10.b(r0, r13)
            if (r2 == 0) goto L41
            r10.m = r5
        L41:
            r4 = r13
            r2 = r0
        L43:
            boolean r6 = r10.m
            if (r6 != 0) goto L52
            r10.o = r0
            r10.n = r13
            r13 = 0
            r10.p = r13
            r13 = 1
            r10.m = r13
        L52:
            r10.j = r11
            r10.l = r2
            com.anythink.basead.exoplayer.l.f$b r11 = r10.f
            if (r11 == 0) goto L8c
            long r12 = r10.h
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L66
            goto L8c
        L66:
            long r11 = r11.f2712a
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 != 0) goto L6d
            goto L8c
        L6d:
            long r13 = r10.h
            long r0 = r4 - r11
            long r0 = r0 / r13
            long r0 = r0 * r13
            long r11 = r11 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L7b
            long r13 = r11 - r13
            goto L7f
        L7b:
            long r13 = r13 + r11
            r8 = r13
            r13 = r11
            r11 = r8
        L7f:
            long r0 = r11 - r4
            long r4 = r4 - r13
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L87
            goto L88
        L87:
            r11 = r13
        L88:
            long r13 = r10.i
            long r11 = r11 - r13
            return r11
        L8c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.l.f.a(long, long):long");
    }

    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.e.getDefaultDisplay() != null) {
                long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
                this.h = refreshRate;
                this.i = (refreshRate * c) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    private boolean b(long j, long j2) {
        return Math.abs((j2 - this.n) - (j - this.o)) > b;
    }

    private static long a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j3 + j5;
            j4 = j5;
            j5 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private final class a implements DisplayManager.DisplayListener {
        private final DisplayManager b;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        public a(DisplayManager displayManager) {
            this.b = displayManager;
        }

        public final void a() {
            this.b.registerDisplayListener(this, null);
        }

        public final void b() {
            this.b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                f.this.c();
            }
        }
    }

    private static final class b implements Handler.Callback, Choreographer.FrameCallback {
        private static final int b = 0;
        private static final int c = 1;
        private static final int d = 2;
        private static final b e = new b();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f2712a = -9223372036854775807L;
        private final Handler f;
        private final HandlerThread g;
        private Choreographer h;
        private int i;

        public static b a() {
            return e;
        }

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f = handler;
            handler.sendEmptyMessage(0);
        }

        public final void b() {
            this.f.sendEmptyMessage(1);
        }

        public final void c() {
            this.f.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            if (this.h != null) {
                this.f2712a = j;
                this.h.postFrameCallbackDelayed(this, 500L);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.h = Choreographer.getInstance();
                } catch (Throwable unused) {
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.h;
                if (choreographer != null) {
                    int i2 = this.i + 1;
                    this.i = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.h;
            if (choreographer2 != null) {
                int i3 = this.i - 1;
                this.i = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f2712a = -9223372036854775807L;
                }
            }
            return true;
        }

        private void d() {
            this.h = Choreographer.getInstance();
        }

        private void e() {
            Choreographer choreographer = this.h;
            if (choreographer != null) {
                int i = this.i + 1;
                this.i = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void f() {
            Choreographer choreographer = this.h;
            if (choreographer != null) {
                int i = this.i - 1;
                this.i = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f2712a = -9223372036854775807L;
                }
            }
        }
    }
}
