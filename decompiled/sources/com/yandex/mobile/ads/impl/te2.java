package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: classes5.dex */
public final class te2 {

    /* renamed from: a, reason: collision with root package name */
    private final lb0 f16957a = new lb0();
    private final b b;
    private final e c;
    private boolean d;
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;

    /* renamed from: q, reason: collision with root package name */
    private long f16958q;

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    private static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f16960a;
        private b.a b;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        public static d a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private d(DisplayManager displayManager) {
            this.f16960a = displayManager;
        }

        @Override // com.yandex.mobile.ads.impl.te2.b
        public final void a(b.a aVar) {
            this.b = aVar;
            this.f16960a.registerDisplayListener(this, f92.a((Handler.Callback) null));
            aVar.a(this.f16960a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            b.a aVar = this.b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.a(this.f16960a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.te2.b
        public final void a() {
            this.f16960a.unregisterDisplayListener(this);
            this.b = null;
        }
    }

    private void d() {
        if (f92.f15466a < 30 || this.e == null) {
            return;
        }
        float b2 = this.f16957a.e() ? this.f16957a.b() : this.f;
        float f = this.g;
        if (b2 == f) {
            return;
        }
        if (b2 != -1.0f && f != -1.0f) {
            if (Math.abs(b2 - this.g) < ((!this.f16957a.e() || this.f16957a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b2 == -1.0f && this.f16957a.c() < 30) {
            return;
        }
        this.g = b2;
        a(false);
    }

    public te2(Context context) {
        b a2 = a(context);
        this.b = a2;
        this.c = a2 != null ? e.a() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void b(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.f16958q = this.o;
        }
        this.m++;
        this.f16957a.a(j * 1000);
        d();
    }

    public final void c() {
        Surface surface;
        this.d = false;
        b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            e eVar = this.c;
            eVar.getClass();
            eVar.c.sendEmptyMessage(2);
        }
        if (f92.f15466a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }

    public final long a(long j) {
        long j2;
        if (this.p != -1 && this.f16957a.e()) {
            long a2 = this.f16958q + ((long) (((this.m - this.p) * this.f16957a.a()) / this.i));
            if (Math.abs(j - a2) <= 20000000) {
                j = a2;
            } else {
                this.m = 0L;
                this.p = -1L;
                this.n = -1L;
            }
        }
        this.n = this.m;
        this.o = j;
        e eVar = this.c;
        if (eVar != null && this.k != -9223372036854775807L) {
            long j3 = eVar.b;
            if (j3 != -9223372036854775807L) {
                long j4 = this.k;
                long j5 = (((j - j3) / j4) * j4) + j3;
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    j2 = j5;
                    j5 = j4 + j5;
                }
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - this.l;
            }
        }
        return j;
    }

    public final void b(float f) {
        this.i = f;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        a(false);
    }

    private static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                et0.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    private static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f16959a;

        @Override // com.yandex.mobile.ads.impl.te2.b
        public final void a() {
        }

        private c(WindowManager windowManager) {
            this.f16959a = windowManager;
        }

        @Override // com.yandex.mobile.ads.impl.te2.b
        public final void a(b.a aVar) {
            aVar.a(this.f16959a.getDefaultDisplay());
        }
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {
        private static final e f = new e();
        public volatile long b = -9223372036854775807L;
        private final Handler c;
        private Choreographer d;
        private int e;

        public static e a() {
            return f;
        }

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler a2 = f92.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.c = a2;
            a2.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.b = j;
            Choreographer choreographer = this.d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.d = Choreographer.getInstance();
                } catch (RuntimeException e) {
                    et0.b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.d;
                if (choreographer != null) {
                    int i2 = this.e + 1;
                    this.e = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.d;
            if (choreographer2 != null) {
                int i3 = this.e - 1;
                this.e = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public final void b() {
        this.d = true;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        if (this.b != null) {
            e eVar = this.c;
            eVar.getClass();
            eVar.c.sendEmptyMessage(1);
            this.b.a(new b.a() { // from class: com.yandex.mobile.ads.impl.te2$$ExternalSyntheticLambda0
                @Override // com.yandex.mobile.ads.impl.te2.b.a
                public final void a(Display display) {
                    te2.this.a(display);
                }
            });
        }
        a(false);
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        d a2 = f92.f15466a >= 17 ? d.a(applicationContext) : null;
        if (a2 != null) {
            return a2;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new c(windowManager);
        }
        return null;
    }

    public final void a(float f) {
        this.f = f;
        this.f16957a.f();
        d();
    }

    public final void a() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void a(Surface surface) {
        if (surface instanceof oh1) {
            surface = null;
        }
        Surface surface2 = this.e;
        if (surface2 == surface) {
            return;
        }
        if (f92.f15466a >= 30 && surface2 != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            a.a(surface2, 0.0f);
        }
        this.e = surface;
        a(true);
    }

    public final void a(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            et0.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    private void a(boolean z) {
        Surface surface;
        float f;
        if (f92.f15466a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                a.a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        a.a(surface, f);
    }
}
