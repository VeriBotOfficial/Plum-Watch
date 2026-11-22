package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import com.amap.api.maps.MapsInitializer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GLTextureView.java */
/* loaded from: classes11.dex */
public class x0 extends TextureView implements TextureView.SurfaceTextureListener {
    private static final k h = new k();
    public static final /* synthetic */ int i = 0;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<x0> f1957a;
    private j b;
    private GLSurfaceView.Renderer c;
    private boolean d;
    private f e;
    private g f;
    private h g;

    /* compiled from: GLTextureView.java */
    private abstract class b implements f {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f1958a;

        public b(int[] iArr) {
            this.f1958a = a(iArr);
        }

        private int[] a(int[] iArr) {
            x0 x0Var = x0.this;
            int i = x0.i;
            x0Var.getClass();
            x0.this.getClass();
            return iArr;
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // com.amap.api.col.3sl.x0.f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f1958a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f1958a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    /* compiled from: GLTextureView.java */
    private class c extends b {
        private int[] c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        protected int i;

        public c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.c = new int[1];
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
        }

        @Override // com.amap.api.col.3sl.x0.b
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int i = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12325, this.c) ? this.c[0] : 0;
                int i2 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12326, this.c) ? this.c[0] : 0;
                if (i >= this.h && i2 >= this.i) {
                    int i3 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12324, this.c) ? this.c[0] : 0;
                    int i4 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12323, this.c) ? this.c[0] : 0;
                    int i5 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12322, this.c) ? this.c[0] : 0;
                    int i6 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12321, this.c) ? this.c[0] : 0;
                    if (i3 == this.d && i4 == this.e && i5 == this.f && i6 == this.g) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: GLTextureView.java */
    private class d implements g {
        private d() {
        }

        @Override // com.amap.api.col.3sl.x0.g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            x0.this.getClass();
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            x0.this.getClass();
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, null);
        }

        @Override // com.amap.api.col.3sl.x0.g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            throw new RuntimeException("eglDestroyContex failed: " + egl10.eglGetError());
        }
    }

    /* compiled from: GLTextureView.java */
    private static class e implements h {
        private e() {
        }
    }

    /* compiled from: GLTextureView.java */
    public interface f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: GLTextureView.java */
    public interface g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: GLTextureView.java */
    public interface h {
    }

    /* compiled from: GLTextureView.java */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<x0> f1960a;
        EGL10 b;
        EGLDisplay c;
        EGLSurface d;
        EGLConfig e;
        EGLContext f;

        public i(WeakReference<x0> weakReference) {
            this.f1960a = weakReference;
        }

        private void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            x0 x0Var = this.f1960a.get();
            if (x0Var != null) {
                h hVar = x0Var.g;
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface3 = this.d;
                ((e) hVar).getClass();
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.d = null;
        }

        GL a() {
            GL gl = this.f.getGL();
            if (this.f1960a.get() != null) {
                int i = x0.i;
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
            x0 x0Var = this.f1960a.get();
            EGLSurface eGLSurface = null;
            if (x0Var != null) {
                h hVar = x0Var.g;
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLConfig eGLConfig = this.e;
                SurfaceTexture surfaceTexture = x0Var.getSurfaceTexture();
                ((e) hVar).getClass();
                try {
                    eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                } catch (IllegalArgumentException e) {
                    Log.e("GLSurfaceView", "eglCreateWindowSurface", e);
                }
                this.d = eGLSurface;
            } else {
                this.d = null;
            }
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
                if (this.b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.b.eglMakeCurrent(this.c, eGLSurface2, eGLSurface2, this.f)) {
                return true;
            }
            Log.w("EGLHelper", "eglMakeCurrent failed: " + this.b.eglGetError());
            return false;
        }

        public void c() {
            d();
        }

        public void e() {
            if (this.f != null) {
                x0 x0Var = this.f1960a.get();
                if (x0Var != null) {
                    x0Var.f.destroyContext(this.b, this.c, this.f);
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
            x0 x0Var = this.f1960a.get();
            if (x0Var == null) {
                this.e = null;
                this.f = null;
            } else {
                this.e = x0Var.e.chooseConfig(this.b, this.c);
                this.f = x0Var.f.createContext(this.b, this.c, this.e);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext != null && eGLContext != EGL10.EGL_NO_CONTEXT) {
                this.d = null;
            } else {
                this.f = null;
                throw new RuntimeException("createContext failed: " + this.b.eglGetError());
            }
        }
    }

    /* compiled from: GLTextureView.java */
    static class j extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1961a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean p;
        private i s;
        private WeakReference<x0> t;

        /* renamed from: q, reason: collision with root package name */
        private ArrayList<Runnable> f1962q = new ArrayList<>();
        private boolean r = true;
        private int l = 0;
        private int m = 0;
        private boolean o = true;
        private int n = 1;

        j(WeakReference<x0> weakReference) {
            this.t = weakReference;
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void d() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 582
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.3sl.x0.j.d():void");
        }

        private boolean g() {
            if (this.d || !this.e || this.f || this.l <= 0 || this.m <= 0) {
                return false;
            }
            return this.o || this.n == 1;
        }

        private void k() {
            if (this.h) {
                this.s.e();
                this.h = false;
                x0.h.a(this);
            }
        }

        private void l() {
            if (this.i) {
                this.i = false;
                this.s.c();
            }
        }

        public int b() {
            int i;
            synchronized (x0.h) {
                i = this.n;
            }
            return i;
        }

        public int c() {
            int i;
            synchronized (x0.h) {
                i = this.l;
            }
            return i;
        }

        public void e() {
            synchronized (x0.h) {
                this.c = true;
                x0.h.notifyAll();
                while (!this.b && !this.d) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            x0.h.wait();
                        } else {
                            x0.h.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void f() {
            synchronized (x0.h) {
                this.c = false;
                this.o = true;
                this.p = false;
                x0.h.notifyAll();
                while (!this.b && this.d && !this.p) {
                    try {
                        x0.h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h() {
            synchronized (x0.h) {
                this.f1961a = true;
                x0.h.notifyAll();
                while (!this.b) {
                    try {
                        x0.h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void i() {
            this.k = true;
            x0.h.notifyAll();
        }

        public void j() {
            synchronized (x0.h) {
                this.o = true;
                x0.h.notifyAll();
            }
        }

        public void m() {
            synchronized (x0.h) {
                this.e = true;
                this.j = false;
                x0.h.notifyAll();
                while (this.g && !this.j && !this.b) {
                    try {
                        x0.h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void n() {
            synchronized (x0.h) {
                this.e = false;
                x0.h.notifyAll();
                while (!this.g && !this.b) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            x0.h.wait();
                        } else {
                            x0.h.wait(2000L);
                        }
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
                d();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                x0.h.b(this);
                throw th;
            }
            x0.h.b(this);
        }

        public void a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (x0.h) {
                this.n = i;
                x0.h.notifyAll();
            }
        }

        public void a(int i, int i2) {
            synchronized (x0.h) {
                this.l = i;
                this.m = i2;
                this.r = true;
                this.o = true;
                this.p = false;
                x0.h.notifyAll();
                while (!this.b && !this.d && !this.p && this.h && this.i && g()) {
                    try {
                        x0.h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (x0.h) {
                    this.f1962q.add(runnable);
                    x0.h.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        public int a() {
            int i;
            synchronized (x0.h) {
                i = this.m;
            }
            return i;
        }
    }

    /* compiled from: GLTextureView.java */
    private class l extends c {
        public l(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public x0(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f1957a = new WeakReference<>(this);
        c();
    }

    public void e() {
        this.b.f();
    }

    protected void finalize() throws Throwable {
        try {
            j jVar = this.b;
            if (jVar != null) {
                jVar.h();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        return this.b.b();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d && this.c != null) {
            j jVar = this.b;
            int b2 = jVar != null ? jVar.b() : 1;
            j jVar2 = new j(this.f1957a);
            this.b = jVar2;
            if (b2 != 1) {
                jVar2.a(b2);
            }
            this.b.start();
        }
        this.d = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        j jVar = this.b;
        if (jVar != null) {
            jVar.h();
        }
        this.d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        getSurfaceTexture();
        this.b.a(i4 - i2, i5 - i3);
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.b.m();
        if (MapsInitializer.getTextureSizeChangedInvoked()) {
            this.b.a(i2, i3);
        } else {
            if (this.b.c() == i2 && this.b.a() == i3) {
                return;
            }
            this.b.a(i2, i3);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.b.n();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.b.a(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        this.b.a(runnable);
    }

    public void requestRender() {
        this.b.j();
    }

    public void setRenderMode(int i2) {
        this.b.a(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        b();
        if (this.e == null) {
            this.e = new l(true);
        }
        if (this.f == null) {
            this.f = new d();
        }
        if (this.g == null) {
            this.g = new e();
        }
        this.c = renderer;
        j jVar = new j(this.f1957a);
        this.b = jVar;
        jVar.start();
    }

    private void b() {
        if (this.b != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void c() {
        setSurfaceTextureListener(this);
    }

    public void d() {
        this.b.e();
    }

    public void a(g gVar) {
        b();
        this.f = gVar;
    }

    /* compiled from: GLTextureView.java */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1963a;
        private int b;
        private boolean c;
        private boolean d;
        private boolean e;
        private j f;

        private k() {
        }

        public void a(j jVar) {
            if (this.f == jVar) {
                this.f = null;
            }
            notifyAll();
        }

        public synchronized void b(j jVar) {
            jVar.b = true;
            if (this.f == jVar) {
                this.f = null;
            }
            notifyAll();
        }

        public boolean c(j jVar) {
            j jVar2 = this.f;
            if (jVar2 == jVar || jVar2 == null) {
                this.f = jVar;
                notifyAll();
                return true;
            }
            a();
            if (this.d) {
                return true;
            }
            j jVar3 = this.f;
            if (jVar3 == null) {
                return false;
            }
            jVar3.i();
            return false;
        }

        public synchronized void a(GL10 gl10) {
            if (!this.c && gl10 != null) {
                a();
                String glGetString = gl10.glGetString(7937);
                if (this.b < 131072) {
                    this.d = !glGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                this.e = !this.d;
                this.c = true;
            }
        }

        public synchronized boolean b() {
            a();
            return !this.d;
        }

        private void a() {
            if (this.f1963a) {
                return;
            }
            this.b = 131072;
            this.d = true;
            this.f1963a = true;
        }
    }

    public void a(f fVar) {
        b();
        this.e = fVar;
    }
}
