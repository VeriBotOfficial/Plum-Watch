package livekit.org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLException;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.EglBase10;
import livekit.org.webrtc.EglBase10Impl;

/* loaded from: classes8.dex */
class EglBase10Impl implements EglBase10 {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    private static final String TAG = "EglBase10Impl";
    private EglConnection eglConnection;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeGetCurrentNativeEGLContext();

    private static class Context implements EglBase10.Context {
        private final EGL10 egl;
        private final EGLContext eglContext;
        private final EGLConfig eglContextConfig;

        @Override // livekit.org.webrtc.EglBase10.Context
        public EGLContext getRawContext() {
            return this.eglContext;
        }

        @Override // livekit.org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            EGLContext eglGetCurrentContext = this.egl.eglGetCurrentContext();
            EGLDisplay eglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            EGLSurface eglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eglGetCurrentDisplay == EGL10.EGL_NO_DISPLAY) {
                eglGetCurrentDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            }
            EGLSurface eGLSurface = null;
            try {
                if (eglGetCurrentContext != this.eglContext) {
                    eGLSurface = this.egl.eglCreatePbufferSurface(eglGetCurrentDisplay, this.eglContextConfig, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        throw new GLException(this.egl.eglGetError(), "Failed to make temporary EGL surface active: " + this.egl.eglGetError());
                    }
                }
                return EglBase10Impl.nativeGetCurrentNativeEGLContext();
            } finally {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                    this.egl.eglDestroySurface(eglGetCurrentDisplay, null);
                }
            }
        }

        public Context(EGL10 egl, EGLContext eglContext, EGLConfig eglContextConfig) {
            this.egl = egl;
            this.eglContext = eglContext;
            this.eglContextConfig = eglContextConfig;
        }
    }

    public static class EglConnection implements EglBase10.EglConnection {
        private EGLSurface currentSurface;
        private final EGL10 egl;
        private final EGLConfig eglConfig;
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private final RefCountDelegate refCountDelegate;

        static /* synthetic */ void lambda$new$1() {
        }

        public EglConnection(EGLContext sharedContext, int[] configAttributes) {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglDisplay = EglBase10Impl.getEglDisplay(egl10);
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase10Impl.getEglConfig(egl10, eglDisplay, configAttributes);
            this.eglConfig = eglConfig;
            int openGlesVersionFromConfig = EglBase.getOpenGlesVersionFromConfig(configAttributes);
            Logging.d(EglBase10Impl.TAG, "Using OpenGL ES version " + openGlesVersionFromConfig);
            this.eglContext = EglBase10Impl.createEglContext(egl10, sharedContext, eglDisplay, eglConfig, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: livekit.org.webrtc.EglBase10Impl$EglConnection$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase10Impl.EglConnection.this.lambda$new$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            synchronized (EglBase.lock) {
                this.egl.eglMakeCurrent(this.eglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            }
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
            this.currentSurface = EGL10.EGL_NO_SURFACE;
        }

        private EglConnection() {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            this.egl = (EGL10) EGLContext.getEGL();
            this.eglContext = EGL10.EGL_NO_CONTEXT;
            this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: livekit.org.webrtc.EglBase10Impl$EglConnection$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase10Impl.EglConnection.lambda$new$1();
                }
            });
        }

        @Override // livekit.org.webrtc.RefCounted
        public void retain() {
            this.refCountDelegate.retain();
        }

        @Override // livekit.org.webrtc.RefCounted
        public void release() {
            this.refCountDelegate.release();
        }

        @Override // livekit.org.webrtc.EglBase10.EglConnection
        public EGL10 getEgl() {
            return this.egl;
        }

        @Override // livekit.org.webrtc.EglBase10.EglConnection
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override // livekit.org.webrtc.EglBase10.EglConnection
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        @Override // livekit.org.webrtc.EglBase10.EglConnection
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        public void makeCurrent(EGLSurface eglSurface) {
            if (this.egl.eglGetCurrentContext() == this.eglContext && this.currentSurface == eglSurface) {
                return;
            }
            synchronized (EglBase.lock) {
                if (!this.egl.eglMakeCurrent(this.eglDisplay, eglSurface, eglSurface, this.eglContext)) {
                    throw new GLException(this.egl.eglGetError(), "eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            }
            this.currentSurface = eglSurface;
        }

        public void detachCurrent() {
            synchronized (EglBase.lock) {
                if (!this.egl.eglMakeCurrent(this.eglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
                    throw new GLException(this.egl.eglGetError(), "eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            }
            this.currentSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    public EglBase10Impl(EGLContext sharedContext, int[] configAttributes) {
        this.eglConnection = new EglConnection(sharedContext, configAttributes);
    }

    public EglBase10Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override // livekit.org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: livekit.org.webrtc.EglBase10Impl.1FakeSurfaceHolder
            private final Surface surface;

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean b) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            @Deprecated
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }
        });
    }

    @Override // livekit.org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    private void createSurfaceInternal(Object nativeWindow) {
        if (!(nativeWindow instanceof SurfaceHolder) && !(nativeWindow instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGL10 egl = this.eglConnection.getEgl();
        EGLSurface eglCreateWindowSurface = egl.eglCreateWindowSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), nativeWindow, new int[]{12344});
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(egl.eglGetError(), "Failed to create window surface: 0x" + Integer.toHexString(egl.eglGetError()));
    }

    @Override // livekit.org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // livekit.org.webrtc.EglBase
    public void createPbufferSurface(int width, int height) {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGL10 egl = this.eglConnection.getEgl();
        EGLSurface eglCreatePbufferSurface = egl.eglCreatePbufferSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), new int[]{12375, width, 12374, height, 12344});
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(egl.eglGetError(), "Failed to create pixel buffer surface with size " + width + "x" + height + ": 0x" + Integer.toHexString(egl.eglGetError()));
    }

    @Override // livekit.org.webrtc.EglBase
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglConnection.getEgl(), this.eglConnection.getContext(), this.eglConnection.getConfig());
    }

    @Override // livekit.org.webrtc.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    @Override // livekit.org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.eglConnection.getEgl().eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // livekit.org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.eglConnection.getEgl().eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // livekit.org.webrtc.EglBase
    public void releaseSurface() {
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            this.eglConnection.getEgl().eglDestroySurface(this.eglConnection.getDisplay(), this.eglSurface);
            this.eglSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw new RuntimeException("This object has been released");
        }
    }

    @Override // livekit.org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    @Override // livekit.org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        this.eglConnection.makeCurrent(this.eglSurface);
    }

    @Override // livekit.org.webrtc.EglBase
    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    @Override // livekit.org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            this.eglConnection.getEgl().eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
        }
    }

    @Override // livekit.org.webrtc.EglBase
    public void swapBuffers(long timeStampNs) {
        swapBuffers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EGLDisplay getEglDisplay(EGL10 egl) {
        EGLDisplay eglGetDisplay = egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new GLException(egl.eglGetError(), "Unable to get EGL10 display: 0x" + Integer.toHexString(egl.eglGetError()));
        }
        if (egl.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        }
        throw new GLException(egl.eglGetError(), "Unable to initialize EGL10: 0x" + Integer.toHexString(egl.eglGetError()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EGLConfig getEglConfig(EGL10 egl, EGLDisplay eglDisplay, int[] configAttributes) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (!egl.eglChooseConfig(eglDisplay, configAttributes, eGLConfigArr, 1, iArr)) {
            throw new GLException(egl.eglGetError(), "eglChooseConfig failed: 0x" + Integer.toHexString(egl.eglGetError()));
        }
        if (iArr[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new RuntimeException("eglChooseConfig returned null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EGLContext createEglContext(EGL10 egl, EGLContext sharedContext, EGLDisplay eglDisplay, EGLConfig eglConfig, int openGlesVersion) {
        EGLContext eglCreateContext;
        if (sharedContext != null && sharedContext == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, openGlesVersion, 12344};
        if (sharedContext == null) {
            sharedContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = egl.eglCreateContext(eglDisplay, eglConfig, sharedContext, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new GLException(egl.eglGetError(), "Failed to create EGL context: 0x" + Integer.toHexString(egl.eglGetError()));
    }
}
