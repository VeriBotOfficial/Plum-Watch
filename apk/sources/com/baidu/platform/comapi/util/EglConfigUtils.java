package com.baidu.platform.comapi.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes15.dex */
public class EglConfigUtils {
    public static boolean isSupport24DepthSize() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[100];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, 100, new int[100]);
            for (int r6 = 0; r6 < 100; r6++) {
                int[] r8 = new int[1];
                EGLConfig eGLConfig = eGLConfigArr[r6];
                if (eGLConfig == null) {
                    break;
                }
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfig, 12324, r8);
                int r9 = r8[0];
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[r6], 12323, r8);
                int r10 = r8[0];
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[r6], 12322, r8);
                int r11 = r8[0];
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[r6], 12325, r8);
                int[] r12 = {r9, r10, r11, r8[0]};
                int r13 = r12[0];
                if ((r13 == 5 && r12[1] == 6 && r12[2] == 5 && r12[3] == 24) || (r13 == 8 && r12[1] == 8 && r12[2] == 8 && r12[3] == 24)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isSupportConfig(int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        int[] r4 = new int[1];
        return egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, r23, 12323, r24, 12322, r25, 12321, r26, 12325, r27, 12326, r28, 12338, r29, 12337, r30, 12344}, new EGLConfig[100], 100, r4) && r4[0] > 0;
    }
}
