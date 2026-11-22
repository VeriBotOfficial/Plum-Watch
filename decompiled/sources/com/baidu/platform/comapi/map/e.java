package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.opengl.GLDebugHelper;
import android.opengl.GLException;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.baidu.platform.comapi.map.s;
import com.heytap.mcssdk.constant.MessageConstant;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.nio.IntBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GLRenderControl.java */
/* loaded from: classes13.dex */
class e implements r {

    /* renamed from: a, reason: collision with root package name */
    private static final k f8636a = new k();
    private WeakReference<SurfaceView> b;
    private int c = 60;
    private final WeakReference<e> d = new WeakReference<>(this);
    private j e;
    private SurfaceRenderer f;
    private boolean g;
    private f h;
    private g i;
    private h j;
    private l k;
    private int l;
    private int m;
    private boolean n;

    /* compiled from: GLRenderControl.java */
    private abstract class b implements f {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f8637a;

        public b(int[] iArr) {
            this.f8637a = a(iArr);
        }

        private int[] a(int[] iArr) {
            if (e.this.m != 2 && e.this.m != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (e.this.m == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // com.baidu.platform.comapi.map.e.f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f8637a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f8637a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    /* compiled from: GLRenderControl.java */
    private class d implements g {

        /* renamed from: a, reason: collision with root package name */
        private int f8638a;

        private d() {
            this.f8638a = 12440;
        }

        @Override // com.baidu.platform.comapi.map.e.g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f8638a, e.this.m, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (e.this.m == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.baidu.platform.comapi.map.e.g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLContext == null || eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            i.b("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* compiled from: GLRenderControl.java */
    /* renamed from: com.baidu.platform.comapi.map.e$e, reason: collision with other inner class name */
    private static class C0401e implements h {
        private C0401e() {
        }

        @Override // com.baidu.platform.comapi.map.e.h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLRenderControl", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.baidu.platform.comapi.map.e.h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* compiled from: GLRenderControl.java */
    interface f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: GLRenderControl.java */
    interface g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: GLRenderControl.java */
    interface h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* compiled from: GLRenderControl.java */
    static class j extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f8640a;
        private volatile boolean b;
        private volatile boolean c;
        private volatile boolean d;
        private volatile boolean e;
        private volatile boolean f;
        private volatile boolean g;
        private volatile boolean h;
        private volatile boolean i;
        private volatile boolean j;
        private volatile boolean k;

        /* renamed from: q, reason: collision with root package name */
        private volatile boolean f8641q;
        private i u;
        private long v;
        private long w;
        private WeakReference<e> y;
        private volatile ArrayList<Runnable> r = new ArrayList<>();
        private volatile boolean s = true;
        private volatile Runnable t = null;
        private int x = 60;
        private volatile int l = 0;
        private volatile int m = 0;
        private volatile boolean o = true;
        private volatile int n = 1;
        private volatile boolean p = false;

        j(WeakReference<e> weakReference) {
            this.y = weakReference;
            setPriority(10);
        }

        /* JADX WARN: Removed duplicated region for block: B:211:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void c() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 689
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.map.e.j.c():void");
        }

        private boolean f() {
            if (this.d || !this.e || this.f || this.l <= 0 || this.m <= 0) {
                return false;
            }
            return this.o || this.n == 1;
        }

        private void i() {
            if (this.h) {
                this.u.e();
                this.h = false;
                e.f8636a.a(this);
            }
        }

        private void j() {
            if (this.i) {
                this.i = false;
                this.u.c();
            }
        }

        public int b() {
            int i;
            synchronized (e.f8636a) {
                i = this.n;
            }
            return i;
        }

        public void d() {
            synchronized (e.f8636a) {
                this.c = true;
                while (!this.b && !this.d) {
                    try {
                        e.f8636a.notifyAll();
                        e.f8636a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void e() {
            synchronized (e.f8636a) {
                this.c = false;
                this.o = true;
                this.f8641q = false;
                while (!this.b && this.d && !this.f8641q) {
                    try {
                        e.f8636a.notifyAll();
                        e.f8636a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void g() {
            synchronized (e.f8636a) {
                this.f8640a = true;
                while (!this.b) {
                    try {
                        e.f8636a.notifyAll();
                        e.f8636a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h() {
            synchronized (e.f8636a) {
                this.o = true;
                e.f8636a.notifyAll();
            }
        }

        public void k() {
            synchronized (e.f8636a) {
                this.e = true;
                this.j = false;
                while (this.g && !this.j && !this.b) {
                    try {
                        e.f8636a.notifyAll();
                        e.f8636a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void l() {
            synchronized (e.f8636a) {
                this.e = false;
                while (!this.g && !this.b) {
                    try {
                        e.f8636a.notifyAll();
                        e.f8636a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                c();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                e.f8636a.b(this);
                throw th;
            }
            e.f8636a.b(this);
        }

        private void a(long j) {
            long j2 = this.v + 1;
            this.v = j2;
            long j3 = this.w + j;
            this.w = j3;
            if (j2 >= 10) {
                int i = (int) (j3 / j2);
                if (i <= 0) {
                    this.v = 0L;
                    this.w = 0L;
                } else {
                    this.x = (this.x + (1000 / i)) / 2;
                    this.v = 0L;
                    this.w = 0L;
                }
            }
        }

        public void b(Runnable runnable) {
            synchronized (e.f8636a) {
                if (Thread.currentThread() == this) {
                    return;
                }
                this.p = true;
                this.o = true;
                this.f8641q = false;
                this.t = runnable;
                e.f8636a.notifyAll();
            }
        }

        public boolean a() {
            return this.h && this.i && f();
        }

        public void a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (e.f8636a) {
                    this.n = i;
                    e.f8636a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public void a(int i, int i2) {
            synchronized (e.f8636a) {
                this.l = i;
                this.m = i2;
                this.s = true;
                this.o = true;
                this.f8641q = false;
                if (Thread.currentThread() == this) {
                    return;
                }
                while (!this.b && !this.d && !this.f8641q && a()) {
                    try {
                        e.f8636a.notifyAll();
                        e.f8636a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (e.f8636a) {
                    this.r.add(runnable);
                    e.f8636a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    /* compiled from: GLRenderControl.java */
    private static class k {
        private k() {
        }

        public synchronized void a(j jVar) {
            notifyAll();
        }

        public synchronized void b(j jVar) {
            jVar.b = true;
            notifyAll();
        }
    }

    /* compiled from: GLRenderControl.java */
    interface l {
        GL a(GL gl);
    }

    /* compiled from: GLRenderControl.java */
    static class m extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private StringBuilder f8642a = new StringBuilder();

        m() {
        }

        private void a() {
            if (this.f8642a.length() > 0) {
                Log.v("GLSurfaceView26", this.f8642a.toString());
                StringBuilder sb = this.f8642a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    a();
                } else {
                    this.f8642a.append(c);
                }
            }
        }
    }

    /* compiled from: GLRenderControl.java */
    private class n extends c {
        public n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0, 0, 0);
        }
    }

    public e(SurfaceView surfaceView) {
        this.b = new WeakReference<>(surfaceView);
    }

    @Override // com.baidu.platform.comapi.map.r
    public Bitmap captureImageFromSurface(int i2, int i3, int i4, int i5, Object obj, Bitmap.Config config) {
        return a(i2, i3, i4, i5, (GL10) obj, config);
    }

    protected void finalize() throws Throwable {
        try {
            j jVar = this.e;
            if (jVar != null) {
                jVar.g();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.baidu.platform.comapi.map.r
    public int getDebugFlags() {
        return this.l;
    }

    @Override // com.baidu.platform.comapi.map.r
    public int getFPS() {
        return this.c;
    }

    @Override // com.baidu.platform.comapi.map.r
    public int getRenderMode() {
        return this.e.b();
    }

    @Override // com.baidu.platform.comapi.map.r
    public s.a getViewType() {
        return s.a.OPENGL_ES;
    }

    @Override // com.baidu.platform.comapi.map.r
    public void onAttachedToWindow() {
        if (this.g && this.f != null) {
            j jVar = this.e;
            int b2 = jVar != null ? jVar.b() : 1;
            j jVar2 = new j(this.d);
            this.e = jVar2;
            if (b2 != 1) {
                jVar2.a(b2);
            }
            this.e.start();
        }
        this.g = false;
    }

    @Override // com.baidu.platform.comapi.map.r
    public void onDetachedFromWindow() {
        j jVar = this.e;
        if (jVar != null) {
            jVar.g();
        }
        this.g = true;
    }

    @Override // com.baidu.platform.comapi.map.r
    public void onPause() {
        this.e.d();
    }

    @Override // com.baidu.platform.comapi.map.r
    public void onResume() {
        this.e.e();
    }

    @Override // com.baidu.platform.comapi.map.r
    public void queueEvent(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.baidu.platform.comapi.map.r
    public void requestRender() {
        this.e.h();
    }

    @Override // com.baidu.platform.comapi.map.r
    public void setDebugFlags(int i2) {
        this.l = i2;
    }

    @Override // com.baidu.platform.comapi.map.r
    public void setFPS(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > 60) {
            i2 = 60;
        }
        this.c = i2;
    }

    @Override // com.baidu.platform.comapi.map.r
    public void setRenderMode(int i2) {
        this.e.a(i2);
    }

    @Override // com.baidu.platform.comapi.map.r
    public void setRenderer(SurfaceRenderer surfaceRenderer) {
        b();
        if (this.h == null) {
            this.h = new n(true);
        }
        if (this.i == null) {
            this.i = new d();
        }
        if (this.j == null) {
            this.j = new C0401e();
        }
        this.f = surfaceRenderer;
        j jVar = new j(this.d);
        this.e = jVar;
        jVar.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.e.a(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.e.k();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.e.l();
    }

    @Override // android.view.SurfaceHolder.Callback2
    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        j jVar = this.e;
        if (jVar != null) {
            jVar.b(runnable);
        }
    }

    public void b(boolean z) {
        this.n = z;
    }

    public int c() {
        SurfaceView surfaceView = this.b.get();
        if (surfaceView != null) {
            return surfaceView.getHeight();
        }
        return 0;
    }

    public SurfaceHolder d() {
        SurfaceView surfaceView = this.b.get();
        if (surfaceView != null) {
            return surfaceView.getHolder();
        }
        return null;
    }

    public int e() {
        SurfaceView surfaceView = this.b.get();
        if (surfaceView != null) {
            return surfaceView.getWidth();
        }
        return 0;
    }

    private void b() {
        if (this.e != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void a(g gVar) {
        b();
        this.i = gVar;
    }

    public void a(f fVar) {
        b();
        this.h = fVar;
    }

    public void a(boolean z) {
        a(new n(z));
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        a(new c(i2, i3, i4, i5, i6, i7, i8, i9));
    }

    public void a(int i2) {
        b();
        this.m = i2;
    }

    private Bitmap a(int i2, int i3, int i4, int i5, GL10 gl10, Bitmap.Config config) {
        Bitmap createBitmap;
        int i6 = i4 * i5;
        int[] iArr = new int[i6];
        int[] iArr2 = new int[i6];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        try {
            gl10.glReadPixels(i2, i3, i4, i5, 6408, 5121, wrap);
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i7 * i4;
                int i9 = ((i5 - i7) - 1) * i4;
                for (int i10 = 0; i10 < i4; i10++) {
                    int i11 = iArr[i8 + i10];
                    iArr2[i9 + i10] = (i11 & (-16711936)) | ((i11 << 16) & 16711680) | ((i11 >> 16) & 255);
                }
            }
            if (config == null) {
                createBitmap = Bitmap.createBitmap(iArr2, i4, i5, Bitmap.Config.ARGB_8888);
            } else {
                createBitmap = Bitmap.createBitmap(iArr2, i4, i5, config);
            }
            return a(createBitmap);
        } catch (GLException unused) {
            return null;
        }
    }

    /* compiled from: GLRenderControl.java */
    private class c extends b {
        private int[] c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;
        protected int k;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12338, i7, 12337, i8, 12344});
            this.c = new int[1];
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = i7;
            this.k = i8;
        }

        @Override // com.baidu.platform.comapi.map.e.b
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            EGLConfig eGLConfig = null;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig2 = eGLConfigArr[i];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int a2 = a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a3 = a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a2 >= this.h && a3 >= this.i) {
                    int a4 = a(egl102, eGLDisplay2, eGLConfig2, 12324, 0);
                    int a5 = a(egl102, eGLDisplay2, eGLConfig2, 12323, 0);
                    int a6 = a(egl102, eGLDisplay2, eGLConfig2, 12322, 0);
                    int a7 = a(egl102, eGLDisplay2, eGLConfig2, 12321, 0);
                    if (a4 == this.d && a5 == this.e && a6 == this.f && a7 == this.g) {
                        if (eGLConfig == null) {
                            eGLConfig = eGLConfig2;
                        }
                        if (a(egl102, eGLDisplay2, eGLConfig2, 12337, 0) == this.k) {
                            return eGLConfig2;
                        }
                    }
                }
                i++;
                egl10 = egl102;
                eGLDisplay = eGLDisplay2;
            }
            return eGLConfig;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.c) ? this.c[0] : i2;
        }
    }

    /* compiled from: GLRenderControl.java */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<e> f8639a;
        EGL10 b;
        EGLDisplay c;
        EGLSurface d;
        EGLConfig e;
        EGLContext f;

        public i(WeakReference<e> weakReference) {
            this.f8639a = weakReference;
        }

        private void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            e eVar = this.f8639a.get();
            if (eVar != null) {
                eVar.j.destroySurface(this.b, this.c, this.d);
            }
            this.d = null;
        }

        GL a() {
            GL gl = this.f.getGL();
            e eVar = this.f8639a.get();
            if (eVar == null) {
                return gl;
            }
            if (eVar.k != null) {
                gl = eVar.k.a(gl);
            }
            if ((eVar.l & 3) != 0) {
                return GLDebugHelper.wrap(gl, (eVar.l & 1) == 0 ? 0 : 1, (eVar.l & 2) != 0 ? new m() : null);
            }
            return gl;
        }

        public boolean b() {
            if (this.b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            d();
            e eVar = this.f8639a.get();
            if (eVar != null) {
                this.d = eVar.j.createWindowSurface(this.b, this.c, this.e, eVar.d());
            } else {
                this.d = null;
            }
            EGLSurface eGLSurface = this.d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, this.f)) {
                return true;
            }
            a("EGLHelper", "eglMakeCurrent", this.b.eglGetError());
            return false;
        }

        public void c() {
            d();
        }

        public void e() {
            if (this.f != null) {
                e eVar = this.f8639a.get();
                if (eVar != null) {
                    eVar.i.destroyContext(this.b, this.c, this.f);
                }
                this.f = null;
            }
            EGLDisplay eGLDisplay = this.c;
            if (eGLDisplay != null) {
                this.b.eglTerminate(eGLDisplay);
                this.c = null;
            }
        }

        public void f() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            e eVar = this.f8639a.get();
            if (eVar == null) {
                this.e = null;
                this.f = null;
            } else {
                try {
                    this.e = eVar.h.chooseConfig(this.b, this.c);
                    this.f = eVar.i.createContext(this.b, this.c, this.e);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    return;
                }
            }
            EGLContext eGLContext = this.f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f = null;
                a("createContext");
            }
            this.d = null;
        }

        public int g() {
            return !this.b.eglSwapBuffers(this.c, this.d) ? this.b.eglGetError() : MessageConstant.CommandId.COMMAND_BASE;
        }

        private void a(String str) {
            b(str, this.b.eglGetError());
        }

        public static void a(String str, String str2, int i) {
            Log.w(str, a(str2, i));
        }

        public static String a(String str, int i) {
            return str + " failed: " + a(i);
        }

        private static String a(int i) {
            switch (i) {
                case MessageConstant.CommandId.COMMAND_BASE /* 12288 */:
                    return "EGL_SUCCESS";
                case 12289:
                    return "EGL_NOT_INITIALIZED";
                case MessageConstant.CommandId.COMMAND_UNREGISTER /* 12290 */:
                    return "EGL_BAD_ACCESS";
                case MessageConstant.CommandId.COMMAND_STATISTIC /* 12291 */:
                    return "EGL_BAD_ALLOC";
                case MessageConstant.CommandId.COMMAND_SET_ALIAS /* 12292 */:
                    return "EGL_BAD_ATTRIBUTE";
                case 12293:
                    return "EGL_BAD_CONFIG";
                case 12294:
                    return "EGL_BAD_CONTEXT";
                case 12295:
                    return "EGL_BAD_CURRENT_SURFACE";
                case 12296:
                    return "EGL_BAD_DISPLAY";
                case 12297:
                    return "EGL_BAD_MATCH";
                case MessageConstant.CommandId.COMMAND_SET_PUSH_TIME /* 12298 */:
                    return "EGL_BAD_NATIVE_PIXMAP";
                case MessageConstant.CommandId.COMMAND_PAUSE_PUSH /* 12299 */:
                    return "EGL_BAD_NATIVE_WINDOW";
                case MessageConstant.CommandId.COMMAND_RESUME_PUSH /* 12300 */:
                    return "EGL_BAD_PARAMETER";
                case 12301:
                    return "EGL_BAD_SURFACE";
                case 12302:
                    return "EGL_CONTEXT_LOST";
                default:
                    return b(i);
            }
        }

        public static void b(String str, int i) {
            throw new RuntimeException(a(str, i));
        }

        private static String b(int i) {
            return "0x" + Integer.toHexString(i);
        }
    }

    public Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = (iArr[i3] & 16777215) | (-16777216);
        }
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }
}
