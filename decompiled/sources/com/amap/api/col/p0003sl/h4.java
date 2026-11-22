package com.amap.api.col.p0003sl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: GlesUtility.java */
/* loaded from: classes11.dex */
public class h4 extends e4 {

    /* renamed from: a, reason: collision with root package name */
    protected int f1678a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    private int[] g = new int[1];

    public h4(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f1678a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    private int[] a(int i, boolean z) {
        return i == 3 ? new int[]{12324, this.f1678a, 12323, this.b, 12322, this.c, 12321, this.d, 12325, this.e, 12326, this.f, 12338, z ? 1 : 0, 12352, 64, 12344} : z ? new int[]{12324, this.f1678a, 12323, this.b, 12322, this.c, 12338, 1, 12344} : new int[]{12324, this.f1678a, 12323, this.b, 12322, this.c, 12344};
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.col.3sl.x0.f
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr;
        int[] iArr2;
        j4 a2 = a(egl10, eGLDisplay);
        if (a2 == null || (iArr = a2.f1697a) == null) {
            return null;
        }
        int[] iArr3 = a2.b;
        int i = iArr3[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr3);
        EGLConfig a3 = a(egl10, eGLDisplay, eGLConfigArr);
        if (a3 != null) {
            return a3;
        }
        this.f1678a = 8;
        this.b = 8;
        this.c = 8;
        j4 a4 = a(egl10, eGLDisplay);
        if (a4 == null || (iArr2 = a4.f1697a) == null) {
            return a3;
        }
        int[] iArr4 = a4.b;
        int i2 = iArr4[0];
        EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
        egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr2, i2, iArr4);
        return a(egl10, eGLDisplay, eGLConfigArr2);
    }

    private j4 a(EGL10 egl10, EGLDisplay eGLDisplay) {
        j4 j4Var = new j4();
        int[] a2 = a(3, true);
        j4Var.f1697a = a2;
        egl10.eglChooseConfig(eGLDisplay, a2, null, 0, j4Var.b);
        if (j4Var.b[0] <= 0) {
            int[] a3 = a(3, false);
            j4Var.f1697a = a3;
            egl10.eglChooseConfig(eGLDisplay, a3, null, 0, j4Var.b);
            if (j4Var.b[0] <= 0) {
                return null;
            }
        }
        return j4Var;
    }

    public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int i = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12325, this.g) ? this.g[0] : 0;
            int i2 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12326, this.g) ? this.g[0] : 0;
            if (i >= this.e && i2 >= this.f) {
                int i3 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12324, this.g) ? this.g[0] : 0;
                int i4 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12323, this.g) ? this.g[0] : 0;
                int i5 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12322, this.g) ? this.g[0] : 0;
                int i6 = egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12321, this.g) ? this.g[0] : 0;
                if (i3 == this.f1678a && i4 == this.b && i5 == this.c && i6 == this.d) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}
