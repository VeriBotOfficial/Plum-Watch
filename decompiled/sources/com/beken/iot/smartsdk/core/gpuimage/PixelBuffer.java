package com.beken.iot.smartsdk.core.gpuimage;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes13.dex */
public class PixelBuffer {
    private static final boolean LIST_CONFIGS = false;
    private static final String TAG = "PixelBuffer";
    private Bitmap bitmap;
    private final EGL10 egl10;
    private final EGLConfig eglConfig;
    private EGLConfig[] eglConfigs;
    private final EGLContext eglContext;
    private final EGLDisplay eglDisplay;
    private final EGLSurface eglSurface;
    private final GL10 gl10;
    private final int height;
    private final String mThreadOwner;
    private GLSurfaceView.Renderer renderer;
    private final int width;

    public PixelBuffer(int i, int i2) {
        this.width = i;
        this.height = i2;
        int[] iArr = {12375, i, 12374, i2, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl10 = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eglGetDisplay;
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig chooseConfig = chooseConfig();
        this.eglConfig = chooseConfig;
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, chooseConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        this.eglContext = eglCreateContext;
        EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, chooseConfig, iArr);
        this.eglSurface = eglCreatePbufferSurface;
        egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        this.gl10 = (GL10) eglCreateContext.getGL();
        this.mThreadOwner = Thread.currentThread().getName();
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        this.renderer = renderer;
        if (!Thread.currentThread().getName().equals(this.mThreadOwner)) {
            Log.e(TAG, "setRenderer: This thread does not own the OpenGL context.");
        } else {
            this.renderer.onSurfaceCreated(this.gl10, this.eglConfig);
            this.renderer.onSurfaceChanged(this.gl10, this.width, this.height);
        }
    }

    public Bitmap getBitmap() {
        if (this.renderer == null) {
            Log.e(TAG, "getBitmap: Renderer was not set.");
            return null;
        }
        if (!Thread.currentThread().getName().equals(this.mThreadOwner)) {
            Log.e(TAG, "getBitmap: This thread does not own the OpenGL context.");
            return null;
        }
        this.renderer.onDrawFrame(this.gl10);
        this.renderer.onDrawFrame(this.gl10);
        convertToBitmap();
        return this.bitmap;
    }

    public void destroy() {
        this.renderer.onDrawFrame(this.gl10);
        this.renderer.onDrawFrame(this.gl10);
        this.egl10.eglMakeCurrent(this.eglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
        this.egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl10.eglTerminate(this.eglDisplay);
    }

    private EGLConfig chooseConfig() {
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        this.egl10.eglChooseConfig(this.eglDisplay, iArr, null, 0, iArr2);
        int i = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        this.eglConfigs = eGLConfigArr;
        this.egl10.eglChooseConfig(this.eglDisplay, iArr, eGLConfigArr, i, iArr2);
        return this.eglConfigs[0];
    }

    private void listConfig() {
        Log.i(TAG, "Config List {");
        for (EGLConfig eGLConfig : this.eglConfigs) {
            Log.i(TAG, "    <d,s,r,g,b,a> = <" + getConfigAttrib(eGLConfig, 12325) + "," + getConfigAttrib(eGLConfig, 12326) + "," + getConfigAttrib(eGLConfig, 12324) + "," + getConfigAttrib(eGLConfig, 12323) + "," + getConfigAttrib(eGLConfig, 12322) + "," + getConfigAttrib(eGLConfig, 12321) + Separators.GREATER_THAN);
        }
        Log.i(TAG, "}");
    }

    private int getConfigAttrib(EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (this.egl10.eglGetConfigAttrib(this.eglDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    private void convertToBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        GPUImageNativeLibrary.adjustBitmap(createBitmap);
    }
}
