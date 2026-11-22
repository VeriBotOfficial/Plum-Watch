package com.anythink.basead.exoplayer.k;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2679a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final int[] d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private static final int e = 12992;
    private final Handler f;
    private final int[] g = new int[1];
    private EGLDisplay h;
    private EGLContext i;
    private EGLSurface j;
    private SurfaceTexture k;

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class a extends RuntimeException {
        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    public g(Handler handler) {
        this.f = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        this.f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.k;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.g, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.h, this.j);
            }
            EGLContext eGLContext = this.i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.h, eGLContext);
            }
            if (af.f2668a >= 19) {
                EGL14.eglReleaseThread();
            }
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
        }
    }

    public final SurfaceTexture b() {
        return (SurfaceTexture) com.anythink.basead.exoplayer.k.a.a(this.k);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.k;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    private static EGLDisplay c() {
        byte b2 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new a("eglGetDisplay failed", b2);
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new a("eglInitialize failed", b2);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, d, 0, eGLConfigArr, 0, 1, iArr, 0);
        byte b2 = 0;
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new a(af.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]), b2);
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        byte b2 = 0;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, e, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed", b2);
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        byte b2 = 0;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, e, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed", b2);
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed", b2);
    }

    private static void a(int[] iArr) {
        byte b2 = 0;
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError), b2);
        }
    }

    public final void a(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        byte b2 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new a("eglGetDisplay failed", b2);
        }
        int[] iArr3 = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
            this.h = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr4 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, d, 0, eGLConfigArr, 0, 1, iArr4, 0);
            if (eglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                EGLDisplay eGLDisplay = this.h;
                if (i == 0) {
                    iArr = new int[]{12440, 2, 12344};
                } else {
                    iArr = new int[]{12440, 2, e, 1, 12344};
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                if (eglCreateContext != null) {
                    this.i = eglCreateContext;
                    EGLDisplay eGLDisplay2 = this.h;
                    if (i == 1) {
                        eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        if (i == 2) {
                            iArr2 = new int[]{12375, 1, 12374, 1, e, 1, 12344};
                        } else {
                            iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                        }
                        eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                        if (eglCreatePbufferSurface == null) {
                            throw new a("eglCreatePbufferSurface failed", b2);
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                        this.j = eglCreatePbufferSurface;
                        GLES20.glGenTextures(1, this.g, 0);
                        int glGetError = GLES20.glGetError();
                        if (glGetError == 0) {
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.g[0]);
                            this.k = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError), b2);
                    }
                    throw new a("eglMakeCurrent failed", b2);
                }
                throw new a("eglCreateContext failed", b2);
            }
            throw new a(af.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), b2);
        }
        throw new a("eglInitialize failed", b2);
    }
}
