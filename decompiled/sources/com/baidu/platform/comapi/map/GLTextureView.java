package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.baidu.platform.gl.GLThreadShareLock;
import com.heytap.mcssdk.constant.MessageConstant;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.IntBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes13.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final h f8576a = new h(null);
    private int b;
    private final View.OnLayoutChangeListener c;
    private final WeakReference<GLTextureView> d;
    private g e;
    private SurfaceRenderer f;
    private boolean g;
    private GLSurfaceView.EGLConfigChooser h;
    private GLSurfaceView.EGLContextFactory i;
    private GLSurfaceView.EGLWindowSurfaceFactory j;
    private GLSurfaceView.GLWrapper k;
    private int l;
    private int m;
    private boolean n;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            GLTextureView gLTextureView = GLTextureView.this;
            gLTextureView.onSurfaceTextureSizeChanged(gLTextureView.getSurfaceTexture(), i3 - i, i4 - i2);
        }
    }

    private abstract class b implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f8578a;

        public b(int[] iArr) {
            this.f8578a = a(iArr);
        }

        private int[] a(int[] iArr) {
            if (GLTextureView.this.m != 2 && GLTextureView.this.m != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (GLTextureView.this.m == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f8578a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f8578a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    private static class e implements GLSurfaceView.EGLWindowSurfaceFactory {
        private e() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static class g extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8581a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean o;
        private f r;
        private WeakReference<GLTextureView> s;
        private ArrayList<Runnable> p = new ArrayList<>();

        /* renamed from: q, reason: collision with root package name */
        private boolean f8582q = true;
        private int k = 0;
        private int l = 0;
        private boolean n = true;
        private int m = 1;

        g(WeakReference<GLTextureView> weakReference) {
            this.s = weakReference;
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x0372  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x038a A[Catch: all -> 0x03ae, TryCatch #6 {all -> 0x03ae, blocks: (B:4:0x001c, B:5:0x001e, B:174:0x025b, B:97:0x0265, B:160:0x0274, B:161:0x0276, B:171:0x0285, B:102:0x0289, B:104:0x029f, B:106:0x02b0, B:110:0x02d2, B:112:0x0302, B:114:0x030a, B:116:0x0318, B:117:0x0326, B:121:0x0334, B:122:0x033d, B:131:0x0348, B:133:0x034c, B:136:0x0373, B:139:0x037d, B:141:0x038a, B:142:0x038c, B:150:0x0394, B:196:0x03ad, B:144:0x038d, B:145:0x0390, B:164:0x0278, B:165:0x027d, B:125:0x033f, B:126:0x0344, B:7:0x001f, B:183:0x0023, B:9:0x0032, B:181:0x003a, B:94:0x0258, B:11:0x0048, B:13:0x004e, B:15:0x0059, B:16:0x008a, B:19:0x0090, B:21:0x00b6, B:23:0x00c2, B:26:0x00c8, B:28:0x00ec, B:30:0x00f0, B:32:0x00fa, B:34:0x0100, B:36:0x010a, B:38:0x010f, B:40:0x012b, B:42:0x0135, B:44:0x013c, B:45:0x0156, B:47:0x015a, B:50:0x0160, B:52:0x017e, B:53:0x0181, B:54:0x018c, B:56:0x0190, B:59:0x0196, B:62:0x01bc, B:63:0x01e0, B:65:0x01e6, B:69:0x01ee, B:72:0x01f8, B:74:0x01fe, B:77:0x0208, B:78:0x020f, B:80:0x0210, B:82:0x0214, B:84:0x0218, B:85:0x021e, B:88:0x0222, B:90:0x0226, B:92:0x022c, B:93:0x024e, B:176:0x039e), top: B:3:0x001c, inners: #0, #2, #3, #5 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void c() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 957
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.map.GLTextureView.g.c():void");
        }

        private boolean f() {
            if (this.d || !this.e || this.f || this.k <= 0 || this.l <= 0) {
                return false;
            }
            return this.n || this.m == 1;
        }

        private void j() {
            if (this.h) {
                this.r.e();
                this.h = false;
                GLTextureView.f8576a.a(this);
            }
        }

        private void k() {
            if (this.i) {
                this.i = false;
                this.r.c();
            }
        }

        public int b() {
            int i;
            synchronized (GLThreadShareLock.LOCK) {
                i = this.m;
            }
            return i;
        }

        public void d() {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                Log.i("GLThread", "onPause tid=" + getId());
                this.c = true;
                obj.notifyAll();
                while (!this.b && !this.d) {
                    Log.i("Main thread", "onPause waiting for mPaused.");
                    try {
                        GLThreadShareLock.LOCK.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void e() {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                Log.i("GLThread", "onResume tid=" + getId());
                this.c = false;
                this.n = true;
                this.o = false;
                obj.notifyAll();
                while (!this.b && this.d && !this.o) {
                    Log.i("Main thread", "onResume waiting for !mPaused.");
                    try {
                        GLThreadShareLock.LOCK.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void g() {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                this.f8581a = true;
                obj.notifyAll();
                while (!this.b) {
                    try {
                        GLThreadShareLock.LOCK.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h() {
            this.j = true;
            GLThreadShareLock.LOCK.notifyAll();
        }

        public void i() {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                this.n = true;
                obj.notifyAll();
            }
        }

        public void l() {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                this.e = true;
                obj.notifyAll();
                while (this.g && !this.b) {
                    try {
                        GLThreadShareLock.LOCK.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void m() {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                this.e = false;
                obj.notifyAll();
                while (!this.g && !this.b) {
                    try {
                        GLThreadShareLock.LOCK.wait();
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
                GLTextureView.f8576a.b(this);
                throw th;
            }
            GLTextureView.f8576a.b(this);
        }

        public boolean a() {
            return this.h && this.i && f();
        }

        public void a(int i) {
            if (i >= 0 && i <= 1) {
                Object obj = GLThreadShareLock.LOCK;
                synchronized (obj) {
                    this.m = i;
                    obj.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public void a(int i, int i2) {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                this.k = i;
                this.l = i2;
                this.f8582q = true;
                this.n = true;
                this.o = false;
                obj.notifyAll();
                while (!this.b && !this.d && !this.o && a()) {
                    Log.i("Main thread", "onWindowResize waiting for render complete from tid=" + getId());
                    try {
                        GLThreadShareLock.LOCK.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            if (runnable != null) {
                Object obj = GLThreadShareLock.LOCK;
                synchronized (obj) {
                    this.p.add(runnable);
                    obj.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        private static String f8583a = "GLThreadManager";
        private static final Class b;
        private static final Method c;
        private boolean d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private g i;

        static {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                b = cls;
                Method declaredMethod = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private h() {
        }

        public void a(g gVar) {
            if (this.i == gVar) {
                this.i = null;
            }
            GLThreadShareLock.LOCK.notifyAll();
        }

        public void b(g gVar) {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                gVar.b = true;
                if (this.i == gVar) {
                    this.i = null;
                }
                obj.notifyAll();
            }
        }

        public boolean c(g gVar) {
            g gVar2 = this.i;
            if (gVar2 == gVar || gVar2 == null) {
                this.i = gVar;
                GLThreadShareLock.LOCK.notifyAll();
                return true;
            }
            a();
            if (this.g) {
                return true;
            }
            g gVar3 = this.i;
            if (gVar3 == null) {
                return false;
            }
            gVar3.h();
            return false;
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        public void a(GL10 gl10) {
            Object obj = GLThreadShareLock.LOCK;
            synchronized (obj) {
                if (!this.f) {
                    a();
                    String glGetString = gl10.glGetString(7937);
                    if (this.e < 131072) {
                        this.g = !glGetString.startsWith("Q3Dimension MSM7500 ");
                        obj.notifyAll();
                    }
                    this.h = !this.g;
                    Log.w(f8583a, "checkGLDriver renderer = \"" + glGetString + "\" multipleContextsAllowed = " + this.g + " mLimitedGLESContexts = " + this.h);
                    this.f = true;
                }
            }
        }

        public boolean b() {
            boolean z;
            synchronized (GLThreadShareLock.LOCK) {
                z = this.h;
            }
            return z;
        }

        public boolean c() {
            boolean z;
            synchronized (GLThreadShareLock.LOCK) {
                a();
                z = !this.g;
            }
            return z;
        }

        private void a() {
            if (this.d) {
                return;
            }
            try {
                this.e = ((Integer) c.invoke(null, "ro.opengles.version", 0)).intValue();
            } catch (Exception unused) {
                this.e = 65536;
            }
            if (this.e >= 131072) {
                this.g = true;
            }
            Log.w(f8583a, "checkGLESVersion mGLESVersion = " + this.e + " mMultipleGLESContextsAllowed = " + this.g);
            this.d = true;
        }
    }

    static class i extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private StringBuilder f8584a = new StringBuilder();

        i() {
        }

        private void a() {
            if (this.f8584a.length() > 0) {
                StringBuilder sb = this.f8584a;
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
                    this.f8584a.append(c);
                }
            }
        }
    }

    private class j extends c {
        public j(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.b = 60;
        this.c = new a();
        this.d = new WeakReference<>(this);
        c();
    }

    public Bitmap captureImageFromSurface(int i2, int i3, int i4, int i5, Object obj, Bitmap.Config config) {
        return a(i2, i3, i4, i5, (GL10) obj, config);
    }

    protected void finalize() throws Throwable {
        try {
            g gVar = this.e;
            if (gVar != null) {
                gVar.g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.l;
    }

    public int getFPS() {
        return this.b;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.n;
    }

    public int getRenderMode() {
        return this.e.b();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("GLTextureView", "onAttachedToWindow reattach =" + this.g);
        if (this.g && this.f != null) {
            g gVar = this.e;
            int b2 = gVar != null ? gVar.b() : 1;
            g gVar2 = new g(this.d);
            this.e = gVar2;
            if (b2 != 1) {
                gVar2.a(b2);
            }
            this.e.start();
        }
        this.g = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        Log.d("GLTextureView", "onDetachedFromWindow");
        g gVar = this.e;
        if (gVar != null) {
            gVar.g();
        }
        this.g = true;
        super.onDetachedFromWindow();
    }

    public void onPause() {
        g gVar = this.e;
        if (gVar != null) {
            gVar.d();
        }
    }

    public void onResume() {
        g gVar = this.e;
        if (gVar != null) {
            gVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        surfaceCreated(surfaceTexture);
        surfaceChanged(surfaceTexture, 0, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        surfaceChanged(surfaceTexture, 0, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        g gVar = this.e;
        if (gVar != null) {
            gVar.a(runnable);
        }
    }

    public void requestRender() {
        g gVar = this.e;
        if (gVar != null) {
            gVar.i();
        }
    }

    public void setDebugFlags(int i2) {
        this.l = i2;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        b();
        this.h = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i2) {
        b();
        this.m = i2;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        b();
        this.i = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        b();
        this.j = eGLWindowSurfaceFactory;
    }

    public void setFPS(int i2) {
        this.b = i2;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.k = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.n = z;
    }

    public void setRenderMode(int i2) {
        this.e.a(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.baidu.platform.comapi.map.GLTextureView] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setRenderer(com.baidu.platform.comapi.map.SurfaceRenderer r10) {
        /*
            r9 = this;
            r9.b()
            android.opengl.GLSurfaceView$EGLConfigChooser r0 = r9.h
            if (r0 != 0) goto L35
            r7 = 0
            r8 = 0
            r0 = 1
            r1 = 8
            r2 = 8
            r3 = 8
            r4 = 0
            r5 = 24
            r6 = 8
            boolean r1 = com.baidu.platform.comapi.util.EglConfigUtils.isSupportConfig(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L30
            if (r1 == 0) goto L2b
            r7 = 24
            r8 = 8
            r3 = 8
            r4 = 8
            r5 = 8
            r6 = 0
            r2 = r9
            r2.setEGLConfigChooser(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L31
            goto L36
        L2b:
            r2 = r9
            r9.setEGLConfigChooser(r0)     // Catch: java.lang.IllegalArgumentException -> L31
            goto L36
        L30:
            r2 = r9
        L31:
            r9.setEGLConfigChooser(r0)
            goto L36
        L35:
            r2 = r9
        L36:
            android.opengl.GLSurfaceView$EGLContextFactory r0 = r2.i
            r1 = 0
            if (r0 != 0) goto L42
            com.baidu.platform.comapi.map.GLTextureView$d r0 = new com.baidu.platform.comapi.map.GLTextureView$d
            r0.<init>(r9, r1)
            r2.i = r0
        L42:
            android.opengl.GLSurfaceView$EGLWindowSurfaceFactory r0 = r2.j
            if (r0 != 0) goto L4d
            com.baidu.platform.comapi.map.GLTextureView$e r0 = new com.baidu.platform.comapi.map.GLTextureView$e
            r0.<init>(r1)
            r2.j = r0
        L4d:
            r2.f = r10
            com.baidu.platform.comapi.map.GLTextureView$g r10 = new com.baidu.platform.comapi.map.GLTextureView$g
            java.lang.ref.WeakReference<com.baidu.platform.comapi.map.GLTextureView> r0 = r2.d
            r10.<init>(r0)
            r2.e = r10
            r10.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.map.GLTextureView.setRenderer(com.baidu.platform.comapi.map.SurfaceRenderer):void");
    }

    public void surfaceChanged(SurfaceTexture surfaceTexture, int i2, int i3, int i4) {
        g gVar = this.e;
        if (gVar != null) {
            gVar.a(i3, i4);
        }
    }

    public void surfaceCreated(SurfaceTexture surfaceTexture) {
        g gVar = this.e;
        if (gVar != null) {
            gVar.l();
        }
    }

    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
        g gVar = this.e;
        if (gVar != null) {
            gVar.m();
        }
    }

    private class d implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f8579a;

        private d() {
            this.f8579a = 12440;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f8579a, GLTextureView.this.m, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.m == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            f.b("eglDestroyContex", egl10.eglGetError());
        }

        /* synthetic */ d(GLTextureView gLTextureView, a aVar) {
            this();
        }
    }

    private void b() {
        if (this.e != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void c() {
        setSurfaceTextureListener(this);
        addOnLayoutChangeListener(this.c);
    }

    private Bitmap a(int i2, int i3, int i4, int i5, GL10 gl10, Bitmap.Config config) {
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
                return Bitmap.createBitmap(iArr2, i4, i5, Bitmap.Config.ARGB_8888);
            }
            return Bitmap.createBitmap(iArr2, i4, i5, config);
        } catch (GLException unused) {
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("OutOfMemoryError", " createBitmap cause OutOfMemoryError : " + e2.getMessage());
            return null;
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new j(z));
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7) {
        setEGLConfigChooser(new c(i2, i3, i4, i5, i6, i7));
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setEGLConfigChooser(new c(i2, i3, i4, i5, i6, i7, i8));
    }

    private class c extends b {
        private int[] c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;

        public c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.c = new int[1];
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = 1;
        }

        @Override // com.baidu.platform.comapi.map.GLTextureView.b
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
                        if (a(egl102, eGLDisplay2, eGLConfig2, 12337, 0) == this.j) {
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

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12338, 1, 12337, i7, 12344});
            this.c = new int[1];
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = i7;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.c) ? this.c[0] : i2;
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<GLTextureView> f8580a;
        EGL10 b;
        EGLDisplay c;
        EGLSurface d;
        EGLConfig e;
        EGLContext f;

        public f(WeakReference<GLTextureView> weakReference) {
            this.f8580a = weakReference;
        }

        public static void a(String str, String str2, int i) {
        }

        private void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f8580a.get();
            if (gLTextureView != null) {
                gLTextureView.j.destroySurface(this.b, this.c, this.d);
            }
            this.d = null;
        }

        GL a() {
            GL gl = this.f.getGL();
            GLTextureView gLTextureView = this.f8580a.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.k != null) {
                gl = gLTextureView.k.wrap(gl);
            }
            if ((gLTextureView.l & 3) != 0) {
                return GLDebugHelper.wrap(gl, (gLTextureView.l & 1) == 0 ? 0 : 1, (gLTextureView.l & 2) != 0 ? new i() : null);
            }
            return gl;
        }

        public boolean b() {
            Log.w("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
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
            GLTextureView gLTextureView = this.f8580a.get();
            if (gLTextureView != null) {
                this.d = gLTextureView.j.createWindowSurface(this.b, this.c, this.e, gLTextureView.getSurfaceTexture());
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
            Log.w("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            d();
        }

        public void e() {
            Log.w("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.f != null) {
                GLTextureView gLTextureView = this.f8580a.get();
                if (gLTextureView != null) {
                    gLTextureView.i.destroyContext(this.b, this.c, this.f);
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
            Log.w("EglHelper", "start() tid=" + Thread.currentThread().getId());
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
            GLTextureView gLTextureView = this.f8580a.get();
            if (gLTextureView == null) {
                this.e = null;
                this.f = null;
            } else {
                this.e = gLTextureView.h.chooseConfig(this.b, this.c);
                this.f = gLTextureView.i.createContext(this.b, this.c, this.e);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f = null;
                a("createContext");
            }
            Log.w("EglHelper", "createContext " + this.f + " tid=" + Thread.currentThread().getId());
            this.d = null;
        }

        public int g() {
            return !this.b.eglSwapBuffers(this.c, this.d) ? this.b.eglGetError() : MessageConstant.CommandId.COMMAND_BASE;
        }

        private void a(String str) {
            b(str, this.b.eglGetError());
        }

        public static String a(String str, int i) {
            return str + " EGL failed code: " + i;
        }

        public static void b(String str, int i) {
            throw new RuntimeException(a(str, i));
        }
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 60;
        this.c = new a();
        this.d = new WeakReference<>(this);
        c();
    }

    public GLTextureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = 60;
        this.c = new a();
        this.d = new WeakReference<>(this);
        c();
    }
}
