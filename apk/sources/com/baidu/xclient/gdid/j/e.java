package com.baidu.xclient.gdid.j;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes15.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EGL10 f9065a;
    public EGLDisplay b;
    public EGLConfig c;
    public EGLSurface d;
    public EGLContext e;
    public GL10 f;
    public Object h;
    public int g = 1;
    public int i = 8;
    public int j = 8;
    public int k = 8;
    public int l = 8;
    public int m = 16;
    public int n = 4;
    public EGLContext o = EGL10.EGL_NO_CONTEXT;

    public final EGLSurface a(int[] r5) {
        int r0 = this.g;
        if (r0 != 2) {
            return r0 != 3 ? this.f9065a.eglCreatePbufferSurface(this.b, this.c, r5) : this.f9065a.eglCreateWindowSurface(this.b, this.c, this.h, r5);
        }
        return this.f9065a.eglCreatePixmapSurface(this.b, this.c, this.h, r5);
    }

    public void a() {
        EGL10 egl10 = this.f9065a;
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = this.d;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.e);
        this.f = (GL10) this.e.getGL();
    }

    public boolean a(int r21, int r22) {
        int[] r1 = {12324, this.i, 12323, this.j, 12322, this.k, 12321, this.l, 12325, this.m, 12352, this.n, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f9065a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.b = eGLDisplayEglGetDisplay;
        this.f9065a.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        int[] r4 = new int[1];
        this.f9065a.eglChooseConfig(this.b, r1, null, 0, r4);
        int r6 = r4[0];
        if (r6 == 0) {
            return false;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[r6];
        this.f9065a.eglChooseConfig(this.b, r1, eGLConfigArr, r6, r4);
        this.c = eGLConfigArr[0];
        this.d = a(new int[]{12375, r21, 12374, r22, 12344});
        this.e = this.f9065a.eglCreateContext(this.b, this.c, this.o, new int[]{12440, 2, 12344});
        a();
        return true;
    }

    public void b() {
        EGL10 egl10 = this.f9065a;
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f9065a.eglDestroySurface(this.b, this.d);
        this.f9065a.eglDestroyContext(this.b, this.e);
        this.f9065a.eglTerminate(this.b);
    }
}
